from model.Mjesanje import Mjesanje
from model.Rezultat import Rezultat


class MjesanjeDvaUnosa(Mjesanje):
    def __init__(self, sifra=None):
        super().__init__(sifra)
        self._bodova_prvi_unos = 0
        self._bodova_drugi_unos = 0
        self._zvanje_prvi_unos = 0
        self._zvanje_drugi_unos = 0

    def get_rezultat(self):
        rezultat = Rezultat()
        rezultat.prvi = self.bodova_prvi_unos + self.zvanje_prvi_unos
        rezultat.drugi = self.bodova_drugi_unos + self.zvanje_drugi_unos
        return rezultat

    @property
    def bodova_prvi_unos(self):
        return self._bodova_prvi_unos

    @bodova_prvi_unos.setter
    def bodova_prvi_unos(self, bodova_prvi_unos):
        self._bodova_prvi_unos = bodova_prvi_unos

    @property
    def bodova_drugi_unos(self):
        return self._bodova_drugi_unos

    @bodova_drugi_unos.setter
    def bodova_drugi_unos(self, bodova_drugi_unos):
        self._bodova_drugi_unos = bodova_drugi_unos

    @property
    def zvanje_prvi_unos(self):
        return self._zvanje_prvi_unos

    @zvanje_prvi_unos.setter
    def zvanje_prvi_unos(self, zvanje_prvi_unos):
        self._zvanje_prvi_unos = zvanje_prvi_unos

    @property
    def zvanje_drugi_unos(self):
        return self._zvanje_drugi_unos

    @zvanje_drugi_unos.setter
    def zvanje_drugi_unos(self, zvanje_drugi_unos):
        self._zvanje_drugi_unos = zvanje_drugi_unos