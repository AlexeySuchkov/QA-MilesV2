public class BonusMilesService {
    public int calculate(int cost) {
        int bonusCount = 20;
        int bonus = cost / bonusCount;
        return bonus;
    }
}
