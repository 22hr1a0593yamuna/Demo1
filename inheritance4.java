class Animal{
void eat(){
System.out.println("eating...");}
}
class Dog extends Animal{
void bark(){
System.out.println("barking...");}
}
class Cat extends Dog{
void meow()
{
System.out.println("meowing...");}
}
class TestInheritance2{
public static void main(String args[]){
Cat d=new Cat();
d.meow();
d.bark();
d.eat();
}
}