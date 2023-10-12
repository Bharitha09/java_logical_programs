import java.util.*;
class Main
{
    public static void main(String args[])
   {
       LinkedList<String>alist=new LinkedList<String>();
       alist.add("Haritha");
       alist.add("Viswa");
       alist.add("Karun");
       alist.add("Rishika");
       alist.add("Sunny");
       System.out.println(alist);
       alist.addFirst("Abby");
       System.out.println(alist);
       alist.add(2,"Pranita");
       System.out.println(alist);
       System.out.println(alist.get(4));
       String a="Karun";
       if(alist.contains(a))
       {
           System.out.println("element contains");
       }
       else
       System.out.println("Elements does not contain");
       alist.removeFirst();
       System.out.println(alist);
   }
}
