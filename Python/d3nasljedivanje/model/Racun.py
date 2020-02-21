from d3nasljedivanje.model.Dokument import Dokument


class Racun(Dokument):
    def __init__(self, sifra, broj_dokumenta, iznos, kupac):
        Dokument.__init__(self, sifra, broj_dokumenta, iznos)
        self._kupac = kupac

    @property
    def kupac(self):
        return self._kupac

    @kupac.setter
    def kupac(self, kupac):
        self._kupac = kupac


