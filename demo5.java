class Test{
public static void main(String args[]){
int i=0;
int sum=0;
while(i<=100)
{
System.out.print(i+"+");
sum=sum+i;
i=i+5;
}
System.out.print("\b"+"="+sum);
}
}
