import java.util.*;
class TestJavaCollection4{
public static void main(String args[]){
Stack<String>stack=new Stack<String>();
stack.push("yamuna");
stack.push("yammu");
stack.push("yammy");
stack.push("latha");
stack.push("Neha");
stack.pop();
Iterator<String>itr=stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}