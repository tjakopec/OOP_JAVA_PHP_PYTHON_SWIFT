//
//  Lokacija.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class Lokacija: Entitet{
    private var longitude: Double
    private var latitude: Double
    private var naziv: String
    
     init(sifra: Int = 0, longitude: Double = 0, latitude: Double = 0, naziv: String) {
        self.longitude=longitude
        self.latitude=latitude
        self.naziv=naziv
        super.init(sifra: sifra)
    }
    
    public func getLongitude()->Double{
        return self.longitude
    }
    
    public func setLongitude(longitude: Double){
        self.longitude = longitude
    }
    
    public func getLatitudee()->Double{
        return self.latitude
    }
    
    public func setLatitude(latitude: Double){
        self.latitude = latitude
    }
    
    public func getNaziv()->String{
        return self.naziv
    }
    
    public func setNaziv(naziv: String){
        self.naziv = naziv
    }
    
}
