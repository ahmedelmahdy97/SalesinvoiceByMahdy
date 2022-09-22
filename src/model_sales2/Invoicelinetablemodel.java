
package model_sales2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Invoicelinetablemodel extends AbstractTableModel {

    private ArrayList<Invoiceline> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public Invoicelinetablemodel(ArrayList<Invoiceline> lines) {
        this.lines = lines;
    }

    public ArrayList<Invoiceline> getLines() {
        return lines;
    }
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoiceline line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice1().getNumber();
            case 1: return line.getItem();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getLineTotal();
            default : return "";
        }
    }
    
}
