/**
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxPoints {

    /**
     * 通过两点之间的斜率判断是不是在一条直线上
     * @param points
     * @return
     */
    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0){
            return 0;
        }

        if (points.length == 1){
            return 1;
        }
        int max = 0;
        for (int i=0;i<points.length;i++){
            Map<Double,Integer> map = new HashMap<Double, Integer>();
            int repeat = 0;
            for (int j=0;j<points.length;j++){
                if (i == j){
                    continue;
                }
                if ((points[i].x == points[j].x) && (points[i].y == points[j].y)){
                    repeat ++;
                    continue;
                }
                double slope = 0;
                if (points[i].x - points[j].x == 0){
                    slope = Double.MAX_VALUE;
                } else {
                    slope = (points[j].y-points[i].y+0.0)/(points[j].x-points[i].x+0.0);
                }

                if (map.get(slope) != null){
                    map.put(slope,map.get(slope)+1);
                } else {
                    map.put(slope,1);
                }
            }

            for (Double key: map.keySet()){
                if (map.get(key) > max){
                    max = map.get(key)+repeat;
                }
            }
            if ((map.keySet().size() == 0) && (repeat > 0)){
                max = repeat;
            }
        }
        return max+1;
    }

    /**
     * 牛客网，没看懂为啥能通过
     * @param points
     * @return
     */
    public int maxPoints2(Point[] points){
        if (points == null || points.length < 3){
            return points.length;
        }

        int res = 0;
        for (int i=1;i<points.length;i++){
            int count = 0;
            long a = points[i].x;
            long b = points[i].y;
            long dx = a - points[i-1].x;
            long dy = b - points[i-1].y;
            if (dx == 0 && dy == 0){
                for (int j=0;j<points.length;j++){
                    if (points[j].x == a && points[j].y == b){
                        count ++;
                    }
                }
            } else {
                for (int j=0;j<points.length;j++){
                    if((points[j].x-a)*dy==(points[j].y-b)*dx){
                        count++;
                    }
                }
            }
            System.out.println(count);
            res = Math.max(res,count);
        }

        return res;
    }

    public static void main(String[] args) {
        Point[] points = {
                new Point(-4,-4),new Point(0,-1),new Point(-2,-2),new Point(1,-1),
                new Point(-1,0),new Point(0,1),new Point(2,1),new Point(2,0),
                new Point(0,0),new Point(1,0),new Point(-1,-1)
//                new Point(0,0),new Point(0,1),
//                new Point(0,2),new Point(0,3),new Point(0,4),new Point(0,5),
//                new Point(0,-1),new Point(0,-2),new Point(0,-3),new Point(0,-4),new Point(0,-5),
//                new Point(1,0),new Point(2,0),new Point(-1,0),new Point(-2,0),new Point(-3,0),
//                new Point(1,1),new Point(2,2),new Point(3,3),new Point(4,4),new Point(5,5)
        };
        System.out.println(new MaxPoints().maxPoints2(points));
    }
}

// Definition for a point.
class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}
