package Vista;

import Model.User;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author GROUP 1 UNC
 */
public class SessionGUI extends javax.swing.JFrame {

    private ArrayList<JRadioButton> radiobuttons = new ArrayList<>();
    private ArrayList<JRadioButton> labels = new ArrayList<>();
    ButtonGroup bg = new ButtonGroup();
    User user;

    public SessionGUI(User user) {
        initComponents();
        this.user = user;
        title2Label.setText("Welcome " + user.account.username);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1Label = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        title3Label = new javax.swing.JLabel();
        title2Label = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        removeContact = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        availableSession = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        makeRequest = new javax.swing.JButton();
        createSession = new javax.swing.JButton();
        addContact = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1Label.setFont(new java.awt.Font("AR DESTINE", 0, 48)); // NOI18N
        title1Label.setForeground(new java.awt.Color(255, 0, 0));
        title1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1Label.setText("DSDRisk Game");
        getContentPane().add(title1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 78));

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Warriors.jpg"))); // NOI18N
        getContentPane().add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, 110));

        title3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3Label.setText("What would you like to do?");
        getContentPane().add(title3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, -1));

        title2Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title2Label.setText("Welcome [Username]");
        getContentPane().add(title2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        aboutLabel.setForeground(new java.awt.Color(0, 0, 204));
        aboutLabel.setText("About this game");
        getContentPane().add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        removeContact.setText("Remove contact");
        removeContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeContactActionPerformed(evt);
            }
        });
        getContentPane().add(removeContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 160, 30));

        logOut.setText("Log out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 160, 30));

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 265, -1, -1));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Session id");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Host username");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 100, -1));

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        availableSession.setViewportView(jPanel2);

        getContentPane().add(availableSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 313, 160));

        makeRequest.setText("Make request");
        getContentPane().add(makeRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 160, 40));

        createSession.setText("Create session");
        createSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSessionActionPerformed(evt);
            }
        });
        getContentPane().add(createSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 160, 30));

        addContact.setText("Add contact");
        addContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContactActionPerformed(evt);
            }
        });
        getContentPane().add(addContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 160, 30));

        changePassword.setText("Change password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(changePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 160, 30));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background700400.jpg"))); // NOI18N
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -6, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed

        this.setVisible(false);
        this.user.account = null;
        new LogInGUI(this.user).setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void createSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSessionActionPerformed
        this.setVisible(false);
        new InitialSetupHostGUI(this.user).setVisible(true);
    }//GEN-LAST:event_createSessionActionPerformed

    private void addContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContactActionPerformed
        new AddContactGUI(this.user).setVisible(true);
    }//GEN-LAST:event_addContactActionPerformed

    private void removeContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeContactActionPerformed
        new DeleteContactGUI(this.user).setVisible(true);
    }//GEN-LAST:event_removeContactActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        new ChangePasswordGUI(this.user).setVisible(true);
    }//GEN-LAST:event_changePasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JButton addContact;
    private javax.swing.JScrollPane availableSession;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton createSession;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logOut;
    private javax.swing.JButton makeRequest;
    private javax.swing.JButton removeContact;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title2Label;
    private javax.swing.JLabel title3Label;
    // End of variables declaration//GEN-END:variables
}