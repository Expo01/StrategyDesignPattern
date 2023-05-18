// implemenets and overrides shared interrface to detail specifics

public class DefensiveStrategy implements IStrategy{
    @Override
    public void actionCommand() {
        System.out.println("Defensive strategy. Protect self and teammates");
    }
}
