<?php


namespace Jakopec;


class PartijaDvaIgraca extends Partija
{
    public function __toString(): string
    {

        $rezultat = $this->getRezultat();
   return 'Partija DVA IGRAČA, igra gotova: ' . $this->isIgraGotova() . ', ' . $this->getIgraci()[0] . ' i ' . ': ' .
       $rezultat->getPrvi() .
       ' | ' . $this->getIgraci()[1] . ': ' . $rezultat->getDrugi();
    }
}