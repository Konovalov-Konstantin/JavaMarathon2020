package day11.task2;

public class Paladin extends Hero implements interfaceHealer {

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health < 75) {
            health += 25;
        } else {
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health < 80) {
            hero.health += 20;
        } else {
            hero.health = 100;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
