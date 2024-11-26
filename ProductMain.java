package conn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Product{
    private int pid;
    private String pname;
    private float pprice;
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Product(int pid, String pname, float pprice) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
    }
    public int getpid() {
        return pid;
    }
    public void setEid(int pid) {
        this.pid = pid;
    }
    public String getpname() {
        return pname;
    }
    public void setpname(String pname) {
        this.pname = pname;
    }
    public float getpprice() {
        return pprice;
    }
    public void setpsalary(float pprice) {
        this.pprice = pprice;
    }
    @Override
    public String toString() {
        return "Employee [pid=" + pid + ", pname=" + pname + ", pprice =" + pprice + "]";
    }
    
    
}
class ProductIdSort implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getpid()<o2.getpid())
            return -1;
        else if(o1.getpid()>o2.getpid())
            return 1;
        else
            return 0;
    }
    
}

class ProductNameSort implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getpname().compareToIgnoreCase(o2.getpname())<0)
            return -1;
        else if(o1.getpname().compareToIgnoreCase(o2.getpname())>0)
            return 1;
        else
            return 0;
    }
    
}

class ProductPriceSort implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getpprice()<o2.getpprice())
            return -1;
        else if (o1.getpprice()>o2.getpprice())
            return 1;
        else
            return 0;
    }
    
}
public class ProductMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Product> alist = new ArrayList<Product>();
        Product pro = new Product();
        Product pro1 = new Product(101,"Laptop",50000);
        Product pro2 = new Product(105, "Phone",40000);
        Product pro3 = new Product(102,"Tablet",60000);
        Product pro4 = new Product(104,"Bluetooth",30000);
        Product pro5 = new Product(103,"headphones",70000);
        
//        for(int i=1;i<=5;i++) {
//            alist.add(emp+""+i);
//        }
        alist.add(pro1);
        alist.add(pro2);
        alist.add(pro3);
        alist.add(pro4);
        alist.add(pro5);
        //Iterator
        //Iterator<Product> iot = alist.iterator();
        //System.out.println("ID\tName\tPrice");
        //while(iot.hasNext()) {
        	//Product p = iot.next();
            //System.out.println(p.getpid()+"\t"+p.getpname()+"\t"+p.getpprice());
        
        //space of code
        Iterator<Product> itob = alist.iterator();
//		System.out.println("ID\tName\t\tPrice");
		System.out.printf("%-8s%-20s%-15s","ID","NAME","PRICE");
		System.out.println();
		while(itob.hasNext()) {
			Product p=itob.next();
//			System.out.println(p.getPid()+"\t"+p.getPname()+"\t\t"+p.getPprice());
			System.out.printf("%-8d%-20s%-15.2f", p.getpid(),p.getpname(),p.getpprice());
			System.out.println();
		
        }
 
        ProductIdSort pis = new ProductIdSort();
        
        Collections.sort(alist,pis);
        Iterator<Product> iot1 = alist.iterator();
        System.out.println("After sorting Id");
        System.out.println("ID\tName\tPrice");
        while(iot1.hasNext()) {
        	Product p = iot1.next();
            System.out.println(p.getpid()+"\t"+p.getpname()+"\t"+p.getpprice());
        }
        
        ProductNameSort pns = new ProductNameSort();
        Collections.sort(alist,pns);
        Iterator<Product> iot2 = alist.iterator();
        System.out.println("After sorting Name");
        System.out.println("ID\tName\tPrice");
        while(iot2.hasNext()) {
        	Product p = iot2.next();
            System.out.println(p.getpid()+"\t"+p.getpname()+"\t"+p.getpprice());
        }
        
        
        ProductPriceSort pss = new ProductPriceSort();
        
        
        Collections.sort(alist,pss);
        Iterator<Product> iot3 = alist.iterator();
        System.out.println("After sorting Salary");
        System.out.println("ID\tName\tPrice");
        while(iot3.hasNext()) {
        	Product p = iot3.next();
            System.out.println(p.getpid()+"\t"+p.getpname()+"\t"+p.getpprice());
        }
        }
        
        

    }



