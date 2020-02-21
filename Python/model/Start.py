from model.Entitet import Entitet
from model.Igrac import Igrac
from model.Mjesanje import Mjesanje
from model.MjesanjeDvaUnosa import MjesanjeDvaUnosa
from model.MjesanjeTriUnosa import MjesanjeTriUnosa
from model.PartijaDvaIgraca import PartijaDvaIgraca


class Start:
    def __init__(self):
        e = Entitet(1) # apstraktna klasa se može instancirati
        print(e.sifra)
        igrac = Igrac(1, "Tomislav", "Jakopec", "", 1)
        print(igrac.sifra)
        #mjesanje = Mjesanje(1) #TypeError: Can't instantiate abstract class Mjesanje with abstract methods get_rezultat

        mjesanje = MjesanjeDvaUnosa()
        mjesanje.bodova_prvi_unos = 23
        mjesanje.zvanje_prvi_unos = 20
        mjesanje.bodova_drugi_unos = 78

        print('Mješanje DVA unosa', mjesanje.get_rezultat().prvi, ' - ', mjesanje.get_rezultat().drugi)

        mjesanje = MjesanjeTriUnosa()
        mjesanje.bodova_prvi_unos = 23
        mjesanje.zvanje_prvi_unos = 20
        mjesanje.bodova_drugi_unos = 78
        mjesanje.bodova_treci_unos=61

        print('Mješanje TRI unosa', mjesanje.get_rezultat().prvi, ' - ', mjesanje.get_rezultat().drugi, ' - ', mjesanje.get_rezultat().treci)

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


Start()
