
package controller;

import java.util.List;
<<<<<<< HEAD
import model.QuadraticEquation;
import model.SuperlativeEquation;
import util.InputUtils;
import view.Menu;

public class Controller {
    
    public static void main(String[] args) {
=======
import java.util.Collections;
import java.util.Scanner;
import model.CountriesList;
import model.EastAsiaCountries;
import utils.FormatString;
import utils.InputUtils;
import view.Menu;


public class Controller {

    
    public static void main(String[] args) {
        CountriesList cl = new CountriesList();
>>>>>>> 5ef3db6 (Geography project)
        int choice;
        while (true) {
            choice = Menu.chooseMenuOption();
            switch (choice) {
                case 1 -> {
<<<<<<< HEAD
                    solveSuperlativeEquation();
                }
                case 2 -> {
                    solveQuandraticEquation();
                }
                case 3 -> 
                    System.exit(0);
            }
        }
        
    }

    private static void solveSuperlativeEquation() {
        System.out.print("Enter coefficient A: ");
        float a = InputUtils.inputFloat();
        System.out.print("Enter coefficient B: ");
        float b = InputUtils.inputFloat();
        SuperlativeEquation se = new SuperlativeEquation(a, b);

        List<Float> solutions = se.calculateEquation();
        List<Float> odd = se.findOdd();
        List<Float> even = se.findEven();
        List<Float> square = se.findSquare();
        displayResult(odd, even, square, solutions);

    }
    private static void solveQuandraticEquation() {
        System.out.print("Enter coefficient A: ");
        float a = InputUtils.inputFloat();
        System.out.print("Enter coefficient B: ");
        float b = InputUtils.inputFloat();
        System.out.print("Enter coefficient C: ");
        float c = InputUtils.inputFloat();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        List<Float> solutions = qe.calculateQuandraticEquation();
        List<Float> odd = qe.findOdd();
        List<Float> even = qe.findEven();
        List<Float> square = qe.findSquare();
        displayResult(odd, even, square, solutions);

    }

    public static void displayResult(List<Float> odd, List<Float> even, List<Float> square, List<Float> result) {
        System.out.print("Number is odd: ");
        if (odd == null) {
            System.out.println("None");
        } else {
            for (Float x : odd) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }
        System.out.print("Number is even: ");
        if (even == null) {
            System.out.println("None");
        } else {
            for (Float x : even) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }
        System.out.print("Number is square number: ");
        if (square == null) {
            System.out.println("None");
        } else {
            for (Float x : square) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }

        if (result == null) {
            System.out.println("No solution exists for the equation.");
        } else {
            System.out.println("Solutions of the superlative equation: ");
            for (Float x : result) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }
    }
=======
                    addCountryInformation(cl);
                }
                case 2 -> {
                    getRecentlyEnteredInformation(cl);
                }
                case 3 -> {
                    searchInformationByName(cl);
                }
                case 4 -> {
                    sortInformationByAscendingOrder(cl);
                }
                case 5 ->
                    System.exit(0);
            }
        }
    }

    public static EastAsiaCountries inputInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country's code:");
        String code = InputUtils.inputCode();
        System.out.println("Enter country's name:");
        String name = InputUtils.inputName();
        name = FormatString.formatName(name);
        System.out.println("Enter country's total area: ");
        float area = InputUtils.inputFloat();
        System.out.println("Enter terrant: ");
        String tr = sc.nextLine();
        EastAsiaCountries eac = new EastAsiaCountries(tr, code, name, area);
        return eac;
    }

    public static void addCountryInformation(CountriesList cl) {
        boolean back;
        do {
            back  = false;
            EastAsiaCountries eac = inputInformation();
            cl.addList(eac);
            System.out.println("Do you want to continue?\n1.Yes\n2.No");
            int choice = InputUtils.inputOption(1, 2);
            if (choice == 1) {
                back = true;
            }
        } while (back == true);
    }

    public static void searchInformationByName(CountriesList cl) {
        System.out.print("Enter name to find: ");
        String name = InputUtils.inputName();
        cl.SearchByCondition((EastAsiaCountries t) -> t.getCountryName().toLowerCase().contains(name.toLowerCase()));
    }

    public static void getRecentlyEnteredInformation(CountriesList cl) {
        List<EastAsiaCountries> clList = cl.getCountryList();
        EastAsiaCountries last = clList.get(clList.size() - 1);
        last.toString();
    }

    public static void sortInformationByAscendingOrder(CountriesList cl) {
        Collections.sort(cl.getCountryList());
        System.out.printf("ID               | Name                  | Area                  | Terrant\n");
        for (EastAsiaCountries eac : cl.getCountryList()) {
            eac.toString();
        }
    }

>>>>>>> 5ef3db6 (Geography project)
}
