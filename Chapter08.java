class Chapter08 {
  public static void main(String[] args) {
    int num = 1;
    while (num < 5) {
      System.out.println(num);
      num++;
    }

    int[] array = {4, 3, 2, 1};
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        continue;
      }
      System.out.println(array[i]);
    }
  }
}
