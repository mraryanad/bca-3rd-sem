// WAP to demonstrate the tower of honnoy

package labReport;

public class TowerOfHonnoy {
    public static void main(String[] args) {
        int n = 3;
        towerOfHonnoy(n, 'A', 'B', 'C');
    }

    public static void towerOfHonnoy(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHonnoy(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHonnoy(n - 1, aux, to, from);
        return;
    }
}
