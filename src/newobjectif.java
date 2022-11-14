
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


public class newobjectif extends javax.swing.JFrame {
       Long p_code[];
    

   
    public newobjectif() {
        initComponents();
        Table();
          
        int index=0;
         try {
             
            p_code=new Long[100];
           
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");


            
           PreparedStatement stmt2 = con.prepareStatement("SELECT * FROM centre");
            ResultSet rs2 = stmt2.executeQuery();
             
              while(rs2.next())
              {
                  p_code[index]=rs2.getLong(2);
                  index++;
                  //cent.addItem(rs2.getString(3));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        year = new com.toedter.calendar.JDateChooser();
        cent = new javax.swing.JComboBox<>();
        nbrabb = new javax.swing.JTextField();
        nbragent = new javax.swing.JTextField();
        nbrvehicule = new javax.swing.JTextField();
        responsable = new javax.swing.JTextField();
        objectif = new javax.swing.JTextField();
        jcode = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_general = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/centre.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 140, 110));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("        Gestion Des Centres");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 540, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 140));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Centre");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Nombre Abbone");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Nombre Agent");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Nombre Vehicule");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Objectif");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Responsable");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Année");

        cent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tighennif", "GHRISS", "Mascara", "SIG", "O/ABTAL", "BOUHANIFIA", "ELBORDJ", "Mohammadia", " " }));
        cent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centActionPerformed(evt);
            }
        });

        nbrabb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrabbActionPerformed(evt);
            }
        });

        nbrvehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrvehiculeActionPerformed(evt);
            }
        });

        jcode.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jcode.setText("code");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nbrabb)
                            .addComponent(nbragent, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cent, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nbrvehicule)
                    .addComponent(responsable)
                    .addComponent(objectif)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nbrvehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(code))
                            .addComponent(responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbrabb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(objectif, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nbragent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 830, 320));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 152, 50));

        jButton2.setBackground(new java.awt.Color(51, 51, 204));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setText("Modifier");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 152, 50));

        jButton3.setBackground(new java.awt.Color(51, 51, 204));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 152, 40));

        jButton5.setBackground(new java.awt.Color(51, 51, 240));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Retour");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, 220, 250));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_general.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_general.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_generalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_general);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 960, 340));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Liste d'informations sur les centres");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 510, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 1020, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centActionPerformed
        // TODO add your handling code here:
       String CDT="0129";
        String CDG="0229";
         String CDM="0329";
          String CDS="0429";

           String CDA="0529";
            String CDB="0629";
             String CDE="0729";
              String CDMO="0829";
                if(cent.getSelectedItem().equals("tighennif")){
      code.setText(CDT);}
        if(cent.getSelectedItem().equals("GHRISS")){
      code.setText(CDG);}
          if(cent.getSelectedItem().equals("Mascara")){
      code.setText(CDM);}
            if(cent.getSelectedItem().equals("SIG")){
      code.setText(CDS);}
              if(cent.getSelectedItem().equals("O/ABTAL")){
      code.setText(CDA);}
                if(cent.getSelectedItem().equals("BOUHANIFIA")){
      code.setText(CDB);}
                  if(cent.getSelectedItem().equals("ELBORDJ")){
      code.setText(CDE);}
                    if(cent.getSelectedItem().equals("Mohammadia")){
      code.setText(CDMO);}
        
      
        
        
        
        
        
    }//GEN-LAST:event_centActionPerformed

    private void nbrabbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrabbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbrabbActionPerformed

    private void nbrvehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrvehiculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbrvehiculeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
   try{              
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root",""); 
  int row=table_general.getSelectedRow();
  String value=(table_general.getModel().getValueAt(row, 0).toString());
  String query="UPDATE centre set code=?,Nom=?, Responsable=?,objectif=?,nbragent=?,nbrabonne=?,nbrvehicule=?,anne=? where id_obj="+value;
  PreparedStatement stmt3 = con.prepareStatement(query);
  
     stmt3.setString(1, code.getText());
      stmt3.setString(2,cent.getSelectedItem().toString());
            stmt3.setString(3,responsable.getText());
             stmt3.setString(4,objectif.getText());
               
                stmt3.setString(5,nbragent.getText());
                 stmt3.setString(6,nbrabb.getText());
                  stmt3.setString(7,nbrvehicule.getText());
                //stmt3.setDate(5, new java.sql.Date(txtyear.getCalendar().getWeekYear()));
                stmt3.setDate(8,  new java.sql.Date(year.getDate().getTime()));
                        
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
        // TODO add your handling code here:
             
       try {
           
           
 Class.forName("com.mysql.jdbc.Driver");

 java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");    
 //String val=p_code[cent.getSelectedIndex()].toString();
 PreparedStatement stmt3 = con.prepareStatement("INSERT INTO centre(code,Nom,Responsable,objectif,nbrabonne,nbragent,nbrvehicule,anne) VALUES(?,?,?,?,?,?,?,?) ");
              stmt3.setString(1,code.getText());
               stmt3.setString(2,cent.getSelectedItem().toString());
              stmt3.setString(3,responsable.getText());
               stmt3.setString(4,objectif.getText());
             
            stmt3.setString(5,nbrabb.getText());
             stmt3.setString(6,nbragent.getText());
               
                stmt3.setString(7,nbrvehicule.getText());
              
                stmt3.setDate(8,  new java.sql.Date(year.getDate().getTime()));
                        
stmt3.executeUpdate();


JOptionPane.showMessageDialog(null,"les données a été ajouter");
Table();
}      
  catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Erreur se trouve ici"+e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
       
             java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");
             int row=table_general.getSelectedRow();
             String value=(table_general.getModel().getValueAt(row, 0).toString());
             String query="DELETE FROM centre WHERE id_obj="+value;
        
        PreparedStatement pst=con.prepareStatement(query);
       
        pst.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(null,"les données a éte supprimer");
        Table();
        }
        catch (Exception e) {
        e.printStackTrace();
    }  
        
        
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_generalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_generalMouseClicked
        // TODO add your handling code here:
       
          DefaultTableModel model=( DefaultTableModel) table_general.getModel();
        int selectedrow=table_general.getSelectedRow();
        objectif.setText(model.getValueAt(selectedrow, 4).toString());
        code.setText(model.getValueAt(selectedrow, 1).toString());
        responsable.setText(model.getValueAt(selectedrow, 3).toString());
        nbrabb.setText(model.getValueAt(selectedrow, 5).toString());
        nbragent.setText(model.getValueAt(selectedrow, 6).toString());
       nbrvehicule.setText(model.getValueAt(selectedrow, 7).toString());

    
    
      
         String centre=model.getValueAt(selectedrow, 2).toString();
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
         
          case "O/ABTAL":
         cent.setSelectedIndex(4);
         break;
          case "BOUHANIFIA":
         cent.setSelectedIndex(5);
         break;
          case "ELBORDJ":
         cent.setSelectedIndex(6);
         break;
         case "Mohammadia":
         cent.setSelectedIndex(6);
         break;
         
         }
          
          
          
        try {
            Date jdate=  new SimpleDateFormat("yyyy-MM-dd").parse( model.getValueAt(selectedrow, 8).toString());
            year.setDate(jdate);
        } catch (ParseException ex) {
            Logger.getLogger(Objectif.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }                                        

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        
    }                                     

    private void tauxCaretUpdate(javax.swing.event.CaretEvent evt) {                                 
       taux();
                                  

                                       
 
        
        
    }//GEN-LAST:event_table_generalMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Frame frm= new Frame();
        frm.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    public void Table(){
        String []objectif={"id_obj","code","centre","Responsable","objectif","nbrabonne","nbragent","nbrvehicule","Année"};
        String [] afficher=new String[9];
        DefaultTableModel model=new DefaultTableModel(null,objectif);
        try{
               Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Stageade","root","");   
            
         java.sql.Statement stmt=con.createStatement();
          ResultSet rs =stmt.executeQuery("SELECT *  FROM centre ");
          while(rs.next()){
               afficher[0]=rs.getString("id_obj");
              afficher[1]=rs.getString("code");
            
                    afficher[2]=rs.getString("Nom");
                    afficher[3]=rs.getString("Responsable");
                    afficher[4]=rs.getString("objectif");
                    afficher[5]=rs.getString("nbrabonne");
                    afficher[6]=rs.getString("nbragent");
                    afficher[7]=rs.getString("nbrvehicule");
                    afficher[8]=rs.getString("anne");
                    model.addRow(afficher);
                    
          
          
          }
          table_general.setModel(model);
          con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        
        
        }
    }
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
            java.util.logging.Logger.getLogger(newobjectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newobjectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newobjectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newobjectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newobjectif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cent;
    private javax.swing.JTextField code;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jcode;
    private javax.swing.JTextField nbrabb;
    private javax.swing.JTextField nbragent;
    private javax.swing.JTextField nbrvehicule;
    private javax.swing.JTextField objectif;
    private javax.swing.JTextField responsable;
    private javax.swing.JTable table_general;
    private com.toedter.calendar.JDateChooser year;
    // End of variables declaration//GEN-END:variables

    private void taux() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
