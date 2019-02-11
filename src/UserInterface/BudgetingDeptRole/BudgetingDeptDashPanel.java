/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BudgetingDeptRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BudgetingDeptOrganization;
import Business.Organization.DirectorOfficeOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventOrganizingCommitteeWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.HRDeptWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author jay_c
 */
public class BudgetingDeptDashPanel extends javax.swing.JPanel {

    /**
     * Creates new form BudgetingDeptDashPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BudgetingDeptOrganization budgetingOrganization;
    private EcoSystem business;

    public BudgetingDeptDashPanel(JPanel userProcessContainer, UserAccount userAccount, BudgetingDeptOrganization budgetingOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        this.budgetingOrganization = budgetingOrganization;
        jLabel2.setText(enterprise.getName());
        jLabel3.setText("Welcome, " + userAccount.getUsername());
        populateTable();
        populateApprovedTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) eventsTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : budgetingOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof HRDeptWorkRequest) {
                HRDeptWorkRequest req = (HRDeptWorkRequest) request;

                if (req.getResult().equalsIgnoreCase("Waiting")) {
                    Object[] row = new Object[8];
                    row[0] = ((HRDeptWorkRequest) request);
                    row[1] = ((HRDeptWorkRequest) request).getEventType();
                    row[2] = ((HRDeptWorkRequest) request).getEventCatagory();
                    row[3] = ((HRDeptWorkRequest) request).getCapacity();
                    row[4] = ((HRDeptWorkRequest) request).getBudget();
                    row[5] = ((HRDeptWorkRequest) request).getEventDate();
                    row[6] = request.getSender().getEmployee().getName();
                    row[7] = request.getStatus();
                    model.addRow(row);
                }

            } else {
                EventOrganizingCommitteeWorkRequest req1 = (EventOrganizingCommitteeWorkRequest) request;
//            System.out.println("####"+request.getStatus());
                if (req1.getResult().equalsIgnoreCase("Waiting")) {

                    Object[] row = new Object[8];

                    if (request instanceof EventOrganizingCommitteeWorkRequest) {
                        row[0] = ((EventOrganizingCommitteeWorkRequest) request);
                        row[1] = ((EventOrganizingCommitteeWorkRequest) request).getEventType();
                        row[2] = ((EventOrganizingCommitteeWorkRequest) request).getEventCatagory();
                        row[3] = ((EventOrganizingCommitteeWorkRequest) request).getCapacity();
                        row[4] = ((EventOrganizingCommitteeWorkRequest) request).getBudget();
                        row[5] = ((EventOrganizingCommitteeWorkRequest) request).getEventDate();
                        row[6] = request.getSender().getEmployee().getName();
                        row[7] = request.getStatus();
                        model.addRow(row);
                    }

                }
            }
        }
    }

    public void populateApprovedTable() {

        DefaultTableModel model = (DefaultTableModel) eventsTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof HRDeptWorkRequest) {
                HRDeptWorkRequest req = (HRDeptWorkRequest) request;

                if (req.getResult().equalsIgnoreCase("Approved")) {
                    Object[] row = new Object[8];
                    row[0] = ((HRDeptWorkRequest) request);
                    row[1] = ((HRDeptWorkRequest) request).getEventType();
                    row[2] = ((HRDeptWorkRequest) request).getEventCatagory();
                    row[3] = ((HRDeptWorkRequest) request).getCapacity();
                    row[4] = ((HRDeptWorkRequest) request).getBudget();
                    row[5] = ((HRDeptWorkRequest) request).getEventDate();
                    row[6] = request.getSender().getEmployee().getName();
                    row[7] = request.getStatus();
                    model.addRow(row);
                }

            } else {
                EventOrganizingCommitteeWorkRequest req1 = (EventOrganizingCommitteeWorkRequest) request;
//            System.out.println("####"+request.getStatus());
                if (req1.getResult().equalsIgnoreCase("Approved")) {

                    Object[] row = new Object[8];

                    if (request instanceof EventOrganizingCommitteeWorkRequest) {
                        row[0] = ((EventOrganizingCommitteeWorkRequest) request);
                        row[1] = ((EventOrganizingCommitteeWorkRequest) request).getEventType();
                        row[2] = ((EventOrganizingCommitteeWorkRequest) request).getEventCatagory();
                        row[3] = ((EventOrganizingCommitteeWorkRequest) request).getCapacity();
                        row[4] = ((EventOrganizingCommitteeWorkRequest) request).getBudget();
                        row[5] = ((EventOrganizingCommitteeWorkRequest) request).getEventDate();
                        row[6] = request.getSender().getEmployee().getName();
                        row[7] = request.getStatus();
                        model.addRow(row);
                    }

                }
            }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        eventsTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventsTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(220, 220), new java.awt.Dimension(220, 220), new java.awt.Dimension(220, 220));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(220, 220), new java.awt.Dimension(220, 220), new java.awt.Dimension(220, 220));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Event Type", "Catagory", "Capacity", "Event Budget", "Event Date", "Sender", "Status"
            }
        ));
        jScrollPane2.setViewportView(eventsTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 990, 176));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setText("REJECT ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, 40));

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton4.setText("ADD ADDITIONAL INFORMATION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 290, 40));

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton3.setText("APPROVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 40));

        eventsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Event Type", "Catagory", "Capacity", "Event Budget", "Event Date", "Sender", "Status"
            }
        ));
        jScrollPane3.setViewportView(eventsTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1000, 176));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel1.setText("ENTERPRISE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setText("Approved Requests");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setText("Pending Requests");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        filler2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1030, 280));

        filler3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1030, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = eventsTable1.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        WorkRequest request = (WorkRequest) eventsTable1.getValueAt(selectedRow, 0);
        if (request instanceof EventOrganizingCommitteeWorkRequest) {
            EventOrganizingCommitteeWorkRequest req = (EventOrganizingCommitteeWorkRequest) request;

            UpdateEventInformation uei = new UpdateEventInformation(userProcessContainer, userAccount, business, req);
            userProcessContainer.add("Update Event Information Panel", uei);
            CardLayout card = (CardLayout) userProcessContainer.getLayout();
            card.next(userProcessContainer);
        } else {
            HRDeptWorkRequest req = (HRDeptWorkRequest) request;
            UpdateEventInformation uei = new UpdateEventInformation(userProcessContainer, userAccount, business, req);
            userProcessContainer.add("Update Event Information Panel", uei);
            CardLayout card = (CardLayout) userProcessContainer.getLayout();
            card.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = eventsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }

        WorkRequest request = (WorkRequest) eventsTable.getValueAt(selectedRow, 0);
        if (request instanceof EventOrganizingCommitteeWorkRequest) {
            EventOrganizingCommitteeWorkRequest req = (EventOrganizingCommitteeWorkRequest) request;
            req.setResult("Approved");
            req.setStatus("Decision Made");
            req.setAcceptingEnterprise(enterprise.getName());
            JOptionPane.showMessageDialog(null, "Approved Event.");
        } else {
            HRDeptWorkRequest req = (HRDeptWorkRequest) request;
            req.setResult("Approved");
            req.setStatus("Decision Made");
            req.setEnterpriseName(enterprise.getName());
            JOptionPane.showMessageDialog(null, "Approved Event.");
        }
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        populateTable();
        populateApprovedTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = eventsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        EventOrganizingCommitteeWorkRequest request = (EventOrganizingCommitteeWorkRequest) eventsTable.getValueAt(selectedRow, 0);
        request.setResult("Rejected");
        request.setStatus("Decision Made");
        JOptionPane.showMessageDialog(null, "Rejected Event.");
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable eventsTable;
    private javax.swing.JTable eventsTable1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
