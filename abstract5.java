abstract class Bank{
abstract float getRateOfintterest();
}
class SBI extends Bank{
float getRateOfintterest(){return 7;}
}
class PNB extends Bank{
float getRateOfintterest(){return 8;}
}
class CANARA extends Bank{
float sgetRateOfintterest(){return 9;}
}
class HDFC extends Bank{
float getRateOfintterest(){return 10;}
}
class TestBank1{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("Rate of intterest is:"+b.getRateOfIntterest()+"%");
b=new PNB();
System.out.println("Rate of intterest is:"+b.getRateOfIntterest()+"%");
b=new CANARA();
System.out.println("Rate of intterest is:"+b.getRateOfIntterest()+"%");
b=new HDFC();
System.out.println("Rate of intterest is:"+b.getRateOfIntterest()+"%");
}}