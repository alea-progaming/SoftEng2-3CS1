package LabStrategyPattern;

public class Wizard implements Character{
    private AttackStrat attackStrat;
    private DefendStrat defendStrat;
    public Wizard(AttackStrat attackStrat, DefendStrat defendStrat) {
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
