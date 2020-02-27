#  Principi objektno orijentiranog programiranja (OOP) s implementacijom u programskim jezicima Java, PHP i Python Skraćeno: OOP Java, PHP i Python

Predavanje održano u četvrtak 27. 02. 2020. 18:00 u Caffe Bar Peppermint.
<br />
Ovo neka bude početna točka za čitanje literature (na dnu stranice). Nisu prikazani svi OOP principi na ovoj stranici već oni najvažniji. Ostali su uredno prikazana u danim poveznicama. U različitim programskim jezicima je implementiran isti primjer kao rješenje problema domene vođenja rezultata kartaške ige Belot (Bela).


# Klasa/Objekt

<p align="center">
  <b>Klasa je opisnik objekta</b><br /><br />
  <b>Objekt je pojavnost klase</b><br /><br />
  <img src="http://1.bp.blogspot.com/-kLY02rb59-4/U6YZP2IVRTI/AAAAAAAAASI/6imnFTmgioE/s1600/dog.gif">
</p>

## Zašto klasa/objekt?
* Klase omogućuju opisivanje realnog sustava kreirajući podatkovni model za koji radimo aplikaciju u čovjeku razumljivom načinu.

# Učahurivanje

<p align="center">
  <b>Princip kojim klasa skriva svoja svojstva (čini ih privatnima) te omogućuje pristup svojstvima putem javnih metoda</b><br /><br />
  eng. Encapsulation zato što se klasa promatra kao kapsula.<br />
  <img src="https://www.protechbeach.com/wp-content/uploads/2019/03/image-6.png"> <br />
</p>
  
  Uobičajeno da javne metode prate predložak naziva get set pa se takve metode nazivaju geteri i seteri. Literatura takve metode poznaje još pod nazivom Accessors (get) i Mutators (set).
  <br />
  
  <p align="center">
  <img src="https://javatutorial.net/wp-content/uploads/2017/10/java-encapsulation.png">
</p>

## Zašto učahurivanje
* <b>Fleksibilnost</b>: Fleksibilnije je i lakše mijenjati učahureni kôd s novim zahtjevima. 
* <b>Ponovna upotreba</b>: Učahureni kôd može se ponovno upotrijebiti u cijeloj aplikaciji ili u više aplikacija.
* <b>Održavanje</b>: Djelovi aplikacije su učahireni u zasebne jedinice, lako je promijeniti ili ažurirati dio aplikacije bez utjecaja na druge dijelove, što smanjuje vrijeme održavanja.

# Nasljeđivanje

<p align="center">
  <b>Princip kojim novoizgrađena klasa izvlači značajke (metode i svojstva) iz već postojeće klase. Koristeći nasljeđivanje podaci postaju dostupni hijerarhijskim redoslijedom.</b><br /><br />

  <img src="https://cdn.techbeamers.com/wp-content/uploads/2019/04/Inheritance-tree.png"> <br />
  <img src="https://www3.ntu.edu.sg/home/ehchua/programming/java/images/OOP_PersonStudnetTeacher.png"> <br />
</p>

  Klase u java programskom jeziku (htjele to ili ne) uvijek nasljeđuju java.lang.Object koji ima sljedeće metode
  <ul>
  <li>protected Object	clone()</li>
  <li>boolean	equals(Object obj)</li>
  <li>protected void	finalize()</li>
  <li>Class<?>	getClass()</li>
  <li>int	hashCode()</li>
  <li>void	notify()</li>
  <li>void	notifyAll()</li>
  <li>String	toString()</li>
  <li>void	wait()</li>
  <li>void	wait(long timeout)</li>
  <li>void	wait(long timeout, int nanos)</li>
  </ul> 
  <br />

## Zašto nasljeđivanje
* Omogućuje hijerarhijsku organizaciju podataka.
* Smanjuje količinu napisanog kôda.
* Zajednička svojstva različitih klasa možemo poopćiti u nadklasi.

# Višeobličje (polimorfizam)

<p align="center">
  <b>Princip kada podklasa definira svoje jedinstveno ponašanje a u isto vrijeme dalje dijeli iste funkcionalnosti ili ponašanje svoje nadklase. </b><br />
  eng. Polymorphism potječe od 2 grčke riječi: "poly" i "morphs". Riječ "poly" znači mnogo (više), a "morphs" znači oblik. Dakle, polimorfizam znači "više oblika" pa je stoga izraz višeobličje prikladan prijevod :)<br />
  <img src="http://www.btechsmartclass.com/java/java_images/OOP-Concept-Polymorphism.png"> <br />
</p>
  
  Realizira se na način da se u nadklasi definira naziv ponašanja a u podklasama se konkretno ponašenje i implementira.

## Zašto Višeobličje
* Dobijemo pregledniji kôd
* "stavi pravu stvar na pravo mjesto" 

# Domensko znanje
Programiranje je rješavanje problema. OOP su principi koje koristimo u programiranju. Moj problem je vođenje rezultat u kartaškoj igri Belot (Bela). Stoga je prikazan primjep OOP principa na podatkovnom modelu koji omogućuje vođenje rezultata u Beli. Belu mogu igrati dva, tri ili četiri igrača (dva para). Igrači odluče do kojeg broja žele igrati (501, 701, 1001,...). Partija Bele su sva mješanja tijekom kojeg igrač/i skupljaju bodove dok ne dosegnu broj do kojeg se igra partija. Jedno kartanje u pravilu se sastoji od više partija gdje igrači vode skupni rezultat tip: sinoć smo ja i Drajzla pobijedili Marija i Vinka 3:2. Tih tri dva znači da se odigralo 5 partija. Svaka partija se sastoji od mješanja. Na jednom mješanju postoje bodovi igrača. Ako igraju dva igrača onda zbroj bodova s zvanjem ne mora biti jednak 162 + zvanja, dok kod partija tri igrača i dva para ukupni zbroj bodova po mješanju mora biti 162 + zvanja. I sada kada pišem ovaj tekst čini se kao rocket science ali zapravo se radi o dvije matematičke operacije: zbrajanje i oduzimanje.

Model klasa koji će mi omogućiti podatkovni model implementiram OOP principima prikazujem koristeći [UML Class dijagram].
<br />
Samo klase
<br />
<img src="https://github.com/tjakopec/OOP_JAVA_PHP_PYTHON/blob/master/Java/classDiagram0.png?raw=true">
<br />
Klase s svojstvima
<br />
<img src="https://github.com/tjakopec/OOP_JAVA_PHP_PYTHON/blob/master/Java/classDiagram1.png?raw=true">


# Fun facts

# Predavač
Tomislav Jakopec radi kao docent na Odsjeku za informacijske znanosti pri Filozofskom fakultetu Osijek. Voditelj je Dvopredmetnog diplomskog studija informacijske tehnologije. Nositelj je kolegija vezanih uz informacijske tehnologije u društvenom području. Kao vanjski suradnik izvodi nastavu na Stručnom studiju informacijskih tehnologija na Odjelu za informacijske znanosti pri Sveučilištu u Zadru na kolegiju Razvoj mobilnih aplikacija. Veliki je zaljubljenik u informacijske tehnologije općenito.



# Korišteni izvori
* [Programming Bond: Object and Class]
* [Encapsulation In Java,Real Time Example,Diagram | ProtechBeach]
* [Using Accessors and Mutators in Java]
* [Java Encapsulation Example]
* [What is Encapsulation in Java - the WHAT, WHY and HOW]
* [Inheritance in Java – OOP Concept]
* [Java Programming Tutorial OOP - Composition, Inheritance &amp; Polymorphism]
* [Class Object]
* [Java Polymorphism Example]
* [Java Tutorials - OOP Concepts | Encapsulation | Abstraction | Inheritance | Polymorphism]


** Sav korišten kôd, kako u primjerima tako i u razvojnim alatima je besplatan i dostupan u otvorenom pristupu. Stoga je i ovaj sadržaj besplatno dostupan u otvorenom pristupu  **

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [Programming Bond: Object and Class]: <http://programmingbond.blogspot.com/2014/06/object-and-class.html>
   [Encapsulation In Java,Real Time Example,Diagram | ProtechBeach]: <https://www.protechbeach.com/java/encapsulation-in-java-with-real-time-example-with-diagram/>
   [Using Accessors and Mutators in Java]: <https://www.thoughtco.com/accessors-and-mutators-2034335>
   [Java Encapsulation Example]: <https://javatutorial.net/java-encapsulation-example>
   [What is Encapsulation in Java - the WHAT, WHY and HOW]: <https://www.codejava.net/java-core/the-java-language/what-is-encapsulation-in-java-the-what-why-and-how>
   [Inheritance in Java – OOP Concept]: <https://www.techbeamers.com/java-inheritance/>
   [Java Programming Tutorial OOP - Composition, Inheritance &amp; Polymorphism]: <https://www3.ntu.edu.sg/home/ehchua/programming/java/J3b_OOPInheritancePolymorphism.html>
   [Class Object]: <https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html>
   [Java Polymorphism Example]: <https://javatutorial.net/java-polymorphism-example>
   [Java Tutorials - OOP Concepts | Encapsulation | Abstraction | Inheritance | Polymorphism]: <http://www.btechsmartclass.com/java/java-oop-concepts.html>
   [UML Class dijagram]: <https://medium.com/@smagid_allThings/uml-class-diagrams-tutorial-step-by-step-520fd83b300b>



   




