package LabStrategyPattern;

public class Game {
    public static void main(String[] args) {
        AttackStrat shootArrow = new ShootArrow();
        DefendStrat dodge = new Dodge();

        Archer archer = new Archer(shootArrow, dodge);

        archer.attack();
        archer.defend();

        System.out.println("----------------------------");

        AttackStrat swingSword = new SwingSword();
        DefendStrat shield = new Shield();

        Knight knight = new Knight(swingSword, shield);

        knight.attack();
        knight.defend();

        knight = new Knight(swingSword, dodge);
        knight.defend();

        System.out.println("----------------------------");


        AttackStrat castSpell = new CastSpell();
        DefendStrat createMagicBarrier = new CreateMagic();

        Wizard wizard = new Wizard(castSpell, createMagicBarrier);

        wizard.attack();
        wizard.defend();


    }
}
