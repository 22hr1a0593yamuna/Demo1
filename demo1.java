import java.util.scanner;
class Note1
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
while(number!=0);
{
int remainder=number%10;
 int reverse=reverse*10+remainder;
number=number/10;
}
}
}