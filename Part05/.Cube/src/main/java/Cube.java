
public class Cube {

    private int edgeLength;
    private int volume;

    public Cube(int edge) {
        this.edgeLength = edge;
        this.volume = edge * edge * edge;
    }

    public int volume() {
        return this.volume;
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume;
    }
}
