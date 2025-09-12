public class Dog {
    private String name; //attribute(instance variable)
    private int age;
    public Dog(String n, int a){
        System.out.println("Dog Made!");
        this.name = n;
        this.age = a;
     }
    public void bark(){
        System.out.println(this.name + " BARKs!");
    }
    public String getName(){
        return this.name;
    }
    //getter
    public int getAge(){
        return this.age;
    }
    //setter method
    public void setName(String newName){
        this.name = newName;
    }
    public void addAge(){
        this.age += 1;
    }

}
