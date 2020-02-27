//
//  MjesanjeDvaUnosa.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class MjesanjeTriUnosa: MjesanjeDvaUnosa{
    
    private var bodovaTreciUnos: Int
    private var zvanjeTreciUnos: Int
    
    
   
    
    init(sifra: Int = 0, stiglja: Bool = false, belot: Bool = false, datumUnosa: Date = Date.init(), bodovaPrviUnos: Int = 0, zvanjePrviUnos: Int = 0, bodovaDrugiUnos: Int = 0, zvanjeDrugiUnos: Int = 0, bodovaTreciUnos: Int = 0, zvanjeTreciUnos: Int = 0) {
        self.bodovaTreciUnos=bodovaTreciUnos
        self.zvanjeTreciUnos=zvanjeTreciUnos
        super.init(sifra: sifra, stiglja: stiglja, belot: belot, datumUnosa: datumUnosa,bodovaPrviUnos: bodovaPrviUnos, zvanjePrviUnos: zvanjePrviUnos, bodovaDrugiUnos: bodovaDrugiUnos, zvanjeDrugiUnos: zvanjeDrugiUnos)
    }
    
    public func getBodovaTreciUnos()->Int{
        return self.bodovaTreciUnos
    }
    
    public func setBodovaTreciUnos(bodovaTreciUnos: Int){
        self.bodovaTreciUnos = bodovaTreciUnos
    }
    
    public func getZvanjeTreciUnos()->Int{
        return self.zvanjeTreciUnos
    }
    
    public func setZvanjeTreciUnos(zvanjeTreciUnos: Int){
        self.zvanjeTreciUnos = zvanjeTreciUnos
    }
    
    
    override func getRezultat()->Rezultat{
        let rezultat = super.getRezultat()
        rezultat.setTreci(treci: getBodovaTreciUnos() + getZvanjeTreciUnos())
        return rezultat
    }
    
    
    
}
