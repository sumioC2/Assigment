package INVO.invoice;


// 1. Class-ka InvoiceItem
class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}

// 2. Class-ka Main-ka ee laga run-gareeynayo
public class invoicetest {
    public static void main(String[] args) {
        // Create an InvoiceItem instance
        InvoiceItem item1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(item1); // Test toString()

        // Test Setters and Getters
        item1.setQty(999);
        item1.setUnitPrice(0.99);
        System.out.println(item1); // Test toString()
        System.out.println("id is: " + item1.getId());
        System.out.println("desc is: " + item1.getDesc());
        System.out.println("qty is: " + item1.getQty());
        System.out.println("unitPrice is: " + item1.getUnitPrice());

        // Test getTotal()
        System.out.println("The total is: " + item1.getTotal());
    }
}