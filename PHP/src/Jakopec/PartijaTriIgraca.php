<?php


namespace Jakopec;


class PartijaTriIgraca extends Partija
{

    public function __toString(): string
    {
        $rezultat = $this->getRezultat();
        return 'Partija TRI IGRAČA, igra gotova: ' . $this->isIgraGotova() . ', ' . $this->getIgraci()[0] . ' i ' . ': ' .
            $rezultat->getPrvi() .
            ' | ' . $this->getIgraci()[1] . ': ' . $rezultat->getDrugi() .
            ' | ' . $this->getIgraci()[2] . ': ' . $rezultat->getTreci();
    }

    public function getRezultat(): Rezultat
    {
        $rezultat = parent::getRezultat();

        $b = 0;
        foreach ($this->getMjesanja() as $mjesanje) {
            $b += $mjesanje->getRezultat()->getTreci();
        }
        $rezultat->setTreci($b);

        return $rezultat;
    }
}