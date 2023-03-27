package seedu.address.model.tank.readings;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Tank's temperature in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidTemperature(String)}
 */
public class Temperature extends Reading {

    public static final String MESSAGE_CONSTRAINTS =
            "Temperature should be a double, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "^-?\\d+(\\.\\d+)?$";
    private int value;

    /**
     * Constructs a {@code Temperature}.
     *
     * @param value A valid temperature;
     * @param date A valid date;
     */
    public Temperature(String value, String date) {
        super(date);
        requireNonNull(value);
        checkArgument(isValidTemperature(value), MESSAGE_CONSTRAINTS);
        this.value = Integer.parseInt(value);
    }

    public boolean isValidTemperature(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Temperature // instanceof handles nulls
                && localDate.equals(((Temperature) other).localDate)); // state check
    }

    @Override
    public int hashcode() {
        return (dateString + value).hashCode();
    }
}
