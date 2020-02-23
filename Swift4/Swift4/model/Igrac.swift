//
//  Igrac.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 22/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import Foundation
class Igrac: Entitet{
    private var ime: String
    private var prezime: String
    private var urlSlika: String
    private var spol: Int
    
    init(sifra: Int = 0, ime: String, prezime: String, urlSlika: String, spol: Int) {
        self.ime = ime
        self.prezime = prezime
        self.urlSlika = urlSlika
        self.spol = spol
        super.init(sifra: sifra)
    }
    
    public func getIme()->String{
        return self.ime
    }
    
    public func setIme(ime: String){
        self.ime = ime
    }
    
    public func getPrezime()->String{
        return self.prezime
    }
    
    public func setPrezime(prezime: String){
        self.prezime = prezime
    }
    
    public func getUrlSlika()->String{
        return self.urlSlika
    }
    
    public func setUrlSlika(urlSlika: String){
        self.urlSlika = urlSlika
    }
    
    public func getSpol()->Int{
        return self.spol
    }
    
    public func setSpol(spol: Int){
        self.spol = spol
    }
    
    
    public var description: String {
        return self.ime + " " + self.prezime
    }
    
    
}
