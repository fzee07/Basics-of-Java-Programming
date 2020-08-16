class ZeroDivide3
{
public static divide(int x,int y)
int z;
try
{
z=x/y; //automatically throw "ArithmeticException"
System.out.println("Division= " +z);
}
catch(ArithmeticException e)
{
System.out.println("Sorry.....can't Divide by zero");
System.out.println("good luck for next time");
}
public static voiod main(String a[])
{
divide(12,4);
divide(12,0);
divide(30,0);
divide(15,3);

}
}