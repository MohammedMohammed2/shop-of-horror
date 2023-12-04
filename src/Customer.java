public class Customer {
    public Customer(int item, double total){
        this.item= item;
        this.total= total;
    }
    private int item;
    private double total;

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
