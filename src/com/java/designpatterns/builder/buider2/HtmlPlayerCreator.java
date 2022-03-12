package com.java.designpatterns.builder.buider2;

public class HtmlPlayerCreator extends PlayersBuilder {
    private Player htmlPlayer;

    public HtmlPlayerCreator() {
        this.htmlPlayer = new Player();
    }

    @Override
    public void buildPlayer() {
        htmlPlayer.setName("HTML Player");
    }

    @Override
    public Player returnPlayer() {
        return htmlPlayer;
    }
}
