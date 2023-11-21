class BasketballPlayer extends Athlete {
    public String team;


    public BasketballPlayer(String name, int height, double weight, String team) {
        super(name, height,(int)weight);
        this.team = team;
    }

    public void print() {
        super.print();
        System.out.println("소속팀: " + team);
    }
}