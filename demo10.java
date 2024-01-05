class Empolyee{
int id;
String name;
String department;
void insertRecord(int i,String n,String d){
id=i;
name=n;
department=d;
}
void displayInformation(){
System.out.println(id+""+name+""+department);}
}
class TestEmpolyee5{
public static void main(String args[]){
Empolyee s1=new Empolyee();
Empolyee s2=new Empolyee();
s1.insertRecord(111,"yammu","CSE");
s2.insertRecord(222,"ganesh","MBA");
s1.displayInformation();
s2.displayInformation();
}
}