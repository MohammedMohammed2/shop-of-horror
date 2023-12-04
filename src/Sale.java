
    public class Sale extends Products {
        public double rabbat;
    public Sale(String product, double price, int amount, double rabbat ){
        super(product,price,amount);
        setRabbat(0.95);

    }
         public void setRabbat(double rabbat) {
             this.rabbat = rabbat;
         }
         public double getRabbat() {
             return rabbat;
         }

         public static double discount(Products shoes,Sale rabbat) {

             if (shoes.getPrice() == 200.30) {
                 shoes.setPrice(shoes.getPrice() * rabbat.getRabbat());
             }
             return shoes.getPrice();
         }


     }