from d2ucahurivanje.model.Dokument import Dokument
from d2ucahurivanje.model.DokumentJednostavno import DokumentJednostavno
import json


class Start:

    def __init__(self):
        self.jednostavno()
        self._podaci = []
        self.ucitaj_dokument()
        self.ispisi_dokumente()

    @property
    def podaci(self):
        return self._podaci

    @podaci.setter
    def sifra(self, podaci):
        self._podaci = podaci

    def jednostavno(self):
        dj = DokumentJednostavno()
        print(dj.sifra)

        d = Dokument()
        print(d.sifra)

    def ucitaj_dokument(self):
        with open('../podaci.json') as json_file:
            data = json.load(json_file)
            for p in data:
                self.podaci.append(Dokument(p['sifra'], p['brojDokumenta'], p['iznos']))

    def ispisi_dokumente(self):
        for p in self.podaci:
            print(p.sifra)
            print(p.broj_dokumenta)
            print(p.iznos)


Start()
