import java.util.Scanner;
class A{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.print("Enter the nth term");
n=sc.nextInt();
System.out.print("Fibonacci series");
while(sum<=n)
{
System.out.println(sum+" ");
a=b;
b=sum;
sum=a+b;
}
}
}