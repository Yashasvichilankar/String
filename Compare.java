class Compare
{
public static void main(String args[])
{
String s1="This is exercise 2";
String s2="This is exercise 1";

System.out.println("Comparing two strings :"+s1.compareTo(s2));


//Comparing two Strings ignoring case differences;
String s3="This is Exercise 3";
String s4="this is exercise 3";

System.out.println(s3.equalsIgnoreCase(s4));


//Concatinating two Strings;
String a="PHP Exercises and";
String b=" Python Exercises";

System.out.println("The concatenated String: "+a.concat(b));
}
}