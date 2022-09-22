
package view_sales3;

import control_sales1.Controller;
import model_sales2.Invoiceheader;
import model_sales2.Invoiceheadertablemodel;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author ahmedheikal
 */
public class InvJFrame extends javax.swing.JFrame {

    public InvJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoiceTable.getSelectionModel().addListSelectionListener(controller);
        invoiceTable.setModel(getInvoicesTableModel());
        createInvoiceButton = new javax.swing.JButton();
        createInvoiceButton.addActionListener(controller);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        invoiceNumLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        createLineButton = new javax.swing.JButton();
        createLineButton.addActionListener(controller);
        deleteLineButton = new javax.swing.JButton();
        deleteLineButton.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(controller);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        createInvoiceButton.setText("Create New Invoice");

        deleteInvoiceButton.setText("Delete Invoice");

        jLabel1.setText("Inoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(lineTable);

        createLineButton.setText("Create New Item");
        createLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLineButtonActionPerformed(evt);
            }
        });

        deleteLineButton.setText("Delete Item");
        deleteLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLineButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        loadFileMenuItem.setText("Load File");
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save File");
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(createInvoiceButton)
                        .addGap(87, 87, 87)
                        .addComponent(deleteInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(invoiceNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(invoiceDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(createLineButton)
                        .addGap(115, 115, 115)
                        .addComponent(deleteLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoiceNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createInvoiceButton)
                        .addComponent(deleteInvoiceButton))
                    .addComponent(createLineButton)
                    .addComponent(deleteLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLineButtonActionPerformed
        
    }//GEN-LAST:event_createLineButtonActionPerformed

    private void deleteLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLineButtonActionPerformed
        
    }//GEN-LAST:event_deleteLineButtonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton createLineButton;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel invoiceNumLabel;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Invoiceheader> invoices;
    private Controller controller = new Controller(this);
    private Invoiceheadertablemodel invoicesTableModel;

    public ArrayList<Invoiceheader> getInvoices() {
        if (invoices == null) invoices = new ArrayList<>();
        return invoices;
    }

    public void setInvoices(ArrayList<Invoiceheader> invoices) {
        this.invoices = invoices;
    }

    public Invoiceheadertablemodel getInvoicesTableModel() {
        if (invoicesTableModel == null) {
            invoicesTableModel = new Invoiceheadertablemodel(getInvoices());
        }
        return invoicesTableModel;
    }

    public void setInvoicesTableModel(Invoiceheadertablemodel invoicesTableModel) {
        this.invoicesTableModel = invoicesTableModel;
    }

    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }

    public JLabel getInvoiceDateLabel() {
        return invoiceDateLabel;
    }

    public JLabel getInvoiceNumLabel() {
        return invoiceNumLabel;
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public JLabel getInvoiceTotalLabel() {
        return invoiceTotalLabel;
    }

    public JTable getLineTable() {
        return lineTable;
    }

    public Controller getController() {
        return controller;
    }
    
    public int getNextInvoiceNum() {
        int num = 0;
        
        for (Invoiceheader invoice : getInvoices()) {
            if (invoice.getNumber() > num) 
                num = invoice.getNumber();
        }
        
        return ++num;
    }
    
    
    
}
