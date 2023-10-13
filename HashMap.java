import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with <String, Integer> key-value pairs
        Map<String, Integer> population = new HashMap<>();

        // Add elements to the HashMap
        population.put("New York", 8623000);
        population.put("Los Angeles", 3990456);
        population.put("Chicago", 2716000);
        population.put("Houston", 2326000);
// Display the HashMap
        System.out.println("HashMap: " + population);

        // Access a value by key
        String city = "Chicago";
        int cityPopulation = population.get(city);
        System.out.println(city + " population: " + cityPopulation);

        // Check if a key exists
        String checkCity = "San Francisco";
        boolean exists = population.containsKey(checkCity);
        System.out.println(checkCity + " exists in the HashMap: " + exists);
/ Remove an entry by key
        String removeCity = "Los Angeles";
        population.remove(removeCity);
        System.out.println("After removing " + removeCity + ": " + population);

        // Iterate through keys
        Set<String> cities = population.keySet();
        System.out.print("Cities in the HashMap: ");
        for (String c : cities) {
            System.out.print(c + " ");
        }
        System.out.println();
/ Iterate through values
        System.out.print("Population values in the HashMap: ");
        for (int pop : population.values()) {
            System.out.print(pop + " ");
        }
        System.out.println();

        // Get the size of the HashMap
        System.out.println("Size of the HashMap: " + population.size());

        // Check if the HashMap is empty
        System.out.println("Is the HashMap empty? " + population.isEmpty());
// Clear the HashMap
        population.clear();
        System.out.println("HashMap is empty after clearing.");

        // Recheck if it's empty
        System.out.println("Is the HashMap empty now? " + population.isEmpty());
    }
}
