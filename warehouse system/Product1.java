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
public class Product1 {
    
     private String name;
    private String manufacturer;
    private String category;
    private int quantity; 
    private Float  price;
    private String color;
    private String date;
    private int weight;
 private String status;
    
    public Product1(String pname,String pmanufacturer,String pcategory,
            int pquantity,Float  pprice,String pcolor,int pweight,String pdate,
            String pstatus
    
    )
    {
        
        this.name = pname;
         this.manufacturer = pmanufacturer;
          this.category = pcategory;
           this.quantity =pquantity;
           this.price=pprice;
           this.color=pcolor;
           this.date=pdate;
           this.weight=pweight;
           this.status=pstatus;
        
        
    }

    
    
    public String getname()
    {
        return name;
    }
    
    public String getmanufacturer()
    {
        return manufacturer;
    }
    
    public String getcategory()
    {
        return category;
    }
    
    public int getquantity()
    {
        return  quantity;
    }
    public float getprice()
    {
        return price;
    }
    public String getcolor()
    {
        return color;
    }
    public String getdate()
    {
        return date;
    }
public int getweight()
    {
        return weight;
    }
public String getstatus()
    {
        return status;
    }
}
