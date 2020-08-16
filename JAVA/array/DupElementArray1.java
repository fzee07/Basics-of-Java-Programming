import java.util.Scanner;
class DupElementArray1
{
public static void main(String a[])
{int x[] = new int[20];
 int sum=0 , n ;
Scanner o1 = new Scanner(System.in);
System.out.println("Enter 20 nos");
for (int i = 0;i<x.length;i++)
{
x[i] = o1.nextInt();
sum += x[i];
}
System.out.println("\n Duplicate Element = " + (sum-190));
}
}
