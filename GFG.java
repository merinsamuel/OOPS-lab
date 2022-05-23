import java.util.*;
public class GFG
{
static void checkSymmetric(int mat[][],int row,int col)
{
int i,j,flag=1;
System.out.print("Matrix formed is");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(mat[i][j]+"\t");
}
System.out.print("");
}
int[][] transpose=new int[row][col];
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
transpose[j][i]=mat[i][j];
}
}
if(row==col)
{
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(mat[i][j]!=transpose[i][j])
{
flag=0;
break;
}
}
if(flag==0)
{
System.out.print("Matrix is not symmetric");
break;
}
}
if(flag==1)
{
System.out.print("matrix is Symmetric");
}
}
else
{
System.out.println("not semmetric");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,row,col,flag=1;
System.out.print("enter number of row");
row=sc.nextInt();
System.out.print("number of col");
col=sc.nextInt();
int[][] mat=new int[row][col];
System.out.print("enter matrix element"); 
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat[i][j]=sc.nextInt();
}
}
checkSymmetric(mat,row,col);
}
}
