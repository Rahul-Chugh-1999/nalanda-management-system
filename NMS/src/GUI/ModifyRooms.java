package GUI;
import Core.Auth;
import Core.Room;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class ModifyRooms extends javax.swing.JFrame
{
    private Auth s;
    private Room[] rooms;
    private int row;

    private void initialize()
    {
        rooms=s.getRoomList();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        for(Room r: rooms) model.addRow(new Object[]{r.id});
        row=-1; setBox();
    }

    private void setBox()
    {
        if(row==-1) room.setText("");
        else room.setText(rooms[row].id);
    }

    private Room getBox()
    {
        Room a;
        if(row==-1) a=new Room("-1");
        else a=rooms[row];
        a.id=room.getText();
        return a;
    }

    public ModifyRooms(String s)
    {
        this.s=new Auth(s);
        initComponents();
        this.setLocationRelativeTo(null);
        initialize();
        JTableHeader header=table.getTableHeader();
        header.setBackground(new Color(255,220,153));
        header.setFont(new Font("Tahome",Font.BOLD,16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        room = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Rooms"
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
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setResizable(false);
        }

        room.setBackground(new java.awt.Color(255, 255, 204));
        room.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        room.setText("Room");

        Insert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                InsertActionPerformed(evt);
            }
        });

        Remove.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RemoveActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UpdateActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(room)
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37)
                .addComponent(logout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_InsertActionPerformed
    {//GEN-HEADEREND:event_InsertActionPerformed
        if(!s.insertRoom(getBox()))
            JOptionPane.showMessageDialog(null,"Room "+getBox().id+" already exists","Update Error",2);
        else initialize();
    }//GEN-LAST:event_InsertActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableMouseClicked
    {//GEN-HEADEREND:event_tableMouseClicked
        row=table.getSelectedRow();
        setBox();
    }//GEN-LAST:event_tableMouseClicked

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RemoveActionPerformed
    {//GEN-HEADEREND:event_RemoveActionPerformed
        if(row==-1) return;
        else s.removeRoom(getBox());
        initialize();
    }//GEN-LAST:event_RemoveActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UpdateActionPerformed
    {//GEN-HEADEREND:event_UpdateActionPerformed
        if(row==-1) return;
        if(!s.updateRoom(getBox()))
            JOptionPane.showMessageDialog(null,"Room "+getBox().id+" already exists","Update Error",2);
        else initialize();
    }//GEN-LAST:event_UpdateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backActionPerformed
    {//GEN-HEADEREND:event_backActionPerformed
        new EditSession(s.id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insert;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Update;
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField room;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
