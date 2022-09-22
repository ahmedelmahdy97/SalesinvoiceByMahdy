
package model_sales2;

import java.util.ArrayList;

public class Invoiceheader {
    private int number;
    private String date;
    private String customer;
    private ArrayList<Invoiceline> lines;
    
    public Invoiceheader() {
    }

    public Invoiceheader(int num, String date, String customer) {
        this.number = num;
        this.date = date;
        this.customer = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Invoiceline line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Invoiceline> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + number + ", date=" + date + ", customer=" + customer + '}';
    }
    
    public String getAsCSV() {
        return number + "," + date + "," + customer;
    }
    
}
