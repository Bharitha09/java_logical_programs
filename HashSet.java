import java.util.*;
class Main
{
    public static void main(String args[])
   {
 HashSet<String>alist=new HashSet<String>();
 alist.add("Haritha");
 alist.add("Viswa");
 alist.add("Karun");
 alist.add("Rishika");
 alist.add("Sunny");
 System.out.println(alist);
 alist.add("Haritha");
 System.out.println(alist);
   String a="Haritha";
       if(alist.contains(a))
       {
           System.out.println("it has the element:");
       }
       else
       System.out.println("it doesn't have the elements");
       System.out.println(alist.remove("Haritha"));
       Iterator itr=alist.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
       }
       }
