class MyOwnExceptionClass extends Exception
{ public MyOwnExceptionClass(String s)
{super(s); //calling of base class (Exception) constructor
}
}

public class Client
{public static void main(String []args)
{int price=120;
try
{if(price<0)
{MyOwnExceptionClass o1 = new MyOwnExceptionClass("price should not be in Negative                                                    you entered -ve value");
throw o1;
}
else 
     System.out.println("price is:"+price);
}
catch(MyOwnExceptionClass m)
{System.out.println(m.getMessage());
}
}
}