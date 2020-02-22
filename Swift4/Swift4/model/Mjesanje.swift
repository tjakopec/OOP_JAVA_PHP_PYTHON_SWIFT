//
//  Mjesanje.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class Mjesanje: Entitet{
    
    private var stiglja: Bool
    private var belot: Bool
    private var datumUnosa: Date
    
    init(sifra: Int = 0, stiglja: Bool = false, belot: Bool = false, datumUnosa: Date = Date.init()) {
        self.stiglja=stiglja
        self.belot=belot
        self.datumUnosa=datumUnosa
    }
    
    public func isStiglja()->Bool{
        return self.stiglja
    }
    
    public func setStiglja(stiglja: Bool){
        self.stiglja = stiglja
    }
    
    public func isBelot()->Bool{
        return self.stiglja
    }
    
    public func setBelot(belot: Bool){
        self.belot = belot
    }
    
    public func getDatumUnosa()->Date{
        return self.datumUnosa
    }
    
    public func setDatumUnosa(datumUnosa: Date){
        self.datumUnosa = datumUnosa
    }
    
    
}
