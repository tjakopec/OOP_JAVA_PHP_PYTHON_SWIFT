using System;
using System.Collections.Generic;
using System.IO;
using CSHARP.Model;
using Newtonsoft.Json;

namespace CSHARP
{
    class Program
    {

        private List<Partija> partije;
        private Igrac igrac1;
        private Igrac igrac2;
        private Igrac igrac3;
        private Igrac igrac4;
        private Lokacija lokacija;

        public Program()
        {
            kreirajRucno();
            foreach(Partija p in partije)
            {
                Console.WriteLine(p);
            }
        }

        private void kreirajRucno()
        {
            partije = new List<Partija>();
            igrac1 = kreirajIgraca("Tomislav", "Jakopec");
            igrac2 = kreirajIgraca("Marijan", "Zidar");
            igrac3 = new Igrac()
            {
                ime = "Marija",
                prezime = "Zimska"
            };
            igrac4 = new Igrac()
            {
                ime = "Anita",
                prezime = "Račman"
            };
            lokacija = new Lokacija();

            kreirajPartijuDvaIgraca();
            kreirajPartijuTriIgraca();
            kreirajPartijuDvaPara();

        }

        private void kreirajPartijuDvaIgraca()
        {
            var p = new PartijaDvaIgraca();
            p.doKolikoSeIgra = 501;
            p.lokacija = lokacija;
            p.unosi = igrac1;
            p.igraci = new List<Igrac>();
            p.igraci.Add(igrac1);
            p.igraci.Add(igrac2);
            p.mjesanja = kreirajMjesanjaDvaPara();
            partije.Add(p);
        }

        private void kreirajPartijuTriIgraca()
        {
            var p = new PartijaTriIgraca();
            p.doKolikoSeIgra = 501;
            p.lokacija = lokacija;
            p.unosi = igrac1;
            p.igraci = new List<Igrac>();
            p.igraci.Add(igrac1);
            p.igraci.Add(igrac2);
            p.igraci.Add(igrac3);
            p.mjesanja = kreirajMjesanjaTriIgraca();
            partije.Add(p);
        }



        private void kreirajPartijuDvaPara()
        {
            var p = new PartijaDvaPara();
            p.doKolikoSeIgra = 501;
            p.lokacija = lokacija;
            p.unosi = igrac1;
            p.igraci = new List<Igrac>();
            p.igraci.Add(igrac1);
            p.igraci.Add(igrac2);
            p.igraci.Add(igrac3);
            p.igraci.Add(igrac4);
            p.mjesanja = kreirajMjesanjaDvaPara();
            partije.Add(p);
        }

        private List<Mjesanje> kreirajMjesanjaDvaPara()
        {
            var mjesanja = new List<Mjesanje>();
            mjesanja.Add( new MjesanjeDvaUnosa()
            {
                bodovaPrviUnos=10,
                bodovaDrugiUnos=152,
                zvanjePrviUnos=0,
                zvanjeDrugiUnos=20
            });

            mjesanja.Add(new MjesanjeDvaUnosa()
            {
                bodovaPrviUnos = 152,
                bodovaDrugiUnos = 10,
                zvanjePrviUnos = 0,
                zvanjeDrugiUnos = 20
            });

            return mjesanja;
        }

        private List<Mjesanje> kreirajMjesanjaTriIgraca()
        {
            var mjesanja = new List<Mjesanje>();
            mjesanja.Add(new MjesanjeTriUnosa()
            {
                bodovaPrviUnos = 10,
                bodovaDrugiUnos = 76,
                zvanjePrviUnos = 0,
                zvanjeDrugiUnos = 20,
                bodovaTreciUnos = 76
            });

            for(int i = 0; i < 5; i++)
            {
                mjesanja.Add(new MjesanjeTriUnosa()
                {
                    bodovaPrviUnos = 10,
                    bodovaDrugiUnos = 76,
                    zvanjePrviUnos = 0,
                    zvanjeDrugiUnos = 20,
                    bodovaTreciUnos = 76
                });
            }
            

            return mjesanja;
        }


        

            private Igrac kreirajIgraca(string ime, string prezime)
        {
            var igrac = new Igrac()
            {
                ime = ime,
                prezime =prezime
            };
            return igrac;
        }


        static void Main(string[] args)
        {
            new Program();
            //https://stackoverflow.com/questions/13297563/read-and-parse-a-json-file-in-c-sharp
            /*
            using (StreamReader r = new StreamReader("podaci.json"))
            {
                
                string json = r.ReadToEnd();
                Console.WriteLine(json);
                List<Partija> partije = JsonConvert.DeserializeObject<List<Partija>>(json);
                Console.WriteLine(partije.Count);


            }
            */


        }
    }
}
