import java.util.Scanner;

class Student 
{public static void main(String s[])
{Scanner o1=new Scanner(System.in);
 int sno,marks;
float per;
String sname;
System.out.println("\nEnter sno,marks,name of student");
sno=o1.nextInt();
marks=o1.nextInt();
sname=o1.nextLine();

per=marks/3.0f;

System.out.println("SNO = " + sno);
System.out.println("MARKS = " + marks);
System.out.println("SNAME = " + sname);
System.out.println("PER = " + per );
}
}