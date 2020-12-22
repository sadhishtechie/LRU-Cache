import java.util.*;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the map: ");
		int n = sc.nextInt();
		LRUCache cache = new LRUCache(n);

		cache.put("Key1", "Value1");
		cache.put("Key2", "Value2");
		cache.put("Key3", "Value3");
		cache.put("Key4", "Value4");
		
		cache.show();
		System.out.println();
		System.out.println(cache.get(1));
		cache.show();
		System.out.println();

		System.out.println(cache.get(4));
		cache.show();
		System.out.println();
		cache.put("Key5", "Value5");
		cache.put("Key6", "Value6");
		cache.show();
		System.out.println();
		cache.put("Key7", "Value7");
		cache.show();
		System.out.println();

	}
}
