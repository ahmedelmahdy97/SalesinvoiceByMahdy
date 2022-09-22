
package model_sales2;

public class Invoiceline {
    private String item;
    private double price;
    private int count;
    private Invoiceheader invoice1;

    public Invoiceline() {
    }

    public Invoiceline(String item, double price, int count, Invoiceheader invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice1 = invoice;
    }

    public double getLineTotal() {
        return price * count;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice1.getNumber() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }

    public Invoiceheader getInvoice1() {
        return invoice1;
    }
    
    public String getAsCSV() {
        return invoice1.getNumber() + "," + item + "," + price + "," + count;
    }
    
}
