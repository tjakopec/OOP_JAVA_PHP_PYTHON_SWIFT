//
//  PartijaTriIgraca.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class PartijaTriIgraca: Partija{
    
    public override func getRezultat()->Rezultat{
        let rezultat = super.getRezultat()
        rezultat.setTreci(treci: getMjesanja().reduce(0) { $0 + $1.getRezultat().getTreci() })
        return rezultat
    }
    
    
    
    public override var description: String {
        let rezultat = getRezultat();
        return "Partija TRI IGRAČA, igra gotova: " + String(super.isIgraGotova()) + ", " +  super.getIgraci()[0].description + ": " +
                String(rezultat.getPrvi()) +
            " | " + super.getIgraci()[1].description + ": " + String(rezultat.getDrugi()) + " | " + super.getIgraci()[2].description + ": " + String(rezultat.getTreci());
    }
    
    
    
}
