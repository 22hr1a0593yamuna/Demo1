import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')&&(c=='0'||c=='1'||c=='2'||c
System.out.println("YES");
else
System.out.println("NO");
}
}