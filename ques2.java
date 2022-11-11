import java.util.*;

   class Customer{
       String name,address;
       int age;
   }
   class Account{
       String accType,branchType;
   }
   class RBI{ // Base class
       int withLimit,n;
       double A,P,r;
       float t;
       long avg,tot,mb;
      
       int setWithdrawalLimit() {
           Scanner inp = new Scanner(System.in);
           String actype=inp.next();
           String brtype=inp.next();
           inp.close();
           if(actype=="SAVINGS" && brtype=="METRO") {
               withLimit = 5000;
           }else {
               withLimit = 4000;
           }
       return withLimit;
       }
      
       double setInterestRate(){
           A=(P+r)/n*t;
           return A;
       }
      
       long setMAB(){
           mb=(avg*tot)/31;
           return mb;
       }
   }
  
   class SBI extends RBI{ // Child class1
       double setInterestRate() {
           A=P*(1+r/n)+n*t;
           return A;
       }
       long setMAB() {
           mb=(avg+tot)/30;
           return mb;
       }
   }
  
   class ICICI extends RBI{ // Child class2
       double setInterestRate() {
           A=(P*r)/n+t;
           return A;
       }
      
       int setWithdrawalLimit() {
           withLimit=7000;
           return withLimit;
       }
   }


public class ques2 {
    public static void main(String args[]){
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        sbi.P=9.433;
        sbi.r=6.42;
        sbi.n=4;
        sbi.t=6;
        Double sbiInt=sbi.setInterestRate();
        System.out.println("SBI interest rate is:"+sbiInt);
        int iciciWL= icici.setWithdrawalLimit();
        System.out.println("ICICI withdraw limit is:"+iciciWL);
     } 
    
}
