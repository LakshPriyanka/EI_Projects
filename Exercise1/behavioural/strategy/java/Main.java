// Main.java
public class Main {
    public static void main(String[] args) {
        // Using Credit Card Payment Strategy
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(100.0);

        // Using PayPal Payment Strategy
        cart = new ShoppingCart(new PayPalPayment("johndoe@example.com"));
        cart.checkout(200.0);

        // Using Bitcoin Payment Strategy
        cart = new ShoppingCart(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(300.0);
    }
}
