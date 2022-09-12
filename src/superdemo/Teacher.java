package superdemo;

public class Teacher extends Human {

  Teacher(String name){
    super(name);
  }

  @Override
  public void talk() {
    System.out.println("teacher talking");
  }
}
