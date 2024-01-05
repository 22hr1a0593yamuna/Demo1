class BSC{
public int age;
public void setAge(int age)
{
if(age<0)this.age=0;
else
this.age=age;
}
public int getAge(){return this.age;}
}
class BCA5{
public static void main(String args[])
{
System.out.println("GOOD MORNING");
BSC ob=new BSC();
ob.setAge(-10);
System.out.println("Age:"+ob.getAge());
}
} 
