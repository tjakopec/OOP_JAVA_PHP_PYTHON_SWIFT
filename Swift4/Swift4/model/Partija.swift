//
//  Partija.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class Partija{
    
    private var doKolikoSeIgra: Int
    private var lokacija: Lokacija;
    private var unosi: Igrac;
    private var mjesanja: Array<MjesanjeProtokol> = Array()
    private var igraci: Array<Igrac> = Array()
    
    init(doKolikoSeIgra: Int = 501, lokacija: Lokacija, unosi: Igrac, mjesanja: Array<MjesanjeProtokol>, igraci: Array<Igrac>) {
        self.doKolikoSeIgra=doKolikoSeIgra
        self.lokacija=lokacija
        self.unosi=unosi
        self.mjesanja=mjesanja
        self.igraci=igraci
    }
    
    
    
    public func getDoKolikoSeIgra()->Int{
        return self.doKolikoSeIgra
    }
    
    public func setDoKolikoSeIgra(doKolikoSeIgra: Int){
        self.doKolikoSeIgra = doKolikoSeIgra
    }
    
    public func getLokacija()->Lokacija{
        return self.lokacija
    }
    
    public func setLokacija(lokacija: Lokacija){
        self.lokacija = lokacija
    }
    
    public func getUnosi()->Igrac{
        return self.unosi
    }
    
    public func setUnosi(unosi: Igrac){
        self.unosi = unosi
    }
    
    public func getMjesanja()->Array<MjesanjeProtokol>{
        return self.mjesanja
    }
    
    public func setMjesanja(mjesanja: Array<MjesanjeProtokol>){
        self.mjesanja = mjesanja
    }
    
    public func getIgraci()->Array<Igrac>{
        return self.igraci
    }
    
    public func setIgraci(igraci: Array<Igrac>){
        self.igraci = igraci
    }
    
    public func getRezultat()->Rezultat{
        let rezultat = Rezultat()
        rezultat.setPrvi(prvi: getMjesanja().reduce(0) { $0 + $1.getRezultat().getPrvi() })
        rezultat.setDrugi(drugi: getMjesanja().reduce(0) { $0 + $1.getRezultat().getDrugi() })
        return rezultat
    }
    
    public func isIgraGotova()->Bool{
        
        let rezultat = getRezultat()
        
        if (rezultat.isPocetak()){
            return false
        }
        
        if (rezultat.getTreci() == 0){
            return rezultat.getPrvi() == rezultat.getDrugi() ? false : rezultat.getPrvi() > getDoKolikoSeIgra() || rezultat.getDrugi() > getDoKolikoSeIgra()
        }else{
            if(rezultat.getPrvi() == rezultat.getDrugi() || rezultat.getPrvi() == rezultat.getTreci() || rezultat.getDrugi() == rezultat.getTreci()){
                return false;
            }

            if (rezultat.getPrvi() > getDoKolikoSeIgra() || rezultat.getDrugi() > getDoKolikoSeIgra() || rezultat.getTreci() > getDoKolikoSeIgra()){
                return true;
            }
        }
        
        return false
    }
    
    public var description: String {
        return "Ovo se ne bi smjelo koristiti, napravite Override u podklasi"
    }
    
}
