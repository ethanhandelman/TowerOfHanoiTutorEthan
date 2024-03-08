package com.mirohaap.towerofhanoitutor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.util.List;

public class WindowController {
    @FXML
    private StackPane ring1, ring2, ring3, ring4, ring5, ring6, ring7, ring8, ring9, ring10;

    private List<Ring> rings;
    private double startX;
    private double startY;

    @FXML
    private void initialize(){
        makeRingDraggable(ring1);
    }

    private void initRings(){

    }
    private void makeRingDraggable(StackPane ring){
        ring.setOnMousePressed(e -> {
            startX = e.getSceneX() - ring.getLayoutX();
            startY = e.getSceneY() - ring.getLayoutY();
        });

        ring.setOnMouseDragged(e -> {
            ring.setLayoutX(e.getSceneX() - startX);
            ring.setLayoutY(e.getSceneY() - startY);
        });
    }
}