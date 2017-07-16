import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by NgocAnDo on 3/2/17.
 */
public class ExplodingRobots {
    public String canExplode(int x1, int y1, int x2, int y2, String instructions){
        Set<Point> robot1P = new HashSet<Point>();
        Set<Point> robot2P = new HashSet<Point>();
        robot1P.add(new Point(x1, y1));
        robot2P.add(new Point(x2, y2));

        for (int i = 0; i < instructions.length(); i++){
            char c = instructions.charAt(i);
            Set<Point> new1P = new HashSet<Point>();
            Set<Point> new2P = new HashSet<Point>();

            switch (c){
                case 'L':
                    for (Point p: robot1P){
                        new1P.add(new Point(p.x - 1, p.y));
                    }
                    for (Point p1: robot2P){
                        new2P.add(new Point(p1.x - 1, p1.y));
                    }
                    break;
                case 'R':
                    for (Point p: robot1P){
                        new1P.add(new Point(p.x + 1, p.y));
                    }
                    for (Point p1: robot2P){
                        new2P.add(new Point(p1.x + 1, p1.y));
                    }
                    break;
                case 'U':
                    for (Point p: robot1P){
                        new1P.add(new Point(p.x, p.y + 1));
                    }
                    for (Point p1: robot2P){
                        new2P.add(new Point(p1.x, p1.y + 1));
                    }
                    break;
                case 'D':
                    for (Point p: robot1P){
                        new1P.add(new Point(p.x, p.y - 1));
                    }
                    for (Point p1: robot2P){
                        new2P.add(new Point(p1.x, p1.y - 1));
                    }
                    break;
            }

            robot1P.addAll(new1P);
            robot2P.addAll(new2P);
        }
        for(Point p : robot1P){
            for (Point p1 : robot2P){
                if(p.equals(p1))
                    return "Explosion";
            }
        }
        return "Safe";
    }

    class Point {
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object p){
            if(p == this)
                return true;
            if(! (p instanceof Point))
                return false;
            if(x == ((Point)p).x && y == ((Point)p).y)
                return true;
            return false;
        }

        @Override
        public int hashCode() {
            return x + y;
        }
    }

}
