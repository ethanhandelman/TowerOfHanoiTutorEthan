package com.mirohaap.towerofhanoitutor;

import javafx.scene.layout.StackPane;

public class Ring {
    private StackPane visualRing;
    private int num;
    private int tower;

    public Ring(StackPane visualRing, int num){
        this.visualRing = visualRing;
        this.num = num;
        tower = 1;
    }

    @Override
    public String toString() {
        return "Ring{" +
                "visualRing=" + visualRing +
                ", num=" + num +
                ", tower=" + tower +
                '}';
    }

    public StackPane getVisualRing() {
        return visualRing;
    }

    public int getNum(){
        return num;
    }

    public int getTower(){
        return tower;
    }

    public void setTower(int newTower){
        if(newTower > 0 && newTower <= 3){
            tower = newTower;
        }
    }

}
