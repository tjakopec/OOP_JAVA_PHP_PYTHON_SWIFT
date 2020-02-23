//
//  PartijaDvaIgraca.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class PartijaDvaIgraca: Partija{
    
    public override var description: String {
        let rezultat = getRezultat();
        return "Partija DVA IGRAČA, igra gotova: " + String(super.isIgraGotova()) + ", " +  super.getIgraci()[0].description + ": " +
                String(rezultat.getPrvi()) +
            " | " + super.getIgraci()[1].description + ": " + String(rezultat.getDrugi());
    }
    
}
