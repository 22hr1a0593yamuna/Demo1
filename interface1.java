interface printable{
void print();
}
interface Showable{
void show();
}
class A implements printable,Showable{
public void print(){System.out.println("hello");}
public void show(){System.out.println("welcome");}
}
class Test{
public static void main(String args[]){
A obj=new A();
obj.print();
obj.show();
}
}