/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods

 // state, population, non-insured percentage, firearm death rate for every 100k population, total firearm deaths, drug overdose death rate for every 100k population, total drug overdose deaths.
 */
public class StateData {

    // TODO: Add at least 3 private attributes
    // Example:
    // private String name;
    // private int population;
    // private double value;
    private String state;
    private double nonInsuredPercentage;
    private int totalFireArmDeaths;
    private double drugOverdoseDeathRate;

    
    // each state is a population
    // TODO: Create a constructor that takes all attributes as parameters
    public StateData(String state, double nonInsuredPercentage, int totalFireArmDeaths, double drugOverdoseDeathRate) {
        this.state = state;
        this.nonInsuredPercentage = nonInsuredPercentage;
        this.totalFireArmDeaths = totalFireArmDeaths;
        this.drugOverdoseDeathRate = drugOverdoseDeathRate;
    }


    // TODO: Add getters for attributes you need
    public String getState() {
        return state;
    }

    public double getNonInsuredPercentage() {
        return nonInsuredPercentage;
    }

    public int getTotalFireArmDeaths() {
        return totalFireArmDeaths;
    }

    public double getDrugOverdoseDeathRate() {
        return drugOverdoseDeathRate;
    }

    // TODO: Add other data analysis methods

    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "StateData{" +
                "state='" + state + '\'' +
                ", nonInsuredPercentage=" + nonInsuredPercentage +
                ", totalFireArmDeaths=" + totalFireArmDeaths +
                ", drugOverdoseDeathRate=" + drugOverdoseDeathRate +
                '}';
    }
}