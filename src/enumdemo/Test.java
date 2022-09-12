package enumdemo;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Test {

    void isWeekend(DaysOfWeek daysOfWeek){ //Her ved switchen hvad datatype dens expression er så man kan bare skrive
        //MONDAY, ligesom den ved at noget er en String eller int. Normalt skal man skrive DaysOfWeek.MONDAY
        switch (daysOfWeek){ //i parantesen hedder det en expression, ikke parameter.
            // Da det er et boolsk udtryk, og kan være et matematisk udtryk.
            //kan hedde condition i iffer og whiles osv.
            //parametrene i funktionen kan hedde parameterliste
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("workday");
            case SATURDAY, SUNDAY -> System.out.println("weekend");
        }
    }

    void run(){
        isWeekend(DaysOfWeek.SATURDAY);

        //initialisering?
        DaysOfWeek day = DaysOfWeek.MONDAY;

        //ekstra
        DaysOfWeek day2 = DaysOfWeek.valueOf("MONDAY");
        System.out.println(day2);
        DaysOfWeek[] days = DaysOfWeek.values(); //returnere et array af alle dagene, alle enummerne
        System.out.println(Arrays.toString(days));

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
        //Specific day:
        System.out.println("day:" + DaysOfWeek.values()[4]);
    }

    //lav en run/go metode til eksamen, da det kan give problemer at lave det i main pga static context
    //patrick vil sige man skal lave en run/go metode hvis han kan se man vil få problemer uden den

    public static void main(String[] args) {
        //new Test().run();
        new Test().error();
    }

    void error(){
        System.out.println("hgvjbkn");
        try{
            File path = new File("List.txt");
            System.out.println("vghjk");
            FileWriter fw = new FileWriter(path);
            fw.write("asd");
            fw.close();
            throw new Error();
        } catch (Throwable t) {
            System.out.println(t);
        }
        System.out.println("gjhk");
    }
}

// hvad hedder enums konstanterne?
//fx"lav et loop der printer alle enums'ne"?
//MONDAY er en værdi mens "enheden"/"klassen" er en enum. MONDAY er også en konstant
//må kaldes værdi og konstant
//.valuesOf for enums er et DaysOfTheWeek array, ikke et String array. Men når man udskriver det
//er det Strings da toString er implementeret i enummen da det arves fra objekt og er overloaded
//til at udskrive enums så det giver mening

//final klasser er bare klasser der hverken kan arve eller være overklasse? Kun det?
//man kan ikke lave subklasser af final klasser men klasser kan ALTID arve fra andre da alt nedarves fra objekt

//skal man bare bruge den nemmeste måde at løse noget på til eksamen, fx Math.gennemsnit og
// output array brug Arrays.toString i stedet for for-loop?
//

//objekter fylder det attributterne fylder i hukommelsen. Instantieringen i sig selv fylder ikke noget?

// .equals() på objekter, hvad sammenligner det? RAM? Skal de være helt ens på alle måder?
//nej equals på to forskellige new objekter skal man selv override og definere hvordan de er ens,
//der er ikke nogen automatisk måde.
//både equals og == sammenligner referencer på objekter og vil give true hvis referencerne er ens og
//at de dermed er de samme. Har man to new objekter skal man selv definere hvordan de sammenlgines

//contains() bruger også equals() er det en anden equals?

//hvorfor skulle man ikke bare catche en Throwable frem for exception

//skal man skrive .Locale(locale ENGLISH)

//hvorfor to \n\n i fildemo?

//hvorfor bliver konstruktører ikke nedarvet

//hvis en abstract overklasse implementere et interface, skal en arvende underklasse så implementere det?

//FC Martin sagde at interfaces kan ligges som attribut, så skal man ikke implementere metoderne

//Scanner token = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
//hvorfor bruge .useLocale(Locale.ENGLISH) ?



//initialisering betyder? Primitiver kun? nej alt er initialisering undtagen med new, som er instantiering
// private Driver driver = new Drivre   højre side er instantiering, venstre side af driver er initialisering

//invarians betyder at fx nogen attributter kun må have tal i en bestemt interval. Hvis det går ud over
//intervallet overholder det ikke klassens invarians
//Car (int weight){
    //if (weight > 0) this.weight = weight;
    //else weight = 0;
//her tvinger konstruktøren vægten til at være minimum 0
//i elsen kan der throwes en exception
//  else throw new IllegalArgumentException("No less than 0 allowed);
//settere skal overholde klassens invarians!!!!! Fx klokkeslet skal ikke kunne tage 15.67
//kan man altid bare throwe exceptions som her? hvor den bare printer ud at den brokker sig?

//hvad bruger man finally til efter try-catch?
//finally sker uanset om der sker en catch eller ej
//den vil typisk lukke en fil eller lukke et skærmvindue eller sige "done"
//den skal rydde op uanset om det man gjorde gik godt eller dårligt
//da programmet ikke lukker ned når den catcher en exception, vil det næste kode efter catchen
//blive udført alligevel så finally er i princippet ligegyligt men det er konvention hvis man
//vil gøre et eller andet relateret til try-catchen

//hvis der ikke er en fil og finally vil lukke filen kan man iffe if instansen af filen er null
//det i sig selv kan try-catches og det kan man gøre uendeligt

//check linked in learning vi har gratis adgang på kea, se JUnit

//umiddelbart skal man bare læse nogle linjer fra filer
//dog kan man skulle lave en log fil med tokens fx den med vaskemaskinen

//så kun txt eller også csv?
//vi kommer ikke til a læse tokens fra en fil men vi kan godt kunne skrive til en csv.
//String tokenizer
// StringTokenizer st = new StringTokenizer("navn,yndlingsdrik", ","); "," er delimiter
//while (st.hasMoreTokens){
    //sout(">>" + st.nextToken());
//}
//dog måske skal man bruge dette? Tokenizer

//koble en klasse til en anden, hvad betyder det i eksamensspørgsmål?
//fx en producer klasse og en film klasse så kan en film klasse få en producer koblet til, altså
//producer lægges som attribut i film. Film "kender" sin egen producer
//hvis flere så lav arrayliste
//i klassediagram så har man en pil fra film til producer, for film ejer producer
//hvis arrayliste så lav en metode til addProducer så der er invarians (data er beskyttet)

//ofte til skrive til filer, skriv fire navne til filen adskilt af ny linje

//hvad hedder det når et interface kun har én metode? Funktionel interface
//comparable har compareTo
//og comparator har compare

//compareTo modtager noget som den sammenligner med. Vi kalder metoden på den første der skrives
//hvilken er størst? Er den første størst? Så returnere den 1 (eller vhilken som helst int større end 0)
//det gør ikke noget at bytte om til eksamen
//er other størst returneres -1
//bare byt om
//natural order er at vi selv definerer hvilken attribut vi sortere efter

//hvis man sammngliner fx farver, som man ikke rigtig kan så sortere den på fx alfabetisk orden
//eller hvad ellers vi vælger. Lav iffer hvis man ikke kan sammenlgine direkte:
//compareTo
    //if(topSpeed > other.topSpeed) return 1;
    //else if (topSpeed < other.topSpeed) return -1;
    //else return 0;
//man skriver manuelt iffer hvis man ikke kan sortere det anderledes. Tal er nemt at sortere
//og alfabetisk orden
//lav også iffer hvis vi vil specificere hvordan skal skal sorteres, fx
//if(topSpeed < 1500 || topSpeed > 300)
//det er dog for avanceret til eksamen

//comparable sammenlginer noget MED noget andet, tager udgangspunkt i det første
//comparator sammenlginer to med HINANDEN
//comparator kan altid laves uden at skulle ændre i eksisterende klasser
//man skal ikke bruge getter i comparable da begge car er i samme klasse. De er i car klassen
//og selv other.car er i car så der er car attributterne i klassen.
//man skriver ikke this.car da car.topSpeed ikke shadower. Man får et objekt ind og ikke en attribut
//i settere skriver man this fordi man får en parameter ind som shadower klassens attribut
// hvis man

//implements Comparable <Car> <> er generics men bare kald det typen. Den får typen Car

//eksempel spm 2: en bil må ikke overskride top-hastigheden

//funktionsheaderen hedder metodedeklaration

//man bruger kun this. hvis der er shadowing

//eksamenstiden starter først når man har læst og forstået spørgsmålet
//hvis man stiller spørgsmål til en af spørgsmålene så bruger det ikke ens tid
//tiden starter når man siger man er klar og har forstået spørgsmålet

//hav projektet klar men ikke main. Men ellers skal man lave projektet når man er der inde
//før tiden starter

//String[] args i main kommer fra gamle dage hvor programmer blev startet i terminalen
//der kunne man give den nogle argumenter, fx filnavne?

//hvorfor er main public static void main (String[] args)
//static fordi man ikke må lave objekter af den, void fordi den ikke returnere noget, public fordi
//den skal kunne nås alle steder i programmet?
//String-arrayet skal være der men args kan hedde noget andet da det bare er en parameter

//implementere en klasse et interface så behøver den ikke implementere dens metoder hvis klassene er abstract
//det er bare den nederste ikke-abstract subklasse der SKAL implementere interfacet
//hvis en abstract overklasse implementere et interface, skal en arvende underklasse så implementere det?

//protected kan ses ned gennem arvehiearkiet samt ses af andre packages