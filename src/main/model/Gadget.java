package main.model;

import java.util.*;

public abstract class Gadget {
    private Set<Character> defaultIO;

    /**
     * Constructor for gadgets that use the default input/output
     * Default input/output will always contain all 26 English alphabets, capitalized.
     * @param None
     */
    public Gadget() {
        defaultIO = new HashSet<>();
        
        for (char i = 'A'; i <= 'Z'; i += 1) {
            char alphabet = i;
            defaultIO.add(alphabet);
        }
    }

    /**
     * Add a character to the default input/output set
     * @param c
     */
    public void addIO(char c) {
        defaultIO.add(c);
    }

    /**
     * Remove an existing character from the input/output set
     * @param c
     */
    public void removeIO(char c) {
        // TODO: complete function
    }

    public Set<Character> getIO() {
        return defaultIO;
    }
}
