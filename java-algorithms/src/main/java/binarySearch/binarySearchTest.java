package binarySearch;

/**
 * Created by liuhang on 2016/10/28.
 */
public class binarySearchTest {
    public static void main(String[]args){
        int array1[]=new int[]{1,2,2,3,4,6,6,6,7,13,17};
        int array2[]=new int[]{2,2};
        binarySearchSolution s1=new binarySearchSolution();
        System.out.println(s1.lowerBound(array1,6));
        System.out.println(s1.upperBound(array1,6));
        System.out.println(s1.upperBound(array2,2));
        System.out.println(s1.lowerBound(array2,2));

    }
}
