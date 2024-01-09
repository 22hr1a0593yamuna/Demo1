class Demo{
public static void displayMenu()
{
System.out.println("+:Addition");
System.out.println("-:Substraction\n*:Multiplication");
System.out.println("/:Division");
}
}
class Test{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
}
}