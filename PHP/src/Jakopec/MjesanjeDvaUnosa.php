<?php


namespace Jakopec;


use Exception;

class MjesanjeDvaUnosa extends Mjesanje
{

    private $bodovaPrviUnos;
    private $bodovaDrugiUnos;

    private $zvanjePrviUnos;
    private $zvanjeDrugiUnos;

    /**
     * MjesanjeDvaUnosa constructor.
     * @param int $id
     * @param bool $stiglja
     * @param bool $belot
     * @param DateTime|null $datumUnosa
     * @param int $bodovaPrviUnos
     * @param int $bodovaDrugiUnos
     * @param int $zvanjePrviUnos
     * @param int $zvanjeDrugiUnos
     * @throws Exception
     */
    public function __construct(int $id=0, bool $stiglja = false, bool $belot = false, DateTime $datumUnosa = null, int $bodovaPrviUnos = 0, int $bodovaDrugiUnos = 0, int $zvanjePrviUnos = 0, int $zvanjeDrugiUnos = 0)
    {
        parent::__construct($id, $stiglja, $belot, $datumUnosa);
        $this->bodovaPrviUnos = $bodovaPrviUnos;
        $this->bodovaDrugiUnos = $bodovaDrugiUnos;
        $this->zvanjePrviUnos = $zvanjePrviUnos;
        $this->zvanjeDrugiUnos = $zvanjeDrugiUnos;
    }

    /**
     * @return int
     */
    public function getBodovaDrugiUnos(): int
    {
        return $this->bodovaDrugiUnos;
    }

    /**
     * @param int $bodovaDrugiUnos
     */
    public function setBodovaDrugiUnos(int $bodovaDrugiUnos)
    {
        $this->bodovaDrugiUnos = $bodovaDrugiUnos;
    }

    /**
     * @inheritDoc
     */
    public function getRezultat(): Rezultat
    {
        $rezultat = new Rezultat();
        $rezultat->setPrvi($this->getBodovaPrviUnos() + $this->getZvanjePrviUnos());
        $rezultat->setDrugi($this->getBodovaDrugiUnos() + $this->getZvanjeDrugiUnos());
        return $rezultat;
    }

    /**
     * @return int
     */
    public function getBodovaPrviUnos(): int
    {
        return $this->bodovaPrviUnos;
    }

    /**
     * @param int $bodovaPrviUnos
     */
    public function setBodovaPrviUnos(int $bodovaPrviUnos)
    {
        $this->bodovaPrviUnos = $bodovaPrviUnos;
    }

    /**
     * @return int
     */
    public function getZvanjePrviUnos(): int
    {
        return $this->zvanjePrviUnos;
    }

    /**
     * @param int $zvanjePrviUnos
     */
    public function setZvanjePrviUnos(int $zvanjePrviUnos)
    {
        $this->zvanjePrviUnos = $zvanjePrviUnos;
    }

    /**
     * @return int
     */
    public function getZvanjeDrugiUnos(): int
    {
        return $this->zvanjeDrugiUnos;
    }

    /**
     * @param int $zvanjeDrugiUnos
     */
    public function setZvanjeDrugiUnos(int $zvanjeDrugiUnos)
    {
        $this->zvanjeDrugiUnos = $zvanjeDrugiUnos;
    }
}