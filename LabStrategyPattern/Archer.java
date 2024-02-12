package LabStrategyPattern;

public class Archer implements Character {
    private AttackStrat attackStrat;
    private DefendStrat defendStrat;

    public Archer(AttackStrat attackStrat, DefendStrat defendStrat) {
        this.attackStrat = attackStrat;
        this.defendStrat = defendStrat;
    }

    public void attack() {
        attackStrat.attack();
    }

    public void defend() {
        defendStrat.defend();
    }
}
