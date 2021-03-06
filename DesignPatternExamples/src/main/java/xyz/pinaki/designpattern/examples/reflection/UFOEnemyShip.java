package xyz.pinaki.designpattern.examples.reflection;

/**
 * Created by pinaki on 5/12/17.
 */
public class UFOEnemyShip {

    private String idcode = "100";

    private String getPrivate() { return "How did you get this"; }

    private String getOtherPrivate(int thisInt, String thatString){

        return "How did you get here " + thisInt + " " + thatString;

    }

    public UFOEnemyShip(int number, String randString){

        System.out.println("You sent: " + number + " " + randString);

    }

    // We define the type of ship we want to create
    // by stating we want to use the factory that
    // makes enemy ships

    Object shipFactory;

    private String name;

    // The enemy ship required parts list is sent to
    // this method. They state that the enemy ship
    // must have a weapon and engine assigned. That
    // object also states the specific parts needed
    // to make a regular UFO versus a Boss UFO

    public UFOEnemyShip(Object shipFactory){

        this.shipFactory = shipFactory;

    }

    String getName() {
        return name;
    }

    void setName(String str) {
        name = str;
    }

    // EnemyShipBuilding calls this method to build a
    // specific UFOEnemyShip

    void makeShip() {

        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOEnemyShip here

//        weapon = shipFactory.addESGun();
//        engine = shipFactory.addESEngine();

    }

}
