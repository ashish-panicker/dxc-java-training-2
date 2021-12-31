package javademos;

public class Arrays {

    public static void main(String[] args) {

        String[] availableColors = new String[5];

        availableColors[0] = "Red";
        availableColors[1] = "Green";
        availableColors[2] = "Blue";
        availableColors[3] = "Yellow";
        availableColors[4] = "Pink";

        System.out.println(availableColors[4]);

        System.out.println(availableColors.length);

        for (int index = 0; index < availableColors.length; index++) {
            System.out.println(availableColors[index]);
        }
        for (String color : availableColors) {
            System.out.println(color);

        }

        String[] favourites = {"Sports", "Music", "Movies"};
        for (String fav : favourites) {
            System.out.println(fav);
        }

        int[][] scores = new int[3][];

        scores[0] = new int[5];
        scores[1] = new int[4];
        scores[2] = new int[3];
    }

}
