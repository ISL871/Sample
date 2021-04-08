
package myfirstprogram;

import java.util.ArrayList;
//tite


 public class VIEW implements VIEWSTUDENT{
    private String viewStud=""; 
    public void viewStudent(ArrayList<String> v) {
        for(int i=0;i<v.size();i++){
        
               this.viewStud = v.get(i);   
           }
    }
    public  ArrayList<String> getView(){
        MyFirstProgram m = new MyFirstProgram();
    
        return  m.addStudent;
    }
    public static void callmemaybe(){
        System.out.println("wala lang");
    }
}

