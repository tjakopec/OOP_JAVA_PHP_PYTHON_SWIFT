//
//  Pomocno.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class Pomocno{
    class func ucitajPodatke()->Array<Partija>{
        var partije = Array<Partija>()
       //Trebalo bi parsirati JSON string ali ne znam kako :)
        
        let igrac1=Igrac(sifra: 1, ime: "Tomislav", prezime: "Jakopec", urlSlika: "", spol: 1)
        let igrac2=Igrac(sifra: 1, ime: "Marijan", prezime: "Zidar", urlSlika: "", spol: 1)
        let igrac3=Igrac(sifra: 3, ime: "Marija", prezime: "Zimska", urlSlika: "", spol: 0)
        let igrac4=Igrac(sifra: 4, ime: "Anita", prezime: "Račman", urlSlika: "", spol: 0)
        
        var igraci = Array<Igrac>()
        igraci.insert(igrac1, at: igraci.endIndex)
        igraci.insert(igrac2, at: igraci.endIndex)
        
        let lokacija = Lokacija(sifra: 1, longitude: 45.5605825, latitude: 18.6098766, naziv: "Caffe Bar Peppermint")
        
        var mjesanja = Array<MjesanjeProtokol>()
        
        var m = MjesanjeDvaUnosa()
      
        m.setBodovaPrviUnos(bodovaPrviUnos: 23)
        m.setBodovaDrugiUnos(bodovaDrugiUnos: 89)
        m.setZvanjeDrugiUnos(zvanjeDrugiUnos: 20)
        
        mjesanja.insert(m, at: mjesanja.endIndex)

        m =  MjesanjeDvaUnosa();
        m.setBodovaPrviUnos(bodovaPrviUnos: 18);
        m.setBodovaDrugiUnos(bodovaDrugiUnos: 51);

         mjesanja.insert(m, at: mjesanja.endIndex)



        m =  MjesanjeDvaUnosa();
        m.setBodovaPrviUnos(bodovaPrviUnos: 120);
        m.setStiglja(stiglja: true);

         mjesanja.insert(m, at: mjesanja.endIndex)


        for _ in 1...8 {
            m =  MjesanjeDvaUnosa();
            m.setBodovaPrviUnos(bodovaPrviUnos: 45);
            m.setBodovaDrugiUnos(bodovaDrugiUnos: 23);

             mjesanja.insert(m, at: mjesanja.endIndex)

        }
        
        let partija = PartijaDvaIgraca(doKolikoSeIgra: 501, lokacija: lokacija, unosi: igrac1, mjesanja: mjesanja, igraci: igraci)
        
        partije.insert(partija, at: partije.endIndex)
        
    
        //DRUGA PARTIJA
        
        
         mjesanja = Array<MjesanjeProtokol>()
        
        // Javlja inheritance Definition conflicts with previous value što nema smisla ali OK
        //var m = MjesanjeTriUnosa(sifra: 1, stiglja: false, belot: false, datumUnosa: Date.init(), bodovaPrviUnos: 23, zvanjePrviUnos: 0, bodovaDrugiUnos: 80, zvanjeDrugiUnos: 20, bodovaTreciUnos: 59, zvanjeTreciUnos: 0)
        
        
        var m3 = MjesanjeTriUnosa(sifra: 1, stiglja: false, belot: false, datumUnosa: Date.init(), bodovaPrviUnos: 23, zvanjePrviUnos: 0, bodovaDrugiUnos: 89, zvanjeDrugiUnos: 20, bodovaTreciUnos: 50, zvanjeTreciUnos: 0)
       
        
        mjesanja.insert(m3, at: mjesanja.endIndex)

        m3 =  MjesanjeTriUnosa();
        m3.setBodovaPrviUnos(bodovaPrviUnos: 18)
        m3.setBodovaDrugiUnos(bodovaDrugiUnos: 51)
        m3.setBodovaTreciUnos(bodovaTreciUnos: 162 - m3.getBodovaPrviUnos() - m3.getBodovaDrugiUnos())
        
        mjesanja.insert(m3, at: mjesanja.endIndex)
        
        m3 =  MjesanjeTriUnosa();
        m3.setBodovaPrviUnos(bodovaPrviUnos: 120)
        m3.setBodovaDrugiUnos(bodovaDrugiUnos: 0)
        m3.setBodovaTreciUnos(bodovaTreciUnos: 42)
        m3.setStiglja(stiglja: true)
        
        mjesanja.insert(m3, at: mjesanja.endIndex)
        
        
        for _ in 1...3 {
            m3 =  MjesanjeTriUnosa();
             m3.setBodovaPrviUnos(bodovaPrviUnos: 45)
                   m3.setBodovaDrugiUnos(bodovaDrugiUnos: 23)
                   m3.setBodovaTreciUnos(bodovaTreciUnos: 162 - m3.getBodovaPrviUnos() - m3.getBodovaDrugiUnos())

             mjesanja.insert(m3, at: mjesanja.endIndex)

        }
    
        m3 =  MjesanjeTriUnosa();
        m3.setBodovaPrviUnos(bodovaPrviUnos: 120)
        m3.setStiglja(stiglja: true)
        m3.setBodovaTreciUnos(bodovaTreciUnos: 162 - m3.getBodovaPrviUnos() - m3.getBodovaDrugiUnos())

         mjesanja.insert(m3, at: mjesanja.endIndex)
        
        igraci = Array<Igrac>()
               igraci.insert(igrac1, at: igraci.endIndex)
               igraci.insert(igrac2, at: igraci.endIndex)
               igraci.insert(igrac3, at: igraci.endIndex)
        
       let partija3 = PartijaTriIgraca(doKolikoSeIgra: 501, lokacija: lokacija, unosi: igrac1, mjesanja: mjesanja, igraci: igraci)
        
              partije.insert(partija3, at: partije.endIndex)
        
        
        
        
        //TREĆA PARTIJA
         
          mjesanja = Array<MjesanjeProtokol>()
          mjesanja.insert(MjesanjeDvaUnosa(sifra: 1, stiglja: false, belot: false, datumUnosa: Date.init(), bodovaPrviUnos: 23, zvanjePrviUnos: 0, bodovaDrugiUnos: 139, zvanjeDrugiUnos: 20), at: mjesanja.endIndex)
          mjesanja.insert(MjesanjeDvaUnosa(sifra: 1, stiglja: false, belot: false, datumUnosa: Date.init(), bodovaPrviUnos: 18, zvanjePrviUnos: 0, bodovaDrugiUnos: 144, zvanjeDrugiUnos: 0), at: mjesanja.endIndex)
          mjesanja.insert(MjesanjeDvaUnosa(sifra: 1, stiglja: false, belot: false, datumUnosa: Date.init(), bodovaPrviUnos: 120, zvanjePrviUnos: 0, bodovaDrugiUnos: 42, zvanjeDrugiUnos: 0), at: mjesanja.endIndex)
         
         igraci = Array<Igrac>()
         igraci.insert(igrac1, at: igraci.endIndex)
         igraci.insert(igrac2, at: igraci.endIndex)
         igraci.insert(igrac3, at: igraci.endIndex)
         igraci.insert(igrac4, at: igraci.endIndex)

         partije.insert(PartijaDvaPara(doKolikoSeIgra: 501, lokacija: lokacija, unosi: igrac1, mjesanja: mjesanja, igraci: igraci), at: partije.endIndex)
         
        
        
        
        
        
        return partije
    }
    
    
    class func JSON()->String{
        return """
        [
          {
            "doKolikoSeIgra": 501,
            "lokacija": {
              "longitude": 18.6098766,
              "latitude": 45.5605825,
              "naziv": "Caffe Bar Peppermint",
              "id": 1
            },
            "unosi": {
              "ime": "Tomislav",
              "prezime": "Jakopec",
              "urlSlika": "https://picsum.photos/200",
              "spol": 1,
              "id": 1
            },
            "mjesanja": [
              {
                "bodovaPrviUnos": 23,
                "bodovaDrugiUnos": 89,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 20,
                "stiglja": false,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 18,
                "bodovaDrugiUnos": 51,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": false,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 120,
                "bodovaDrugiUnos": 0,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              }
            ],
            "igraci": [
              {
                "ime": "Tomislav",
                "prezime": "Jakopec",
                "urlSlika": "https://picsum.photos/200",
                "spol": 1,
                "id": 1
              },
              {
                "ime": "Marijan",
                "prezime": "Zidar",
                "urlSlika": "https://picsum.photos/200",
                "spol": 1,
                "id": 2
              }
            ],
            "id": 0
          },
          {
            "doKolikoSeIgra": 501,
            "lokacija": {
              "longitude": 18.6098766,
              "latitude": 45.5605825,
              "naziv": "Caffe Bar Peppermint",
              "id": 1
            },
            "unosi": {
              "ime": "Tomislav",
              "prezime": "Jakopec",
              "urlSlika": "https://picsum.photos/200",
              "spol": 1,
              "id": 1
            },
            "mjesanja": [
              {
                "bodovaTreciUnos": 50,
                "zvanjeTreciUnos": 0,
                "bodovaPrviUnos": 23,
                "bodovaDrugiUnos": 89,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 20,
                "stiglja": false,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.848Z",
                "id": 0
              },
              {
                "bodovaTreciUnos": 93,
                "zvanjeTreciUnos": 0,
                "bodovaPrviUnos": 18,
                "bodovaDrugiUnos": 51,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": false,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              },
              {
                "bodovaTreciUnos": 42,
                "zvanjeTreciUnos": 0,
                "bodovaPrviUnos": 120,
                "bodovaDrugiUnos": 0,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              },
              {
                "bodovaTreciUnos": 94,
                "zvanjeTreciUnos": 0,
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              },
              {
                "bodovaTreciUnos": 94,
                "zvanjeTreciUnos": 0,
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              },
              {
                "bodovaTreciUnos": 94,
                "zvanjeTreciUnos": 0,
                "bodovaPrviUnos": 45,
                "bodovaDrugiUnos": 23,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              }
            ],
            "igraci": [
              {
                "ime": "Tomislav",
                "prezime": "Jakopec",
                "urlSlika": "https://picsum.photos/200",
                "spol": 1,
                "id": 1
              },
              {
                "ime": "Marijan",
                "prezime": "Zidar",
                "urlSlika": "https://picsum.photos/200",
                "spol": 1,
                "id": 2
              },
              {
                "ime": "Marija",
                "prezime": "Zimska",
                "urlSlika": "https://picsum.photos/200",
                "spol": 0,
                "id": 3
              }
            ],
            "id": 0
          },
          {
            "doKolikoSeIgra": 501,
            "lokacija": {
              "longitude": 18.6098766,
              "latitude": 45.5605825,
              "naziv": "Caffe Bar Peppermint",
              "id": 1
            },
            "unosi": {
              "ime": "Tomislav",
              "prezime": "Jakopec",
              "urlSlika": "https://picsum.photos/200",
              "spol": 1,
              "id": 1
            },
            "mjesanja": [
              {
                "bodovaPrviUnos": 23,
                "bodovaDrugiUnos": 139,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 20,
                "stiglja": false,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 18,
                "bodovaDrugiUnos": 144,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": false,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              },
              {
                "bodovaPrviUnos": 120,
                "bodovaDrugiUnos": 42,
                "zvanjePrviUnos": 0,
                "zvanjeDrugiUnos": 0,
                "stiglja": true,
                "belot": false,
                "datumUnosa": "2020-02-21T13:56:14.849Z",
                "id": 0
              }
            ],
            "igraci": [
              {
                "ime": "Tomislav",
                "prezime": "Jakopec",
                "urlSlika": "https://picsum.photos/200",
                "spol": 1,
                "id": 1
              },
              {
                "ime": "Marijan",
                "prezime": "Zidar",
                "urlSlika": "https://picsum.photos/200",
                "spol": 1,
                "id": 2
              },
              {
                "ime": "Marija",
                "prezime": "Zimska",
                "urlSlika": "https://picsum.photos/200",
                "spol": 0,
                "id": 3
              },
              {
                "ime": "Anita",
                "prezime": "Račman",
                "urlSlika": "https://picsum.photos/200",
                "spol": 0,
                "id": 4
              }
            ],
            "id": 0
          }
        ]
        """
    }
}
