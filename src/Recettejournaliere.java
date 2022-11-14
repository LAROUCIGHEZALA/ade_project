
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.div;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class Recettejournaliere extends javax.swing.JFrame {
      Long L_code[];
 Long P_code[];
 
 
   
    public Recettejournaliere() {
        initComponents();
        Tablef();
          int index = 0;
          int index1=0;
       
         try {
             
             
            L_code = new Long[100];
           P_code = new Long[100];
           
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");


            
           PreparedStatement stmt2 = con.prepareStatement("SELECT * FROM centre ");
            ResultSet rs = stmt2.executeQuery();
            
              while(rs.next())
              {
               
                  L_code[index1]=rs.getLong(1);//idobj
                  index1++;
                     P_code[index]=rs.getLong(2);//code
                  index++;
                //CENT.addItem(rs.getString(3));
                 
              
              }
              rs.close();}
         catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jour = new com.toedter.calendar.JDateChooser();
        taux = new javax.swing.JTextField();
        recouv = new javax.swing.JTextField();
        objectiff = new javax.swing.JTextField();
        CENT = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        ajouter = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        com_rech = new javax.swing.JComboBox<>();
        txt_rech = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rec_jour = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recette journaliére");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 420, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/para.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 130, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 140));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Centre:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Recouvrement:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Objectif:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Taux:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Date:");

        taux.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
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

        recouv.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        objectiff.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        objectiff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objectiffActionPerformed(evt);
            }
        });

        CENT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tighennif", "GHRISS", "Mascara", "SIG", "O/ABTAL", "BOUHANIFIA", "ELBORDJ", "Mohammadia", " " }));
        CENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CENTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(objectiff, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CENT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taux, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recouv, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taux, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CENT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(objectiff, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recouv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 710, 220));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ajouter.setBackground(new java.awt.Color(51, 51, 204));
        ajouter.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ajouter.setText("Ajouter");
        ajouter.setBorder(null);
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        supprimer.setBackground(new java.awt.Color(51, 51, 255));
        supprimer.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        supprimer.setText("Supprimer");
        supprimer.setBorder(null);
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        modifier.setBackground(new java.awt.Color(51, 51, 255));
        modifier.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        modifier.setText("Modifier");
        modifier.setBorder(null);
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(51, 51, 255));
        reset.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.setBorder(null);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(51, 51, 255));
        clear.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 51, 255));
        exit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        exit.setText("Retour");
        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ajouter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(166, 166, 166))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 230, 360));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton6.setText("Recherche");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 150, 40));

        com_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centre", "Date" }));
        jPanel1.add(com_rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 160, 40));
        jPanel1.add(txt_rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 210, 40));

        tbl_rec_jour.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tbl_rec_jour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_rec_jour.setGridColor(new java.awt.Color(51, 51, 51));
        tbl_rec_jour.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tbl_rec_jour.setShowGrid(false);
        tbl_rec_jour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_rec_jourMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_rec_jour);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 567, 1040, 300));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Rechercher par:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void objectiffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objectiffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_objectiffActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
         try {
           
           
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");    
            
 PreparedStatement stmt3 = con.prepareStatement("INSERT INTO recouvrement(id_obj,div_obj,rec,taux,date) VALUES(?,?,?,?,?)");
       
            stmt3.setLong(1,L_code[CENT.getSelectedIndex()]);
            stmt3.setString(2,objectiff.getText());
            stmt3.setString(3,recouv.getText());
            stmt3.setString(4,taux.getText());
                //stmt3.setDate(5, new java.sql.Date(txtyear.getCalendar().getWeekYear()));
                stmt3.setDate(5,  new java.sql.Date(jour.getDate().getTime()));
                        
stmt3.executeUpdate();


JOptionPane.showMessageDialog(null,"les données a été ajouter");
Tablef();
}      
  catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_ajouterActionPerformed

    private void tbl_rec_jourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_rec_jourMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model=( DefaultTableModel) tbl_rec_jour.getModel();
        int selectedrow=tbl_rec_jour.getSelectedRow();
        objectiff.setText(model.getValueAt(selectedrow, 2).toString());
         recouv.setText(model.getValueAt(selectedrow, 3).toString());
    
    
      
         String centrej=model.getValueAt(selectedrow, 1).toString();
         switch(centrej){
          case "tighennif":
         CENT.setSelectedIndex(0);
         break;
          case "GHRISS":
         CENT.setSelectedIndex(1);
         break;
          case "Mascara":
         CENT.setSelectedIndex(2);
         break;
          case "SIG":
         CENT.setSelectedIndex(3);
         break;
      
          case "O/Abtal":
         CENT.setSelectedIndex(4);
         break;
          case "BOUHANIFIA":
         CENT.setSelectedIndex(5);
         break;
          case "ELBORDJ":
         CENT.setSelectedIndex(6);
         break;
             
          case "Mohammadia":
         CENT.setSelectedIndex(7);
         break;
        
         
         }
          taux.setText(model.getValueAt(selectedrow, 4).toString());
          
          
        try {
            Date jdate=  new SimpleDateFormat("yyyy-MM-dd").parse( model.getValueAt(selectedrow, 5).toString());
            jour.setDate(jdate);
        } catch (ParseException ex) {
            Logger.getLogger(Objectif.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_tbl_rec_jourMouseClicked

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
        
             int row=tbl_rec_jour.getSelectedRow();
             String cell=tbl_rec_jour.getModel().getValueAt(row, 0).toString();
             String query="DELETE FROM `recouvrement` WHERE  idrec = "+cell;
        try{
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");
                 PreparedStatement pst = con.prepareStatement(query);
      
        pst.execute();
       
        JOptionPane.showMessageDialog(null,"deleted successfuly");
        Tablef();
        }
        catch (Exception e) {
        e.printStackTrace();
    }  
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_supprimerActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
        
        
        try{              
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root",""); 
  int row=tbl_rec_jour.getSelectedRow();
  String cell=(tbl_rec_jour.getModel().getValueAt(row, 0).toString());
  String query="UPDATE recouvrement set rec=?,taux=?,date=? where idrec="+cell;
  PreparedStatement stmt3 = con.prepareStatement(query);
   
             stmt3.setString(1,recouv.getText());
               
                stmt3.setString(2,taux.getText());
                //stmt3.setDate(5, new java.sql.Date(txtyear.getCalendar().getWeekYear()));
                stmt3.setDate(3,  new java.sql.Date(jour.getDate().getTime()));
                        
                stmt3.executeUpdate();


             JOptionPane.showMessageDialog(null,"les données a été modifier");
             Tablef();
   
   
   
   } 
      catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }          
        
        
        

    }//GEN-LAST:event_modifierActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
         try{
               Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");
      java.sql.Statement Statement = con.createStatement();
      String item=CENT.getSelectedItem().toString();
              ResultSet  rs = Statement.executeQuery("SELECT objectif,anne FROM centre WHERE code='"+P_code[CENT.getSelectedIndex()]+"'");
       while(rs.next()){
      
           
           double obj = rs.getDouble("objectif");
                    
           objjour(obj);
                  
                  Date annee=rs.getDate("anne");
                 jour.setDate(annee);
                   
       }
                    
             
         
         
      
    
 
 }catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }   
    }//GEN-LAST:event_resetActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        
        
       
    objectiff.setText(null);
    recouv.setText(null);
    taux.setText(null);
    jour.setCalendar(null);
    CENT.setSelectedIndex(0);




    }//GEN-LAST:event_clearActionPerformed

    private void CENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CENTActionPerformed

    private void tauxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tauxActionPerformed
    
    }//GEN-LAST:event_tauxActionPerformed

    private void tauxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tauxCaretUpdate
        // TODO add your handling code here:
        taux();
    }//GEN-LAST:event_tauxCaretUpdate

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //la recherche ici
         
        if (txt_rech.getText().equals("")){
         JOptionPane.showMessageDialog(this,"SVP entrer quelle que chose");
        }else
        if(com_rech.getSelectedItem().equals("Centre")){
            tableReparationRecherche(txt_rech.getText()) ;
          
         }else 
       
                 {  
                 tableReparationRecherchedate(txt_rech.getText());
                
    } 
   
        
        
        
   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
         Frame frm= new Frame();
        frm.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_exitActionPerformed
public void tableReparationRecherche(String valeur) {
        String[] recouvrement = {"idrec", "centre", "objectif journaliere", "recouvrement", "taux", "date"};
        String[] ajouter = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, recouvrement);
        try {
             Class.forName("com.mysql.jdbc.Driver");
               
      java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");
      java.sql.Statement Statement = con.createStatement();
            
           
           ResultSet   rs = Statement.executeQuery("SELECT * FROM recouvrement,centre WHERE (recouvrement.id_obj=centre.id_obj) AND Nom like '%"+valeur+"%'");
            

            while (rs.next()) {
                ajouter[0] = rs.getString("idrec");
                ajouter[1] = rs.getString("Nom");
                ajouter[2] = rs.getString("div_obj");
                ajouter[3] = rs.getString("rec");
                ajouter[4] = rs.getString("taux");
                ajouter[5] = rs.getString("date");
               
                model.addRow(ajouter);
            }
            tbl_rec_jour.setModel(model);
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }}
public void tableReparationRecherchedate(String valeur) {
        String[] recouvrement = {"idrec", "centre", "objectif journaliere", "recouvrement", "taux", "date"};
        String[] ajouter = new String[6];
        DefaultTableModel model = new DefaultTableModel(null, recouvrement);
        try {
             Class.forName("com.mysql.jdbc.Driver");
               
      java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");
      java.sql.Statement Statement = con.createStatement();
            
           
           ResultSet   rs = Statement.executeQuery("SELECT * FROM recouvrement,centre WHERE (recouvrement.id_obj=centre.id_obj) AND date like '%"+valeur+"%'");
            

            while (rs.next()) {
                ajouter[0] = rs.getString("idrec");
                ajouter[1] = rs.getString("Nom");
                ajouter[2] = rs.getString("div_obj");
                ajouter[3] = rs.getString("rec");
                ajouter[4] = rs.getString("taux");
                ajouter[5] = rs.getString("date");
               
                model.addRow(ajouter);
            }
            tbl_rec_jour.setModel(model);
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }}
    public void taux(){
      Double  rec=Double.parseDouble(recouv.getText());
       Double  obj=Double.parseDouble(objectiff.getText());
       
       Double jtaux=rec/obj*100;
       taux.setText(String.valueOf(jtaux));
        



}


public void objjour(double x){
      
            
        double y =(x/366);
         
        
        objectiff.setText(String.valueOf(y));
        

}
  private void Tablef() {
         String []objectif={"idrec","centre","objectifjournaliére","rec","taux","date"};
        String [] afficher=new String[6];
        DefaultTableModel model=new DefaultTableModel(null,objectif);
        try{
               Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");   
            
         java.sql.Statement stmt=con.createStatement();
          ResultSet rs =stmt.executeQuery("SELECT * FROM recouvrement,centre WHERE recouvrement.id_obj=centre.id_obj ");
          while(rs.next()){
              afficher[0]=rs.getString("idrec");
              afficher[1]=rs.getString("Nom");
              afficher[2]=rs.getString("div_obj");
              afficher[3]=rs.getString("rec");
              afficher[4]=rs.getString("taux");
              afficher[5]=rs.getString("date");
              model.addRow(afficher);
                    
          
          
          }
          tbl_rec_jour.setModel(model);
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
            java.util.logging.Logger.getLogger(Recettejournaliere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recettejournaliere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recettejournaliere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recettejournaliere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recettejournaliere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CENT;
    private javax.swing.JButton ajouter;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> com_rech;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jour;
    private javax.swing.JButton modifier;
    private javax.swing.JTextField objectiff;
    private javax.swing.JTextField recouv;
    private javax.swing.JButton reset;
    private javax.swing.JButton supprimer;
    private javax.swing.JTextField taux;
    private javax.swing.JTable tbl_rec_jour;
    private javax.swing.JTextField txt_rech;
    // End of variables declaration//GEN-END:variables

}
