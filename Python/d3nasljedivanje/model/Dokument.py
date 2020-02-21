class Dokument:
    def __init__(self, sifra=None, broj_dokumenta=None, iznos=None):
        # PEP 8 - Style Guide for Python Code, the following guidance appears in the section Descriptive: Naming Styles
        if sifra is None:
            self._sifra = 1
        else:
            self._sifra = sifra

        if broj_dokumenta is None:
            self._broj_dokumenta = 1
        else:
            self._broj_dokumenta = broj_dokumenta

        if iznos is None:
            self.iznos = 0
        else:
            self.iznos = iznos

    @property
    def sifra(self):
        return self._sifra

    @sifra.setter
    def sifra(self, sifra):
        self._sifra = sifra

    @property
    def broj_dokumenta(self):
        return self._broj_dokumenta

    @broj_dokumenta.setter
    def broj_dokumenta(self, broj_dokumenta):
        self._broj_dokumenta = broj_dokumenta

    @property
    def iznos(self):
        return float(self._iznos)

    @iznos.setter
    def iznos(self, iznos):
        self._iznos = iznos

