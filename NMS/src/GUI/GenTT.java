package GUI;
import Core.Semester;
import Core.Auth;
import java.awt.Color;
public class GenTT extends javax.swing.JFrame
{
    private Auth s;
    private void setData()
    {
        Semester sem=s.getSemester();
        Year.setText(sem.year);
        Status.setText(sem.status);
        if("Open".equals(sem.status)) Status.setForeground(new Color(51,204,0));
        else Status.setForeground(Color.red);
        if("Spring".equals(sem.type)) spring.setSelected(true);
        else Autumn.setSelected(true);
        isSuccess.setText("");
    }
    public GenTT(String s)
    {
        this.s=new Auth(s);
        initComponents();
        this.setLocationRelativeTo(null);
        setData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Year = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        Freeze = new javax.swing.JButton();
        spring = new javax.swing.JRadioButton();
        Autumn = new javax.swing.JRadioButton();
        back1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        isSuccess = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Year.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update.setText("Generate");
        update.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateActionPerformed(evt);
            }
        });

        Status.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Status.setText("Frozen");

        Freeze.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Freeze.setText("Freeze");
        Freeze.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FreezeActionPerformed(evt);
            }
        });

        buttonGroup1.add(spring);
        spring.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        spring.setForeground(new java.awt.Color(255, 51, 51));
        spring.setText("Spring");

        buttonGroup1.add(Autumn);
        Autumn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Autumn.setForeground(new java.awt.Color(255, 51, 51));
        Autumn.setText("Autumn");

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

        isSuccess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        isSuccess.setText("                    Template");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Current Year");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Current Semester");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Current Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 260, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spring)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Autumn))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Freeze, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(283, 283, 283))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(isSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(back1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spring)
                    .addComponent(Autumn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Freeze, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(isSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateActionPerformed
    {//GEN-HEADEREND:event_updateActionPerformed
        
        
        Semester sem=s.getSemester();
        sem.type=spring.isSelected()?"Spring":"Autumn";
        try
        {    
            sem.year=String.valueOf(Integer.parseInt(Year.getText()));
            sem.status="Open";
            if(s.genTT(sem.type))
            {
                s.updateSemester(sem);
                setData();
                isSuccess.setText("Time Table successfully generated");
                isSuccess.setForeground(new Color(51,204,0));
            }
            else
            {
                setData();
                isSuccess.setForeground(Color.RED);
                isSuccess.setText("Failure to generate Time Table");
            }
        }
        catch(NumberFormatException e)
        {
            setData();
            isSuccess.setForeground(Color.RED);
            isSuccess.setText("Enter valid integer in current semester");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void FreezeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FreezeActionPerformed
    {//GEN-HEADEREND:event_FreezeActionPerformed
        s.freezeSemester();
        setData();
    }//GEN-LAST:event_FreezeActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back1ActionPerformed
    {//GEN-HEADEREND:event_back1ActionPerformed
        new AuthHomepage(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Autumn;
    private javax.swing.JButton Freeze;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField Year;
    private javax.swing.JButton back1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel isSuccess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton spring;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
