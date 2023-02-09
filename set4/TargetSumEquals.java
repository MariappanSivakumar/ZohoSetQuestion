
package set4;

import java.util.function.Function;


public class TargetSumEquals {
    int group = 0;
    public void subset(int nums[], int index, int div, java.util.List<Integer> list){
        if(index == nums.length)
        {
            int count = 0;
            count = list.stream().filter((i) -> (i%div==0)).map(new FunctionImpl()).reduce(count, Integer::sum);
            if(count==list.size() && list.size()>1){
                System.out.println(list);
                group++;
            }
            return;
        }
        list.add(nums[index]);
        subset(nums, index+1, div, list);
        list.remove(list.size()-1);
        subset(nums, index+1, div,list);
    }
    public void init() {
        int nums[] = {3, 9, 7, 4, 6, 8};
        int div = 1;
        subset(nums, 0, div, new java.util.ArrayList());
        System.out.println("Total Group : "+group);
    }
    public static void main(String art[]) {
        new TargetSumEquals().init();
    }

    private static class FunctionImpl implements Function<Integer, Integer> {

        public FunctionImpl() {
        }

        @Override
        public Integer apply(Integer item) {
            return 1;
        }
    }
}
