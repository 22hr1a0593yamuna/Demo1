class Idcard{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private int adhar_no;
public void setCollege_name(String college_name){this.college_name=college_name;}
public void setCollege_address(String college_address){this.college_address=college_address;}
public void setAy_start(int ay_start){this.ay_start=ay_start;}
public void setAy_end(int ay_end){this.ay_end=ay_end;}
public void setId(int id){this.id=id;}
public void setStudent_name(String student_name){this.student_name=student_name;}
public void setCourse_name(String course_name){this.course_name=course_name;}
public void setAdhar_no(int adhar_no){this.adhar_no=adhar_no;}
public String getCollege_name(){return college_name;}
public String getCollege_address(){return college_address;}
public int getAy_start(){return ay_start;}
public int getAy_end(){return ay_end;}
public int getId(){return id;}
public String getStudent_name(){return student_name;}
public String getCourse_name(){return course_name;}
public int getAdhar_no(){return adhar_no;}
}
class BCA4{
public static void main (String args[])
{
Idcard ob=new Idcard();
ob.setCollege_name("MTIET");
ob.setCollege_address("PALAMANER");
ob.setAy_start(2023);
ob.setAy_end(2026);
ob.setId(27542);
ob.setStudent_name("YAMUNA");
ob.setCourse_name("CSE");
ob.setAdhar_no(222);
System.out.println("College_name:"+ob.getCollege_name());
System.out.println("college_address:"+ob.getCollege_address());
System.out.println("Ay_start:"+ob.getAy_start());
System.out.println("Ay_end:"+ob.getAy_end());
System.out.println("Student_name"+ob.getStudent_name());
System.out.println("Course_name"+ob.getCourse_name());
System.out.println("Adhar_no"+ob.getAdhar_no());
}
}
