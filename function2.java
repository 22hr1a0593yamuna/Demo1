java.util.Scanner;
class Demo{
public static void displayMenu()
{
System.out.println("+:Addition");
System.out.println("-:Substraction\n*:Multiplication");
System.out.println("/:Division");
}
public void add(int a,int b)
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
public int sub(int a,int b)
{
int res=a-b;
return res;
}
}
class Test{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
int r=ob.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}