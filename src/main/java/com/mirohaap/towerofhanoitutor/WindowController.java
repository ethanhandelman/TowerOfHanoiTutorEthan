package com.mirohaap.towerofhanoitutor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class WindowController {
    @FXML
    private StackPane ring1, ring2, ring3, ring4, ring5, ring6, ring7, ring8, ring9, ring10;
    @FXML
    private AnchorPane gamePanel;
    @FXML
    private Rectangle tow1Bottom, tow2Bottom, tow3Bottom;
    private DragDropUtil dragDropUtil;

    @FXML
    private void initialize(){
        List<Ring> rings = new ArrayList<>(){{

            add(new Ring(ring1, 1));
            add(new Ring(ring2, 2));
            add(new Ring(ring3, 3));
            add(new Ring(ring4, 4));
            add(new Ring(ring5, 5));
            add(new Ring(ring6, 6));
            add(new Ring(ring7, 7));
            add(new Ring(ring8, 8));
            add(new Ring(ring9, 9));
            add(new Ring(ring10, 10));
        }};

        this.dragDropUtil = new DragDropUtil(gamePanel, rings);

    }

    @FXML
    public void onTutorToggled(){

    }

    @FXML
    public void onRestartButtonClick(){

    }



}