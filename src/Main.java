package src;

import src.environnement.Map;
import src.environnement.Room;
import src.structs.Coord;

public class Main {
    public static void main(String[] args) {
        Map theMap = new Map(10);
        theMap.init(5);
        System.out.println(theMap);
    }
}
