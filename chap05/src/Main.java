public class Main {
    public static void main(String[] args) {
        Athlete[] athletes = new Athlete[4];

        athletes[0] = new BaseballPlayer("박해민", 180, 75.5, "중견수");
        athletes[1] = new BasketballPlayer("유기상", 190, 85.0, "LG 세이커스");
        athletes[2] = new BaseballPlayer("강효종", 183, 68.5, "투수");
        athletes[3] = new BaseballPlayer("홍창기", 180, 68.5, "우익수");

        for (Athlete athlete : athletes) {
            athlete.print();
            System.out.println();
        }
    }
}