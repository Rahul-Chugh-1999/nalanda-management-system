package GUI;
import Core.User;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame 
{
    public Login()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        authorities.setSelected(true);
    }
    public static void main(String[] args)
    {
        new Login().setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        student = new javax.swing.JRadioButton();
        professor = new javax.swing.JRadioButton();
        authorities = new javax.swing.JRadioButton();
        logIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("         Welcome to Nalanda Management System");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password_field.png"))); // NOI18N
        jLabel2.setText("Password:");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username_field.png"))); // NOI18N
        jLabel3.setText("User Name:");
        jLabel3.setOpaque(true);

        userName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup.add(student);
        student.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        student.setForeground(new java.awt.Color(255, 51, 51));
        student.setText("Student");

        buttonGroup.add(professor);
        professor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        professor.setForeground(new java.awt.Color(255, 51, 51));
        professor.setText("Professor");

        buttonGroup.add(authorities);
        authorities.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        authorities.setForeground(new java.awt.Color(255, 51, 51));
        authorities.setText("Authorities");

        logIn.setBackground(new java.awt.Color(153, 153, 255));
        logIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logIn.setText("Login");
        logIn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(272, 272, 272)
                                        .addComponent(professor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(authorities))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(password)
                                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(student)))
                        .addGap(0, 208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student)
                    .addComponent(professor)
                    .addComponent(authorities))
                .addGap(30, 30, 30)
                .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void logInActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logInActionPerformed
    {//GEN-HEADEREND:event_logInActionPerformed
        String type=null;
        if(authorities.isSelected()) type="auth";
        if(student.isSelected()) type="student";
        if(professor.isSelected()) type="prof";
        User user=new User(userName.getText(),type);
        if(user.confirmPassword(String.valueOf(password.getPassword())))
        {
            if(authorities.isSelected()) new AuthHomepage(user.id).setVisible(true);
            if(student.isSelected()) new StudentHomepage(user.id).setVisible(true);
            if(professor.isSelected()) new ProfHomepage(user.id).setVisible(true);
            this.dispose();
        }
        if(this.isVisible()) JOptionPane.showMessageDialog(null,"Invalid login details. Try again.","Login Error",2);
    }//GEN-LAST:event_logInActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton authorities;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logIn;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton professor;
    private javax.swing.JRadioButton student;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
