package Comparingdifferentdatastructures;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Different_DataStructures {
    public static void main(String[] args) {
        int sizes[] ={1000,10000 ,100000};
        for(int size:sizes) {
            compare(size);
        }
    }
    public static double[] compare(int size){
        Random random = new Random();
        int target = random.nextInt(size);
        int arr[] = new int[size];
        double array[] = new double[3];
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i< size;i++){
            arr[i] = random.nextInt();
            set.add(random.nextInt());
            treeSet.add(random.nextInt());
        }
        double arrStartTime =  System.nanoTime();
        searchinArray(arr , target);
        double arrEndTime = System.nanoTime();
        double arrTime = arrEndTime-arrStartTime;
        array[0] = arrTime;
        System.out.println(" The time complexity of array is "+ arrTime);
        //HashSet time Complexity
        double setStratTime = System.nanoTime();
        searchInHashSet(set , target);
        double setEndTime = System.nanoTime();
        double setTime = setEndTime-setStratTime;
        array[1] = setTime;
        System.out.println(" The time complexity of HasSet is "+ setTime);
        //Tree set time complexity
        double treeSetStartTime = System.nanoTime();
        searchInTreeSet(treeSet , target);
        double treeSetEndTime = System.nanoTime();
        double treeSetTime = treeSetEndTime-treeSetStartTime;
        array[2] = treeSetTime;
        System.out.println(" The time complexity of Tree data set is "+ treeSetTime);

        return array;
    }
    public static boolean searchinArray(int arr[] ,int target){
        boolean flag = false ;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target ){
                flag = true ;
                return flag;
            }
        }
        return flag ;

    }
    public static boolean searchInHashSet(HashSet<Integer> set , int target ){
        return set.contains((target));

    }
    public static boolean searchInTreeSet(TreeSet<Integer> treeSet , int target ){
        return treeSet.contains(target);
    }
}
