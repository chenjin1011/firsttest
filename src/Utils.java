import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: chenjin
 * Date: 13-5-27
 * Time: 下午10:17
 * To change this template use File | Settings | File Templates.
 */
public class Utils {
    public static List<Integer> generateRandomIntegerList(int nums){
        List<Integer> sourceList = new ArrayList<Integer>();
        for(int i=0;i<nums;i++){
            sourceList.add(new Random().nextInt(5*nums));
        }
        return sourceList;
    }

    public static void dumpIntegerList(List<Integer> sourceList){
        for(Integer elem:sourceList){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
