package Delivery;

public class DeliveryByPeople extends Delivery {

    private int distance;
    private int speed;

    public DeliveryByPeople(String title, int maxWeight, int speed, int distance) {
        super(title, maxWeight);
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public void print() {
        System.out.println("Доставим за " + this.getTime());
    }

    public int getTime() {
        return this.distance / this.speed;
    }


}
