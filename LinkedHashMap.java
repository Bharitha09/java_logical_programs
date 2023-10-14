import java.util.*;
class Main
{
    public static void main(String args[])
   {
       LinkedHashMap<Integer, String> hmap = new LinkedHashMap<Integer, String>();
       hmap.put(1,"Haritha");
       hmap.put(2,"Viswa");
       hmap.put(3,"Rishika");
       hmap.put(4,"Karun");
       hmap.put(5,"Sunny");
      System.out.println("LinkedHashMap: " +hmap);
     
        String c = "Viswa";
        boolean exists = hmap.containsKey(2);
        System.out.println(c + " exists in the HashMap: " + exists);
        String a = "Haritha";
        String b = hmap.get(1);
        System.out.println(b +"contains: " + a);
        
        String d = "Haritha";
        hmap.remove(1);
        System.out.println("After removing " + d + ": " + hmap);
        System.out.println("Is the HashMap empty? " + hmap.isEmpty());
         hmap.clear();
        System.out.println("HashMap is empty after clearing.");
        System.out.println("Is the HashMap empty? " + hmap.isEmpty());
   }
}
