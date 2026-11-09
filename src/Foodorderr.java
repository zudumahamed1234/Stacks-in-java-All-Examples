public class Foodorderr {
    private String dishName;
    private double basePrice;
    private int quantity;


    public Foodorderr (String dishName, double basePrice, int quantity) {
        this.dishName = dishName;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }


    public String getDishName() {
        return dishName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getQuantity() {
        return quantity;
    }



    public void calculateTotal() {
        double total = basePrice * quantity;

        System.out.printf(
                "Order %s: %d x %.0f = %.0f%n",
                dishName, quantity, basePrice, total
        );
    }
}


class DineinOrder extends Foodorderr {
    private int tableNumber;

    public DineinOrder(String dishName, double basePrice,
                       int quantity, int tableNumber) {
        super(dishName, basePrice, quantity);
        this.tableNumber = tableNumber;
    }



    @Override
    public void calculateTotal() {
        double subtotal = getBasePrice() * getQuantity();
        double serviceCharge = subtotal * 0.10;
        double total = subtotal + serviceCharge;

        System.out.printf(
                "Dine-in %s at table %d: %.0f + service 10%% = %.0f%n",
                getDishName(), tableNumber, subtotal, total
        );
    }
}


class DeliveryOrder extends Foodorderr {
    private double deliveryFee;

    public DeliveryOrder(String dishName, double basePrice,
                         int quantity, double deliveryFee) {
        super(dishName, basePrice, quantity);
        this.deliveryFee = deliveryFee;
    }


    @Override
    public void calculateTotal() {
        double subtotal = getBasePrice() * getQuantity();
        double total = subtotal + deliveryFee;

        System.out.printf(
                "Delivery %s: %.0f + delivery %.0f = %.0f%n",
                getDishName(), subtotal, deliveryFee, total
        );
    }
}

