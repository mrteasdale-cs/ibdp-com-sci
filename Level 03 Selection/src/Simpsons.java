public class Simpsons {
    String name;
    int age;
    String gender;

    public Simpsons(String name, int age, String gender) { //Constructor - every class has a constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //accessor / getter method
    public String getName() {
        return this.name;
    }
    //checker
    public String checkWho(){
        String returnString = null;

        if ((this.age == 39) && (this.gender.equalsIgnoreCase("m"))) {
            returnString = "It's Homer Simpson!";
        } else if ((this.age == 34) && (this.gender.toLowerCase().equals("f"))) {
            returnString = "It's Marge Simpson!";
        } else {
            returnString = "It's someone else!";
        }
        return returnString;
    }

}
