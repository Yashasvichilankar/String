import java.util.Scanner;
class Data
{
public static void main(String args[])
{
String s1;
String s2;

Scanner sc=new Scanner(System.in);

//Two String object contain the same data;
System.out .println("Enter first String : ");
s1=sc.nextLine();

System.out .println("Enter Second String : ");
s2=sc.nextLine();

System.out.println("Comparing two String objects.");
System.out.println(s1+" equals "+s2+" ? "+s1.equals(s2));

//comparing by ignoring case;
String s3;
String s4;
System.out .println("Enter First String in any case: ");
s3=sc.nextLine();

System.out .println("EnterSecond String in any case: ");
s4=sc.nextLine();

System.out.println("Comparing two String objects.");
System.out.println(s3+" equals "+s4+" ? "+s3.equalsIgnoreCase(s4));


}
}