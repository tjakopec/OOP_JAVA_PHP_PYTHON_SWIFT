class Fiskalizacija:
    def __init__(self, jir, zki):
        # PEP 8 - Style Guide for Python Code, the following guidance appears in the section Descriptive: Naming Styles
        self._jir = jir
        self._zki = zki


    @property
    def jir(self):
        return self._jir

    @jir.setter
    def jir(self, jir):
        self._jir = jir

    @property
    def zki(self):
        return self._zki

    @zki.setter
    def zki(self, zki):
        self._zki = zki


