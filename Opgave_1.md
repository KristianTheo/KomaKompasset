## Opgave 1
### Beskrivelse
Der skal til KomaKompasset tilføjes en tabel på forsiden, der viser beregninger

### Mockup
Design på tabellen skal matche designet fra DKFDS
https://designsystem.dk/komponenter/tables/

### Acceptkriterier
1. Tabellen skal have 5 kolonner (Beskrivelse, Værdi 1, Værdi 2, Værdi 3, Samlet værdi)
2. "Samlet værdi" er beregnet ved (Værdi 1 + Værdi 2) * Værdi 3 * Multiplikator
3. Multiplikatoren skal ikke vises i tabellen
4. Beskrivelsen skal vises som fed tekst
5. Tabellen skal ligne mockup fra DKFDS

### Løsningsbeskrivelse
1. Lav en ny component CalculationTable. 
2. Indsæt komponenten i stedet for HelloWorld i MainView
3. Tilpas interface typen CalculationEntry.ts så den matcher CalculationEntry.java
4. Lav et axios get-kald til localhost:3000/getdata i Componentens "created"-hook
   - getdata giver dig et array af CalculationEntry objekter i JSON format
5. Lav en "v-for" med tabelrækker der tegner hver CalculationEntry jf. acceptkriterierne
