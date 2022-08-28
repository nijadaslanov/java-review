public class Apples {

    private Color color;
    private int weight;

    public Apples(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
