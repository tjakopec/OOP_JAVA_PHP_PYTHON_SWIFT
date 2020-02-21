from abc import ABC


class Entitet(ABC):
    def __init__(self, sifra=None): # ne može id jer je to shadow build name
        super().__init__()
        if sifra is None:
            self._sifra = 0
        else:
            self._sifra = sifra

    @property
    def sifra(self):
        return self._sifra

    @sifra.setter
    def sifra(self, sifra):
        self._sifra = sifra

