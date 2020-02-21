from abc import abstractmethod
from model.Entitet import Entitet
from model.Igrac import Igrac
from model.Lokacija import Lokacija
from model.Rezultat import Rezultat


class Partija(Entitet):
    def __init__(self, sifra=None):
        super().__init__(sifra)
        self._do_koliko_se_igra = 501
        self._lokacija = Lokacija()
        self._unosi = Igrac()
        self._mjesanja = []
        self._igraci = []

    @abstractmethod
    def get_rezultat(self) -> Rezultat:
        pass

    @property
    def is_igra_gotova(self) -> bool:
        rezultat = self.get_rezultat()
        if rezultat.is_pocetak():
            return False
        if rezultat.treci == 0:
            return False if rezultat.prvi == rezultat.drugi else rezultat.prvi > self.do_koliko_se_igra | rezultat.drugi > self.do_koliko_se_igra
        else:
            return rezultat.prvi > self.do_koliko_se_igra | rezultat.drugi > self.do_koliko_se_igra | rezultat.treci > self.do_koliko_se_igra
        return False

    @property
    def do_koliko_se_igra(self):
        return self._do_koliko_se_igra

    @do_koliko_se_igra.setter
    def do_koliko_se_igra(self, do_koliko_se_igra):
        self._do_koliko_se_igra = do_koliko_se_igra

    @property
    def lokacija(self):
        return self._lokacija

    @lokacija.setter
    def lokacija(self, lokacija):
        self._lokacija = lokacija

    @property
    def unosi(self):
        return self._unosi

    @unosi.setter
    def unosi(self, unosi):
        self._unosi = unosi

    @property
    def mjesanja(self):
        return self._mjesanja

    @mjesanja.setter
    def mjesanja(self, mjesanja):
        self._mjesanja = mjesanja

    @property
    def igraci(self):
        return self._igraci

    @igraci.setter
    def igraci(self, igraci):
        self._igraci = igraci
