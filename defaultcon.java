class A{
A(){
System.out.println("hello a from default constructor");}
A(int x){
this();
System.out.println(x);
}
}
class Test5{
public static void main(String args[]){
A a=new A(10);
}
}