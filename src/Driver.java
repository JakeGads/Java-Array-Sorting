import java.util.Random;

public class Driver {
  public static void main(String[] args) {
    sortOMatic sort = new sortOMatic();
    Random rand = new Random();

    int level = rand.nextInt() % 300;
    if (level < 0) level *= -1;
    while (level == 0) level = rand.nextInt();
    if (level < 0) level *= 1;
    int[] myArray = new int[level];

    for (int i = 0; i < level; i++) {
      myArray[i] = rand.nextInt();
    }

    myArray = sort.selectionDescending(myArray);

    System.out.println(sort.printStringArray(myArray, "\n"));
  }
}
