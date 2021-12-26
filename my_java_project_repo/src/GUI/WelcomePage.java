/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ugure
 */
public class WelcomePage extends javax.swing.JFrame {

   AdminPasswordPanel adminPassword= new AdminPasswordPanel(this);
   CustomerPanel CF = new CustomerPanel(this);
    public WelcomePage() 
    {
        setLocationRelativeTo(null); //center
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showAdminPasswordBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        gotoCustomerFrameBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Reservation System  v1.0");
        setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ADMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 70, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("CUSTOMER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, -1));

        showAdminPasswordBTN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showAdminPasswordBTN.setText("Enter");
        showAdminPasswordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAdminPasswordBTNActionPerformed(evt);
            }
        });
        getContentPane().add(showAdminPasswordBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 110, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, 130));

        gotoCustomerFrameBTN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        gotoCustomerFrameBTN.setText("Enter");
        gotoCustomerFrameBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoCustomerFrameBTNActionPerformed(evt);
            }
        });
        getContentPane().add(gotoCustomerFrameBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brandIcon2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brandIcon.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 60, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/byTicket.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 70));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 512, 20));

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText(" Flight Reservation System");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 210));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 170, 230));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("v1.0");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showAdminPasswordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAdminPasswordBTNActionPerformed
        adminPassword.setVisible(true);      
    }//GEN-LAST:event_showAdminPasswordBTNActionPerformed

    private void gotoCustomerFrameBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoCustomerFrameBTNActionPerformed
        CF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gotoCustomerFrameBTNActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gotoCustomerFrameBTN;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton showAdminPasswordBTN;
    // End of variables declaration//GEN-END:variables
}