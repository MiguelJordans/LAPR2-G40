package app.mappers.dto;

public class TestDTO {

    private String citizenCardNumber;
    private String testID;
    private String nhsCode;
    private State state;
    private String name;

    /**
     * Constructor.
     *
     * @param citizenCardNumber the citizen card number
     * @param testID            the test ID
     * @param nhsCode           the NHS code
     * @param state             the state
     * @param name              the name
     */
    public TestDTO(String citizenCardNumber, String testID, String nhsCode, String state, String name) {

        this.citizenCardNumber = citizenCardNumber;
        this.testID = testID;
        this.nhsCode = nhsCode;
        this.name = name;

        setState(state);
    }

    /**
     * Gets the citizen card number.
     *
     * @return the citizen card number
     */
    public String getCitizenCardNumber() {
        return citizenCardNumber;
    }

    /**
     * Gets the NHS code.
     *
     * @return the NHS code
     */
    public String getNhsCode() {
        return nhsCode;
    }

    /**
     * Gets the test ID.
     *
     * @return the test ID
     */
    public String getTestID() {
        return testID;
    }

    /**
     * Gets the test state.
     *
     * @return the test state
     */
    public String getState() {
        return state.name();
    }

    /**
     * Test state options.
     */
    enum State {
        CREATED,
        SAMPLE_COLLECTED,
        SAMPLE_ANALYSED,
        DIAGNOSTIC_MADE,
        VALIDATED;
    }

    /**
     * Modifies the test state.
     *
     * @param state the test state
     */
    public void setState(State state) {
        this.state = state;
    }

    public void setState(String s) {
        switch (s) {
            case "CREATED":
                setState(State.CREATED);
                break;
            case "SAMPLE_COLLECTED":
                setState(State.SAMPLE_COLLECTED);
                break;
            case "SAMPLE_ANALYSED":
                setState(State.SAMPLE_ANALYSED);
                break;
            case "DIAGNOSTIC_MADE":
                setState(State.DIAGNOSTIC_MADE);
                break;
            case "VALIDATED":
                setState(State.VALIDATED);
                break;
            default:
                break;
        }
    }

    /**
     * Compares the state.
     * @param state the state
     * @return true if it's different, false if it's equal
     */
    public boolean compareState(String state) {

        if (state.equals("SAMPLE_ANALYSED") || state.equals("SAMPLE_COLLECTED") || state.equals("DIAGNOSTIC_MADE") || state.equals("VALIDATED")) {
            return false;
        }
        return true;
    }

    /**
     * Returns the textual description of the test in the format: TIN number, test ID, NHS code,
     * test type, state and date.
     * @return the Test's characteristics
     */
    @Override
    public String toString() {
        return "TestDTO{" +
                " TestID:" + testID +
                ", NhsCode:" + nhsCode +
                ", Client name: " + name +
                ", state:" + state +
                '}';
    }
}
