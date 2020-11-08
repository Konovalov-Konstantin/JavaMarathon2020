package day11.task2;

public class Shaman extends Hero implements interfaceHealer, interfaceMagicAttack {

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health < 50) {
            health += 50;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health < 70) {
            hero.health += 30;
        } else {
            hero.health = 100;
        }
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
