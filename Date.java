import java.util.*;
public class Main
{
 public static void main(String[] args) 
 {
	 Date d=new Date();
	 System.out.println("full date is..."+d);
	 System.out.println("Year..."+(d.getYear()+1900));
	 System.out.println("Month is..."+(d.getMonth()+1));
	 System.out.println("Date is.."+d.getDate());
	 System.out.println("week day is..."+d.getDay());
	 System.out.println("Hours..."+d.getHours());
	 System.out.println("Minutes..."+d.getMinutes());
System.out.println("Seconds..."+d.getSeconds());
 }
}
