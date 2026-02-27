/**
 * Data holder representing a single state record from the CSV dataset.
 *
 * <p>This class encapsulates properties that are used by the analysis
 * code in {@link App}.  Attributes include the name of the state,
 * percentage of residents without health insurance, total firearm
 * deaths, and drug overdose death rate per 100k population.</p>
 *
 * @author Sam H
 * @collaborator CoPilot
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
    /**
     * Constructs a new StateData instance with the given values.
     *
     * @param state name of the state
     * @param nonInsuredPercentage percentage of residents without insurance
     * @param totalFireArmDeaths total number of firearm deaths
     * @param drugOverdoseDeathRate overdose death rate per 100k population
     */
    public StateData(String state, double nonInsuredPercentage, int totalFireArmDeaths, double drugOverdoseDeathRate) {
        this.state = state;
        this.nonInsuredPercentage = nonInsuredPercentage;
        this.totalFireArmDeaths = totalFireArmDeaths;
        this.drugOverdoseDeathRate = drugOverdoseDeathRate;
    }


    // TODO: Add getters for attributes you need
    /**
     * Returns the state's name.
     *
     * @return state name
     */
    public String getState() {
        return state;
    }

    /**
     * Returns the percentage of residents without health insurance.
     *
     * @return non-insured percentage
     */
    public double getNonInsuredPercentage() {
        return nonInsuredPercentage;
    }

    /**
     * Returns the total firearm deaths recorded for the state.
     *
     * @return firearm death count
     */
    public int getTotalFireArmDeaths() {
        return totalFireArmDeaths;
    }

    /**
     * Returns the drug overdose death rate per 100k population.
     *
     * @return overdose death rate
     */
    public double getDrugOverdoseDeathRate() {
        return drugOverdoseDeathRate;
    }

    // TODO: Add other data analysis methods

    // TODO: Override toString() to return a readable representation of your object
    /**
     * Returns a string representation of the StateData object.
     *
     * <p>The string includes all attributes: state name, non-insured percentage,
     * total firearm deaths, and drug overdose death rate.</p>
     *
     * @return a formatted string containing all state data attributes
     */
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