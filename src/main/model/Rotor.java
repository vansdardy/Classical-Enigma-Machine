/**
 * Each rotor has two sides for contact, with each side including all the alphabets available.
 * Within each rotor, 26 wires connect the alphabet from each side in pairs. Giving a permutation of 26! pairs.
 * 
 * Traditionally, inserted from right to left, the rightmost rotor will rotate once after each input.
 * After the rightmost rotor rotates a total of 26 times, the second to right rotor will rotate once.
 * The pattern continues as follows. One rotor will rotate once when the rotor to its right rotate 26 times.
 * 
 * In this project, we consider 26 times a cycle.
 * 
 * The rotation after each input and the sheer amount of possible permutations was the main reason why
 * the Germans claimed that the Enigma was impossible to crack.
 */

package main.model;

public class Rotor extends Gadget {
    
}
