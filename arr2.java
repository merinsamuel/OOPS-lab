import java.util.*;
class arr2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,search,flag=0;
System.out.println("enter the number of elements");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the element to be searched");
search=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==search)
{
System.out.println("element"+search+"found at"+"position");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("element"+search+"not found");
}
}
}
