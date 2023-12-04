/*This is a class for all my products*/
public class Products {
    /*a variable for products*/
    private String product;
    /*a variable for the price of said product*/
    public double price;
    /*a variable for the total products left on the market*/
    private int amount;

    public Products(String product,double price, int amount){
        this.product= product;
        this.price= price;
        this.amount= amount;
    }



    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
