import java.util.*;
class Main
{
    public static void main(String args[])
   {
       Vector<String>alist=new Vector<String>();
       alist.add("Haritha");
       alist.add("Viswa");
       alist.add("Karun");
       alist.add("Rishika");
       alist.add("Sunny");
       
      
       System.out.println(alist);
       
       System.out.println(alist.capacity());
       for(int i=0;i<alist.size();i++)
		{
		System.out.println(alist.elementAt(i));
		}
	                    Enumeration enu=alist.elements();
		while(enu.hasMoreElements())
		{
		System.out.println(enu.nextElement());
		}
       
   }
}
