class StringMethodDemo
{public static void main(String s[])
{String s1="Hello India";
String s2="This Is My India";
String s3="Good"; 
String s4="good";
String s5;
boolean chk;
char ch;
int x;

ch=s1.charAt(4);
System.out.println(ch);

x=s1.compareTo(s2);
if(x>0)
System.out.println("S1 is Big");
else if(x<0)
System.out.println("s2 is Big");
else
System.out.println("Equal");

x=s3.compareToIgnoreCase(s4);
if(x==0)
    System.out.println("Not Equal");

s5=s1.concat(s2);
    System.out.println(s5);

if(s1.endsWith("dia"))
    System.out.println("TRUE");
else
    System.out.println("NOT TRUE");

if(s3.equals(s4))
    System.out.println("Equal");
else
    System.out.println("Not Equal");

if(s3.equalsIgnoreCase(s4))
    System.out.println("Equal");
else 
    System.out.println("Not Equal");

x=s1.indexOf('I');
    System.out.println("Position ="+x);

x=s2.indexOf('I',8);
    System.out.println("Position ="+x);

x=s2.indexOf("My");
    System.out.println("Position ="+x);

x=s2.indexOf("My",10);
    System.out.println("Position ="+x);

x=s2.lastIndexOf('I');
    System.out.println("Last Index Of I= "+x);

x=s2.lastIndexOf("My");
    System.out.println("Last Index Of My ="+x);

x=s2.length();
    System.out.println("Length of s2 string ="+x);

s1=s1.replace('o','d');
    System.out.println("New s1="+s1);

String list[]=new String[4];
list=s2.split(" ");
for(String ele: list)
    System.out.println(ele);

chk=s2.startsWith("this");
if(chk==true)
    System.out.println("TRUE");
else
    System.out.println("NOT TRUE");

s5=s2.substring(5); 
    System.out.println(s5);

s5=s2.substring(5,7);//doubt(replace from lastIndex-1)
    System.out.println(s5);

char temp[]=s1.toCharArray();
for(char ele : temp)
    System.out.println(ele);

s5=s1.toLowerCase();
    System.out.println(s5);

s5=s1.toUpperCase();
    System.out.println(s5);

String t=" I Love My India ";
s5=t.trim();
    System.out.println(s5);
}
}