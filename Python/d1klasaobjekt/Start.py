from d1klasaobjekt.model.Dokument import Dokument
from d1klasaobjekt.model.DokumentJednostavno import DokumentJednostavno
import json
from pprint import pprint

podaci = []


def jednostavno():
    dj = DokumentJednostavno()
    dj.sifra = 1
    print(dj.sifra)


def ucitaj_dokument_jednostavno():
    with open('podaci.json') as json_file:
        data = json.load(json_file)
        for p in data:
            dj = DokumentJednostavno()
            #pprint(p)
            dj.sifra = p['sifra']
            dj.brojDokumenta = p['brojDokumenta']
            dj.iznos = p['iznos']
            podaci.append(dj)


def ucitaj_dokument():
    with open('podaci.json') as json_file:
        data = json.load(json_file)
        for p in data:
            podaci.append(Dokument(p))


def ispisi_dokumente():
    for p in podaci:
        #pprint(p)
        pprint(vars(p))
        print(p.sifra)
        print(p.brojDokumenta)
        print(p.iznos)


#jednostavno()
#ucitaj_dokument_jednostavno()
ucitaj_dokument()
ispisi_dokumente()

