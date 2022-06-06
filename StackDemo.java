import java.util.*;
public class StackDemo
{
public static void main(String args[])
{
Stack<String>stack=new Stack<String>();
stack.add("geeks");
stack.add("for");
stack.add("geeks");
stack.add("10");
stack.add("20");
System.out.println("Stack:"+stack);
String rem_ele=stack.remove(4);
System.out.println("removed element:"+rem_ele);
System.out.println("final Stack:"+stack);
}
}