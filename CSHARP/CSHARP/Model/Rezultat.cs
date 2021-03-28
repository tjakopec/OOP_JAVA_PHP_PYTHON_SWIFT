using System;
namespace CSHARP.Model
{
    public class Rezultat
    {
        public int prvi { get; set; }
        public int drugi { get; set; }
        public int treci { get; set; }


        public bool isPocetak()
        {
            return prvi == 0 && drugi == 0 && treci == 0;
        }

    }
}
