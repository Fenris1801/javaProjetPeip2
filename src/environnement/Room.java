package src.environnement;

import src.structs.Coord;

public class Room {
    private Coord topLeft;
    private Coord bottomRight;

    public Room(Coord topLeft, Coord bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Coord getTopLeft() {
        return topLeft;
    }

    public Coord getBottomRight() {
        return bottomRight;
    }
}
