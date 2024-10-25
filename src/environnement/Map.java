package src.environnement;

import src.environnement.element.Dirt;
import src.structs.Coord;

import java.util.Random;

public class Map {
    private MapElement[][] map;
    private int size;
    private Room[] rooms;
    private int roomDefaultNumber;
    private Random randomNumbers = new Random();

    public Map(int size) {
        this.map = new MapElement[size][size];
        this.size = size;
    }

    public Map() {
        this(5);
    }

    public void init(int number) {
        for (int i = 0; i < number; i++) {
            Coord topLeft = new Coord(randomNumbers.nextInt(size), randomNumbers.nextInt(size));

            Room theRoom = new Room(topLeft, new Coord(randomNumbers.nextInt(size - topLeft.getX()) + topLeft.getX(), randomNumbers.nextInt(size - topLeft.getY()) + topLeft.getY()));
            if (this.doesFit(theRoom))
                setElement(theRoom, new Dirt());

        }
    }

    public void init() {
        init(roomDefaultNumber);
    }

    public void initFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                this.map[i][j] = new MapElement();
            }
        }
    }

    public void setElement(Room room, MapElement type) {
        for (int x = room.getTopLeft().getX(); x <= room.getBottomRight().getX(); x++) {
            for (int y = room.getTopLeft().getY(); y <= room.getBottomRight().getY(); y++)
                this.map[x][y] = type;
        }
    }


    public boolean doesFit(Room room) {
        for (int x = room.getTopLeft().getX(); x <= room.getBottomRight().getX(); x++) {
            for (int y = room.getTopLeft().getY(); y <= room.getBottomRight().getY(); y++) {
                if (this.map[x][y] != null)
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for (MapElement[] row : this.map) {
            for (MapElement element : row) {
                result += (element == null) ? " " : element.toString();
            }
            result += '\n';
        }
        return result;
    }
}