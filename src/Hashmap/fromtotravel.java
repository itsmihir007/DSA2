package Hashmap;

import java.util.*;

public class fromtotravel {
    public static void main(String[] args) {
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("A" , "B");
        tickets.put("C", "D");
        tickets.put("E" , "A");
        tickets.put("D" , "E");
        String start = getstart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
    public static String getstart(HashMap<String, String> tickets){
        HashMap<String ,String > revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key) ,key);
        }
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> nums11 = new HashSet<>();
        Set<Integer> nums22 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int num : nums1){
            nums11.add(num);
        }
        for(int num : nums2){
            nums22.add(num);
        }

        for(int num : nums1){
            if(!nums22.contains(num)){
                list1.add(num);
            }
        }

        for(int num : nums2){
            if(!nums11.contains(num)){
                list2.add(num);
            }
        }

        ans.add(list1);
        ans.add(list2);
    return ans;
    }


    public int maxOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
}
