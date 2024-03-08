package com.mirohaap.towerofhanoitutor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository _instance;
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);
    //for each tower, [0] is the bottom, last index is the top
    private List<List<Integer>> towers;

    private Repository(){
        towers = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            towers.add(new ArrayList<>());
        }
        for(int i = 0; i < 10; i++){
            towers.get(0).add(i + 1);
        }
        System.out.println(towers);

    }

    public List<Integer> getTowerByIndex(int index){
        if(index < towers.size() && index >= 0){
            return List.copyOf(towers.get(index));
        }
        throw new IndexOutOfBoundsException("Towers must be referenced using indexes 0, 1, or 2.");
    }

    public void applyMove(Move move){
        towers.get(move.getFrom()).remove(move.getN());
        towers.get(move.getTo()).add(move.getN());
        changes.firePropertyChange("move", null, move);
    }

    public static Repository getInstance(){
        if(_instance == null){
            _instance = new Repository();
        }
        return _instance;
    }
}
