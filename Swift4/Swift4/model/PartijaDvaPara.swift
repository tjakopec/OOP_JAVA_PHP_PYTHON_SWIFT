//
//  PartijaDvaPara.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class PartijaDvaPara: Partija{
    
    public override var description: String {
        let rezultat = getRezultat();
        return "Partija DVA PARA, igra gotova: " + String(super.isIgraGotova()) + ", " +  super.getIgraci()[0].description + " i " + super.getIgraci()[1].description + ": " +
                String(rezultat.getPrvi()) +
            " | " + super.getIgraci()[2].description + " i " + super.getIgraci()[3].description + ": " + String(rezultat.getDrugi());
    }
    
}
