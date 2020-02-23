//
//  MjesanjeDvaUnosa.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class MjesanjeDvaUnosa: Mjesanje, MjesanjeProtokol{
    
    private var bodovaPrviUnos: Int
    private var zvanjePrviUnos: Int

    private var bodovaDrugiUnos: Int
    private var zvanjeDrugiUnos: Int
    
    init(sifra: Int = 0, stiglja: Bool = false, belot: Bool = false, datumUnosa: Date = Date.init(), bodovaPrviUnos: Int = 0, zvanjePrviUnos: Int = 0, bodovaDrugiUnos: Int = 0,  zvanjeDrugiUnos: Int = 0) {
        self.bodovaPrviUnos=bodovaPrviUnos
        self.zvanjePrviUnos=zvanjePrviUnos
        self.bodovaDrugiUnos=bodovaDrugiUnos
        self.zvanjeDrugiUnos=zvanjeDrugiUnos
        super.init(sifra: sifra, stiglja: stiglja, belot: belot, datumUnosa: datumUnosa)
    }
    
    public func getBodovaPrviUnos()->Int{
        return self.bodovaPrviUnos
    }
    
    public func setBodovaPrviUnos(bodovaPrviUnos: Int){
        self.bodovaPrviUnos = bodovaPrviUnos
    }
    
    public func getZvanjePrviUnos()->Int{
        return self.zvanjePrviUnos
    }
    
    public func setZvanjePrviUnos(zvanjePrviUnos: Int){
        self.zvanjePrviUnos = zvanjePrviUnos
    }
    
    public func getBodovaDrugiUnos()->Int{
        return self.bodovaDrugiUnos
    }
    
    public func setBodovaDrugiUnos(bodovaDrugiUnos: Int){
        self.bodovaDrugiUnos = bodovaDrugiUnos
    }
    
    public func getZvanjeDrugiUnos()->Int{
        return self.zvanjeDrugiUnos
    }
    
    public func setZvanjeDrugiUnos(zvanjeDrugiUnos: Int){
        self.zvanjeDrugiUnos = zvanjeDrugiUnos
    }
    
    func getRezultat()->Rezultat{
        let rezultat = Rezultat()
        rezultat.setPrvi(prvi: getBodovaPrviUnos() + getZvanjePrviUnos())
        rezultat.setDrugi(drugi: getBodovaDrugiUnos() + getZvanjeDrugiUnos())
        return rezultat
    }
    
    
    
}
