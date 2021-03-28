using System;
namespace CSHARP.Model
{
    public class MjesanjeTriUnosa:MjesanjeDvaUnosa
    {

        public int bodovaTreciUnos { get; set; }
        public int zvanjeTreciUnos { get; set; }


        public override Rezultat getRezultat()
        {
            var r = base.getRezultat();
            r.treci = bodovaTreciUnos + zvanjeTreciUnos;
            return r;
        }
    }
}
