import java.util.Vector;
class Main{
public static void main(String args[]){
Vector<String>friut=new Vector<>();
friut.add("Mango");
friut.add("Banana");
friut.add("Grapes");
friut.add("Berries");
friut.add("Apple");
friut.add("Cirtus");
System.out.println("Vector:"+friut);
Vector<String>friuts=new Vector<>();
friuts.add("Peaches");
friuts.add("Coconut");
friuts.add("Pears");
friuts.add("Pineapples");
friuts.addAll(friut);
System.out.println("New Vector:"+friuts);
Vector<String>vegetable=new Vector<>();
vegetable.add("Onions");
vegetable.add("Tomato");
vegetable.add("Chilies");
vegetable.add("Ginger");
vegetable.add("Garlic");
vegetable.add("Potato");
Vector<String>vegetables=new Vector<>();
vegetable.add("Peppers");
vegetable.add("Broccoli");
vegetable.add("Carrot");
vegetable.add("Cabbage");
System.out.println("vegetable:"+vegetable);
Vector<String>animalProducts=new Vector<>();
animalProducts.add("Chicken");
animalProducts.add("Eggs");
animalProducts.add("Meat");
animalproducts.add("Fish");
System.out.println("animalProducts:"+animalProducts);
}
} 