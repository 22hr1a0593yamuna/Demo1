import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>grocery=new Vector<>();
grocery.add("rice");
grocery.add("dall");
grocery.add(2,"wheat");
System.out.println("Vector:"+grocery);
Vector<String>grocerys=new Vector<>();
grocerys.add("ghee");
grocerys.addAll(grocery);
System.out.println("New Vector:"+grocerys);
}
}