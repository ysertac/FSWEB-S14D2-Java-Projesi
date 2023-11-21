import com.workintech.enums.PaintColor;
import com.workintech.models.*;
import com.workintech.enums.LampType;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(100, true, LampType.FLUORESCENT);
        Lamp lamp2 = new Lamp(354, false, LampType.LED);
        lamp1.turnOn();
        System.out.println("***************");
        lamp2.turnOn();
        System.out.println("******************************");
        System.out.println("******************************");
        Bed bed1 = new Bed("orthopaedic", 2, 10, 1, 1);
        bed1.make();
        System.out.println("*****************************");
        System.out.println("*****************************");
        Wardrobe wardrobe1 = new Wardrobe(2, 1, 1.5);
        wardrobe1.add();
        System.out.println("*****************************");
        System.out.println("*****************************");
        Carpet carpet1 = new Carpet(10, 15, PaintColor.BLUE);
        carpet1.lying();
        System.out.println("*****************************");
        System.out.println("*****************************");
        Wall wall1 = new Wall("north-east");
        Wall wall2 = new Wall("south-east");
        Wall wall3 = new Wall("north-west");
        Wall wall4 = new Wall("south-west");
        wall1.create();
        System.out.println("*****************************");
        System.out.println("*****************************");
        Ceiling ceiling1 = new Ceiling(3, PaintColor.WHITE);
        ceiling1.create();
        System.out.println("*****************************");
        System.out.println("*****************************");
        BedRoom myBedRoom = new BedRoom("myBedRoom", wall1, wall2, wall3, wall4, ceiling1, bed1, lamp2,carpet1, wardrobe1);
        myBedRoom.createRoom();
    }
}