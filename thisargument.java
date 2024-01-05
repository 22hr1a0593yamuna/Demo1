class s2{
void m(s2 obj){
System.out.println("method is invoked");
}
void p(){
m(this);
}
public static void main(String args[]){
s2 ob=new s2();
ob.p();
}
}