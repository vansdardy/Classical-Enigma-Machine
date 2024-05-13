package main.abstraction;

import java.util.*;

public class Gadget extends Observable {
    // Singleton IOs
    private static Gadget singleGadget = null;
    private static Set<Character> defaultIO;
    private static Set<Character> gadgetIO;

    /**
     * Constructor for gadgets that use the default input/output
     * Default input/output will always contain all 26 English alphabets,
     * capitalized.
     */
    private Gadget() {
        super();
        defaultIO = new HashSet<>();
        for (char i = 'A'; i <= 'Z'; i += 1) {
            defaultIO.add(i);
        }
        gadgetIO = new HashSet<>();
        gadgetIO.addAll(defaultIO);
    }

    /**
     * Add a character to the default input/output set
     * @param c, a character
     */
    public void addIO(char c) {
        gadgetIO.add(c);
        notifyObservers(gadgetIO);
    }

    /**
     * Remove an existing character from the input/output set
     * @param c, a character
     */
    public void removeIO(char c) {
        gadgetIO.remove(c);
        notifyObservers(gadgetIO);
    }

    /**
     * Return the gadget's IO
     * @return gadgetIO
     */
    public Set<Character> getIO() {
        return gadgetIO;
    }

    /**
     * Ensure gadgetIO copies defaultIO's value when first declared
     * @return gadgetIO, Set<Character>
     */
    public static Gadget getGadget() {
        if (singleGadget == null) {
            singleGadget = new Gadget();
        }
        return singleGadget;
    }
}
