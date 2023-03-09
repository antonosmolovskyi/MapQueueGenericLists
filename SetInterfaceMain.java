package lista;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceMain {

	public static void main(String[] args) {
		HashSetMethod();
		//treeSetMethod();
		//linkedHashSetMethod();
	}
	
	public static void HashSetMethod() {
		Set<Car> cars = new HashSet();
		
		Car car1 = new Car("BMW");
		Car car2 = new Car("Nissan");
		Car car3 = new Car("Reno");
		Car car4 = new Car("Tesla");
		Car car5 = new Car("Tesla");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(new Car("Nissan"));
		cars.add(new Car("Volvo"));
		//System.out.println(cars.contains(car4));
		Iterator<Car> iterator = cars.iterator();
		
		while(iterator.hasNext()) {
			Car car = iterator.next();
			System.out.println(car.getName());
		}	
		
		
	}
	
	public static void treeSetMethod() {
		Set<Integer> tree = new TreeSet<>();
		
		tree.add(32);
		tree.add(21);
		tree.add(324);
		tree.add(222);
		tree.add(112);
		tree.add(71);
		tree.add(600);
		
		Iterator<Integer> iterator = tree.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		
	}
	public static void linkedHashSetMethod() { // ordered
		Set<Integer> set = new LinkedHashSet();
		set.add(32);
		set.add(231);
		set.add(1);
		set.add(333);
		set.add(598);
		set.add(3);
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
