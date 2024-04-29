package progcompetition;

import java.util.HashMap;
import java.util.Map;


public class ProgCompetition {

    
    public static void main(String[] args) {
        int v[] = {1,2,3,5};
        System.out.println(twoSums(v,4));
    }
    public static String twoSums(int[] nums, int target){
        Map<Integer,Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(mapa.containsKey(comp)){
                return ""+nums[i]+" "+nums[mapa.get(comp)];
            }
            mapa.put(nums[i],i);
            
        }
        return "não temkk";
    }
}
