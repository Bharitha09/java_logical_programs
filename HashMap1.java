import java.util.*;
class Main
{
    public static void main(String args[])
   {
       HashMap<Integer, String> hmap = new HashMap<Integer, String>();
       hmap.put(1,"Haritha");
       hmap.put(2,"Viswa");
       hmap.put(3,"Rishika");
       hmap.put(4,"Karun");
       hmap.put(5,"Sunny");
      System.out.println("HashMap: " +hmap);
      String a = "Haritha";
     String b = hmap.get(a);
        System.out.println("element contains" + hmap + b);
        String c = "Haritha";
        boolean exists = hmap.containsKey(c);
        System.out.println(c + " exists in the HashMap: " + exists);
   }
}
