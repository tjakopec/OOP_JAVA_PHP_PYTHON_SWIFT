from model.Partija import Partija
from model.Rezultat import Rezultat


class PartijaDvaPara(Partija):
    def __init__(self):
        super().__init__()

    def __str__(self) -> str:
        return 'Partija DVA PARA, igra gotova: ' + str(self.is_igra_gotova) + ', ' + \
               str(self.igraci[0]) + ' i ' + str(self.igraci[1]) + ': ' + str(self.get_rezultat().prvi) + \
            ' | ' + str(self.igraci[2]) + ' i ' + str(self.igraci[3]) + ': ' + str(self.get_rezultat().drugi)
