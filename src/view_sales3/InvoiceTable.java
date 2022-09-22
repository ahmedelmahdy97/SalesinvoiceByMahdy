
package view_sales3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvoiceTable extends JDialog {
    private JTextField customertnamefield;
    private JTextField invdatefield;
    private JLabel custnamejl;
    private JLabel invdatejl;
    private JButton okbtn;
    private JButton cancelbtn;

    public InvoiceTable(InvJFrame frame) {
        custnamejl = new JLabel("Customer Name:");
        customertnamefield = new JTextField(20);
        invdatejl = new JLabel("Invoice Date:");
        invdatefield = new JTextField(20);
        okbtn = new JButton("OK");
        cancelbtn = new JButton("Cancel");
        
        okbtn.setActionCommand("createInvoiceOK");
        cancelbtn.setActionCommand("createInvoiceCancel");
        
        okbtn.addActionListener(frame.getController());
        cancelbtn.addActionListener(frame.getController());
        setLayout(new GridLayout(3, 2));
        
        add(invdatejl);
        add(invdatefield);
        add(custnamejl);
        add(customertnamefield);
        add(okbtn);
        add(cancelbtn);
        
        pack();
        
    }

    public JTextField getCustomertnamefield() {
        return customertnamefield;
    }

    public JTextField getInvdatefield() {
        return invdatefield;
    }
    
}
