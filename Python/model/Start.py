from model.Entitet import Entitet
from model.Igrac import Igrac
from model.Lokacija import Lokacija
from model.Mjesanje import Mjesanje
from model.MjesanjeDvaUnosa import MjesanjeDvaUnosa
from model.MjesanjeTriUnosa import MjesanjeTriUnosa
from model.Partija import Partija
from model.PartijaDvaIgraca import PartijaDvaIgraca
import json

from model.PartijaDvaPara import PartijaDvaPara
from model.PartijaTriIgraca import PartijaTriIgraca


class Start:
    def __init__(self):
        self._partije = []
        self.ucitajPartije()
        for p in self._partije:
            print(p)
        #self.testiranje()

    def testiranje(self):
        e = Entitet(1)  # apstraktna klasa se može instancirati
        print(e.sifra)
        igrac = Igrac(1, "Tomislav", "Jakopec", "", 1)
        print(igrac.sifra)
        # mjesanje = Mjesanje(1) #TypeError: Can't instantiate abstract class Mjesanje with abstract methods get_rezultat

        mjesanje = MjesanjeDvaUnosa()
        mjesanje.bodova_prvi_unos = 23
        mjesanje.zvanje_prvi_unos = 20
        mjesanje.bodova_drugi_unos = 78

        print('Mješanje DVA unosa', mjesanje.get_rezultat().prvi, ' - ', mjesanje.get_rezultat().drugi)

        mjesanje = MjesanjeTriUnosa()
        mjesanje.bodova_prvi_unos = 23
        mjesanje.zvanje_prvi_unos = 20
        mjesanje.bodova_drugi_unos = 78
        mjesanje.bodova_treci_unos = 61

        print('Mješanje TRI unosa', mjesanje.get_rezultat().prvi, ' - ', mjesanje.get_rezultat().drugi, ' - ',
              mjesanje.get_rezultat().treci)

        partija = PartijaDvaIgraca()
        mjesanje = MjesanjeDvaUnosa()
        mjesanje.bodova_prvi_unos = 23
        mjesanje.zvanje_prvi_unos = 20
        mjesanje.bodova_drugi_unos = 78
        partija.mjesanja.append(mjesanje)
        mjesanje = MjesanjeDvaUnosa()
        mjesanje.bodova_prvi_unos = 23
        mjesanje.zvanje_prvi_unos = 20
        mjesanje.bodova_drugi_unos = 78
        partija.mjesanja.append(mjesanje)

        print(partija)

    def ucitajPartije(self):
        with open('../podaci.json') as json_file:
            partije = json.load(json_file)
            for p in partije:
                if len(p['igraci']) == 2:
                    partija = PartijaDvaIgraca()
                elif len(p['igraci']) == 3:
                    partija = PartijaTriIgraca()
                elif len(p['igraci']) == 4:
                    partija = PartijaDvaPara()

                partija.do_koliko_se_igra = p['doKolikoSeIgra']

                unosi = Igrac()
                unosi.sifra = p['unosi']['id']
                unosi.ime = p['unosi']['ime']
                unosi.prezime = p['unosi']['prezime']
                unosi.spol = p['unosi']['spol']
                partija.unosi = unosi

                lokacija = Lokacija()
                lokacija.sifra = p['lokacija']['id']
                lokacija.longitude = p['lokacija']['longitude']
                lokacija.latitude = p['lokacija']['latitude']
                lokacija.naziv = p['lokacija']['naziv']
                partija.lokacija = lokacija

                for i in p['igraci']:
                    igrac = Igrac()
                    igrac.sifra = i['id']
                    igrac.ime = i['ime']
                    igrac.prezime = i['prezime']
                    igrac.spol = i['spol']
                    partija.igraci.append(igrac)

                for m in p['mjesanja']:

                    if 'bodovaTreciUnos' in m:
                        mjesanje = MjesanjeTriUnosa()
                        mjesanje.bodova_treci_unos = m['bodovaTreciUnos']
                        mjesanje.zvanje_treci_unos = m['zvanjeTreciUnos']
                    else:
                        mjesanje = MjesanjeDvaUnosa()
                    mjesanje.sifra = m['id']
                    mjesanje.datum_unosa = m['datumUnosa']
                    mjesanje.stiglja = m['stiglja']
                    mjesanje.belot = m['belot']
                    mjesanje.bodova_prvi_unos = m['bodovaPrviUnos']
                    mjesanje.zvanje_prvi_unos = m['zvanjePrviUnos']
                    mjesanje.bodova_drugi_unos = m['bodovaDrugiUnos']
                    mjesanje.zvanje_drugi_unos = m['zvanjeDrugiUnos']
                    partija.mjesanja.append(mjesanje)





                self._partije.append(partija)


Start()
