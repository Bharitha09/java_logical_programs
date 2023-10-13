import java.util.*;
class Main
{
    public static void main(String args[])
   {
 TreeSet<Integer> alist = new TreeSet<>();
 alist.add(23);
 alist.add(45);
 alist.add(10);
 alist.add(9);
 System.out.println(alist);
 alist.add(5);
 System.out.println(alist);
   Integer a=2;
       if(alist.contains(a))
       {
           System.out.println("it has the element:");
       }
       else
       System.out.println("it doesn't have the elements");
       System.out.println(alist.remove(5));
       Iterator itr=alist.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
       }
       }
