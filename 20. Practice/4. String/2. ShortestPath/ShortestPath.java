//Question: Given a route containing 4 directions (E, W ,N ,S), Find the shortest path to reach destination.

//           N
//           |
//       W --  -- E
//           |
//           S

public class ShortestPath {
    public static float Dist(String str) {
        int x = 0;
        int y = 0;
        int l = str.length();

        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);

            // North
            if (ch == 'N') {
                y++;
            }
            // south
            else if (ch == 'S') {
                y--;
            }
            // west
            else if (ch == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        String str = "WNEENESENNN";
        System.out.println(Dist(str));
    }

}
