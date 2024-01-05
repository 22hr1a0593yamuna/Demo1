class Note{
private String name;
private String std;
private String sec;
private int rollno;
private String sub;
public void setName(String name){this.name=name;}
public void setStd(String Std){this.std=std;}
public void setSec(String Sec){this.sec=sec;}
public void setRollno(String rollno){this.rollno=rollno;}
public void setSub(String sub){this.sub=sub;}
public String getName(){return name;}
public String getStd(){retrun std;}
public String getRollno(){return rollno;}
public String getSub(){return sub;}
}
class note3
{
public static void main(String args[]){
Note N=new Note();
N.setName("YAMUNA");
N.setStd("B.TECH");
N.setSec("CSE-B");
N.SetRollno(593);
N.setSub("JAVA");
system.out.println("name:"+N.getName());
System.out.println("name:"+N.getStd());
System.out.println("name:"+N.getRollno());
System.out.println("name:"+N.getSub());
}
}