import java.util.Scanner;
class CheckPrime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int inputNum=sc.nextInt();
int count=0;
for(int i=1;i<=inputNum;i++)
{
if(inputNum%i==0)
{
count++;
System.out.print(i);
if(i!=inputNum)
System.out.print(",");
}
}
System.out.println("\nCount of factors of"+inputNum+"is"+count);
if(count==2)
System.out.println("PRIME");
else
System.out.println("NOT PRIME");
}
}