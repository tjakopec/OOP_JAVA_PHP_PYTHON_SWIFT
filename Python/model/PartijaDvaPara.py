from model.Partija import Partija
from model.Rezultat import Rezultat


class PartijaDvaPara(Partija):
    def __init__(self):
        super().__init__()

    def get_rezultat(self) -> Rezultat:
        rezultat = Rezultat()
        rezultat.prvi = sum(mjesanje.get_rezultat().prvi for mjesanje in self.mjesanja)
        rezultat.drugi = sum(mjesanje.get_rezultat().drugi for mjesanje in self.mjesanja)
        return rezultat

    def __str__(self) -> str:
        return 'Partija DVA PARA, igra gotova: ' + str(self.is_igra_gotova) + ', ' + \
               str(self.igraci[0]) + ' i ' + str(self.igraci[1]) + ': ' + str(self.get_rezultat().prvi) + \
            ' | ' + str(self.igraci[2]) + ' i ' + str(self.igraci[3]) + ': ' + str(self.get_rezultat().drugi)
