# Arkkitehtuurikuvaus

## Rakenne
Ohjelmassa on neljä erillaista pakettia
![Pakkausrakenne](./Kuvat/Package.png)
rpg pitää sisällään gamemanagerin, rpg.character pitää sisällään hahmoluokat, rpg.map pitää sisällään kartan luomiseen tarkoitetut komponentit ja rpg.ui pitää sisällään graafiset jutut.
## Käyttöliittymä
Käyttöliittymän eri näkymät näkyvät vain yksi kerrallaan.
Niitä on kolmea erillaista ne ovat:
- Menunäkymä
- Karttanäkymä
- Taisteluruutu

Eri näkymät ovat omia luokkiaan ja niiden näyttämisestä vastaa Ui
## Sovelluslogiikka
Sovelluslogiikasta vastaa GameManager luokka.
![Gamemanager](./Kuvat/Basic.png)
### Päätoiminnallisuudet

#### Muut toiminnallisuudet

## Ohjelman rakenteeseen jääneet heikkoudet

### käyttöliittymä
