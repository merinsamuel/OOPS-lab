import java.util.*;
class MainQueue
{
public static void main(String args[])
{
PriorityQueue<String>cities_queue=new PriorityQueue<String>();
cities_queue.add("sydney");
cities_queue.add("venice");
cities_queue.add("new york");
cities_queue.add("california");
cities_queue.add("melbourne");
System.out.println("PriorityQueue Head:"+cities_queue.element());
System.out.println("\nPriorityQueue contents");
Iterator iter=cities_queue.iterator();
while(iter.hasNext())
{
System.out.print(iter.next()+"");
}
}
}