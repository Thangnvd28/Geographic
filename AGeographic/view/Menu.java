<<<<<<< HEAD
package view;

import util.InputUtils;

/**
 *
 * @author Admin
 */
public class Menu {

    public static int chooseMenuOption() {
        System.out.println("\n\n========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choose: ");
        int option = InputUtils.inputOption(1, 3);
=======

package view;

import utils.InputUtils;


public class Menu {
    public static int chooseMenuOption(){
        System.out.println("\n\n   MANAGE EAST ASIA COUNTRIES");
        System.out.println("------------------------------");
        System.out.println("1. Enter the information for countries in East Asia.");
        System.out.println("2. Display information of the country you've just input (the last one).");
        System.out.println("3. Search the country according to the entered country's name.");
        System.out.println("4. Display the information increasing with the country name.");
        System.out.println("5. Exit");
        System.out.print("Enter your choose: ");
        int option = InputUtils.inputOption(1, 5);
>>>>>>> 5ef3db6 (Geography project)
        return option;
    }
}
