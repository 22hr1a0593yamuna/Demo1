import java.util.Scanner;
class pattern1{
public static void printPattern(char c,int n){
for(int i=0;i<n;i++){
System.out.print("\n");
for (int j=0;j<=i;j++)
System.out.print(c);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printPattern(ch,row);
}
}

