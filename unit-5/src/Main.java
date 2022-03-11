import Delivery.*;

public class Main {
    public static void main(String[] args) {
        DeliveryByPeople test = new DeliveryByPeople("test", 5, 8, 400);
        DeliveryByTransport car = new DeliveryByTransport("car", 50, 350);

        System.out.println(test.getTime());
        System.out.println(test.getTitle());
        test.setTitle("new title");
        System.out.println(test.getTitle());
        test.print();
        car.print();
        System.out.println("max weight: " + car.getMaxWeight());
        car.setMaxWeight(45);
        System.out.println("max weight: " + car.getMaxWeight());
    }
}
