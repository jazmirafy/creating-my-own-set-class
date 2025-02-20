import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set egyptSet = new Set(new Integer[] {3, 4, 5, 6});
        Set professorSet = new Set(new Integer[] {1, 2, 3, 4});
        
        int choice;
        //i know i wanna use do while since i want this to execute at least one time and maybe repeat depending on the user
        do {
            System.out.println("Type one of these numbers to choose a set operation:");
            System.out.println("1. Print Egypt's set");
            System.out.println("2. Print Professor's set");
            System.out.println("3. Add element to Egypt's set");
            System.out.println("4. Remove element from Egypt's set");
            System.out.println("5. Print union of both sets");
            System.out.println("6. Print intersection of both sets");
            System.out.println("7. Print difference of Egypt's set and Professor's set");
            System.out.println("8. Check if Egypt's set is a subset of Professor's set");
            System.out.println("9. Clear Professor's set");
            System.out.println("10. Check if Egypt's set is empty");
            System.out.println("11. Check if an element exists in Egypt's set");
            System.out.println("12. Check if both sets are equal");
            System.out.println("13. Get the cardinality (size) of Egypt's set");
            System.out.println("14. Exit");
            
            choice = scanner.nextInt();
            //i like switch statements since its faster than doing if else etc
            switch (choice) {
                case 1:
                    egyptSet.printElements();
                    break;
                case 2:
                    professorSet.printElements();
                    break;
                case 3:
                    System.out.println("Enter an element to add to Egypt's set:");
                    int elementToAdd = scanner.nextInt();
                    egyptSet.addElement(elementToAdd);
                    break;
                case 4:
                    System.out.println("Enter an element to remove from Egypt's set:");
                    int elementToRemove = scanner.nextInt();
                    egyptSet.removeElement(elementToRemove);
                    break;
                case 5:
                    Set unionSet = egyptSet.union(professorSet);
                    unionSet.printElements();
                    break;
                case 6:
                    Set intersectionSet = egyptSet.intersection(professorSet);
                    intersectionSet.printElements();
                    break;
                case 7:
                    Set differenceSet = egyptSet.difference(professorSet);
                    differenceSet.printElements();
                    break;
                case 8:
                    boolean isSubset = egyptSet.isSubset(professorSet);
                    if (isSubset) {
                        System.out.println("Egypt's set is a subset of Professor's set.");
                    } else {
                        System.out.println("Egypt's set is not a subset of Professor's set.");
                    }
                    break;
                case 9:
                    professorSet.clear();
                    System.out.println("Professor's set cleared.");
                    break;
                case 10:
                    if (egyptSet.isEmpty()) {
                        System.out.println("Egypt's set is empty.");
                    } else {
                        System.out.println("Egypt's set is not empty.");
                    }
                    break;
                case 11:
                    System.out.println("Enter an element to check if it exists in Egypt's set:");
                    int elementToCheck = scanner.nextInt();
                    if (egyptSet.isElement(elementToCheck)) {
                        System.out.println("Element exists in Egypt's set.");
                    } else {
                        System.out.println("Element does not exist in Egypt's set.");
                    }
                    break;
                case 12:
                    boolean isEqual = egyptSet.isEqual(professorSet);
                    if (isEqual) {
                        System.out.println("Both sets are equal.");
                    } else {
                        System.out.println("The sets are not equal.");
                    }
                    break;
                case 13:
                    System.out.println("The cardinality of Egypt's set is: " + egyptSet.getCardinality());
                    break;
                case 14:
                    System.out.println("Bye bye <33");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        } while (choice != 14);
        
        scanner.close();
    }
}
