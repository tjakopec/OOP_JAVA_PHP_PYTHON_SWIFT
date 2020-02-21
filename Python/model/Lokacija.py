from model.Entitet import Entitet


class Lokacija(Entitet):
    def __init__(self, sifra=None, longitude=None, latitude=None, naziv=None): # ne može id jer je to shadow build name
        super().__init__(sifra)
        self._longitude = "" if longitude is None else longitude
        self._latitude = "" if latitude is None else latitude
        self._naziv = "" if naziv is None else naziv

    @property
    def longitude(self):
        return self._longitude

    @longitude.setter
    def longitude(self, longitude):
        self._longitude = longitude

    @property
    def latitude(self):
        return self._latitude

    @latitude.setter
    def latitude(self, latitude):
        self._latitude = latitude

    @property
    def naziv(self):
        return self.naziv

    @naziv.setter
    def naziv(self, naziv):
        self._naziv = naziv

