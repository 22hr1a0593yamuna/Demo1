class Student{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);}
}
public class StaticVariable{
public static void main(String args[]){
Student s1=new Student(15,"yummy");
Student s2=new Student(20,"yamuna");
Student.college="MTIET";
s1.display();
s2.display();
}
}