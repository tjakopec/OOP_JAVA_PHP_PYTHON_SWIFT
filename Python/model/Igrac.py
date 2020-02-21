from model.Entitet import Entitet


class Igrac(Entitet):
    def __init__(self, sifra=None, ime=None, prezime=None, url_slika=None, spol=None): # ne može id jer je to shadow build name
        super().__init__(sifra)
        if ime is None:
            self._ime = ""
        else:
            self._ime = ime
        self._prezime = "" if prezime is None else prezime
        self._url_slika = "" if url_slika is None else url_slika
        self._spol = "" if spol is None else spol

    @property
    def ime(self):
        return self._ime

    @ime.setter
    def ime(self, ime):
        self._ime = ime

    @property
    def prezime(self):
        return self._prezime

    @prezime.setter
    def prezime(self, prezime):
        self._prezime = prezime

    @property
    def url_slika(self):
        return self._url_slika

    @url_slika.setter
    def url_slika(self, url_slika):
        self._url_slika = url_slika

    @property
    def spol(self):
        return self._spol

    @spol.setter
    def spol(self, spol):
        self._spol = spol

    def __str__(self):
        return self.ime + " " + self.prezime
