//Question: Given a route containing 4 directions (E, W ,N ,S), Find the shortest path to reach destination.

//           N
//           |
//       W --  -- E
//           |
//           S

// Displacement  == under-root of ( (x2-x1)^2 - (y2-y1)^2 ) 

public class shortestPath {
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
            // West
            else {
                x--;
            }
        }
        int x1 = x * x;
        int y1 = y * y;
        // Math.sqrt return double value
        return (float) Math.sqrt(x1 + y1);

    }

    public static void main(String args[]) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
}
