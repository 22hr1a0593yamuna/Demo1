class Person{
protected String fname="john";
protected String lname="Doe";
protected int age=24;
}
class Student extends Person{
private int graduationYear=2018;
public static void main(String[] args){
Student Obj=new Student();
System.out.println("Name:"+Obj.fname+" "+Obj.lname);
System.out.println("Age:"+Obj.age);
System.out.println("Graduation Year:" +Obj.graduationYear);
}
}
