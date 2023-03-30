import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PointTester
{
    public static void main(String[] args)
    {
        ThreeDPoint pointD = new ThreeDPoint("D", 12, -3, 8);
        ThreeDPoint pointE = new ThreeDPoint("E", 12, -3, 8);
        ThreeDPoint pointF = new ThreeDPoint("F", 12, 5, 4);
        ThreeDPoint pointG = new ThreeDPoint("G", 10, -3, 8);
        ThreeDPoint pointH = new ThreeDPoint("H", 10, 15, 8);

        System.out.println(pointD);
        System.out.println(pointE);
        System.out.println(pointF);
        System.out.println(pointG);
        System.out.println(pointH);

        System.out.println(pointD.equals(pointE));
        System.out.println(pointE.equals(pointF));
        System.out.println(pointE.equals(pointG));
        System.out.println(pointF.equals(pointG));
        System.out.println(pointG.equals(pointH));


        ArrayList<ThreeDPoint> k = new ArrayList<ThreeDPoint>();
        k.add(pointD);
        k.add(pointE);
        k.add(pointF);
        k.add(pointG);
        k.add(pointH);
        Collections.sort(k);

        for(int i = 0; i < k.size(); i++){
            System.out.println(k.get(i));
        }
    }
}
