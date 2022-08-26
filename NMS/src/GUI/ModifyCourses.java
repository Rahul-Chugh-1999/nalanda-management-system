package GUI;
import Core.Auth;
import Core.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class ModifyCourses extends javax.swing.JFrame
{
    private String dept,year,type;
    private Auth s;
    private int row;
    private Course[] clist;
    private Prof[] cBoxProfValues;
    private Dept[] cBoxDeptValues;
    private boolean inProcess=false;
    private void setDeptBox(String deptt)
    {
        inProcess=true;
        cBoxDeptValues=s.getDeptList();
        cBoxDept.removeAllItems();
        int id=-1,i=0;
        for(Dept dep:cBoxDeptValues)
        {
            cBoxDept.addItem(dep.id);
            if(dep.id == null ? deptt == null : dep.id.equals(deptt)) id=i;
            i++;
        }
        cBoxDept.setEditable(false);
        if(id==-1) 
        {
            inProcess=false;
            return;
        }
        cBoxDept.setSelectedIndex(id);
        inProcess=false;
    }
    
    private void setProfIdBox(String proff)
    {
        String department=cBoxDeptValues[cBoxDept.getSelectedIndex()].id;
        cBoxProfId.removeAllItems();
        cBoxProfValues=s.getProfList(department);
        int id=-1,i=0;
        for(Prof prof:cBoxProfValues)
        {
            cBoxProfId.addItem(prof.id+" ("+prof.name+")");
            if(prof.id == null ? proff == null : prof.id.equals(proff)) id=i;
            i++;
        }
        cBoxProfId.setEditable(false);
        if(id==-1) return;
        cBoxProfId.setSelectedIndex(id);
    }
    
    private void setBox()
    {
        tCourseId.setText(row==-1?"":clist[row].id);
        tHours.setText(row==-1?"":clist[row].hours);
        tName.setText(row==-1?"":clist[row].name);
        setDeptBox(row==-1?"":s.getProfDept(clist[row].prof));
        setProfIdBox(row==-1?"":clist[row].prof);
        //tProf.setText(row==-1?"":clist[row].prof);
        indicator.setText("");
    }
    
    private Course getBox()
    {
        Course a=(row==-1)?new Course("-1"):clist[row];
        a.id=tCourseId.getText();
        a.dept=dept;
        a.year=year;
        a.type=type;
        a.name=tName.getText();
        a.hours=tHours.getText();
        a.prof=cBoxProfValues[cBoxProfId.getSelectedIndex()].id;
        //a.prof=tProf.getText();
        return a;
    }
    
    private void newtable()
    {
        clist=s.getCourseList(dept, year,type);
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        for(Course c: clist) model.addRow(new Object[]{c.id,c.name,c.hours,s.getProfDept(c.prof),c.prof});
        row=-1;
        setBox();
       
    }
    
    public ModifyCourses(String dept,String year,String type,String s)
    {
        this.s=new Auth(s);
        this.dept=dept;
        this.year=year;
        this.type=type;
        initComponents();
        this.setLocationRelativeTo(null);
        newtable();
        JTableHeader header=table.getTableHeader();
        header.setBackground(new Color(255,220,153));
        header.setFont(new Font("Arial",Font.BOLD,12));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tCourseId = new javax.swing.JTextField();
        tHours = new javax.swing.JTextField();
        tName = new javax.swing.JTextField();
        bInsert = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        indicator = new javax.swing.JLabel();
        cBoxProfId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cBoxDept = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "Course Id", "Course Name", "Weekly Hours", "Prof. Dept.", "Prof. Id"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
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
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0)
        {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        tHours.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                tHoursFocusLost(evt);
            }
        });

        bInsert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bInsert.setText("Insert");
        bInsert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bInsertActionPerformed(evt);
            }
        });

        bUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bUpdateActionPerformed(evt);
            }
        });

        bdelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bdelete.setText("Remove");
        bdelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bdeleteActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Prof. Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Weekly Hours");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Course Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Course Id");

        indicator.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        indicator.setForeground(new java.awt.Color(204, 0, 0));
        indicator.setText("Template");

        cBoxProfId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Prof. Dept");

        cBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxDept.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cBoxDeptItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(indicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tCourseId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(tName, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(cBoxProfId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tHours)
                                    .addComponent(cBoxDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tHours)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cBoxDept)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxProfId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(indicator, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableMouseClicked
    {//GEN-HEADEREND:event_tableMouseClicked
        row=table.getSelectedRow();
        setBox();
    }//GEN-LAST:event_tableMouseClicked

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bInsertActionPerformed
    {//GEN-HEADEREND:event_bInsertActionPerformed
        if(cBoxProfId.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(null,"Presantly no Prof. exists under selected Dept.","Insert Error",2);
            return;
        }
        if(!"".equals(indicator.getText())) return;
        if(!s.insertCourse(getBox()))
            JOptionPane.showMessageDialog(null,"user with CousrseId "+tCourseId.getText()+" already exists","Insert Error",2);
        else newtable();
    }//GEN-LAST:event_bInsertActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bUpdateActionPerformed
    {//GEN-HEADEREND:event_bUpdateActionPerformed
        if(cBoxProfId.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(null,"Presantly no Prof. exists under selected Dept.","Update Error",2);
            return;
        }
        if(!"".equals(indicator.getText())) return;
        if(row==-1) return;
        if(!s.updateCourse(getBox()))
            JOptionPane.showMessageDialog(null,"user with CousrseId "+tCourseId.getText()+" already exists","Update Error",2);
        else newtable();
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bdeleteActionPerformed
    {//GEN-HEADEREND:event_bdeleteActionPerformed
        if(row==-1) return;
        s.removeCourse(getBox());
        newtable();
    }//GEN-LAST:event_bdeleteActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logoutActionPerformed
    {//GEN-HEADEREND:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back1ActionPerformed
    {//GEN-HEADEREND:event_back1ActionPerformed
        new ChooseSemesterType(s.id,dept,year).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void tHoursFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_tHoursFocusLost
    {//GEN-HEADEREND:event_tHoursFocusLost
        try
        {
            int d=Integer.parseInt(tHours.getText());
            if(d>=1&&d<=40)
            {
                indicator.setText("");
                return;
            }
        }
        catch(NumberFormatException e)
        {
        }
        indicator.setText("Weekly Hours must be a valid inter in 1-40 range");
    }//GEN-LAST:event_tHoursFocusLost

    private void cBoxDeptItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cBoxDeptItemStateChanged
    {//GEN-HEADEREND:event_cBoxDeptItemStateChanged
        if(!inProcess) setProfIdBox("");
    }//GEN-LAST:event_cBoxDeptItemStateChanged
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInsert;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton back1;
    private javax.swing.JButton bdelete;
    private javax.swing.JComboBox<String> cBoxDept;
    private javax.swing.JComboBox<String> cBoxProfId;
    private javax.swing.JLabel indicator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField tCourseId;
    private javax.swing.JTextField tHours;
    private javax.swing.JTextField tName;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
