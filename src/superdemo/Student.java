package superdemo;

public class Student extends Human {
 //autogenerer overridede metoder ved at trykke på pop-uppens drop down
  Student(String name){
    super(name);
  }
  @Override
  public void talk() {
    super.talk(); //kalder først Human klassen
    System.out.println("student talking");
  }
}
//super skal stå øverst i konstruktoren

//Konstruktører SKAL matche super. Vil man kalde en anden konstruktør end super skal supers konstruktør overloades
//det SKAL ske fordi mennesker har bestemt at
//det giver ikke mening at lave et sprog hvor konstruktøren ikke matcher super, da man skal gøres som den gør
//for at instantiere objektet. Når et objekt instantieres går den op i arvehierarkiet til den når objekt og så
//går den ned og "laver"? de metoder der er i de forskellige attributter og metoder ned i hierarkiet.


//toString arves fra object