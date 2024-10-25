package src.environnement;

public class Map {

    private MapElement[][] map;

    public Map(int size) {
        this.map = new MapElement[size][size];
    }

    public Map() {
        this(5);
    }

    public void initFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                this.map[i][j] = new MapElement();
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (MapElement[] row : this.map) {
            for (MapElement element : row) {
                result += element.toString();
            }
            result += '\n';
        }
        return result;
    }
}