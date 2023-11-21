public class Athlete {
    public String name;
    public int height;
    public int weight;

    public Athlete(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println("이름: " + name);
        System.out.println("키: " + height + "cm");
        System.out.println("몸무게: " + weight + "kg");
    }
}






