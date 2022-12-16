import java.util.Scanner;
class customer
{
    private String customer_name=new String();
    private int customer_no;
    private int qty;
    private double price;
    private double totalprice;
    private double discount;
    private double netprice;

   customer()
    {}
    public void customer(String s,int c,int q,double p)
    {
        customer_name=s;
        customer_no=c;
        qty=q;
        price=p;
    }
    public void input()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the customer name:");
        customer_name=S.next();
        System.out.println("Enter the customer no:");
        customer_no=S.nextInt();
        System.out.println("Enter the price:");
        price=S.nextDouble();
        System.out.println("Enter the quantity:");
        qty=S.nextInt();
    }
    public void caldiscount()
    {
        totalprice=price*qty;
        if(totalprice>=50000)
        {
            discount=(double)0.25*totalprice;
        }
        else if(totalprice>=25000)
        {
            discount=(double)0.10*totalprice;
        }
        else{
            discount=0.0;
        }
        netprice=totalprice-discount;
    }
    public void display()
    {
        System.out.println("Customer name:"+customer_name);
        System.out.println("Customer no:"+customer_no);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+qty);
        System.out.println("Net price:"+netprice);
         System.out.println("discount:"+discount);  
    }
}

class Main
{
    public static void main(String arg[])
    {
        Scanner SS=new Scanner(System.in);
        customer c1=new customer();
        customer c3=new customer();
        c1.input();
        c1.caldiscount();
        c1.display();
   
    }
}