package org.jfg.drills.ch05.recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int [] a = new int[] {2, 8, 34, 78, 90, 120, 170, 200, 230};
        int target = 200;

        System.out.format("Is %d found in array? A: %b\n",
                target, binarySearch(a, target, 0,a.length-1));

        target = 400;
        System.out.format("Is %d found in array? A: %b\n",
                target, binarySearch(a, target, 0,a.length-1));

        target = 2;
        System.out.format("Is %d found in array? A: %b\n",
                target, binarySearch(a, target, 0,a.length-1));

        target = 230;
        System.out.format("Is %d found in array? A: %b\n",
                target, binarySearch(a, target, 0,a.length-1));

        target = 90;
        System.out.format("Is %d found in array? A: %b\n",
                target, binarySearch(a, target, 0,a.length-1));

        target = -7;
        System.out.format("Is %d found in array? A: %b\n",
                target, binarySearch(a, target, 0,a.length-1));
    }

    public static boolean binarySearch(int[] data, int target, int lowIndex, int highIndex) {
        if (lowIndex > highIndex)
            return false;

        int mid = (lowIndex + highIndex)/2;

        if (target == data[mid])
            return true;

        if (target < data[mid])
            return binarySearch(data, target, lowIndex, mid - 1);
        else
            return binarySearch(data, target, mid + 1, highIndex);
    }

}
