package Interface.exercise;

public class Test {
    public static void main(String[] args) {
        BasketballCoach coach = new BasketballCoach("anxi", 50);
        coach.teach();
        System.out.println(coach.getName() + " " + coach.getAge());
        PingpongPlayer player = new PingpongPlayer();
        player.setName("许昕");
        player.setAge(35);
        System.out.println(player.getName() + " " + player.getAge());
        player.study();
        player.speak();
    }

}
