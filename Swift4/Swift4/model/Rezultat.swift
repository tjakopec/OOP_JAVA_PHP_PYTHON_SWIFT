//
//  Rezultat.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation

class Rezultat{
    
    private var prvi: Int
    private var drugi: Int
    private var treci: Int
    
    init(prvi: Int = 0, drugi: Int = 0, treci: Int = 0) {
        self.prvi = prvi
        self.drugi = drugi
        self.treci = treci
    }
    
    public func getPrvi()->Int{
        return self.prvi
    }
    
    public func setPrvi(prvi: Int){
        self.prvi = prvi
    }
    
    public func getDrugi()->Int{
        return self.drugi
    }
    
    public func setDrugi(drugi: Int){
        self.drugi = drugi
    }
    
    public func getTreci()->Int{
        return self.treci
    }
    
    public func setTreci(treci: Int){
        self.drugi = treci
    }
    
    public func isPocetak()->Bool{
        return getPrvi() == 0 && getDrugi() == 0 && getTreci() == 0
    }
    
}
