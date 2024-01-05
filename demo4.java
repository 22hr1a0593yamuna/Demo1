class Employee{
private String name;
private int id;
public void setName(String name){this.name=name;}
public void setId(int Id){this.id=id;}
public String getName(){return name;}
public string getId(){return id;}
}
class BCA5{
public static void main(String args[])
{
Employee ob=new Employee();
ob.setName("yamuna");
ob.setId(27542)
System.out.println("Name:"+ob.getName());
System.out.println("Id:"+ob.getId());
}
}