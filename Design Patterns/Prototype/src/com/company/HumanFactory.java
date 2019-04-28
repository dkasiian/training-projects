package com.company;

class HumanFactory {
    private Human human;

    HumanFactory(Human human){
        setPrototype(human);
    }

    void setPrototype(Human human){
        this.human = human;
    }

    Human makeCopy() {
        return (Human) human.copy();
    }
}
