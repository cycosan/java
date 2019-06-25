/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanjay
 */
public final class warehouse extends javax.swing.JFrame {

    /**
     * Creates new form warehouse
     */
    public warehouse() {
        initComponents();
        show_Manifest_In_JTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        clear1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        warehouses = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        clear1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/iconfinder_back-alt_134226.png"))); // NOI18N
        clear1.setText("Back");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("SMNR Warehouse");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear1))
                .addContainerGap())
        );

        warehouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itemname", "Price", "Quantity", "Company name"
            }
        ));
        jScrollPane1.setViewportView(warehouses);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed

        this.dispose();
        menu masuk=new menu();
        masuk.setVisible(true);
    }//GEN-LAST:event_clear1ActionPerformed
 public Connection getConnection()
    {
    Connection con = null;
    try{
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manifest?zeroDateTimeBehavior=convertToNull","root","");
    
    return con;    
    }
          catch(Exception e){
            
        return null;
          }   }
  
 
 public ArrayList<Product1> getManifest()
{
    ArrayList<Product1> manifestList =new ArrayList<Product1>();
 Connection con=getConnection();
 String query="SELECT * FROM manifest_db";
 Statement st;
 ResultSet rs;
    try{
 
 st = con.createStatement();
 rs=st.executeQuery(query);
 Product1 manifest;
 while (rs.next())
  {
   manifest = new Product1(rs.getString("Name"),rs.getString("Manufacturer"),rs.getString("Category"),rs.getInt("Quantity"),Float.parseFloat(rs.getString("Price"))
      ,rs.getString("Color"),rs.getInt("Weight"),rs.getString("Date"),rs.getString("Status"));
  manifestList.add(manifest);
  }
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
 
}          
return manifestList;
}
 public Connection getConnection1()
    {
    Connection con1 = null;
    try{
    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shipping?zeroDateTimeBehavior=convertToNull","root","");
    
    return con1;    
    }
          catch(Exception e){
            
        return null;
          }   }
 public ArrayList<Product2> getShipping()
{
    ArrayList<Product2> shippingList =new ArrayList<Product2>();
 Connection con=getConnection();
 String query="SELECT * FROM shipping_db";
 Statement st;
 ResultSet rs;
    try{
 
 st = con.createStatement();
 rs=st.executeQuery(query);
 Product2 shipping;
 while (rs.next())
  {
   shipping = new Product2(rs.getString("Customer"),rs.getString("Item_name"),rs.getString("Location"),rs.getInt("Quantity"),Float.parseFloat(rs.getString("Price"))
      ,rs.getInt("Distance"),rs.getInt("Shipping_charge"),rs.getString("Load_date"),rs.getString("Status"));
  shippingList.add(shipping);
  }
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
 
}          
return shippingList;
}
void show_Manifest_In_JTable()
{
 ArrayList<Product1>list=getManifest();
 //ArrayList<Product2>list2=getShipping();
 
 DefaultTableModel model=(DefaultTableModel)warehouses.getModel();
 model.setRowCount(0);
 Object[] row =new Object[4];
 
 for(int i=0; i < list.size();i++)
 {
     
     if("Recieved".equals(list.get(i).getstatus())){
 row[0]=list.get(i).getname();
  row[1]=list.get(i).getprice();
   row[2]=list.get(i).getquantity();
    row[3]=list.get(i).getmanufacturer();
    model.addRow(row);
     }
 
 } 
}

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable warehouses;
    // End of variables declaration//GEN-END:variables
}
