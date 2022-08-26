package GUI;
import Core.Prof;

public class ProfHomepage extends javax.swing.JFrame
{

    Prof p;
    
    public ProfHomepage(String id)
    {
        p=new Prof(id);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        additionalRequests = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        cpass1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cnt1 = new javax.swing.JButton();
        viewTT = new javax.swing.JButton();
        viewCourses1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        additionalRequests.setBackground(new java.awt.Color(204, 255, 204));
        additionalRequests.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        additionalRequests.setText("Addl. Subjects Requests");
        additionalRequests.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                additionalRequestsActionPerformed(evt);
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

        cpass1.setBackground(new java.awt.Color(204, 204, 204));
        cpass1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cpass1.setText("Change Password");
        cpass1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cpass1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("View");

        cnt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cnt1.setText("Central Time Table");
        cnt1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cnt1ActionPerformed(evt);
            }
        });

        viewTT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewTT.setText("My Time Table");
        viewTT.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewTTActionPerformed(evt);
            }
        });

        viewCourses1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewCourses1.setText("My Courses");
        viewCourses1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewCourses1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cnt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewCourses1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewTT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cpass1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(97, 97, 97)
                .addComponent(logout)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(additionalRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(cpass1))
                .addGap(13, 13, 13)
                .addComponent(additionalRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewTT, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewCourses1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additionalRequestsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_additionalRequestsActionPerformed
    {//GEN-HEADEREND:event_additionalRequestsActionPerformed
        new AdditionalRequests(p.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_additionalRequestsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void cpass1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cpass1ActionPerformed
    {//GEN-HEADEREND:event_cpass1ActionPerformed
        new ChangePassword(p.id,"prof").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cpass1ActionPerformed

    private void cnt1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cnt1ActionPerformed
    {//GEN-HEADEREND:event_cnt1ActionPerformed
        new CNT(p.id,"prof").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cnt1ActionPerformed

    private void viewTTActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_viewTTActionPerformed
    {//GEN-HEADEREND:event_viewTTActionPerformed
        new TimeTable(p.id,p.type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewTTActionPerformed

    private void viewCourses1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_viewCourses1ActionPerformed
    {//GEN-HEADEREND:event_viewCourses1ActionPerformed
        new ViewCourses(p.id, p.type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewCourses1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionalRequests;
    private javax.swing.JButton cnt1;
    private javax.swing.JButton cpass1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewCourses1;
    private javax.swing.JButton viewTT;
    // End of variables declaration//GEN-END:variables
}
