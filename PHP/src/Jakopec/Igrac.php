<?php


namespace Jakopec;


class Igrac extends Entitet
{

    private $ime;
    private $prezime;
    private $urlSlika;
    private $spol;

    /**
     * Igrac constructor.
     * @param int $id
     * @param string $ime
     * @param string $prezime
     * @param string $urlSlika
     * @param string $spol
     */
    public function __construct(int $id = 0, string $ime = '', string $prezime = '', string $urlSlika = '', string $spol = '')
    {
        parent::__construct($id);
        $this->ime = $ime;
        $this->prezime = $prezime;
        $this->urlSlika = $urlSlika;
        $this->spol = $spol;
    }

    /**
     * @return string
     */
    public function getUrlSlika(): string
    {
        return $this->urlSlika;
    }

    /**
     * @param string $urlSlika
     */
    public function setUrlSlika(string $urlSlika)
    {
        $this->urlSlika = $urlSlika;
    }

    /**
     * @return int
     */
    public function getSpol(): int
    {
        return $this->spol;
    }

    /**
     * @param int $spol
     */
    public function setSpol(int $spol)
    {
        $this->spol = $spol;
    }

    public function __toString(): string
    {
        return $this->getIme() . ' ' . $this->getPrezime();
    }

    /**
     * @return string
     */
    public function getIme(): string
    {
        return $this->ime;
    }

    /**
     * @param string $ime
     */
    public function setIme(string $ime)
    {
        $this->ime = $ime;
    }

    /**
     * @return string
     */
    public function getPrezime(): string
    {
        return $this->prezime;
    }

    /**
     * @param string $prezime
     */
    public function setPrezime(string $prezime)
    {
        $this->prezime = $prezime;
    }

}