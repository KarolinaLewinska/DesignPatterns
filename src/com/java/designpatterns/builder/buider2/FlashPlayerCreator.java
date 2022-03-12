package com.java.designpatterns.builder.buider2;

public class FlashPlayerCreator extends PlayersBuilder {
    private Player flashPlayer;

    public FlashPlayerCreator() {
        this.flashPlayer = new Player();
    }

    @Override
    public void buildPlayer() {
        flashPlayer.setName("Flash Player");
    }

    @Override
    public Player returnPlayer() {
        return flashPlayer;
    }
}