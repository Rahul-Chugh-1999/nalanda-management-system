package GUI;
import Core.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ChooseAdditional extends javax.swing.JFrame
{

    Student s;
    boolean rowChosen=false;
    Course[] addSubs;
    int row;
    public ChooseAdditional(String s)
    {
        initComponents();
        setLocationRelativeTo(null);
        this.s=new Student(s);
        addSubs=this.s.additionalList();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        for(Course course: addSubs)
            model.addRow(new String[]{"   "+course.id,"   "+course.name,"   "+course.dept,"   "+course.year,"   "+course.hours,"   "+this.s.getProfName(course.prof)});
        JTableHeader header=table.getTableHeader();
        header.setBackground(new Color(255,220,153));
        header.setFont(new Font("Arial",Font.BOLD,14));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        choose = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        choose.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        choose.setText("Choose");
        choose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chooseActionPerformed(evt);
            }
        });

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

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Course Id", "Course Name", "Department", "Students of year", "Weekly Hours", "Prof Name"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Additional Subjects Options");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back1)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(logout)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choose)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chooseActionPerformed
    {//GEN-HEADEREND:event_chooseActionPerformed
        if(row==-1) return;
        s.chooseAdditional(addSubs[row].id);
        new StudentHomepage(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chooseActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back1ActionPerformed
    {//GEN-HEADEREND:event_back1ActionPerformed
        new StudentHomepage(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableMouseClicked
    {//GEN-HEADEREND:event_tableMouseClicked
        row=table.getSelectedRow();
    }//GEN-LAST:event_tableMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton choose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
