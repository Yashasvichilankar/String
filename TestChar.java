import java.util.Scanner;
class TestChar
{
public static void main(String args[])
{
String s1,s2;

Scanner sc=new Scanner(System.in);
System.out.println("Enter first String: ");
s1=sc.nextLine();

System.out.println("Enter second String: ");
s2=sc.nextLine();

System.out.println("Comparing "+s1+" and "+s2+" : "+s1.equals(s2));

}
}
