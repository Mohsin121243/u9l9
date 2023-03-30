public class Point {
    private int x;
    private int y;
    private String label;


    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o){
        if(o instanceof Point){
            Point p = (Point)o;
            if(p.getX() == this.x && p.getY() == this.y){
                return true;
            }
            return false;
        }
            else{ return false;
        }
    }
    public String toString(){
        return "Point " + label + " is at " + " x = " + x + " y = "+ y;
    }
    public int compareTo(Object o){
        if(o instanceof Point){
            Point p = (Point) o;
            int sum =  p.getX() + p.getY();
            int otherSum =  this.x + this.y;
            return Math.abs(sum-otherSum);
        }
        return 0;
    }
}
