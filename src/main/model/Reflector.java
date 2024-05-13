/**
 * The reflector connects the output from the last rotor (26 alphabets) into 13 pairs.
 * 
 * For example, if before the last rotor, the alphabet is 'B';
 * and the rotor connected 'B' to 'H', and 'I' to 'K';
 * with the reflector connecting 'H' and 'K';
 * then, the alphabet will go through the process of 'B' --> 'H' --> 'K' --> 'I', after exiting the last rotor a 2nd time.
 * 
 * The reflector offers a practical way to eventually output a result.
 */

package main.model;
import main.abstraction.Gadget;
import main.abstraction.Observer;

import java.util.*;

public class Reflector implements Observer {
    // TODO: fields
    private List<Character> io = new ArrayList<>();
    private Map<Character, Character> reflections = new HashMap<>();

    public Reflector() {
        io.addAll(Gadget.getGadget().getIO());
    }

    public void updateIO(Set<Character> newIO) {
        io.clear();
        io.addAll(newIO);

        // TODO: update reflections
    }
}
