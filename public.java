class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day8Program(){
public static void main(String args[]){
Student ob1=new Student();
ob1.setId(15);
ob1.setName("Test");
System.out.println("Id:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
}
}