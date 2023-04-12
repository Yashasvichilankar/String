import java.util.Scanner;
class Uppercase
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);

System.out.println("Enter string you want to change in upper case: ");
s=sc.nextLine();
System.out.println(s.toUpperCase());
}
}