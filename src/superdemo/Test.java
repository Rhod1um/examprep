package superdemo;

import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    Student student1 = new Student("alex");
    Teacher teacher1 = new Teacher("clara");

    student1.talk();
    teacher1.talk();

    ArrayList<Human> humans = new ArrayList<>();
    humans.add(student1);
    humans.add(teacher1);

    for (Human h : humans){
      h.talk(); //kan ikke soutes fordi talk() er en void metode
    }
  }
}
