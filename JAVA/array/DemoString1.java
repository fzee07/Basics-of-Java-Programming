class DemoString1
{public static void main(String a[])
{char s[]={'M','y', ' ','I','n','d','i','a'};
byte b[]={'H','e','l','l','o',' ','I','n','d','i','a'};

String s1="Aim Point";
String s2="Aim Point"+"Informatics";
String s3=new String("Good Morning");
String s4=new String(s,3,5);
String s5=new String(b,6,5);

System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);


                   //Array Of String
String list[]=new String[3];
list[0]=new String("Muhammad");
list[1]=new String("Faizan");
list[2]=new String("Hassan");
for(String name : list)
System.out.println(name);
}
};




