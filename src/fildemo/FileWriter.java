package fildemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriter {

  void go() {
    try {
      File file = new File("fildemo/newfile.txt");
      PrintStream printStream = new PrintStream(file); //man må også bruge andre metoder, printwriter osv,
      //der er forskelle den ene skriver linjer den anden skriver karakter for karakter
      //man vil hellere try castche end at throwe fordi vi vil fange en exception så tidligt som muligt og ikke
      //smide den tilbage i systemet, ellers skal alle metoder der kalder metoden forholde sig til det
      //indtil den smides tilbage til brugeren
      printStream.println("one line");
      printStream.println("another line \n and last");
    } catch (FileNotFoundException f){
      System.err.println(f);
    } finally {
      //???
    }
  }
}
//lav try-catch manuelt
//de spørger ikke til de forskellige måder at skrive til filer
//vælg try-catch! og ikke at throwe
