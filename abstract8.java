interface printable{
void print();
}
class A6 implements printable{
public void print()
{
System.out.println("hello");}
}
class Test{
public static void main(String args[]){
A6 obj=new A6();
obj.print();
}
}