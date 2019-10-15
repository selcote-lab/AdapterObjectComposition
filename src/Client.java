public class Client {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WillTurkey turkey = new WillTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
