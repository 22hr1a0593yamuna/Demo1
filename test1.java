class person{
public void move(){
System.out.println("latha can move");}
}
class latha extends person{
public void move(){
System.out.println("latha can walk and run");}
}
class Test{
public static void main(String args[]){
person a=new person();
person b=new latha();
a.move();
b.move();
}
}