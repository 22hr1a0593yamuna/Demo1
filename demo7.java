import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
boolean cond=true;
System.out.println("Conds is:"+cond);
System.out.println("Var1="+a);
System.out.println("Var2="+b);
System.out.println("Now cond is:"+!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}