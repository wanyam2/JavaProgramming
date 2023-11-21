class BaseballPlayer extends Athlete {
    public String position;


    public BaseballPlayer(String name, int height, double weight, String position) {
        super(name, height, (int)weight);
        this.position = position;
    }

    public void print() {
        super.print();
        System.out.println("포지션: " + position);
    }
}