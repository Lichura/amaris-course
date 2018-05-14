package Amaris.objects;

public class Room {

    int width;
    int height;
    int length;


    public Room(){
        this.width = 0;
        this.height = 0;
        this.length = 0;
    }

    public Room(int width, int height, int lenght){
        this.width = width;
        this.height = height;
        this.length = lenght;
        //System.out.println("este cuarto mide %s de largo * %s de ancho * %s de alto ", lenght, width, height);
    }

    public int getAreaFlavia(){
        return this.width * this.height * this.length;
    }
}
