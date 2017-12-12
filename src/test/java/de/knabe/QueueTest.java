package de.knabe;
import static org.junit.Assert.*; 
import org.junit.Test;


public class QueueTest {
	
	@Test
	public void test1(){
		
	Queue bla = new Queue(3);
	bla.enqueue(1);
	bla.enqueue(2);
	bla.enqueue(3);
	bla.enqueue(4);
	assertEquals("Es ist nicht 3", 1, bla.dequeue());
	}
}
