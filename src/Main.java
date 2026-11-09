public class Main { 
    public static void main(String[] args) {

        DineinOrder dineIn = new DineinOrder(
                "Shaah Cadey", 8000, 2, 5
        );

        DeliveryOrder delivery = new DeliveryOrder(
                "Biryani", 12000, 1, 2000
        );

        dineIn.calculateTotal();
        delivery.calculateTotal();
    }




























}
