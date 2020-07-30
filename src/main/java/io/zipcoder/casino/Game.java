package io.zipcoder.casino;

public interface Game {
    //String gameName;

    //Boolean gameState;

    void play();

    void nextTurn();

    Boolean checkGameState();

    String printScore();

    String printGameRules();

    void exit();
}
