package src;

import src.environnement.Map;

public class Main {
    public static void main(String[] args) {
        Map theMap = new Map(3);
        theMap.initFull();
        System.out.println(theMap);
    }
}
