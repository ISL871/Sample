
package myfirstprogram;
import java.util.ArrayList;
import java.util.Scanner;
public class MyFirstProgram {
public ArrayList<String> addStudent = new ArrayList<String>();
public static String Studname;
    public static void main(String[] args) {
     MainMenu();
    }
    public static void MainMenu(){
      Scanner scan = new Scanner(System.in);
      System.out.print("[1]ADD STUDENT\n"
                     + "[2]VIEW ALL STUDENT\n"
                     + "[3]VIEW SINGLE STUDENT\n"
                     + "[4]DELETE ALL STUDENT\n"
                     + "[5]DELETE SINGLE STUDENT\n"
                     + "[6]EXIT\n");
      int choice = scan.nextInt();
      scan.nextLine();
      switch(choice){
          case 1: 
          ADD();
          break;
          case 2:
          System.out.println("View Students");
          View();
          break;
          default:
    }
    }
    public static void ADD(){
    Scanner scan = new Scanner(System.in);
    MyFirstProgram f = new MyFirstProgram();
    ADDING add = new ADDING();
    System.out.println("enter stud name");
          Studname =scan.nextLine();
          add.setStudName(Studname);
          String Student = add.getStudName();
          f.addStudent.add(Student);
          MainMenu();
      }
    public static void View(){
       MyFirstProgram m = new MyFirstProgram();
       System.out.println(m.addStudent);
       MainMenu();
    }
}
