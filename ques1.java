class Mammals{
    void print(){
       System.out.println("I am mammal");
    }
   }
   class MarineAnimals extends Mammals{              
       void print(){                               
      System.out.println("I am a marine animal"); 
       }
       void printParent(){
           super.print();
        //    super is used to call the function of parent
       }
      }
   class BlueWhale extends MarineAnimals{   //Now it will inherit both the classes. 
                                           //Also multiple inheritence in not there in java
       void print(){
       System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
       }
       void printMA(){
           super.print();
        //    this will call the print of Marine animals.
       }
       void printMam(){
           super.printParent();
        //    this will be used to call the print function of Mammals. As first it will call the printparent which
        //  will then call the print of Mammals
       }
   }
   
 

public class ques1 {
    public static void main(String args[]){
        Mammals mammal=new Mammals();
        MarineAnimals Marine=new MarineAnimals();
        BlueWhale BlueWh=new BlueWhale();
   
        mammal.print();  //function of Mammals by object of Mammals
        Marine.print(); //function of MarineAnimals by object of MarineAnimals
        BlueWh.print(); //function of BlueWhale by object of BlueWhale
        
        BlueWh.printMA(); //function of MarineAnimals by object of BlueWhale
        BlueWh.printMam(); //function of Mammals by object of BlueWhale
       } 
    
}
