using System;
namespace CSHARP.Model
{
    public abstract class Mjesanje: Entitet
    {
        public abstract Rezultat getRezultat();

        public bool stiglja { get; set; }
        public bool belot { get; set; }
    }
}
