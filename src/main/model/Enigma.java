/**
 * A classical Enigma machine consists of 5 main gadgets:
 * 1. Input: A keyboard that includes all the alphabets (A to Z)
 * 2. Plugboard: A set of wire connections that mirror a certain set of alphabets to another set of alphabets.
 * 3. Rotors: These are the most important cryptographic parts of the machine. The German military in WWII had 3 to 7 rotors
 *            available for one machine.
 * 4. Reflector: Connect the last rotor's output in pairs.
 * 5. Output: Light bulbs that show the encrypted alphabet from the input of 1 alphabet.
 * 
 * For any given input (an alphabet), the electric signals go through the gadgets in the following order:
 * Input --> Plugboard --> Rotors --> Reflector --> Rotors --> Plugboard --> Output
 * 
 * For more detailed explanation, please visit the Wikipedia page of the Enigma machine:
 * https://en.wikipedia.org/wiki/Enigma_machine
 * 
 * The major flaw that led to the crack of the Enigma machine was that the input of an alphabet will never output itself.
 * That is: if the input is 'G', the encrypted message will never be 'G', it can be any other alphabet in the rest twenty-five.
 * Due to this design flaw, the German's habit of adding "Heil Hitler" at the end of a telegraph became the critical breakthrough
 * to crack a random intercepted encrypted message.
 */

package main.model;

public class Enigma {
    
}
