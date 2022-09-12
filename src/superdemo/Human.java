package superdemo;

public abstract class Human { //abstract pga overklasse
  private String name;

  Human (String name){
    this.name = name;
  }
  public void talk(){
    System.out.println("human talking");
  }
  String getName(){
    return name;
  }

}
