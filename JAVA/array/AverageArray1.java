import java.util.Scanner;
class AverageArray
{public static void main(String a[])
{int x[] = new int [10];
int sum = 0 , n ;
Scanner o1 = new Scanner (System.in);
n = o1.nextInt();
x=new int[n];
System.out.println("Enter 10 nos");
for (int i = 0; i<x.length; i++)
{ x[i] = o1.nextInt();
sum+=x[i];
}
System.out.println("\n Average = "+ ((float)sum/x.length));
}
}