/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 *
 * @author emper
 */
public class ChangeRecord extends javax.swing.JFrame {

    public static String username;
    String paswd, fname, lname, emal, agie, number, sprt, spcenter,spbranch,coach; //add coach

                   
    

    
   
       
    
        
    
    /**
     *
     * Creates new form ChangeRecord
     */
    public ChangeRecord() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label10 = new java.awt.Label();
        label2 = new java.awt.Label();
        label5 = new java.awt.Label();
        label9 = new java.awt.Label();
        label4 = new java.awt.Label();
        label8 = new java.awt.Label();
        label13 = new java.awt.Label();
        label6 = new java.awt.Label();
        Viewbtn = new javax.swing.JButton();
        bbtn = new javax.swing.JButton();
        emltxt = new javax.swing.JTextField();
        numtxt = new javax.swing.JTextField();
        spctxt = new javax.swing.JComboBox<>();
        brch = new javax.swing.JComboBox<>();
        sprtcom = new javax.swing.JComboBox<>();
        label14 = new java.awt.Label();
        label3 = new java.awt.Label();
        label7 = new java.awt.Label();
        label11 = new java.awt.Label();
        chrecordbtn = new javax.swing.JButton();
        pswrdtxt = new javax.swing.JTextField();
        label12 = new java.awt.Label();
        label15 = new java.awt.Label();
        coachtxt = new javax.swing.JTextField();
        asigcoach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Modify Account Details");

        label10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label10.setText("First Name:");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("Last Name:");

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("Email:");

        label9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label9.setName(""); // NOI18N
        label9.setText("Age:");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("Number:");

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setText("Sports Center:");

        label13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label13.setText("Coach:");

        label6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label6.setText("Sport:");

        Viewbtn.setText("View Record");
        Viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbtnActionPerformed(evt);
            }
        });

        bbtn.setText("Return to Menu");
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });

        emltxt.setBackground(new java.awt.Color(0, 0, 0));
        emltxt.setForeground(new java.awt.Color(255, 255, 255));
        emltxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        numtxt.setBackground(new java.awt.Color(0, 0, 0));
        numtxt.setForeground(new java.awt.Color(255, 255, 255));
        numtxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        spctxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur", "Penang", "Melaka", "Lankawi" }));
        spctxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        spctxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spctxtActionPerformed(evt);
            }
        });

        brch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        brch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brchActionPerformed(evt);
            }
        });

        sprtcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Swimming", "Badminton", "Football", "Archery", "Gymnastics", "Volleyball", "Basketball", "Cricket", "Tennis", "Table Tennis" }));
        sprtcom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        sprtcom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sprtcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprtcomActionPerformed(evt);
            }
        });

        label14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label14.setText("Password:");

        label3.setBackground(new java.awt.Color(0, 0, 0));
        label3.setForeground(new java.awt.Color(255, 255, 255));

        label7.setBackground(new java.awt.Color(0, 0, 0));
        label7.setForeground(new java.awt.Color(255, 255, 255));

        label11.setBackground(new java.awt.Color(0, 0, 0));
        label11.setForeground(new java.awt.Color(255, 255, 255));

        chrecordbtn.setText("Change Record");
        chrecordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chrecordbtnActionPerformed(evt);
            }
        });

        pswrdtxt.setBackground(new java.awt.Color(0, 0, 0));
        pswrdtxt.setForeground(new java.awt.Color(255, 255, 255));
        pswrdtxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        label12.setForeground(new java.awt.Color(255, 0, 0));
        label12.setText("Note: Only records with RED borders can be modified.");

        label15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label15.setText("Branch:");

        coachtxt.setEditable(false);

        asigcoach.setText("Assign Coach");
        asigcoach.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        asigcoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asigcoachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pswrdtxt)
                                    .addComponent(brch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(emltxt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40))
                                    .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spctxt, 0, 121, Short.MAX_VALUE)
                                            .addComponent(sprtcom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(coachtxt)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chrecordbtn)
                            .addComponent(Viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(bbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asigcoach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spctxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(brch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sprtcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(label15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pswrdtxt))
                        .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(coachtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(asigcoach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chrecordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbtnActionPerformed
        try {
            try (Scanner in = new Scanner(new File("Studentregistration.txt"))) {
                while (in.hasNextLine())
                {
                    String s = in.nextLine();
                    String[] sArray = s.split(",");
                    
                    if (sArray[0].equals(username))
                    {
                        paswd= sArray[1];
                        fname= sArray[2];
                        lname= sArray[3];
                        emal= sArray[4];
                        agie= sArray[5];
                        number= sArray[6];
                        sprt= sArray[7];
                        spcenter= sArray[8];
                        spbranch= sArray[9];
                        coach= sArray[10];
                        
                        label3.setText(fname);
                        label7.setText(lname);
                        emltxt.setText(emal);
                        label11.setText(agie);
                        pswrdtxt.setText(paswd);
                        numtxt.setText(number);
                        sprtcom.setSelectedItem(sprt);
                        spctxt.setSelectedItem(spcenter);
                        brch.setSelectedItem(spbranch);
                        coachtxt.setText(coach);
                    }
                    
                }in.close();
            } 
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                "User Database Not Found", "Error",
                JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ViewbtnActionPerformed

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtnActionPerformed
        StudentMenu mnu=new StudentMenu();
        mnu.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_bbtnActionPerformed

    private void brchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brchActionPerformed

        
// TODO add your handling code here:
    }//GEN-LAST:event_brchActionPerformed

    private void chrecordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chrecordbtnActionPerformed
      String filepath= "Studentregistration.txt";
      String tempFile= "temp.txt";
      File oldFile = new File(filepath);
      File newFile= new File(tempFile);
      String usrname;
        String pswd; 
        String afname;
        String alname;
        String aemal;
        String aagie;
        String anumber;
        String asprt;
        String aspcenter;
        String aspbranch;  
        String acoach;
        String search=username;
        try{
            FileWriter fw= new FileWriter(tempFile,true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            String  npaswd=pswrdtxt.getText().trim();
              String nfname=label3.getText().trim();
              String nlname=label7.getText().trim();
              String nemal=emltxt.getText().trim();
              String nagie=label11.getText().trim();
              String nnumber=numtxt.getText().trim();
              String nsprt=sprtcom.getSelectedItem().toString();
              String nspcenter=spctxt.getSelectedItem().toString();
              String nspbranch=brch.getSelectedItem().toString();
              String ncoach=coachtxt.getText().trim();
              while(x.hasNext()){
                 usrname= x.next();
                  pswd= x.next();
                  afname=x.next();
                  alname=x.next();
                  aemal=x.next();
                  aagie=x.next();
                  anumber=x.next();
                  asprt=x.next();
                  aspcenter=x.next();
                  aspbranch=x.next();  
                  acoach= x.next();
                  
                  if(usrname.equals(search)){
                    pw.println(search+","+npaswd+","+nfname+","+nlname+","+nemal+","+nagie+","+nnumber+","+nsprt+","+nspcenter+","+nspbranch+","+ncoach); //add ncoach here
                  }
                  else{
                    pw.println(usrname+","+pswd+","+afname+","+alname+","+aemal+","+aagie+","+anumber+","+asprt+","+aspcenter+","+aspbranch+","+acoach); //add acoach here
                  }
              }x.close();
              pw.flush();
              pw.close();
              oldFile.delete();
              File dump =new File(filepath);
              newFile.renameTo(dump);
            
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Failed update");
        }
        
    }//GEN-LAST:event_chrecordbtnActionPerformed

    private void spctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spctxtActionPerformed
       try{
            if(spctxt.getSelectedItem().equals("Kuala Lumpur")){
                brch.removeAllItems();
                brch.setSelectedItem(null);
                brch.addItem("KL1");
                brch.addItem("KL2");
                brch.addItem("KL3");
                brch.addItem("KL4");
            }
            else if(spctxt.getSelectedItem().equals("Penang")){
                brch.removeAllItems();
                brch.setSelectedItem(null);
                brch.addItem("P1");
                brch.addItem("P2");
                brch.addItem("P3");
                brch.addItem("P4");
            }

            else if(spctxt.getSelectedItem().equals("Melaka")){
                brch.removeAllItems();
                brch.setSelectedItem(null);
                brch.addItem("M1");
                brch.addItem("M2");
                brch.addItem("M3");
                brch.addItem("M4");
            }

            else if(spctxt.getSelectedItem().equals("Lankawi")){
                brch.removeAllItems();
                brch.setSelectedItem(null);
                brch.addItem("L1");
                brch.addItem("L2");
                brch.addItem("L3");
                brch.addItem("L4");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_spctxtActionPerformed

    private void sprtcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprtcomActionPerformed
        if(sprtcom.getSelectedItem().equals("Swimming")){
                
            }
    }//GEN-LAST:event_sprtcomActionPerformed

    private void asigcoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asigcoachActionPerformed
        String searchcenter= spctxt.getSelectedItem().toString();
        String searchbranch = brch.getSelectedItem().toString();
        String searchsport= sprtcom.getSelectedItem().toString();
        try {
            try (Scanner in = new Scanner(new File("Coach.txt"))) {
                while (in.hasNextLine())
                {
                    String s = in.nextLine();
                    String[] sArray = s.split(",");

                    if (sArray[5].equals(searchsport))
                    {
                        if(sArray[7].equals(searchcenter)){

                            if(sArray[8].equals(searchbranch)){
                                String assigncoach= sArray[1];
                                coachtxt.setText(assigncoach);

                                JOptionPane.showMessageDialog(null,
                                    "Coach Assigned Succesffully");
                            }

                        }
                       

                    }
                   
                    

                }
                in.close(); }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                "Coach Database Not Found", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_asigcoachActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangeRecord().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Viewbtn;
    private javax.swing.JButton asigcoach;
    private javax.swing.JButton bbtn;
    private javax.swing.JComboBox<String> brch;
    private javax.swing.JButton chrecordbtn;
    private javax.swing.JTextField coachtxt;
    private javax.swing.JTextField emltxt;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField numtxt;
    private javax.swing.JTextField pswrdtxt;
    private javax.swing.JComboBox<String> spctxt;
    private javax.swing.JComboBox<String> sprtcom;
    // End of variables declaration//GEN-END:variables
}
