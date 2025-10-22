public class Main {
    public static void main(String[] args) {
       SalesPerson myran = new SalesPerson();

       myran.addSales(57000, 1);

       myran.addSales(170000, 2);
       myran.addSales(183000, 3);
       myran.addSales(10000, 4);
       myran.addSales(100000, 5);

       myran.printSales();
    }
}