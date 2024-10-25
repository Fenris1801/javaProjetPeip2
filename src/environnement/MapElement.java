package src.environnement;

public class MapElement {
    protected enum Type {
        GROUND,
        MOB,
        WEARABLE
    }

    private Type type;

    public MapElement(Type type) {
        this.type = type;
    }

    public MapElement() {
        this.type = Type.GROUND;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return (type == Type.GROUND) ? "." : type.toString();
    }
}