
// main class

public class CounterStrike {
    public static void main(String[] args) {
        // two players defined and rolees labeled via their types
        Player terrorist = new Player("Terrorist");
        Player counter_terrorist = new Player("Counter Terrorist");

        // initial strategies set and actions output
        terrorist.setStrategy(new AggressiveStrategy());
        counter_terrorist.setStrategy(new  DefensiveStrategy());
        terrorist.action();
        counter_terrorist.action();

        // strategies out outputs switched
        terrorist.setStrategy(new DefensiveStrategy());
        counter_terrorist.setStrategy(new AggressiveStrategy());
        terrorist.action();
        counter_terrorist.action();
    }
}