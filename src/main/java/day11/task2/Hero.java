package day11.task2;

abstract class Hero implements interfacePhysAttack {
    int health;       //+ здоровье
    double physDef;      //+ процент поглощения физического урона
    double magicDef;     //+ процент поглощения магического урона
    int physAtt;      //+ величина физической атаки), по необходимости
    int magicAtt;     // ввеличина магической атаки), по необходимости

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt * (1-hero.physDef);
        if (hero.health >= attack) {
            hero.health -= attack;
        } else {
            hero.health = 0;
        }
    }
}
