public class BonusMilesService {
    public int calculate(int amount) {
        int oneMile = 20;
        int bonus = amount / oneMile;
        return bonus;
    }
}
