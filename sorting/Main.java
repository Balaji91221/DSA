import java.util.Arrays;

class point implements Comparable<point> {
    int x, y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(point p) {
        return this.x - p.x;
    }
}

public class Main {
    public static void main(String[] args) {
        point[] p = new point[5];
        p[0] = new point(1, 2);
        p[1] = new point(3, 4);
        p[2] = new point(5, 6);
        p[3] = new point(7, 8);
        p[4] = new point(9, 10);

        Arrays.sort(p);

        for (int i = 0; i < 5; i++) {
            System.out.println(p[i].x + " " + p[i].y);
        }
    }
}
