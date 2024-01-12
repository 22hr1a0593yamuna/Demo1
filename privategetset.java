class Student{
	private String name;
private int age;
private String getName(){return this.name;}
private int getAge(){return this.age;}
private void setName(String name){
if(name.length()>0)
this.name=name;
else
System.out.println("Name cant be empty");
}
private void setAge(int Age){this.age=age;}
public void display(){
System.out.println(getName()+" ,"+getAge());
}
public void inputStudentDetails(String n,int a){
setName(n);
setAge(a);
}
}
class Test{
public static void main(String args[]){
Student obs1=new Student();
obs1.inputStudentDetails("PAwan",19);
Student obs2=new Student();
obs2.inputStudentDetails("",13);
obs2.display();
obs1.display();
}
}
