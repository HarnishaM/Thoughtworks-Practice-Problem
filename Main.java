import java.util.*;
class Main{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);

Customer c=new Customer();

System.out.println("Enter viewing hours for Netflix:");
int n=sc.nextInt();
c.addServices(new Netflix(),n);
System.out.println("Enter viewing hours for AmazonPrime:");
int a=sc.nextInt();
c.addServices(new AmazonPrime(), a);
System.out.println("Enter viewing hours for Hotstar:");
int h=sc.nextInt();
c.addServices(new Hotstar(), h);
System.out.println("Total amount to be paid is:" + c.calculateCost());
sc.close();
    }
    
}