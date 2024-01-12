abstract class MyClass{
public void disp1(){
System.out.println("Concrete method of parent class");
}
abstract public void disp2();
}
class Demo extends MyClass{
public void disp2()
{
System.out.println("overriding abstract method");}
}
class Test{
public static void main(String args[]){
MyClass obj;
obj=new Demo();
obj.disp1();
}
}