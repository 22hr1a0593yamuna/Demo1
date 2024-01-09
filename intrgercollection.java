import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
List<Integer>numbers=new ArrayList<>();
numbers.add(11);
numbers.add(22);
numbers.add(33);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+number);
int removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber);
System.out.println("List:"+numbers);
}
}
