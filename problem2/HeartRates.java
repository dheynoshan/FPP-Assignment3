package problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    private final int RESTING_HEART_RATE=70;
    private final float LOWER_BOUNDRY=0.5F;
    private final float UPPER_BOUNDRY=0.85F;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge(){
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public int maximumHeartRate(){
        return 220-this.calculateAge();
    }

    public void targetHeartRateRange(){
        int averageHeartRate = this.maximumHeartRate() - this.RESTING_HEART_RATE;
        float lowerBoundryTarget = (float)(averageHeartRate*this.LOWER_BOUNDRY + this.RESTING_HEART_RATE);
        float upperBoundryTarget = (float)(averageHeartRate*this.UPPER_BOUNDRY + this.RESTING_HEART_RATE);

        System.out.println("The Target Heart Rate Range is between " + lowerBoundryTarget + " and " + upperBoundryTarget);
    }

    @Override
    public String toString() {
        String s = "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + this.calculateAge() + "\nDate of Birth: "
                + this.dateOfBirth.toString() + "\nMaximum Heart Rate: " + this.maximumHeartRate();
        return s;
    }
}
