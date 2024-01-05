import java.util.Scanner;
class Increment{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=10;
int a=i+1;
System.out.println("a="+a);
System.out.println(i);
++i;
System.out.println(i);
System.out.println(++i);
System.out.println(i++);
System.out.println(i);
int j=10;
int b=++j;
System.out.println("b="+b);
}
}