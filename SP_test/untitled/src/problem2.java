import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem2 {
    public problem2() {
    }

    public static void main(String[] args) {
        List<String> outlist =  new ArrayList<>();
        List<String> list1 =  new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        list2.add("1");
        list2.add("2");
        list2.add("3");
        problem2 p2 = new problem2();
        outlist = p2.shuffleLists(list1,list2);

        for(int i=0;i<outlist.size();i++){
            System.out.println(outlist.get(i));
        }

    }

//    public List<String> shuffle(List<String> list1,List<String> list2){
//        List<String> outlist = new ArrayList<>();
//
//        for(int i;i)
//
//        return outlist;
//
//
//    }

    public  List<String> shuffleLists(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }
        return result;
    }
}
