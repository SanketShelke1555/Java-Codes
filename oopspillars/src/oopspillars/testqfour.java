package oopspillars;


interface Aa {
 void show();   
}


abstract class Bb {
 abstract void display();      
 
 public void message() {              
     System.out.println("Message of abstract class B");
 }
}


class Cc extends Bb implements Aa {

 public void show() {
     System.out.println("show from interface A");
 }

 public void display() {
     System.out.println("display from abstract class B");
 }
}

public class testqfour {
 public static void main(String[] args) {
     
     Cc obj = new Cc();
     obj.show();      
     obj.display();   
     obj.message();   
 }
}

