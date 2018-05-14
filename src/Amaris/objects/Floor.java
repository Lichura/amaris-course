package Amaris.objects;

import java.util.*;
public class Floor {

    int width;
    int height;
    String name;
    Building building;
    ArrayList<Room> rooms = new ArrayList();

    public Floor(){
        this.width = 0;
        this.height = 0;
    }

    public Floor(String name, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public void addRoomLisandro(Room room){
        rooms.add(room);
    }


    public int getAreaLisandro(){
        int area = 0;
        for (Room room: rooms) area += room.getAreaLisandro();
        return area;
    }

    public String getNameLisandro(){
        return this.name;
    }
}
