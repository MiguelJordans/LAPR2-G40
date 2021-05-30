package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;



public class ParameterCategory {

    private String code;
    private String nhsld;
    private String description;

    /**
     * Constructs an instance of ParameterCategory.
     *
     * @param code the ParameterCategory's code
     * @param description the ParameterCategory's description
     * @param nhsld the ParameterCategory's nhsld
     */

    public ParameterCategory(String code, String description, String nhsld) {

        checkCode(code);
        checkNhsld(nhsld);
        checkDescription(description);

        this.code = code;
        this.nhsld = nhsld;
        this.description = description;

    }

    //Checks --------------------------------------------------------------------

    /**
     * Checks code rules (According to the acceptance criteria).
     *
     * @param code the ParameterCategory's code
     */

    public void checkCode(String code) {

        if (StringUtils.isBlank(code))
            throw new IllegalArgumentException("Code cannot be blank.");

        if (code.length()< Constants.CODE_MIN || code.length() > Constants.CODE_CATEGORY_MAX)
            throw new IllegalArgumentException("Code not valid! Code must have 4 to 8 chars.");

    }

    /**
     * Checks Nhsld rules (According to the acceptance criteria).
     *
     * @param nhsld the ParameterCategory's nhsld
     */

    public void checkNhsld(String nhsld) {

        if (StringUtils.isBlank(nhsld))
            throw new IllegalArgumentException("NHSLD cannot be blank.");


        if (nhsld.length() > Constants.NHSLD_MAX)
            throw new IllegalArgumentException("NHSLD not valid! Cannot have more than 8 chars.");

    }

    /**
     * Checks the description rules (According to the acceptance criteria).
     *
     * @param description the ParameterCategory's description
     */

    public void checkDescription(String description) {

        if (StringUtils.isBlank(description))
            throw new IllegalArgumentException("Description cannot be blank.");

        if (description.length() > Constants.DESCRIPTION_CATEGORY_MAX)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 40 chars.");

    }

    //Get--------------------------------------------------------------------------------

    /**
     * Returns the code of the ParameterCategory
     *
     * @return the code of the ParameterCategory
     */

    public String getCode() {
        return code;
    }

    /**
     * Returns the description of the ParameterCategory
     *
     * @return the description of the ParameterCategory
     */

    public String getDescription() {
        return description;
    }

    /**
     * Returns the nhsld of the ParameterCategory
     *
     * @return the nhsld of the ParameterCategory
     */

    public String getNhsld() {
        return nhsld;
    }

    //Set----------------------------------------------------------------------------

    /**
     * Modifies the name of the ParameterCategory
     *
     * @param nhsld modifies the name of the ParameterCategory
     */

    public void setName(String nhsld) {
        checkNhsld(nhsld);
        this.nhsld = nhsld;
    }

    /**
     * Modifies the name of the ParameterCategory
     *
     * @param description modifies the name of the ParameterCategory
     */

    public void setDescription(String description) {
        checkDescription(description);
        this.description = description;
    }

    /**
     * Modifies the name of the the ParameterCategory
     *
     * @param code modifies the name of the ParameterCategory
     */

    public void setCode(String code) {
        checkCode(code);
        this.code = code;
    }

    /**
     * Returns the textual description of the the ParameterCategory in the format: Code, Description, NHSLD.
     *
     * @return
     */

    @Override
    public String toString() {
        return
                " Code: " + code  +
                        ", Description:" + description +
                        ", NHSLD:" + nhsld;

    }
}