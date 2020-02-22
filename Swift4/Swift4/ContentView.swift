//
//  ContentView.swift
//  Swift4
//
//  Created by Tomislav Jakopec on 14/02/2020.
//  Copyright © 2020 Tomislav Jakopec. All rights reserved.
//

import SwiftUI

struct ContentView: View {
     @State private var showDetails = false

       var body: some View {
           VStack {
               Button(action: {
                   self.showDetails.toggle()
                
                let partije = Pomocno.ucitajPodatke()
                print(partije.count)
                
                
                
               }) {
                   Text("Kreni")
               }

               if showDetails {
                
                Text("Krenuo")
                  
               }
           }
       }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
