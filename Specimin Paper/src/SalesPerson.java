public class SalesPerson {
    static int bonus1;
    static int bonus2;
    private String id;
    double[] sales = new double[12];

    public SalesPerson() {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void addSales(double sales, int month) {        // code missing
        try {
            this.sales[month] = this.sales[month] + sales;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid month");
        }
    }

    public double calculateHighest() {
        double highest = this.sales[0];
        for (int i = 0; i < 10; i++) {
            if (this.sales[i] > this.sales[i + 1]) {
                highest = this.sales[i];
            }
        }
        return highest;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += this.sales[i];
        }
        return total;
    }

    public void printSales() {
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Month: " + "\t" + this.sales[i]);
        }
    }
}