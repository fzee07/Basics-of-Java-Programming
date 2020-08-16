class ZeroDivide2
{
public static void main(String a[])
{
System.out.println("START");
int x= 15, y=0;
int z;
try
{
z=x/y; //automatically throw "ArithmeticException"
System.out.println("Division= " +z);
}
catch(ArithmeticException e)
{
System.out.println("Sorry......can'y divide by zero");
System.out.println(e.getMessage()); //message by getmessage() method
e.printStackTrace(); // for display detail message
}
System.out.println("END");
}
}