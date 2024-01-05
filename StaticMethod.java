class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="MTIET";
}
Student(int r,String  n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);}
}
class StaticMethod{
public static void main(String args[]){
Student s1=new Student(15,"yamuna");
Student s2=new Student(20,"yummu");
s1.display();
s2.display();
Student.change();
Student s3=new Student(17,"yummy");
s1.display();
s2.display();
s3.display();
}
}
