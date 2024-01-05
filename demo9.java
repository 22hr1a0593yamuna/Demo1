import java.util.Scanner;
class ReverseDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int rd=0;
n=sc.nextInt();
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
System.out.println(rd);
}
}