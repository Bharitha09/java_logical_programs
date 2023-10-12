import java.util.*;
class Main
{
    public static void main(String args[])
    {
        ArrayList<String>alist=new ArrayList<String>();
        alist.add("Haritha");
        alist.add("Viswa");
        alist.add("Karun");
        alist.add("rishika");
        alist.add("subby");
        System.out.println(alist);
       System.out.println("The size of an array is:"+alist.size()); 
        String a="Vijay";
        if(alist.contains(a))
        {
            System.out.println("list contains:");
        }
        else
        System.out.println("element is not found");
        Collections.sort(alist);
        System.out.println(alist);
    }
    
    
}
