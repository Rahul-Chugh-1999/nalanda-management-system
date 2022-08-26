package GUI;
import Core.Semester;
import Core.Student;

public class StudentHomepage extends javax.swing.JFrame
{
    Student s;
    public StudentHomepage(String s)
    {
        this.s=new Student(s);
        initComponents();
        this.setLocationRelativeTo(null);
        chooseAdditional.setVisible("Open".equals(new Semester().status)&&("Open".equals(this.s.addStatus)||"Reject".equals(this.s.addStatus)));
        additionalStatus.setText("Status  : "+(("Frozen".equals(new Semester().status))?"Closed":this.s.addStatus));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        cnt = new javax.swing.JButton();
        viewTT = new javax.swing.JButton();
        viewCourses = new javax.swing.JButton();
        chooseAdditional = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        cpass1 = new javax.swing.JButton();
        additionalStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cnt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cnt.setText("Central Time Table");
        cnt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cntActionPerformed(evt);
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

        viewCourses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewCourses.setText("My Courses");
        viewCourses.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewCoursesActionPerformed(evt);
            }
        });

        chooseAdditional.setBackground(new java.awt.Color(204, 255, 204));
        chooseAdditional.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        chooseAdditional.setText("Choose");
        chooseAdditional.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chooseAdditionalActionPerformed(evt);
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

        additionalStatus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        additionalStatus.setForeground(new java.awt.Color(0, 153, 0));
        additionalStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        additionalStatus.setText("status");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("View");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setText("Additonal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel3.setText("Subject");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cpass1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(238, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(additionalStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chooseAdditional, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .addComponent(viewTT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewCourses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(254, 254, 254)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout)
                            .addComponent(cpass1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(additionalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseAdditional, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewTT, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cntActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cntActionPerformed
    {//GEN-HEADEREND:event_cntActionPerformed
        new CNT(s.id,"student").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cntActionPerformed

    private void viewTTActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_viewTTActionPerformed
    {//GEN-HEADEREND:event_viewTTActionPerformed
        new TimeTable(s.id,"student").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewTTActionPerformed

    private void viewCoursesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_viewCoursesActionPerformed
    {//GEN-HEADEREND:event_viewCoursesActionPerformed
        new ViewCourses(s.id, s.type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewCoursesActionPerformed

    private void chooseAdditionalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chooseAdditionalActionPerformed
    {//GEN-HEADEREND:event_chooseAdditionalActionPerformed
        new ChooseAdditional(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chooseAdditionalActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void cpass1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cpass1ActionPerformed
    {//GEN-HEADEREND:event_cpass1ActionPerformed
        new ChangePassword(s.id,"student").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cpass1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additionalStatus;
    private javax.swing.JButton chooseAdditional;
    private javax.swing.JButton cnt;
    private javax.swing.JButton cpass1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewCourses;
    private javax.swing.JButton viewTT;
    // End of variables declaration//GEN-END:variables
}
