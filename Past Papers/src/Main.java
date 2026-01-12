//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //DRIVER CLASS

    Monster icy = new Monster("IceBaby", 100, Monster.ICE_MONSTER_TYPE);

    System.out.println(icy.getName());

    icy.setName("IceCube");

    System.out.println(icy.getName());

    WaterMonster icyB = new WaterMonster("WaterBoy", 120);

    System.out.println(icyB.getName());
    }
}