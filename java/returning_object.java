class RV
{
  int a;
  float b;
String name;
 RV()
{
  a=90;
  b=56.7f;
  name="Nilesh";
}
RV(int x,float y,String n)
{
 a=x;
 b=y;
name=n;
}
  int mydata()
{
  return a;
}

 float mydata1()
{
  return b;
}

RV display()
{
  RV ob = new RV();
   return ob;
}

RV display1()
{
  RV ob1 = new RV(77,52.6f,"Obey");
   return ob1;
}
}



class Returning
{
 public static void main(String ar[])
{
  RV ob = new RV();
ob=ob.display();

System.out.println("A value"+ob.a);
System.out.println("B value"+ob.b);
System.out.println("Name value"+ob.name);

ob=ob.display1();

System.out.println("A value"+ob.a);
System.out.println("B value"+ob.b);
System.out.println("Name value"+ob.name);

}
}
