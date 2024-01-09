import java.util.ArrayList;
class Main{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
languages.add("Java");
languages.add("Kotlin");
languages.add("C++");
languages.add("Python");
languages.set(2,"JavaScript");
System.out.println("Modified ArrayList:"+languages);
}
}