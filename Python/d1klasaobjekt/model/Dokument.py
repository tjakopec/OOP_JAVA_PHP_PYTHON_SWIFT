class Dokument:
    def __init__(self, rijecnik):
        for svojstvo, vrijednost in rijecnik.items():
            setattr(self, svojstvo, vrijednost)