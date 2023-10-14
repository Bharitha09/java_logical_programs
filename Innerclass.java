class Outer
{
     int a=10;
     void method1()
      { 
         Inner  in=new Inner();         
          in.method2(); 
          System.out.println("a value is:"+a);
       }
    class Inner
     {
        int b=20;
        void method2()
         {
            System.out.println("b value is:"+b);
          }
       } 
}
class Main
{
    public static void main(String args[])
      {
           Outer  ou=new Outer();
           ou.method1();
        }
}
