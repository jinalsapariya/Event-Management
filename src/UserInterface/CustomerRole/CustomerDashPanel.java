/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Customers.Customer;
import Business.EcoSystem;
import Business.Email.EmailAuth;
import Business.Enterprise.Enterprise;
import Business.Event.Event;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventOrganizingCommitteeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jay_c
 */
public class CustomerDashPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerDashPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    public CustomerDashPanel(JPanel userProcessContainer,UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        jLabel2.setText(userAccount.getUsername());
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(Event e : business.getEventDirectory().getEventList()){
            Object[] row = new Object[8];
            row[0] = e;
            row[1] = e.getEventType();
            row[2] = e.getEventCatagory();
            row[3] = e.getCapacity();
            row[4] = e.getPrice();
            row[5] = e.getEventDate();
            row[6] = e.getTime();
            row[7] = e.getVenue();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(220, 220), new java.awt.Dimension(220, 220), new java.awt.Dimension(220, 220));

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Event Type", "Catagory", "Capacity", "Event Price", "Event Date", "Event Time", "Event Venue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1010, 280));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("BOOK SEAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 46));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.setToolTipText("");
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 151, 46));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setText("All Events");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1050, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        Event e = (Event)workRequestJTable.getValueAt(selectedRow, 0);
        String message = "Your seats have been booked for the "+e.getEventName()+"! Schedule your calendar for "+e.getEventDate()+" at "+e.getTime();

        int seats = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        if(seats > e.getCapacity()){
            JOptionPane.showMessageDialog(null, "No seats available");
        }
        else{
            
            JOptionPane.showMessageDialog(null, seats+" Seats Booked");
        }
        int act = e.getAct_booking() + seats;
        int capacity = e.getCapacity() - seats;
        e.setAct_booking(act);
        e.setCapacity(capacity);
        List<Customer> c = e.getCustomers();
        c.add(userAccount.getCustomer());
        e.setCustomers((ArrayList<Customer>) c);
        populateTable();
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
