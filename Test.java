import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

String s1="PHP Exercises and Python Exercises";
System.out.println(s1);

String s2;
System.out.println("Specified sequence of char values: ");
s2=sc.nextLine();

System.out.println(s1.contains(s2));
}
}