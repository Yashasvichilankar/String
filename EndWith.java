import java.util.Scanner;
class EndWith
{
public static void main(String args[])
{
String s1,s2;
String end_s;

Scanner sc=new Scanner(System.in);

System.out.println("Enter First String ");
s1=sc.nextLine();

System.out.println("Enter Second String ");
s2=sc.nextLine();

System.out.println("String ends with: ");
end_s=sc.nextLine();

boolean b1=s1.endsWith(end_s);
boolean b2=s2.endsWith(end_s);

System.out.println(s1+" ends with "+end_s+" :"+b1);
System.out.println(s2+" ends with "+end_s+" :"+b2);
}
}