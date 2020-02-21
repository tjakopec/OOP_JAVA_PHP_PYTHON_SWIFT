from d3nasljedivanje.model.Racun import Racun


class Start:
    def __init__(self):
        r = Racun(1, "2020-001", 123.22, "FFOS")
        print(r.sifra)


Start()

