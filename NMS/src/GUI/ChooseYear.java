package GUI;
import Core.Semester;
import Core.Auth;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class ChooseYear extends javax.swing.JFrame
{
    private Auth s;
    private String dept,Frame;
    private String[] year;
    public ChooseYear(String dept,String s,String Frame)
    {
        this.Frame=Frame;
        this.s=new Auth(s);
        this.dept=dept;
        initComponents();
        this.setLocationRelativeTo(null);
        year=new String[4];
        String[] yearDisplay=new String[4];
        if("Courses".equals(Frame)) year=new String[]{"4","3","2","1"};
        if("Courses".equals(Frame)) yearDisplay=new String[]{"  4th Year","  3rd Year","  2nd Year","  1st Year"};
        else
        {
            year[3]=(new Semester().year);
            year[2]=String.valueOf(Integer.valueOf(year[3])-1);
            year[1]=String.valueOf(Integer.valueOf(year[2])-1);
            year[0]=String.valueOf(Integer.valueOf(year[1])-1);
            yearDisplay[3]="  "+year[3];
            yearDisplay[2]="  "+year[2];
            yearDisplay[1]="  "+year[1];
            yearDisplay[0]="  "+year[0];
        }
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        for(String yr:yearDisplay) model.addRow(new Object[]{yr});
        JTableHeader header=table.getTableHeader();
        header.setBackground(new Color(255,220,153));
        header.setFont(new Font("Arial",Font.BOLD,16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                {null},
                {null},
                {null},
                {null}
            },
            new String []
            {
                "Choose Year"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(32);
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
            table.getColumnModel().getColumn(0).setResizable(false);
        }

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(logout))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backActionPerformed
    {//GEN-HEADEREND:event_backActionPerformed
        new ChooseDept(s.id,Frame).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableMouseClicked
    {//GEN-HEADEREND:event_tableMouseClicked
        int row=table.getSelectedRow();
        if("Batches".equals(Frame)) new ModifyStudents(dept,year[row],s.id).setVisible(true);
        if("Courses".equals(Frame)) new ChooseSemesterType(s.id,dept,year[row]).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tableMouseClicked
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
