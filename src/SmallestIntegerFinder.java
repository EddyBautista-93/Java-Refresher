public class SmallestIntegerFinder {

//    Given an array of integers your solution should find the smallest integer.
//
//    For example:
//
//    Given [34, 15, 88, 2] your solution will return 2
//    Given [34, -345, -1, 100] your solution will return -345
//    You can assume, for the purpose of this kata, that the supplied array will not be empty.

    public static int findSmallestInt(int[] args) {
        int temp;
        int size = args.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (args[i] > args[j]) {
                    if (args[i] > args[j]) {
                        temp = args[i];
                        args[i] = args[j];
                        args[j] = temp;
                    }
                }
            }

        }
        return args[0];
    }


}
