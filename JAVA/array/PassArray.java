class PassArray
{public static void main(String s[])
{int temp[]={10,3,5,90,6};
printArray(temp);//calling method
System.out.println("\n");
printArray(new int[]{3,1,2,6,4,2});//calling method
}
public static void printArray(int[] array)
 {
 for(int i=0;i<array.length;i++)
   {
     System.out.print(array[i]+" ");
   }
 }
}
