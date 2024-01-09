import java.util.Scanner;
class PolymorphismExample1
{
void print(){
System.out.println("welcome");}
void print(String n){
System.out.println("welcome"+n);}
}
class Test{
public static void main(String args[]){
polymorphismExample1 ob1=new polymorphismExample1();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("please type your name:");
String s=sc.next();
ob1.print(s);
}
}