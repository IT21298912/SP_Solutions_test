import java.util.ArrayList;
import java.util.List;

public class problem1 {
    public static void main(String[] args) {

        problem1 p1 = new problem1();
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(9);

        int length = nums.size();

        int res = p1.sumWhileLoop(nums,length);
        int res2 = p1.sumForLoop(nums,length);
        int res3 = p1.sumListRec(nums,length);

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }


    public int sumForLoop(List<Integer> num,int len){

        int res = 0;

        for(int i = 0;i<len;i++){
            res= res+ num.get(i);
        }

        return res;
    }

    public int sumWhileLoop(List<Integer> num,int len){
        int res = 0;
        int i = 0;

        while (i<len){
            res= res+ num.get(i);
            i++;
        }

        return res;
    }

    public  int sumListRec(List<Integer> list, int n) {
        if (n <= 0) {
            return 0;
        }

        return list.get(n - 1) + sumListRec(list, n - 1);
    }


    public problem1() {
    }
}
