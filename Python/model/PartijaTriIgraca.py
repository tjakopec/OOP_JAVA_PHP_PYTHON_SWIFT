from model.Partija import Partija
from model.Rezultat import Rezultat


class PartijaTriIgraca(Partija):
    def __init__(self):
        super().__init__()

    def get_rezultat(self):
        rezultat = Rezultat()
        rezultat.prvi = sum(mjesanje.get_rezultat().prvi for mjesanje in self.mjesanja)
        rezultat.drugi = sum(mjesanje.get_rezultat().drugi for mjesanje in self.mjesanja)
        rezultat.treci = sum(mjesanje.get_rezultat().treci for mjesanje in self.mjesanja)
        return rezultat

    def __str__(self) -> str:
        return 'Partija TRI IGRAČA, igra gotova: ' + str(self.is_igra_gotova) + ', ' + \
               str(self.igraci[0]) + ': ' + str(self.get_rezultat().prvi) + \
               ' | ' + str(self.igraci[1]) + ': ' + str(self.get_rezultat().drugi) + \
               ' | ' + str(self.igraci[2]) + ': ' + str(self.get_rezultat().treci)
