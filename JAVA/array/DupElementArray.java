class DupElementArray
{
public static void main(String a[])
{int x[] = {2,4,1,9,8,12,6,3,7,5};
int sum = 0;
for (int i = 0;i<x.length;i++)
{
sum += x[i];
}
System.out.println("\n Duplicate Element = " + (sum-45));
}
}
