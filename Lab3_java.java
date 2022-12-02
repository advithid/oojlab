import java.util.Scanner;
class book
{
String name;
String au;
double price;
int num_pages;
book(){}
book(String n,String a,double pr,int p)
{
name=n;
au=a;
price= 0;
num_pages=0;
}
void getd()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name of the book:");
name=s.next();
System.out.println("enter the name of the author");
au=s.next();
System.out.println("enter the price of book:");
price=s.nextDouble();
System.out.println("enter the number of pages");
num_pages=s.nextInt();
}
public String toString()
{
String SSS="name of the book is"+name+" name of the author is"+au+" price of the book is"+price+" number of pages in the book is"+num_pages;
return SSS;
}
}
class main_book
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("enter the number of books");
int n=s1.nextInt();
book b[]=new book[n];
for(int i=0;i<n;i++)
{ b[i]=new book();
b[i].getd();
}
for(int i=0;i<n;i++)
{
System.out.println("book"+(i+1)+"details");
System.out.println(b[i]);
}
}
}

