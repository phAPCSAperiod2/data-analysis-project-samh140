import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * <p>This class contains the entry point for running a simple
 * analysis over state-level health and safety statistics. It
 * includes helpers to load the CSV dataset and perform several
 * example queries such as finding max firearm deaths and filtering
 * by overdose death rate.</p>
 *
 * @author Sam H
 * @collaborator CoPilot
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */

public class App {

    private static final String fileName = "StateData2020-CDC-Census (3).csv";

    public static void main(String[] args) throws IOException {

        // TODO: Update this with your CSV file path
        StateData[] dataList = readFile(fileName);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome! This program analyzes data from the StateData2020-CDC-Census dataset.");
        while (true) {
            System.out.println("What analysis would you like to make? (1) Max firearm deaths, (2) Min percentage of non-insured, (3) States with drug overdose death rate above 35 (per 100k population), (4) Exit");
            int choice = scanner.nextInt();
            if (choice == 1)
            {
                maxFireArmDeaths(dataList);
            }
            else if (choice == 2)
            {
                minPercentageNonInsured(dataList);
            }
            else if (choice == 3)
            {
                drugOverdoseDeathRateAbove(dataList, 35);
            }
            else if (choice == 4)
            {
                System.out.println("Exiting program.");
                break;
            }
            else
            {
                System.out.println("Invalid input. Please enter 1, 2, 3, or 4.");
            }
            
        }
        scanner.close();
    }

    /**
     * Reads the dataset from a CSV file and constructs an array of
     * {@link StateData} objects. Assumes the first line is a header and
     * that there are at most 50 records (one per US state).
     *
     * @param fileName the path to the CSV file
     * @return an array containing data objects parsed from the file
     * @throws IOException if the file cannot be opened
     */
    public static StateData[] readFile(String fileName) throws IOException {
        int index = 0;
        File file = new File(fileName);
        StateData[] dataList = new StateData[50]; // Assuming 50 states, adjust if needed
        Scanner scanner = new Scanner (file);
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while (scanner.hasNextLine() && index < dataList.length) {
            String singleLine = scanner.nextLine();
            String[] columns = singleLine.split(",");
            // convert text to numbers, create new Data objects
            dataList[index] = new StateData(columns[0], Double.parseDouble(columns[2]), Integer.parseInt(columns[4]), Double.parseDouble(columns[5]));
            index++;
        }
        scanner.close();
        return dataList;
    }

    /**
     * Prints the state that has the maximum number of firearm deaths from
     * the supplied dataset. Also outputs a simple comment based on the
     * magnitude of the death toll.
     *
     * @param dataList array of state data; null elements are ignored
     */
    public static void maxFireArmDeaths(StateData[] dataList) {
        int maxDeaths = 0;
        String stateWithMaxDeaths = "";
        for (StateData data : dataList) {
            if (data != null && data.getTotalFireArmDeaths() > maxDeaths) {
                maxDeaths = data.getTotalFireArmDeaths();
                stateWithMaxDeaths = data.getState();
            }
        }
        System.out.println("State with the highest firearm deaths: " + stateWithMaxDeaths + " with " + maxDeaths + " deaths.");

        if (maxDeaths >= 500) {
            System.out.println("This is a high number of firearm deaths, this is a problem that needs to be addressed.");
        }
        else {
            System.out.println("This is an extremely high number of firearm deaths, this is a critical problem that needs to be addressed and solved immediately.");
        }

    }

    /**
     * Finds and prints the state with the lowest percentage of
     * non‑insured residents. Provides a commentary on the result range
     * (low, moderate, high).
     *
     * @param dataList dataset to search, may contain null entries
     */
    public static void minPercentageNonInsured(StateData[] dataList){
        double minPercentage = Double.MAX_VALUE; // initialize to a very high value so any percentage will be lower
        String stateWithMinPercentage = "";
        for (StateData data : dataList) {
            if (data != null && data.getNonInsuredPercentage() < minPercentage && data.getNonInsuredPercentage()!= -1) { // check for valid percentage
                minPercentage = data.getNonInsuredPercentage();
                stateWithMinPercentage = data.getState();
            }
        }
        System.out.println("State with the lowest non-insured percentage: " + stateWithMinPercentage + " with " + minPercentage + "% non-insured.");

        if (minPercentage <= 5) {
            System.out.println("This is a low percentage of non-insured individuals, this is a positive sign for the state.");
        }
        else if (minPercentage <= 10) {
            System.out.println("This is a moderate percentage of non-insured individuals, there is room for improvement in healthcare coverage in this state.");
        }
        else {
            System.out.println("This is a high percentage of non-insured individuals, the problem should be addressed immediately.");
        }
    }

    /**
     * Lists states whose drug overdose death rate exceeds the given
     * threshold and prints them. If none are found, a message is shown
     * accordingly.
     *
     * @param dataList the dataset to inspect
     * @param number the threshold rate (per 100k population)
     */
    public static void drugOverdoseDeathRateAbove(StateData[] dataList, double number) {
        String[] statesAboveNumber = new String[dataList.length];
        for (int i = 0; i < dataList.length; i++) {
            if (dataList[i] != null && dataList[i].getDrugOverdoseDeathRate() > number) {
                statesAboveNumber[i] = dataList[i].getState();
            }
        }
        if (statesAboveNumber.length == 0){
            System.out.println("No states have a drug overdose death rate above " + number + " (per 100k population).");
        }
        else {
            System.out.println("State(s) with drug overdose death rate above " + number + " (per 100k population) are : ");
            for (String state : statesAboveNumber) {
                if (state != null) {
                    System.out.println(state);
                }
            }
            System.out.println("This is concerning. A drug overdose death rate above " + number + " (per 100k population) proves that this is a critical problem in these states and that needs to be addressed immediately.");
        }
    }
}