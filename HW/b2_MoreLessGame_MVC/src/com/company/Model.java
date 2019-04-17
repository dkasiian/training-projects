package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Model {

    private final int MIN_BARRIER = 0;
    private final int MAX_BARRIER = 100;
    private int randomNumber, minBarrier, maxBarrier, userInputtedNumber;
    private ArrayList<Integer> userNumbers = new ArrayList<>();

    // 100 НЕ ВКЛЮЧАТЬ
    public void setRandomNumber(){
        // Upper boundary is exclusive. So we need MAX_BARRIER + 1
        randomNumber = ThreadLocalRandom.current().nextInt(MIN_BARRIER, MAX_BARRIER + 1);
    }

    public void setDiapason(){
        minBarrier = MIN_BARRIER;
        maxBarrier = MAX_BARRIER;
    }

    public void setUserNumber(int inputtedNumber){
        userInputtedNumber = inputtedNumber;
        userNumbers.add(userInputtedNumber);
        setNewDiapason(inputtedNumber);
    }

    public boolean compareNumbers(){
        return userInputtedNumber == randomNumber;
    }

    private void setNewDiapason(int value){
        if (value >= randomNumber)
            maxBarrier = value - 1;
        else
            minBarrier = value + 1;
    }

    public int getMinBarrier(){
        return minBarrier;
    }

    public int getMaxBarrier(){
        return maxBarrier;
    }

    public int getUserNumber(){
        return userInputtedNumber;
    }

    public int getRandomNumber(){
        return randomNumber;
    }

    public ArrayList<Integer> getUserNumbers(){
        return userNumbers;
    }
}
