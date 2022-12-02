import java.util.Scanner;
class student{
String name;
String usn;
int marks[]=new int[3];
int credit[]=new int[3];
int totcredits()
{
int t=0,i;
for(i=0;i<3;i++)
{
t=t+credit[i];
}
return t;
}
}
class cs009{
public static void main(String args[])
{
System.out.println("enter the student name ,usn\n");
int i,t;
float sgpa=0;
Scanner sc=new Scanner(System.in);
student s1=new student();
s1.name=sc.nextLine();
s1.usn=sc.nextLine();
System.out.println("marks and credit of each subjects are\n");
for(i=0;i<3;i++)
{
s1.marks[i]=sc.nextInt();
if(s1.marks[i]==100)
s1.marks[i]=(s1.marks[i]/10);
else
s1.marks[i]=(s1.marks[i]/10)+1;
s1.credit[i]=sc.nextInt();
sgpa=sgpa+s1.marks[i]*s1.credit[i];
}
t=s1.totcredits();
sgpa=sgpa/(t);
System.out.println("sgpa of"+s1.name+"is\n"+sgpa);
}
}
