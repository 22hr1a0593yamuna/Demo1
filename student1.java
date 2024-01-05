import java.util.Scanner;
class Student{
private String name;
private int id;
private String dept;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public void setDept(String dept){this.dept=dept;}
public int getId(){return this.id;}
public String getName(){return this.name;}
public String getDept(){return this.dept;}
}
class Day{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Student[] ob=new Student[3];
for(int i=0;i<3;i++){
ob[i]=new Student();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
ob[i].setDept(sc.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++){
System.out.println("ID:"+ob[j].getId());
System.out.println("Name:"+ob[j].getName());
System.out.println("Dept:"+ob[j].getDept());
}
}
}