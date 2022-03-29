public enum Season {
    WINTER("white"),
    SPRING("yellow"),
    SUMMER("green"),
    AUTUMN("orange");

    private String color;

    Season(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
