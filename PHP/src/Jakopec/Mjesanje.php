<?php


namespace Jakopec;


use DateTime as DateTime;
use Exception;

abstract class Mjesanje extends Entitet
{

    private $stiglja;
    private $belot;
    private $datumUnosa;

    /**
     * Mjesanje constructor.
     * @param int $id
     * @param bool $stiglja
     * @param bool $belot
     * @param DateTime $datumUnosa
     * @throws Exception
     */
    public function __construct(int $id, bool $stiglja = false, bool $belot = false, DateTime $datumUnosa = null)
    {
        parent::__construct($id);
        $this->stiglja = $stiglja;
        $this->belot = $belot;
        $this->datumUnosa = $datumUnosa == null ? new DateTime() : $datumUnosa;
    }

    /**
     * @return Rezultat
     */
    public abstract function getRezultat(): Rezultat;

    /**
     * @return bool
     */
    public function isStiglja(): bool
    {
        return $this->stiglja;
    }

    /**
     * @param bool $stiglja
     */
    public function setStiglja(bool $stiglja)
    {
        $this->stiglja = $stiglja;
    }

    /**
     * @return bool
     */
    public function isBelot(): bool
    {
        return $this->belot;
    }

    /**
     * @param bool $belot
     */
    public function setBelot(bool $belot)
    {
        $this->belot = $belot;
    }

    /**
     * @return DateTime
     */
    public function getDatumUnosa(): DateTime
    {
        return $this->datumUnosa;
    }

    /**
     * @param DateTime $datumUnosa
     */
    public function setDatumUnosa(DateTime $datumUnosa)
    {
        $this->datumUnosa = $datumUnosa;
    }


}