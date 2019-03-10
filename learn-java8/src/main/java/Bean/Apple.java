package Bean;

public class Apple {

    String name;
    int age;
    double weight;

    public Apple(int age, double weight, String name) {

    }

    public Apple(int i, double v) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
