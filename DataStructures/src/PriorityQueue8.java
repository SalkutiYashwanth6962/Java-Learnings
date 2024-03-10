import java.util.PriorityQueue;
//for customized objects we have to provide implementation of comparable or comparator interface
//priority queue internally implements comparator and comparable interface
public class PriorityQueue8 {
  public static void main(String[] args) {
//	PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
//	
//	priorityQueue.add(10);
//	priorityQueue.add(90);
//	priorityQueue.add(30);
//	priorityQueue.add(20);
//	priorityQueue.add(90);
	
	
//	System.out.println(priorityQueue);
	  PriorityQueue<Mobile> priorityQueue=new PriorityQueue<>();
		
		priorityQueue.add(new Mobile("Iphone",10000));
		
		priorityQueue.add(new Mobile("Iphone2",40000));
		priorityQueue.add(new Mobile("Iphone",12000));
		priorityQueue.add(new Mobile("Iphone",18000));
		
		
		System.out.println(priorityQueue);
 }
}
