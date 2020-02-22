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
        let partije = Array<Partija>()
        let JSON = Pomocno.JSON()
        
        let jsonData = JSON.data(using: .utf8)!
        
        print(jsonData.count)
        
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
