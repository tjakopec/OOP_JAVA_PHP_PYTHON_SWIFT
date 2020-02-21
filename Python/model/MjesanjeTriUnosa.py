from model.Mjesanje import Mjesanje
from model.MjesanjeDvaUnosa import MjesanjeDvaUnosa
from model.Rezultat import Rezultat


class MjesanjeTriUnosa(MjesanjeDvaUnosa):
    def __init__(self, sifra=None):
        super().__init__(sifra)
        self._bodova_treci_unos = 0
        self._zvanje_treci_unos = 0

    def get_rezultat(self):
        rezultat = super().get_rezultat()
        rezultat.treci = self.bodova_treci_unos + self.zvanje_treci_unos
        return rezultat

    @property
    def bodova_treci_unos(self):
        return self._bodova_treci_unos

    @bodova_treci_unos.setter
    def bodova_treci_unos(self, bodova_treci_unos):
        self._bodova_treci_unos = bodova_treci_unos

    @property
    def zvanje_treci_unos(self):
        return self._zvanje_treci_unos

    @zvanje_treci_unos.setter
    def zvanje_treci_unos(self, zvanje_treci_unos):
        self._zvanje_treci_unos = zvanje_treci_unos

