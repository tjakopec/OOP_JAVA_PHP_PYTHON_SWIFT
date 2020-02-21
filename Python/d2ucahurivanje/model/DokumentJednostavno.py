
class DokumentJednostavno:
    def __init__(self, sifra=None, broj_dokumenta=None, iznos=None):
        # PEP 8 - Style Guide for Python Code, the following guidance appears in the section Descriptive: Naming Styles
        if sifra is None:
            self.sifra = 1
        else:
            self.sifra = sifra

        if broj_dokumenta is None:
            self.broj_dokumenta = 1
        else:
            self.broj_dokumenta = broj_dokumenta

        if iznos is None:
            self.iznos = 1
        else:
            self.iznos = iznos
