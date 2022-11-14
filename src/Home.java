
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc Bridge
 */
public class Home extends javax.swing.JFrame {
     Long L_code[];
     
     Long P_code[];

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
         int index=0;
          Table();
   
         try {
             
             //L_code = new Long[100];
              P_code = new Long[100];
           
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");


            
           PreparedStatement stmt2 = con.prepareStatement("SELECT * FROM `centre`");
            ResultSet rs2 = stmt2.executeQuery();
             
              while(rs2.next())
              {
                 // L_code[index]=rs2.getLong(2);
                   P_code[index]=rs2.getLong(2);
                  index++;
                 // cent.addItem(rs2.getString(3));
                 
              
              }
              rs2.close();}
         catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_reset = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cent = new javax.swing.JComboBox<>();
        year = new com.toedter.calendar.JDateChooser();
        taux = new javax.swing.JTextField();
        objm = new javax.swing.JTextField();
        recm = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rec_mon = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setAutoscrolls(true);
        jPanel4.setFocusCycleRoot(true);
        jPanel4.setFocusTraversalPolicyProvider(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recettes mensuelles");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 440, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/argent.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 130, 140));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_reset.setBackground(new java.awt.Color(51, 51, 255));
        btn_reset.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.setBorder(null);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 40));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 80, 160, 50));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setText("Modifier");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, 43));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.setBorder(null);
        jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton1StateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 20, 160, 42));

        btn_exit.setBackground(new java.awt.Color(51, 51, 255));
        btn_exit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_exit.setText("Retour");
        btn_exit.setBorder(null);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel3.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 160, 40));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Objectif");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 110, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("recouvrement");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("centre");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("taux");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 60, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("date");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 70, 30));

        cent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tighennif", "GHRISS", "Mascara", "SIG", "O/ABTAL", "BOUHANIFIA", "ELBORDJ", "Mohammadia", " ", " ", " " }));
        cent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centActionPerformed(evt);
            }
        });
        jPanel5.add(cent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 190, 40));

        year.setDateFormatString("yyyy-MM-dd");
        jPanel5.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 200, 30));

        taux.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tauxCaretUpdate(evt);
            }
        });
        taux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tauxActionPerformed(evt);
            }
        });
        jPanel5.add(taux, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 180, 40));
        jPanel5.add(objm, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 180, 40));
        jPanel5.add(recm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_rec_mon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_rec_mon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_rec_monMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_rec_mon);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1040, 230));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 660));
        jPanel4.getAccessibleContext().setAccessibleParent(null);

        setSize(new java.awt.Dimension(1202, 694));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
             int row=tbl_rec_mon.getSelectedRow();
             String cell=tbl_rec_mon.getModel().getValueAt(row, 0).toString();
             String query="DELETE FROM `recouvrement` WHERE  idrec = "+cell;
        try{
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");
                 PreparedStatement pst = con.prepareStatement(query);
      
        pst.execute();
       
        JOptionPane.showMessageDialog(null,"deleted successfuly");
        Table();
        }
        catch (Exception e) {
        e.printStackTrace();
    }  
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{              
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root",""); 
  int row=tbl_rec_mon.getSelectedRow();
  String cell=(tbl_rec_mon.getModel().getValueAt(row, 0).toString());
  String query="UPDATE recouvrement set rec=?,taux=?,date=? where idrec="+cell;
  PreparedStatement stmt3 = con.prepareStatement(query);
   
             stmt3.setString(1,recm.getText());
               
                stmt3.setString(2,taux.getText());
                //stmt3.setDate(5, new java.sql.Date(txtyear.getCalendar().getWeekYear()));
                stmt3.setDate(3,  new java.sql.Date(year.getDate().getTime()));
                        
                stmt3.executeUpdate();


             JOptionPane.showMessageDialog(null,"les données a été modifier");
             Table();
   
   
   
   } 
      catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }          
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
           
        
       try {
           
           
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");    
            
 PreparedStatement stmt3 = con.prepareStatement("INSERT INTO recouvrement(id_obj,div_obj,rec,taux,date) VALUES(?,?,?,?,?)");
       
            stmt3.setLong(1,P_code[cent.getSelectedIndex()]);
            stmt3.setString(2,objm.getText());
             stmt3.setString(3,recm.getText());
               
                stmt3.setString(4,taux.getText());
                //stmt3.setDate(5, new java.sql.Date(txtyear.getCalendar().getWeekYear()));
                stmt3.setDate(5,  new java.sql.Date(year.getDate().getTime()));
                        
stmt3.executeUpdate();


JOptionPane.showMessageDialog(null,"les données a été ajouter");
Table();
//clear();
}      
  catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }

    

        
        
        
        
        
        
        
    }                                      

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
   try{              
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root",""); 
  int row=tbl_rec_mon.getSelectedRow();
  String value=(tbl_rec_mon.getModel().getValueAt(row, 0).toString());
  String query="UPDATE recouvrement set code=?,obj=?,rec=?,taux=?,date=? where idrec="+value;
  PreparedStatement stmt3 = con.prepareStatement(query);
     stmt3.setLong(1,L_code[cent.getSelectedIndex()]);
            stmt3.setString(2,objm.getText());
             stmt3.setString(3,recm.getText());
               
                stmt3.setString(4,taux.getText());
                //stmt3.setDate(5, new java.sql.Date(txtyear.getCalendar().getWeekYear()));
                stmt3.setDate(5,  new java.sql.Date(year.getDate().getTime()));
                        
                stmt3.executeUpdate();


             JOptionPane.showMessageDialog(null,"les données a été modifier");
             Table();
   
   
   
   } 
      catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    } 
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tauxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tauxActionPerformed
        taux();
    }//GEN-LAST:event_tauxActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
     try{
               Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");
      
          
     
      
     
       
            java.sql.Statement Statement = con.createStatement();
              ResultSet  rs = Statement.executeQuery("SELECT objectif,anne FROM centre WHERE code='"+P_code[cent.getSelectedIndex()]+"'");
       while(rs.next()){
       
                   
                   double objmn = rs.getDouble("objectif");
                   objmon(objmn);
                  Date annee=rs.getDate("anne");
                  year.setDate(annee);
                   
       }
                    
             
         
         
      
    
 
 }catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }   
    }//GEN-LAST:event_btn_resetActionPerformed

        
        public void taux(){
      Double  rec=Double.parseDouble(recm.getText());
       Double  obj=Double.parseDouble(objm.getText());
       
       Double jtaux=rec/obj*100;
       taux.setText(String.valueOf(jtaux));
        



}
public void clear(){
    objm.setText(null);
    recm.setText(null);
    taux.setText(null);
    year.setCalendar(null);
    cent.setSelectedIndex(0);



}
public void objmon(double x){
      
            
        double y = x/12;
         
        
        objm.setText(String.valueOf(y));
        

}
    
    
    private void tbl_rec_monMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_rec_monMouseClicked
         DefaultTableModel model=( DefaultTableModel) tbl_rec_mon.getModel();
        int selectedrow=tbl_rec_mon.getSelectedRow();
        objm.setText(model.getValueAt(selectedrow, 2).toString());
         recm.setText(model.getValueAt(selectedrow, 3).toString());
    
    
      
         String centre=model.getValueAt(selectedrow, 1).toString();
         switch(centre){
          case "tighennif":
         cent.setSelectedIndex(0);
         break;
          case "GHRISS":
         cent.setSelectedIndex(1);
         break;
          case "Mascara":
         cent.setSelectedIndex(2);
         break;
          case "SIG":
         cent.setSelectedIndex(3);
         break;
         
        
          case "O/Abtal":
         cent.setSelectedIndex(4);
         break;
          case "BOUHANIFIA":
         cent.setSelectedIndex(5);
         break;
          case "ELBORDJ":
         cent.setSelectedIndex(6);
         break;
         
         }
          taux.setText(model.getValueAt(selectedrow, 4).toString());
          
          
        try {
            Date jdate=  new SimpleDateFormat("yyyy-MM-dd").parse( model.getValueAt(selectedrow, 5).toString());
            year.setDate(jdate);
        } catch (ParseException ex) {
            Logger.getLogger(Objectif.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_tbl_rec_monMouseClicked

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton1StateChanged
        
    }//GEN-LAST:event_jButton1StateChanged

    private void tauxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tauxCaretUpdate
       taux();
    }//GEN-LAST:event_tauxCaretUpdate

    private void centActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
 Frame frm= new Frame();
        frm.setVisible(true);
        dispose();         // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_exitActionPerformed
 public void Table(){
        String []objectif={"idrec","centre","objectifmonsielle","rec","taux","date"};
        String [] afficher=new String[6];
        DefaultTableModel model=new DefaultTableModel(null,objectif);
        try{
               Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");   
            
         java.sql.Statement stmt=con.createStatement();
          ResultSet rs =stmt.executeQuery("SELECT *  FROM recouvrement,centre Where recouvrement.id_obj=centre.id_obj ");
          while(rs.next()){
              afficher[0]=rs.getString("idrec");
             
                   afficher[1]=rs.getString("Nom");
                    
                    afficher[2]=rs.getString("div_obj");
                    afficher[3]=rs.getString("rec");
                    afficher[4]=rs.getString("taux");
                    afficher[5]=rs.getString("date");
                    model.addRow(afficher);
                    
          
          
          }
          tbl_rec_mon.setModel(model);
          con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        
        
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox<String> cent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField objm;
    private javax.swing.JTextField recm;
    private javax.swing.JTextField taux;
    private javax.swing.JTable tbl_rec_mon;
    private com.toedter.calendar.JDateChooser year;
    // End of variables declaration//GEN-END:variables
}
