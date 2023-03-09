package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsMain {

	public static void main(String[] args) {
/*
		List<Integer> list = new ArrayList<>();
		list.add(5);
		System.out.println(list);
		list.add(1, 153);
		System.out.println(list);
		list.add(0, 43);
		System.out.println(list);
		list.add(4343);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println("------");

		System.out.println(list.subList(0, 2)); // from 0 to 2, without 2

		// Iterator
		List<Order> orders = new ArrayList<Order>() {
			{
				add(new Order(231, 12.0));
				add(new Order(241, 5.0));
				add(new Order(271, 32.0));
				add(new Order(331, 24.0));
				add(new Order(144, 99.0));
			}
		};
		Iterator<Order> iterator = orders.iterator();
		while (iterator.hasNext()) {
			Order order = iterator.next();
			System.out.println(order);
		}
		List<Order> orders1 = new ArrayList<>();
		orders1.add(new Order(12, 12.1f));
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
*/
		// arrayListMethod();
		linkedListMethod();
	}

	public static void arrayListMethod() {
		List<Car> cars = new ArrayList<>();

		Car car1 = new Car("BMW");
		Car car2 = new Car("Nissan");
		Car car3 = new Car("Reno");
		Car car4 = new Car("Tesla");
		Car car5 = new Car("Tesla");
		Car car6 = new Car();

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);

		System.out.println("Contains: " + cars.contains(car6));
		System.out.println("Index of : " + cars.indexOf(car3));
		System.out.println("size : " + cars.size());
		System.out.println("last index: " + cars.lastIndexOf(car6));
		cars.set(2, car5);
		System.out.println("after set: ");

		Iterator<Car> iterator = cars.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

	public static void linkedListMethod() {
		LinkedList<Car> cars = new LinkedList<>();
		cars.add(new Car("BMW"));
		cars.add(new Car("Tesla"));
		cars.add(new Car("Nissan"));
		cars.add(new Car("Opel"));
		cars.add(new Car("Ford"));

		cars.addLast(new Car("Fiat"));

		Iterator<Car> iterator = cars.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		System.out.println("---------------");
		Collections.shuffle(cars);
		
		iterator = cars.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}

}
