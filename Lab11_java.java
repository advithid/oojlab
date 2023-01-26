package CIE;
import java.util.*;
public class student{
    Scanner sc=new Scanner(System.in);
    public String usn,name;
    public int sem;
   
    public void accept(){
        System.out.println("Enter USN, Name and Current semester: ");
        usn=sc.nextLine();
        name=sc.nextLine();
        sem=sc.nextInt();
    }
    public void display(){
        System.out.println("\nStudent Details");
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("Semester: "+sem);
    }
}
package CIE;
import java.util.*;
public class internals extends CIE.student {
    Scanner sc=new Scanner(System.in);
    public int ciem[]=new int[5];

    public void accept(){
        int i;
        for(i=0;i<5;i++)
        { System.out.println("Enter CIE marks of subject "+(i+1));
          ciem[i]=sc.nextInt();
        }
    }
}

package SEE;
import CIE.*;
import java.util.*;
public class externals extends CIE.student{
    Scanner sc=new Scanner(System.in);
    public int seem[]=new int[5];

    public void accept(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter SEE marks of subject "+(i+1));
            seem[i]=sc.nextInt();
        }
    }
}

import CIE.*;
import SEE.*;
import java.util.*;
class total{
    public static void main(String args[]) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        int total[]=new int[5];
        System.out.println("Enter number of students: ");
        n=sc.nextInt();
        CIE.student s[]=new CIE.student[n];
        CIE.internals ci[]=new CIE.internals[n];
        SEE.externals se[]=new SEE.externals[n];
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter student "+(i+1)+" details");
            s[i]=new CIE.student();
            s[i].accept();
            ci[i]=new CIE.internals();
            ci[i].accept();
            se[i]=new SEE.externals();
            se[i].accept();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("\nDetails of student "+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j]=ci[i].ciem[j]+se[i].seem[j];
                System.out.println("Total marks in subject "+(j+1)+": "+total[j]);
            }
            System.out.println();
        }
    }
}
