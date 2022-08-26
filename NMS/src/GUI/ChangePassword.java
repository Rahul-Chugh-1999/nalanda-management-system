package GUI;
import Core.User;
import java.awt.Color;
public class ChangePassword extends javax.swing.JFrame
{
    private User u;

    public ChangePassword(String id,String type)
    {
        u=new User(id,type);
        initComponents();
        this.setLocationRelativeTo(null);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        oldPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        nPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        rnPass = new javax.swing.JPasswordField();
        ReqPassChange = new javax.swing.JButton();
        Indicator = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Enter Old Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter New Password");

        nPass.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                nPassFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Re-enter New Password");

        rnPass.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                rnPassFocusLost(evt);
            }
        });
        rnPass.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rnPassActionPerformed(evt);
            }
        });

        ReqPassChange.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ReqPassChange.setText("Submit");
        ReqPassChange.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ReqPassChangeActionPerformed(evt);
            }
        });

        Indicator.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        back1.setBackground(new java.awt.Color(204, 204, 204));
        back1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backbuttoncircle_79559 (1).png"))); // NOI18N
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                back1ActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(153, 153, 255));
        logout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit (1).png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ReqPassChange, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Indicator, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nPass, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rnPass, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(338, 338, 338)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back1)
                    .addComponent(logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                    .addComponent(nPass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rnPass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Indicator, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ReqPassChange, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReqPassChangeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ReqPassChangeActionPerformed
    {//GEN-HEADEREND:event_ReqPassChangeActionPerformed
        if(String.valueOf(nPass.getPassword()) == null ? String.valueOf(rnPass.getPassword()) != null : !String.valueOf(nPass.getPassword()).equals(String.valueOf(rnPass.getPassword())))
            return;
        if(u.confirmPassword(String.valueOf(oldPass.getPassword())))            
        {
            u.changePassword(String.valueOf(nPass.getPassword()));
            Indicator.setForeground(new Color(51,204,0));
            Indicator.setText("Password Changed Succesfully");
            return;
        }
        Indicator.setForeground(Color.RED);
        Indicator.setText("Wrong old password");
    }//GEN-LAST:event_ReqPassChangeActionPerformed

    private void rnPassFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_rnPassFocusLost
    {//GEN-HEADEREND:event_rnPassFocusLost
        if(String.valueOf(nPass.getPassword()) == null ? String.valueOf(rnPass.getPassword()) != null : !String.valueOf(nPass.getPassword()).equals(String.valueOf(rnPass.getPassword())))
        {
            Indicator.setForeground(Color.RED);
            Indicator.setText("Passwords Don't match");
        }
    }//GEN-LAST:event_rnPassFocusLost

    private void nPassFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_nPassFocusLost
    {//GEN-HEADEREND:event_nPassFocusLost
        if("".equals(String.valueOf(rnPass.getPassword()))) Indicator.setText("");
        else if(String.valueOf(nPass.getPassword()) == null ? String.valueOf(rnPass.getPassword()) != null : !String.valueOf(nPass.getPassword()).equals(String.valueOf(rnPass.getPassword())))
        {
            Indicator.setForeground(Color.RED);
            Indicator.setText("Passwords Don't match");
        }
        else Indicator.setText("");
    }//GEN-LAST:event_nPassFocusLost

    private void rnPassActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rnPassActionPerformed
    {//GEN-HEADEREND:event_rnPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnPassActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back1ActionPerformed
    {//GEN-HEADEREND:event_back1ActionPerformed
        if("auth".equals(u.type))
            new AuthHomepage(u.id).setVisible(true);
        if("student".equals(u.type))
             new StudentHomepage(u.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Indicator;
    private javax.swing.JButton ReqPassChange;
    private javax.swing.JButton back1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    private javax.swing.JPasswordField nPass;
    private javax.swing.JPasswordField oldPass;
    private javax.swing.JPasswordField rnPass;
    // End of variables declaration//GEN-END:variables
}
