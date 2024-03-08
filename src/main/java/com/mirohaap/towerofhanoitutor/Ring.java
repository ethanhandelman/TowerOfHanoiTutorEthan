package com.mirohaap.towerofhanoitutor;

import javafx.scene.layout.StackPane;

public class Ring {
    private StackPane visualRing;
    private int num;

    public Ring(StackPane visualRing, int num){
        this.visualRing = visualRing;
        this.num = num;
    }

    public StackPane getVisualRing() {
        return visualRing;
    }

    public int getNum(){
        return num;
    }
}
