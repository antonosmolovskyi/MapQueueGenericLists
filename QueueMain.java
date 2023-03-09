package lista;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueMain {

	public static void main(String[] args) {
		//Queue<Car> cars = new ArrayBlockingQueue<>(5);
		Deque<Car> cars = new ArrayDeque<>();
		/*
		cars.add(new Car("BMW"));
		cars.add(new Car("Tesla"));
		cars.add(new Car("Nissan"));
		cars.add(new Car("Opel"));
		cars.add(new Car("Ford"));
		
		Iterator<Car> iterator = cars.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		*/
		Queue<Car> lifoQueue = Collections.asLifoQueue(cars);// last in first out
		lifoQueue.add(new Car("BMW"));
		lifoQueue.add(new Car("Nissan"));
		lifoQueue.add(new Car("Volvo"));
		lifoQueue.add(new Car("Dodge"));
		
		System.out.println("First element : " + lifoQueue.element());
		System.out.println("First element with remove: " + lifoQueue.remove());
		
		Iterator<Car> iterator = cars.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
	}

}
