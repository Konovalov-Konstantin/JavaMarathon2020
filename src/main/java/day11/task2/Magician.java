package day11.task2;

public class Magician extends Hero implements interfaceMagicAttack {
    public Magician () {
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magicAttack = magicAtt * (1-hero.magicDef);
        if (hero.health >= magicAttack) {
            hero.health -= magicAttack;
        } else {
            hero.health = 0;
        }
    }
}
