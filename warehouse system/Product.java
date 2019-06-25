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
public class Product {
     private Long contact;
    private String company;
    private String email;
    private String location; 
 
    
    public Product(String pcompany, Long pcontact, String pemail, String plocation)
    {
        
        this.company = pcompany;
        this.contact = pcontact;
        this.email = pemail;
        this.location = plocation;
        
    }

    
    
    public long getcontact()
    {
        return contact;
    }
    
    public String getcompany()
    {
        return company;
    }
    
    public String getemail()
    {
        return email;
    }
    
    public String getlocation()
    {
        return  location;
    }
    
    
    
    
}
