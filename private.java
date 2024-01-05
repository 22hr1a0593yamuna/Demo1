class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class private1{
public static void main(String args[]){
Student ob1=new Student();
ob1.setId(15);
ob1.setName("Test");
System.out.println("Id:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
Student ob2=new Student();
ob2.setId(20);
ob2.setName("yamuna");
System.out.println("Id:"+ob2.getId());
System.out.println("Name:"+ob2.getId());
Student ob3=new Student();
ob3.setId(23);
ob3.setName("yammu");
System.out.println("Id:"+ob3.getId());
System.out.println("Name:"+ob3.getId());
}
}
