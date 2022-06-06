import java.util.*;
public class JavaExample
{
public static void main(String args[])
{
ArrayList<String>obj=new ArrayList<String>();
obj.add("ajeet");
obj.add("harry");
obj.add("chaitanya");
obj.add("steeve");
obj.add("anuj");
System.out.println("Original ArrayList");
for(String str:obj)
System.out.println(str);
obj.add(0,"rahul");
obj.add(1,"justin");
System.out.println("ArrayList after add operation:");
for(String str:obj)
System.out.println(str);
obj.remove("chaitanya");
obj.remove("harry");
System.out.println("ArrayList after remove operation:");
for(String str:obj)
System.out.println(str);
obj.remove(1);
System.out.println("Final ArrayList");
for(String str:obj)
System.out.println(str);
}
}

