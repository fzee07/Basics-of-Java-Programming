import java.util.Scanner;
class OccrenArray
{public static void main(String a[] )
{int x[] =new int [10];
int c,i,j,temp;
boolean chk;
Scanner o1 = new Scanner(System.in);
System.out.println("Enter 10 nos");
for(i=0;i<x.length;i++)
x[i] = o1.nextInt();
for(i=0;i<10;i++)
{chk = false;
for(j=i-1;j>=0;j--)
{if(x[i] == x[j])
{chk=true;
break;
}
}
if(chk==false)
{c=0;
for(j=i;j<10;j++)
{if([i] == x[j])
c++;
}
System.out.println("\n No of "+x[i]+"="+c);
}//end of 'if'
}//end of for loop
}//end of main
}//end of class