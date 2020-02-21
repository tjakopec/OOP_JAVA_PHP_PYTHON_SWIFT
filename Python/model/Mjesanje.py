from abc import abstractmethod
from datetime import date

from model.Entitet import Entitet


class Mjesanje(Entitet):
    def __init__(self, sifra=None):
        super().__init__(sifra)
        self._stiglja = False
        self._belot = False
        self._datum_unosa = date.today()

    @abstractmethod
    def get_rezultat(self):
        pass

    @property
    def stiglja(self):
        return self._stiglja

    @stiglja.setter
    def stiglja(self, stiglja):
        self._stiglja = stiglja

    @property
    def belot(self):
        return self._belot

    @belot.setter
    def belot(self, belot):
        self._belot = belot

    @property
    def datum_unosa(self):
        return self._datum_unosa

    @belot.setter
    def datum_unosa(self, datum_unosa):
        self._datum_unosa = datum_unosa

