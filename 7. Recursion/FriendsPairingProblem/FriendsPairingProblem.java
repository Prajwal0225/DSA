/*
 * Friends Pairing Problem
 * Given n friends, each one can remain single or can be paired up with some other friend.Each friend can be paired only once. Find out the total number of ways in which frinds can remain single or can be paired up.
 */

public class FriendsPairingProblem {

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // choice
        // single
        int fnm1 = friendsPairing(n - 1);

        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totWays
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String args[]) {
        System.out.println(friendsPairing(3));
    }
}
