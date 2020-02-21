from d3nasljedivanje.model.Dokument import Dokument
from d3nasljedivanje.model.specificno.Fiskalizacija import Fiskalizacija


class Racun(Dokument, Fiskalizacija):
    def __init__(self, sifra, broj_dokumenta, iznos, jir, zki, kupac):
        Dokument.__init__(self, sifra, broj_dokumenta, iznos)
        Fiskalizacija.__init__(self, jir, zki)
        self._kupac = kupac

    @property
    def kupac(self):
        return self._kupac

    @kupac.setter
    def kupac(self, kupac):
        self._kupac = kupac


