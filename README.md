# OhjelmistotekniikkaHarjoitustyö.
Ohjelma on yksinkertainen ylhäältäpäinkuvattu roolipeli.
## Dokumentaatio
[Changelog](https://github.com/Erikvu/ot-harkkartyo/blob/master/Dokumentit/ChangeLog.md)

[Vaativuusmäärittely](https://github.com/Erikvu/ot-harkkartyo/blob/master/Dokumentit/Vaativuusmaarittely.md)

[Työaika](https://github.com/Erikvu/ot-harkkartyo/blob/master/Dokumentit/Tyoaika.md)

[Arkkitehtuuri](https://github.com/Erikvu/ot-harkkartyo/blob/master/Dokumentit/Arkkitehtuuri.md)

[Testaus](https://github.com/Erikvu/ot-harkkartyo/blob/master/Dokumentit/Testaus.md)


## Projektin suoritus
Ohjelmaa ohjataan nuolinäppäimillä ja välilyönti toimii toiminto näppäimenä.
kansiosta: ~/Documents/Ot-harkkatyo/

Komento: mvn compile exec:java -Dexec.mainClass=rpg.Rpg

### Testaus
testi: mvn test

testikattavuus: mvn jacoco:report

checkstyle: mvn jxr:jxr checkstyle:checkstyle

