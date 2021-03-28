using System;
namespace CSHARP.Model
{
    public class PartijaDvaIgraca: Partija
    {
        public override string ToString()
        {
            var r = getRezultat();
            return "Partija DVA IGRAČA, igra gotova: " + isIgraGotova() + ", " + igraci[0] + ": " +
                    r.prvi +
                    " | " + igraci[1] + ": " + r.drugi;
        }
    }
}
