
package model_sales2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Invoiceheadertablemodel extends AbstractTableModel {
    private ArrayList<Invoiceheader> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    
    public Invoiceheadertablemodel(ArrayList<Invoiceheader> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoiceheader invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNumber();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
}
