class Rezultat:
    def __init__(self):
        self._prvi = 0
        self._drugi = 0
        self._treci = 0

    def is_pocetak(self):
        return self._prvi == 0 and self._drugi == 0 and self._treci == 0

    @property
    def prvi(self):
        return self._prvi

    @prvi.setter
    def prvi(self, prvi):
        self._prvi = prvi

    @property
    def drugi(self):
        return self._drugi

    @drugi.setter
    def drugi(self, drugi):
        self._drugi = drugi

    @property
    def treci(self):
        return self._treci

    @treci.setter
    def treci(self, treci):
        self._treci = treci

