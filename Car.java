package day10;
//Constructors task

public class Car {
     String make;
     int year;
     // NO ARGUMENTS
      Car(){
    	  this.make="unknown";
    	  this.year=2000;
    	  
      }
      //SINGLE PARAMETER
      Car(String make){
    	  this.make=make;
    	  this.year=2000;
    	   }
      //TWO PARAMETERS
      Car(String make,int year){
    	  this.make=make;
    	  this.year=year;
      }
      //TWO PARAMETERS WITH DIFFERENT ORDER
      Car(int year,String make){
    	  this.make=make;
    	  this.year=year;
      }
      void displayCarDetails() {
    	  System.out.println("make:"+ make);
    	  System.out.println("year:"+ year);

      }
}
