package fildemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
  //her er der også en masse måder at læse fra filer på

  void go(){
    try{
      File file = new File("fildemo/newfile.txt");
      Scanner filescanner = new Scanner(file); //den kunne ikke se filen lavet i den anden klasse, måske fordi programmet ikke ha værer kørt og filen derfor ikke oprettet
      while (filescanner.hasNext()){
        System.out.println(filescanner.nextLine());
      }
    }catch (IOException f){
      System.err.println(f);
    }
  }
}
