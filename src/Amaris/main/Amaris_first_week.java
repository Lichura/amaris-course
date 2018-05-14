package Amaris.main;

import Amaris.objects.*;

import java.util.*;

public class Amaris_first_week{




    public static void main(String[] args){
        Building building = new Building();
        ArrayList<Floor> floors = new ArrayList();

        Floor firstFloor = new Floor("firstFloor", 20, 30);
        Floor secondFloor = new Floor("secondFloor", 10,20);
        Floor thirdFloor = new Floor("thirdFloor", 10, 30);
        Floor loft = new Floor("loft", 5,30);

        Room livingRoom = new Room(10, 10, 10);
        Room bathroom = new Room(10, 15, 10);
        Room kitchen = new Room(15, 10, 10);
        Room bedroom = new Room(20,20,20);

        building.addFloor(firstFloor);
        building.addFloor(secondFloor);
        building.addFloor(thirdFloor);
        building.addFloor(loft);

        firstFloor.addRoom(livingRoom);
        firstFloor.addRoom(bathroom);
        firstFloor.addRoom(kitchen);
        firstFloor.addRoom(bedroom);
        secondFloor.addRoom(kitchen);
        secondFloor.addRoom(bathroom);

        floors.add(firstFloor);
        floors.add(secondFloor);
        floors.add(thirdFloor);
        floors.add(loft);


        printTotalArea(building);
    }


    public static void printTotalArea(Building building){
        System.out.println("El area total del edficio es: " + building.getTotalAreaFlavia());
    }


}
