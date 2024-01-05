class B
{
public static void main(){
System.out.println("main method without arugument called");
}
public static void main(int x){
System.out.println("main method without arugument called"+x*2);
}
public static void main(String s){
System.out.println("welcome"+s);}
public static void main(String args[]){
System.out.println("yamuna is typing");
main();
main("yamuna");
main(20);
}
}