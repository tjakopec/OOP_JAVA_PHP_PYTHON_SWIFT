//
//  Entitet.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class Entitet
{
    private var sifra: Int
    
    init(sifra: Int = 0) {
        self.sifra = sifra
    }
    
    public func getSifra()->Int{
        return self.sifra
    }
    
    public func setSifra(sifra: Int){
        self.sifra = sifra
    }
    
}
