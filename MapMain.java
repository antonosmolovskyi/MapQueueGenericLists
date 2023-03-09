package lista;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapMain {

	public static void main(String[] args) {
		Map<String, Car> hashMap = new HashMap(); // not ordered not compared

		hashMap.put("first", new Car("Toyota"));
		hashMap.put("second", new Car("Nissan"));
		hashMap.put("third", new Car("Tesla"));
		hashMap.put("fourth", new Car("BMW"));
		
		//iteratorMap(hashMap);
		
		Map<String, Car> treeMap = new TreeMap<>(); // compare by string (native compare)
		
		treeMap.put("A car", new Car("Niva"));
		treeMap.put("Second car", new Car("Mercedes"));
		treeMap.put("Third car", new Car("Chevroleut"));
		treeMap.put("Fourth car", new Car("Lexus"));
		treeMap.put("B car", new Car("Dodge"));
		treeMap.put("Fifth car", new Car("Audi"));
		
		//iteratorMap(treeMap);
		
		Map<String, Car> linkedMap = new LinkedHashMap<>(); // ordered
		
		linkedMap.put("1", new Car("Nissan"));
		linkedMap.put("3", new Car("Toyota"));
		linkedMap.put("4", new Car("Dodge"));
		linkedMap.put("2", new Car("Audi"));
		linkedMap.put("5", new Car("Tesla"));
		
		iteratorMap(linkedMap);

	}

	public static void iteratorMap(Map<String, Car> map) {
		//System.out.println();
		Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Car> carEntry = iterator.next();
			System.out.println(carEntry.getKey() + " " + carEntry.getValue());
		}
	}

}
