/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

/**
 *
 * @author syrly
 */
public class Vertex {
    private char label; // label (cth 'A')
    private  boolean wasVisited;

    public Vertex(char label) {
        // construktor
        this.label = label;
        wasVisited = false;
    }

    //getter setter

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
