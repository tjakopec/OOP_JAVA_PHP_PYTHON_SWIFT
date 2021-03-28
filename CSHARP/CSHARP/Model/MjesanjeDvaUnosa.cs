using System;
namespace CSHARP.Model
{
    public class MjesanjeDvaUnosa:Mjesanje
    {
        public int bodovaPrviUnos { get; set; }
        public int bodovaDrugiUnos { get; set; }

        public int zvanjePrviUnos { get; set; }
        public int zvanjeDrugiUnos { get; set; }

        public override Rezultat getRezultat()
        {
            return new Rezultat
            {
                prvi = bodovaPrviUnos + zvanjePrviUnos,
                drugi = bodovaDrugiUnos + zvanjeDrugiUnos
            };
        }
    }
}
