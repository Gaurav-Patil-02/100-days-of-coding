public class FindTheK_thCharacterInStringGame_II {
    public static char kthCharacter(long k, int[] operations) {
    final int operationsCount = (int) Math.ceil(Math.log(k) / Math.log(2));
    int increases = 0;

    for (int i = operationsCount - 1; i >= 0; --i) {
      final long halfSize = 1L << i;
      if (k > halfSize) {
        k -= halfSize; // Move k from the right half to the left half.
        increases += operations[i];
      }
    }

    return (char) ('a' + increases % 26);
  }

  public static void main(String[] args) {
    int k = 5, operations[] = {0,0,0};
    System.out.println(kthCharacter(k, operations));

  }
}
