package com.boxhitgame.subjects;

public class Player {

    // Datenbank
    private int playerID;

    // Datenbank
    private String name;

    // Datenbank
    private int score;

    // Datenbank
    private String hexColor;
    private int positionX;
    private int positionY;
    private int scale;
    boolean isAlive;
    private int coolDownForAttack;

    public Player(int playerID, String name, String hexColor) {
        this.playerID = playerID;
        this.name = name;
        this.score = 0;
        this.hexColor = hexColor;
        this.scale = 200;
        this.isAlive = true;
        this.coolDownForAttack = 10;
    }

    public int getPlayerID() {
        return playerID;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getHexColor() {
        return hexColor;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getScale() {
        return scale;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getCoolDownForAttack()    {
        return coolDownForAttack;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setHexColor(String hexColor) {
        this.hexColor = hexColor;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setCoolDownForAttack(int coolDownForAttack) {
        this.coolDownForAttack = coolDownForAttack;
    }

    public void move(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    public void attack() {
        this.coolDownForAttack = 10;
    }
}
