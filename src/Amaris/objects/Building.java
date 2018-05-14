package Amaris.objects;
import java.util.*;

public class Building {

    String buildingName;
    ArrayList<Floor> floors = new ArrayList();

    public Building(){

    }

    public void addFloorLisandro(Floor floor){
        floors.add(floor);
    }

    public int getTotalAreaLisandro(){
        int totalArea = 0;
        for (Floor floor : floors){
            totalArea += floor.getAreaLisandro();
        }
        return totalArea;
    }

    public ArrayList<String> getFloorNames(){
        ArrayList<String> names = new ArrayList();
        for (Floor floor : floors){
            names.add(floor.getNameLisandro());
        }
        return names;
    }


}
