package GUI;
import Core.Auth;
public class EditSession extends javax.swing.JFrame
{
    private Auth s;

    public EditSession(String s)
    {
        this.s=new Auth(s);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        batches = new javax.swing.JButton();
        modifyProf = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        courses = new javax.swing.JButton();
        back = new javax.swing.JButton();
        modifyRooms = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        batches.setBackground(new java.awt.Color(204, 255, 204));
        batches.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        batches.setText("Students");
        batches.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                batchesActionPerformed(evt);
            }
        });

        modifyProf.setBackground(new java.awt.Color(204, 255, 204));
        modifyProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        modifyProf.setText("Faculity");
        modifyProf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modifyProfActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Departments");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        courses.setBackground(new java.awt.Color(204, 255, 204));
        courses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        courses.setText("Courses");
        courses.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                coursesActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backbuttoncircle_79559 (1).png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backActionPerformed(evt);
            }
        });

        modifyRooms.setBackground(new java.awt.Color(204, 255, 204));
        modifyRooms.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        modifyRooms.setText("Rooms");
        modifyRooms.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modifyRoomsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("View / Modify");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(modifyProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(batches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(logout))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(batches, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifyProf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifyRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyProfActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_modifyProfActionPerformed
    {//GEN-HEADEREND:event_modifyProfActionPerformed
        new ChooseDept(s.id,"ModifyProf").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modifyProfActionPerformed

    private void coursesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_coursesActionPerformed
    {//GEN-HEADEREND:event_coursesActionPerformed
        new ChooseDept(s.id,"Courses").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_coursesActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backActionPerformed
    {//GEN-HEADEREND:event_backActionPerformed
        new AuthHomepage(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        new ModifyDept(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void batchesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_batchesActionPerformed
    {//GEN-HEADEREND:event_batchesActionPerformed
        new ChooseDept(s.id,"Batches").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_batchesActionPerformed

    private void modifyRoomsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_modifyRoomsActionPerformed
    {//GEN-HEADEREND:event_modifyRoomsActionPerformed
        new ModifyRooms(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modifyRoomsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton batches;
    private javax.swing.JButton courses;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton modifyProf;
    private javax.swing.JButton modifyRooms;
    // End of variables declaration//GEN-END:variables
}
