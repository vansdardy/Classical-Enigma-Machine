/**
 * The plugboard was an additional feature for military use compared to commercial-use Enigma machines.
 * It allowed an upper limit of 10 wires to connect 20 alphabets in pairs.
 * 
 * For example, if the alphabet 'S' is connected to 'A' on the plugboard.
 * Then, as soon as the user inputs 'A', it will first be mirrored to 'S' through the plugboard, and then enter the rotors;
 * while if after the alphabet passed through the reflector and the rotors, it became an 'S', it will be mirrored to 'A' as the output.
 * 
 * The use of plugboard is entirely optional as it was only designed for additional
 * cryptographic security.
 */

package main.model;
import main.abstraction.Gadget;
import main.abstraction.Observer;

import java.util.*;

public class Plugboard implements Observer {
    // The plugboard has the set of IO, and the cable connecting them in pairs.
    private List<Character> io = new ArrayList<>();
    private Map<Character, Character> cable = new HashMap<>();

    public Plugboard() {
        io.addAll(Gadget.getGadget().getIO());
    }

    public void updateIO(Set<Character> newIO) {
        io.clear();
        io.addAll(newIO);

        // TODO: update cable
    }
}
