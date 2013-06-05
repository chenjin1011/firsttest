import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: chenjin
 * Date: 13-5-27
 * Time: 下午9:19
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static void main(String[] args) {
        System.out.println("This program is my try to implement mergesort in java!");
        //1.random product some integers to sort.

        List<Integer> sourceList = Utils.generateRandomIntegerList(10);
        Utils.dumpIntegerList(sourceList);

     List sortedList =  mergeSort(sourceList);

        System.out.println("after merge sort:");
        Utils.dumpIntegerList(sortedList);
    }

    private static List<Integer> mergeSort(List<Integer> sourceList) {
        //1.divide
        int middle = sourceList.size()/2;
        System.out.println("middle = "+middle);

        System.out.println("dump sourceList in mergerSort:");
        Utils.dumpIntegerList(sourceList);

        if(middle<1){
            return sourceList;
        }else {
        List<Integer> leftList = sourceList.subList(0,middle);
        Utils.dumpIntegerList(leftList);
            leftList= mergeSort(leftList);
        List<Integer> rightList = sourceList.subList(middle,sourceList.size());
         Utils.dumpIntegerList(rightList);
            rightList = mergeSort(rightList);
          return combileTwoList(leftList,rightList);
        }


    }

    private static List<Integer> combileTwoList(List<Integer> leftList, List<Integer> rightList) {
        int length = leftList.size()+rightList.size();
        List<Integer> sumList = new ArrayList<Integer>();
        int leftIndex=0;
        int rightIndex = 0;
        while(leftIndex<leftList.size() && rightIndex<rightList.size()){
           if(leftList.get(leftIndex)<=rightList.get(rightIndex)){
             sumList.add(leftList.get(leftIndex));
               leftIndex++;
           } else {
               sumList.add(rightList.get(rightIndex));
               rightIndex++;
           }
        }

        if (leftIndex==leftList.size()){
            while(rightIndex<rightList.size()){
                sumList.add(rightList.get(rightIndex));
                rightIndex++;
            }
        }else {
            while(leftIndex<leftList.size()){
                sumList.add(leftList.get(leftIndex));
                leftIndex++;
            }
        }

        return sumList;
    }


}
