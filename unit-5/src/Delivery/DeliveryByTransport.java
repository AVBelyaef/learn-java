package Delivery;

public class DeliveryByTransport extends Delivery {
    private int fuelPrice;
    public DeliveryByTransport(String title, int maxWeight, int fuelPrice) {
        super(title, maxWeight);
        this.fuelPrice = fuelPrice;
    }

    @Override
    public void print() {
        System.out.println("Стоимость доставки " + this.getPriceDelivery() + " руб.");
    }

    public int getPriceDelivery() {
        return (this.fuelPrice*15)/100;
    }

}
