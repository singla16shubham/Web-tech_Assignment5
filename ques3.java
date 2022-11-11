import java.util.*;

class Marks{
    int rollNo,marks;
    String name;
}
class Physics extends Marks{
  Physics(String name,int marks){
    this.name=name;
    this.marks=marks;
  }
}
class Chemistry extends Marks{
    Chemistry(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
class Mathematics extends Marks{
    Mathematics(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}


public class ques3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt(); //number of students
        
        Physics arr1[]=new Physics[n]; //arrays to store marks of each student in physics
        Chemistry arr2[]=new Chemistry[n]; //arrays to store marks of each student in chemistry
        Mathematics arr3[]=new Mathematics[n]; //arrays to store marks of each student in math
        for(int i=0;i<n;i++){
           System.out.print("Enter name of student "+(i+1)+": ");
           String temp=sc.next();
           System.out.print("Enter marks in physics, chemistry, mathematics respectively seperated by space: ");
   
           int Marks=sc.nextInt(); //Marks in physics
           Physics p=new Physics(temp, Marks);  //creating an object with name and marks
           arr1[i]=p;              //pushing the object into the array
   
           Marks=sc.nextInt(); // Marks in chemistry
           Chemistry c=new Chemistry(temp, Marks);
           arr2[i]=c;
   
           Marks=sc.nextInt(); // Marks in math
           Mathematics m=new Mathematics(temp, Marks);
           arr3[i]=m;
        }
        int pTotal,cTotal,mTotal;
        pTotal=0;
        cTotal=0;
        mTotal=0;
        for(int i=0;i<n;i++){
           pTotal+=arr1[i].marks;
           cTotal+=arr2[i].marks;
           mTotal+=arr3[i].marks;
        }
        for(int i=0;i<n;i++)
           System.out.println("Total marks of student "+(i+1)+": "+(arr1[i].marks+arr2[i].marks+arr3[i].marks)); 
   
        System.out.println("Average marks of the class in physics: "+(pTotal*1.0/n));
        System.out.println("Average marks of the class in chemistry: "+(cTotal*1.0/n));
        System.out.println("Average marks of the class in chemistry: "+(mTotal*1.0/n));
        System.out.println("Average total marks of the class: "+(mTotal+cTotal+pTotal)*1.0/n);
        sc.close();
       }
    
}
