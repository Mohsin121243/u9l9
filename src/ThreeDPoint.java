public class ThreeDPoint extends Point implements Comparable{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label,x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public boolean equals(Object o){
        if(o instanceof ThreeDPoint){
            ThreeDPoint p = (ThreeDPoint)o;
            if(super.equals(o) && p.getZ() == this.z){
                return true;
            }

        }
        return false;

    }
    public String toString(){
        return super.toString() + " z = "+ z;
    }

    public int compareTo(Object o){
        if(o instanceof ThreeDPoint){
            ThreeDPoint p = (ThreeDPoint) o;
            int sum = p.getZ() + p.getX() + p.getY();
            int otherSum = this.z + this.getX() + this.getY();
            if(sum > otherSum){
                return 1;
            }
        }
        return -1;
    }
}
