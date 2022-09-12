package abstractclasses;

public abstract class IAmAnAbstractClass {
    //Kan ikke instantieres
    //bruges til overklasser
    //Is-A relationship - overklasse og subklasse
    //bruges ikke rigtig ud over det undtagen at Math er måske abstract
}
//en final klasse kan ikke arve

//new Klasse() - parantesen er at man kalder konstruktoren. Man kalder en metode når man instantierer.

//java køre i en sandbox og derfor kan man ikke have pointeres/pege direkte til hukommelsem.
// Det forhindre wild pointers. Patricks eksempel, hvis man skriver i word og starter et spil op
//kan formatteringen i word pludselig være blevet ændret pga spillet havde en wild pointer

//husk altid at skrive kode i en metode. Meget klassisk fejl

// == bruges til primitiver, .equals() bruges til objekter, altså to objekter som er ens
// == bruges også til objekter men at teste om det er DET SAMME OBJEKT, ét new
// == sammenligner REFERENCER når det gælder objekter

//wrapper klasser er objekter med simple datatyper, fx Integer, Float, Boolean osv.
// Objekt der indkapsler simple datatyper. Det er praktisk fordi der følger metoder med, fx valueOf
//og at kunne bruge dem i arraylister

//null betyder der ikke er en reference på instancen. Kan derfor kun bruges på objekter

//hvis java siger at noget er deprecated betyder det det på et tidspunkt ikke vil virke længere men
//efter patricks erfaring bliver det ved med at virke

//objekter fylder det attributterne fylder i hukommelsen. Instantieringen i sig selv fylder ikke noget?

//<> i arrayliste er generics og bestemmer at der kun kan komme dén type ind

//de røde streger er intellij, det er ikke compileren der laver exceptions.
//exceptions er dem der kan catches (unchecked, fx nullpointerexception eller arrayindexoutofbounds)
//checked exceptions tjekkes af compileren (javac) og den får man før programmet kan køre,
//programmet kan ikke køre med en checked exception. Den kan godt med unchecked fordi det er JVM
//der først opdager den runtime. Derfor skal den catches da det sker mens programmet køre

//kun unchecked kan catches. Checked er tjekket fra start og errors får det hele til at gå ned
//checked kan også catches!! Patrick checkede op på det

//til eksamen vil de have en mere specifikt exception frem for bare Ecxeption
// men i stedet ArithmeticException, FileNotFound, IndexOutOfBounds, NullPointerException osv

//catch (Exception e){
    //sout("fandt ikke fil");
//}
//Exception e skal bare catches den behøver ikke printes ud eller bruges til noget
