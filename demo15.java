import java.util.Scanner;
class BreakEx1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1;
while(i<25){
if(i%5==0)break;
System.out.print(i+",");
i++;
}
}
}