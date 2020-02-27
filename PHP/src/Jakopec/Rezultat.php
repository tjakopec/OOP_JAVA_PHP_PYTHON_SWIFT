<?php


namespace Jakopec;


class Rezultat
{

    private $prvi;
    private $drugi;
    private $treci;

    /**
     * Rezultat constructor.
     * @param int $prvi
     * @param int $drugi
     * @param int $treci
     */
    public function __construct(int $prvi = 0, int $drugi = 0, int $treci = 0)
    {
        $this->prvi = $prvi;
        $this->drugi = $drugi;
        $this->treci = $treci;
    }

    /**
     * @return int
     */
    public function getPrvi(): int
    {
        return $this->prvi;
    }

    /**
     * @param int $prvi
     */
    public function setPrvi(int $prvi)
    {
        $this->prvi = $prvi;
    }

    /**
     * @return int
     */
    public function getDrugi(): int
    {
        return $this->drugi;
    }

    /**
     * @param int $drugi
     */
    public function setDrugi(int $drugi)
    {
        $this->drugi = $drugi;
    }

    /**
     * @return int
     */
    public function getTreci(): int
    {
        return $this->treci;
    }

    /**
     * @param int $treci
     */
    public function setTreci(int $treci)
    {
        $this->treci = $treci;
    }

    public function isPocetak(): bool
    {
        return $this->prvi == 0 && $this->drugi == 0 && $this->treci == 0;
    }

}