import java.util.*;
class CharAtExample6{
ArrayList<Character>a1;
CharAtExample6(){
a1=new ArrayList<Character>();
a1.add('0');a1.add('1');a1.add('2');a1.add('3');
a1.add('4');a1.add('5');a1.add('6');a1.add('7');
a1.add('8');a1.add('9');
}
private boolean isVowel(char c){
for(int i=0;i<a1.size();i++)
{
if(c==a1.get(i)){
return true;}}
return false;}
public int countVowels(String s)
{
int countVowel=0;
int size=s.length();
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isVowel(c)){
countVowel=countVowel+1;
}
}
return countVowel;
}
public static void main(String args[]){
CharAtExample6 obj=new CharAtExample6();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfVowel=obj.countVowels(str);
System.out.println("String:"+str);
System.out.println("Total numbers of digits in the string are:"+noOfVowel+"\n");
}
}