from d3nasljedivanje.model.specificno.Racun import Racun


class Start:
    def __init__(self):
        r = Racun(1, "2020-001", 123.22, "XXX", "XXX", "FFOS")
        print(r.sifra)


Start()
