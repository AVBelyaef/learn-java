package Delivery;

public abstract class Delivery {
    private String title;
    private int maxWeight;

    public Delivery(String title, int maxWeight) {
        this.title = title;
        this.maxWeight = maxWeight;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String time) {
        this.title = time;
    }

    public Integer getMaxWeight() {
        return this.maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void print(){
        System.out.println("title: " + this.title);
    };
}
