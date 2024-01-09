import java.util.List;
import java.util.LinkedList;
class Main{
public static void main(String args[]){
List<Integer>numbers=new LinkedList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
System.out.println("List:"+numbers);
int nmbers=numbers.get(2);
System.out.println("Accessed Element:"+numbers);
int index=numbers.indexOf(20);
System.out.println("Position of 20 is"+index);
int removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber);
}
}