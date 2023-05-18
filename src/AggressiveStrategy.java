// implemenets and overrides shared interrface to detail specifics

public class AggressiveStrategy implements IStrategy {
    @Override
    public void actionCommand() {
        System.out.println("Aggressive strategy. Find and kill opponents");
    }
}
