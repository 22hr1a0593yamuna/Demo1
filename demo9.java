 class PrePostDecrementExample
{
public static void main(String args[]){
int i=20;
int a=i--;
System.out.println("a="+a);
System.out.println("i"+i);
--i;
System.out.println(i);
System.out.println(--i);
System.out.println(i--);
System.out.println(i);
int j=20;
int b=--j;
System.out.println("b="+b);
System.out.println("j"+j);
}
}