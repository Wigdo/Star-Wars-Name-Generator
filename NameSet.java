public class NameSet {

    private String firstName;
    private String lastName;
    private String townName;
    private String maidenName;

    public NameSet ()
    {
        firstName = "default";
        lastName = "default";
        townName = "default";
        maidenName = "default";
    }

    public NameSet (String firstName, String lastName, String townName, String maidenName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.townName = townName;
        this.maidenName = maidenName;
    }

    public String display ()
    {
        return ("You have entered the following values");
    }

    public String getFirstName () {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTownName() {
        return townName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
}
