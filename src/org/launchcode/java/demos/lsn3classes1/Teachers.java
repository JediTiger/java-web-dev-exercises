package org.launchcode.java.demos.lsn3classes1;

public class Teachers {

    private String lastName;
    private String firstName;
    private String subject;
    private int yearsTeaching;

    public String getNFirstName() {
        return firstName;
    }

    private void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String aLastName) {
        lastName = aLastName;
    }
    public String getSubject() {
        return subject;
    }

    private void setSubject(String aSubject) {
        subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    private void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }
}
