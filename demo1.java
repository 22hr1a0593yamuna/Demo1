class BSC{
public int x;
public void setX(int a){x=a;}
}
class BCA{
public static void main(String args[])
{
System.out.println("GOOD MORNING");
BSC ob=new BSC();
ob.setX(10);
System.out.println("X:"+ob.x);
}
}