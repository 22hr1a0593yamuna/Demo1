import java.util.Scanner;
class Arithmetic{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Double num1=sc.nextDouble();
Double num2=sc.nextDouble();
Double sum;
Double sub;
Double mul;
Double div;
Double mod;
System.out.println("num1="+num1);
System.out.println("num2="+num2);
sum=num1+num2;
sub=num1-num2;
mul=num1*num2;
div=num1/num2;
if(num2==0)
System.out.println("division is not possible");
else
System.out.println("division is possible");
mod=num1%num2;
System.out.println("The sum="+sum);
System.out.println(num1 +"+"+num2 +"="+sum);
System.out.println(num1+"-"+num2 +"="+sub);
System.out.println(num1+"*"+num2 +"="+mul);
System.out.println(num1+"/"+num2 +"="+div);
System.out.println(num1+"%"+num2 +"="+mod);
}
}