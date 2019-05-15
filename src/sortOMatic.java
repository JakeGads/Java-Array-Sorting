// package Working.sorter;

public class sortOMatic {

  private final int bubbleMax = 25;
  private final int selectionMax = 50;

  /**
   * Sorts an array listing it out in ascending order
   *
   * @param arr - an array of unsorted vales
   * @return The sorted array
   */
  public int[] sortAscending(int arr[]) {
    if (arr.length < bubbleMax) arr = bubbleAscending(arr);
    else if (arr.length < selectionMax) arr = selectionAscending(arr);
    else arr = injectionAscending(arr);
    return arr;
  }
  /**
   * Sorts an array listing it out in ascending order
   *
   * @param arr - an array of unsorted vales
   * @return The sorted array
   */
  public double[] sortAscending(double arr[]) {
    if (arr.length < bubbleMax) arr = bubbleAscending(arr);
    else if (arr.length < selectionMax) arr = selectionAscending(arr);
    else arr = injectionAscending(arr);
    return arr;
  }
  /**
   * Sorts an array listing it out in ascending order
   *
   * @param arr - an array of unsorted vales
   * @return The sorted array
   */
  public float[] sortAscending(float arr[]) {
    if (arr.length < bubbleMax) arr = bubbleAscending(arr);
    else if (arr.length < selectionMax) arr = selectionAscending(arr);
    else arr = injectionAscending(arr);
    return arr;
  }
  /**
   * Sorts an array listing it out in ascending order
   *
   * @param arr - an array of unsorted vales
   * @return The sorted array
   */
  public char[] sortAscending(char arr[]) {
    if (arr.length < bubbleMax) arr = bubbleAscending(arr);
    else if (arr.length < selectionMax) arr = selectionAscending(arr);
    else arr = injectionAscending(arr);
    return arr;
  }

  /**
   * Sorts an array listing it out in descending order
   *
   * @param arr - an array of unsorted values
   * @return the sorted array
   */
  public int[] sortD(int arr[]) {
    if (arr.length < bubbleMax) arr = bubbleDescending(arr);
    else if (arr.length < selectionMax) arr = selectionDescending(arr);
    else arr = injectionDescending(arr);
    return arr;
  }
  /**
   * Sorts an array listing it out in descending order
   *
   * @param arr - an array of unsorted values
   * @return the sorted array
   */
  public double[] sortD(double arr[]) {
    if (arr.length < bubbleMax) arr = bubbleDescending(arr);
    else if (arr.length < selectionMax) arr = selectionDescending(arr);
    else arr = injectionDescending(arr);
    return arr;
  }
  /**
   * Sorts an array listing it out in descending order
   *
   * @param arr - an array of unsorted values
   * @return the sorted array
   */
  public float[] sortD(float arr[]) {
    if (arr.length < bubbleMax) arr = bubbleDescending(arr);
    else if (arr.length < selectionMax) arr = selectionDescending(arr);
    else arr = injectionDescending(arr);
    return arr;
  }
  /**
   * Sorts an array listing it out in descending order
   *
   * @param arr - an array of unsorted values
   * @return the sorted array
   */
  public char[] sortD(char arr[]) {
    if (arr.length < bubbleMax) arr = bubbleDescending(arr);
    else if (arr.length < selectionMax) arr = selectionDescending(arr);
    else arr = injectionDescending(arr);
    return arr;
  }

  /**
   * Sorts the array using a bubble sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public int[] bubbleAscending(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (arr[j] > arr[j + 1]) {
          // swap temp and arr[i]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }
  /**
   * Sorts the array using a bubble sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public double[] bubbleAscending(double arr[]) {

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (arr[j] > arr[j + 1]) {
          // swap temp and arr[i]
          double temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }
  /**
   * Sorts the array using a bubble sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public float[] bubbleAscending(float arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (arr[j] > arr[j + 1]) {
          // swap temp and arr[i]
          float temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }
  /**
   * Sorts the array using a bubble sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public char[] bubbleAscending(char arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (Character.toLowerCase(arr[j]) > Character.toLowerCase(arr[j + 1])) {
          // swap temp and arr[i]
          char temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }

  /**
   * Sorts the array using a bubble sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public int[] bubbleDescending(int arr[]) {

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (arr[j] < arr[j + 1]) {
          // swap temp and arr[i]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }
  /**
   * Sorts the array using a bubble sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public double[] bubbleDescending(double arr[]) {

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (arr[j] < arr[j + 1]) {
          // swap temp and arr[i]
          double temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }
  /**
   * Sorts the array using a bubble sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public float[] bubbleDescending(float arr[]) {

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (arr[j] < arr[j + 1]) {
          // swap temp and arr[i]
          float temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }
  /**
   * Sorts the array using a bubble sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public char[] bubbleDescending(char arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++)
        if (Character.toLowerCase(arr[j]) < Character.toLowerCase(arr[j + 1])) {
          // swap temp and arr[i]
          char temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    }
    return arr;
  }

  /**
   * Sorts the array using a selection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public int[] selectionAscending(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) if (arr[j] > arr[index]) index = j;

      int smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }
  /**
   * Sorts the array using a selection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public double[] selectionAscending(double[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) if (arr[j] < arr[index]) index = j;

      double smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }
  /**
   * Sorts the array using a selection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public float[] selectionAscending(float[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) if (arr[j] < arr[index]) index = j;

      float smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }
  /**
   * Sorts the array using a selection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public char[] selectionAscending(char[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++)
        if (Character.toLowerCase(arr[j]) < Character.toLowerCase(arr[index])) index = j;

      char smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }

  /**
   * Sorts the array using a selection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public int[] selectionDescending(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) if (arr[j] > arr[index]) index = j;

      int smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }
  /**
   * Sorts the array using a selection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public double[] selectionDescending(double[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) if (arr[j] > arr[index]) index = j;

      double smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }
  /**
   * Sorts the array using a selection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public float[] selectionDescending(float[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) if (arr[j] > arr[index]) index = j;

      float smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }
  /**
   * Sorts the array using a selection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public char[] selectionDescending(char[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++)
        if (Character.toLowerCase(arr[j]) > Character.toLowerCase(arr[index])) index = j;

      char smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    return arr;
  }

  /**
   * Sorts the array using a injection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public int[] injectionAscending(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      int key = arr[i];
      int j = i - 1;

      /* Move elements of arr[0..i-1], that are
      greater than key, to one position ahead
      of their current position */
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }
  /**
   * Sorts the array using a injection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public double[] injectionAscending(double[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      double key = arr[i];
      int j = i - 1;

      /* Move elements of arr[0..i-1], that are
      greater than key, to one position ahead
      of their current position */
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }
  /**
   * Sorts the array using a injection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public float[] injectionAscending(float[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      float key = arr[i];
      int j = i - 1;

      /* Move elements of arr[0..i-1], that are
      greater than key, to one position ahead
      of their current position */
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }
  /**
   * Sorts the array using a injection sort, will list it in ascending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public char[] injectionAscending(char[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      char key = arr[i];
      int j = i - 1;

      /* Move elements of arr[0..i-1], that are
      greater than key, to one position ahead
      of their current position */
      while (j >= 0 && Character.toLowerCase(arr[j]) > Character.toLowerCase(key)) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }

  /**
   * Sorts the array using a injection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public int[] injectionDescending(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] < key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }
  /**
   * Sorts the array using a injection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public double[] injectionDescending(double[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      double key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] < key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }
  /**
   * Sorts the array using a injection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public float[] injectionDescending(float[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      float key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] < key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }
  /**
   * Sorts the array using a injection sort, will list it in descending order
   *
   * @param arr the array
   * @return the sorted array
   */
  public char[] injectionDescending(char[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      char key = arr[i];
      int j = i - 1;
      while (j >= 0 && Character.toLowerCase(arr[j]) < Character.toLowerCase(key)) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }

  public String printStringArray(int[] arr) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + ", ";
    }
    return aLongString;
  }
  public String printStringArray(double[] arr) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + ", ";
    }
    return aLongString;
  }
  public String printStringArray(float[] arr) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + ", ";
    }
    return aLongString;
  }
  public String printStringArray(char[] arr) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + ", ";
    }
    return aLongString;
  }
  public String printStringArray(int[] arr, String n) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + n;
    }
    return aLongString;
  }
  public String printStringArray(double[] arr, String n) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + n;
    }
    return aLongString;
  }
  public String printStringArray(float[] arr, String n) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + n;
    }
    return aLongString;
  }
  public String printStringArray(char[] arr, String n) {
    String aLongString = "";
    for (int i = 0; i < arr.length; i++) {
      aLongString += arr[i] + n;
    }
    return aLongString;
  }
}
