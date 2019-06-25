/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Sanjay
 */
public class Product2 {
       private String name;
    private String customer;
    private String location;
    private int quantity; 
    private Float  price;
    private int charge;
    private String date;
    private int distance;
 private String status;
 private float totalcost;
    
    public Product2(String pcustomer,String pname,String plocation,
            int pquantity,Float  pprice,int pdistance,int pcharge,String pdate,
            String pstatus
    
    )
    {
        
        this.name = pname;
         this.customer = pcustomer;
          this.location = plocation;
           this.quantity =pquantity;
           this.price=pprice;
           this.distance=pdistance;
           this.date=pdate;
           this.charge=pcharge;
           this.status=pstatus;
        
        
    }

    
    
    public String getname()
    {
        return name;
    }
    
    public String getcustomer()
    {
        return customer;
    }
    
    public String getlocation()
    {
        return location;
    }
    
    public int getquantity()
    {
        return  quantity;
    }
    public float getprice()
    {
        return price;
    }
    public int getcharge()
    {
        return charge;
    }
    public String getdate()
    {
        return date;
    }
public int getdistance()
    {
        return distance;
    }
public String getstatus()
    {
        return status;
    }
public float gettotalcost(){
return price+charge*10;
}
}
