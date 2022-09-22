
package view_sales3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LineTable extends JDialog{
    private JTextField itemnamefield;
    private JTextField itemcountfield;
    private JTextField itempricefield;
    private JLabel itemnamejl;
    private JLabel itemcountjl;
    private JLabel itempricejl;
    private JButton okbtn;
    private JButton cancelbtn;
    
    public LineTable(InvJFrame frame) {
        itemnamefield = new JTextField(20);
        itemnamejl = new JLabel("Item Name");
        
        itemcountfield = new JTextField(20);
        itemcountjl = new JLabel("Item Count");
        
        itempricefield = new JTextField(20);
        itempricejl = new JLabel("Item Price");
        
        okbtn = new JButton("OK");
        cancelbtn = new JButton("Cancel");
        
        okbtn.setActionCommand("createLineOK");
        cancelbtn.setActionCommand("createLineCancel");
        
        okbtn.addActionListener(frame.getController());
        cancelbtn.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 2));
        
        add(itemnamejl);
        add(itemnamefield);
        add(itemcountjl);
        add(itemcountfield);
        add(itempricejl);
        add(itempricefield);
        add(okbtn);
        add(cancelbtn);
        
        pack();
    }

    public JTextField getItemnamefield() {
        return itemnamefield;
    }

    public JTextField getItemcountfield() {
        return itemcountfield;
    }

    public JTextField getItempricefield() {
        return itempricefield;
    }
}
