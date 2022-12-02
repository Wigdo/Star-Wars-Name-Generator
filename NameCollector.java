public class NameCollector {

    private String firstName;
    private String lastName;
    private String townName;
    private String maidenName;

    private NameSet nameObj;

    public NameCollector ()
    {
        nameObj = new NameSet(getFirstName(), getLastName(), getTownName(), getMaidenName());
        System.out.println("Your Star Wars name is: \n");
        System.out.print(nameObj.getFirstName().charAt(0) + "" + nameObj.getFirstName().charAt(1) + "" + nameObj.getFirstName().charAt(2));
        System.out.print(nameObj.getLastName().charAt(0) + "" + nameObj.getLastName().charAt(1));
        System.out.print(" " + nameObj.getMaidenName().charAt(0) + "" + nameObj.getMaidenName().charAt(1));
        System.out.print(nameObj.getTownName().charAt(0) + "" + nameObj.getTownName().charAt(1) + "" + nameObj.getTownName().charAt(2));
    }

    public static void main (String[] args)
    {
        NameCollector nameObj = new NameCollector();
    }
    public String getFirstName()
    {
        Input inputObj = new Input();
        System.out.println("Please enter your first name.");
        String newFirstName = "";
        newFirstName  = inputObj.acceptStringInput();
        return newFirstName;
    }

    public String getLastName()
    {
        Input inputObj = new Input();
        System.out.println("Please enter your surname.");
        String newLastName = "";
        newLastName  = inputObj.acceptStringInput();
        return newLastName;
    }

    public String getTownName()
    {
        Input inputObj = new Input();
        System.out.println("Please enter the name of the city you were born in.");
        String newTownName = "";
        newTownName  = inputObj.acceptStringInput();
        return newTownName;
    }

    public String getMaidenName()
    {
        Input inputObj = new Input();
        System.out.println("Please enter your mother's maiden name.");
        String newMaidenName = "";
        newMaidenName  = inputObj.acceptStringInput();
        return newMaidenName;
    }

}
