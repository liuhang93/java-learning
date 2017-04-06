package interview;

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[]arr = new int[3];
        for(int i =0;i<3; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int out = 0;
        int max = (int)Math.pow(2,k)-1;
        int min = 1;
        int root = (1+max)/2;

        while(true){
            if(arr[0]>root){
                min = root+1;
                root = (min+max)/2;
            }else if(arr[2]<root){
                max = root-1;
                root = (min+max)/2;
            }else{
                break;
            }
        }
        System.out.println(root);
    }
}
