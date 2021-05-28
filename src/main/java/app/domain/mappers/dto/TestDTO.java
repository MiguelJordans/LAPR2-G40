package app.domain.mappers.dto;

import app.domain.model.Test;
import app.domain.model.TestType;

import java.util.List;

public class TestDTO {

    private String citizenCardNumber;
    private String testID;
    private String nhsCode;
    private State state;

    public TestDTO(String citizenCardNumber,String testID,String nhsCode,String state){

        this.citizenCardNumber = citizenCardNumber;
        this.testID = testID;
        this.nhsCode = nhsCode;

        setState(state);

    }

    public String getCitizenCardNumber() {
        return citizenCardNumber;
    }

    public String getNhsCode() {
        return nhsCode;
    }

    public String getTestID() {
        return testID;
    }

    public String getState() {
        return state.name();
    }

    enum State {
        CREATED,
        SAMPLE_COLLECTED,
        SAMPLE_ANALYSED,
        DIAGNOSTIC_MADE,
        VALIDATED;
    }

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

    public boolean compareState(String state) {


        if (state.equals("SAMPLE_ANALYSED") || state.equals("SAMPLE_COLLECTED") || state.equals("DIAGNOSTIC_MADE") || state.equals("VALIDATED")) {
            return false;
        }

        return true;

    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "citizenCardNumber='" + citizenCardNumber + '\'' +
                ", testID='" + testID + '\'' +
                ", nhsCode='" + nhsCode + '\'' +
                ", state=" + state +
                '}';
    }
    
}
