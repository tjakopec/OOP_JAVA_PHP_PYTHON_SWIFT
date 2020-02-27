from model.Partija import Partija


class PartijaDvaIgraca(Partija):
    def __init__(self):
        super().__init__()

    def __str__(self) -> str:
        return 'Partija DVA IGRAČA, igra gotova: ' + str(self.is_igra_gotova) + ', ' + \
               str(self.igraci[0]) + ': ' + str(self.get_rezultat().prvi) + \
            ' | ' + str(self.igraci[1]) + ': ' + str(self.get_rezultat().drugi)
