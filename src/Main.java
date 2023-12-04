import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* makes a products called shirt*/
        /*sets the amount of shirts left on the market to 17*/
        /*sets the price of shirts to 300.34 sek*/
        Products shirt = new Products("shirt",300.34,17);
        Products jens = new Products("jens",700.30,19);
        Sale shoes = new Sale("shoes",200.30,7, 0.95);

        /*this customer variables that need to be 0,so the program can increase it everytime the customer makes a purchase*/
        Customer kund= new Customer(0,0);
        int input;
        while (true) {
            /*prints out a sentence for the user*/
            System.out.println("here are the available products");
            System.out.println("-------------------------\n");
            System.out.println("1 -"+" "+shirt.getProduct()+" "+shirt.getPrice()+"SEK"+","+shirt.getAmount()+" "+"left");
            System.out.println("2 -"+" "+jens.getProduct()+" "+jens.getPrice()+"SEK"+","+ jens.getAmount()+" "+"left");
            System.out.println("3 -"+" "+shoes.getProduct()+" "+shoes.getPrice()+"SEK"+","+shoes.getAmount()+" "+"left"+","+"Buy 3 and get a 5% discount on your next purchase");
            /*when the amount of shoes that are left on the market is 5 or below it will put a discount on the price of the shoes*/
            if (shoes.getAmount()<=5){
                Sale.discount(shoes,shoes);
            }
            System.out.println("4 - Quit");
            System.out.println("select your desired product:");
            input=scan.nextInt();
            if (input==1){
                /*everytime the user selects an option the program reduces the amount of said item ands one to the users basket and adds up the price*/
                shirt.setAmount(shirt.getAmount()-1);
                kund.setItem(kund.getItem()+1);
                kund.setTotal(kund.getTotal()+shirt.getPrice());
            }
            if (input==2){
                jens.setAmount(jens.getAmount()-1);
                kund.setItem(kund.getItem()+1);
                kund.setTotal(kund.getTotal()+jens.getPrice());
            }
            if (input==3){
                shoes.setAmount(shoes.getAmount()-1);
                kund.setItem(kund.getItem()+1);
                kund.setTotal(kund.getTotal()+shoes.getPrice());
            }
            else if (input==4){
                /*prints out the total price and the amount of items the user bought*/
                System.out.printf("you bought %s products it costed a total of %.2f SEK\n",kund.getItem(),kund.getTotal());
                break;
            }
        }
    }
}