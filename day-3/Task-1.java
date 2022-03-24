
public class Main {

    public static void main(String[] args) {

        int[][] multipication = new int[10][10];

        for (int i = 0; i < multipication.length; i++) {
            for (int j = 0; j < multipication[i].length; j++) {
                multipication[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < multipication.length; i++) {
            for (int j = 0; j < multipication[i].length; j++) {
                System.out.println( (i + 1) + " * " + (j + 1) + " = " + multipication[i][j]);
            }
        }

    }
}

