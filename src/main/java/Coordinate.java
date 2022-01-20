import java.util.Objects;

public class Coordinate {

    int x;
    int y;
    int presents;

    public Coordinate(int cordX, int cordY) {
        x = cordX;
        y = cordY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y && presents == that.presents;
    }
}
