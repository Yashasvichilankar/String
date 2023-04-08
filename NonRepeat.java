class NonRepeat
{
public static void main(String[] args)
{

//non repeating character in string;

String s1="gibblegabbler";
System.out.println("Given String is: "+s1);
int i=0,j=0;
for(i=0;i<s1.length();i++)
{
//System.out.println(s1);
boolean unique=true;
for(j=0;j<s1.length();j++)
{
if(i!=j && s1.charAt(i)==s1.charAt(j))
{
unique=false;
break;
}
}
if(unique)
{
System.out.println("Non Repeating String: "+s1.charAt(i));
break;
}
}
}
}