package src.structs;

import static java.lang.Math.*;

class Coord {
    private int x;
    private int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "<" + x + ", " + y + ">";
    }

    public boolean equals(Coord other) {
        return x == other.getX() && y == other.getY();
    }

    public Coord add(Coord other) {
        return new Coord(x + other.getX(), y + other.getY());
    }

    public Coord subtract(Coord other) {
        return new Coord(x - other.getX(), y - other.getY());
    }

    public double distance(Coord other) {
        return sqrt(Math.pow((other.getX() - x), 2) + Math.pow((other.getY() - y), 2));
    }
}