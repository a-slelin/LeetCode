public class Test {
    public static void print(int[] array){
        System.out.println(array[0] + " " + array[1]);
    }

    public static void main(String[] args) {
        BadSolution bs = new BadSolution();

        print(bs.twoSum(new int[]{2,7,11,15}, 9));
        print(bs.twoSum(new int[]{3, 2, 4}, 6));
        print(bs.twoSum(new int[]{3, 3}, 6));

        Solution s = new Solution();

        print(s.twoSum(new int[]{2,7,11,15}, 9));
        print(s.twoSum(new int[]{3, 2, 4}, 6));
        print(s.twoSum(new int[]{3, 3}, 6));
    }
}
