package Leetcode;
import javax.print.CancelablePrintJob;
import java.util.*;
public class practicess {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long sum = (long) nums[i] + nums[j];
                        sum += nums[k];
                        sum += nums[l];
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> arr = new ArrayList<>(set);
        return arr;
    }

    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            maps.put(nums[i], maps.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static List<Integer> majorityElementt(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 3;
        List<Integer> l = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n) {
                l.add(nums[i]);
                count = 0;
            }
        }
        return l;
    }



    public static StringBuilder frequencySort(String s) {
        TreeMap<Character, Integer> maps = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            maps.put(ch, maps.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
        }

        for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
            sb.append(entry.getKey());
        }
        return sb;
    }

    public static int findK(int matrix[][], int n, int m, int k)
    {
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        int []arr = new int[list.size()];
        for(int i = 0; i < r*c ; i++){
            arr[i] = list.get(i);
        }
        return arr[k-1];
    }

//    public static void main(String[] args) {
//        //int [][]matrix = {{-3,-2,0,-6},{-7,-4,-2,0},{-4,0,-1,-7},{-7,-3,-9,-8},{-8,6,0,-8},{1,5,9,7}};
//        int [][] matrix = {{3,3,4},{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(findK(matrix,4,3,5));
//    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                arr.add(stack.pop());
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] =  arr.contains(nums1[i])?arr.get(nums1[i]):-1;
        }
        return nums1;
    }
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        // your code goes here
//        Scanner x = new Scanner(System.in);
//        int t = x.nextInt();
//        // int count = 0;
//        while(t-->0){
//            int count = 0;
//            String y = x.next();
//            char []ch = y.toCharArray();
//            Arrays.sort(ch);
//            for(int i = 1 ; i < ch.length; i++){
//                if(ch[i]==ch[i-1]){
//                    count++;
//                }
//            }
//            if(count >=1){
//                System.out.println("YES");
//                if(count == 0){
//                                System.out.println("NO");
//                            }
//            }
//            else {
//                 if(count == 0){
//                                System.out.println("NO");
//                            }
//            }
//        }
//    }
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int store[] = new int[map.size()];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            store[i++] = entry.getValue();
        }
        Arrays.sort(store);
        for (int j = 1; j < store.length; j++) {
            if(store[j-1] != store[j]){
                continue;
            }
            else{
                return false;
            }
        }

        return true;
    }
    public static int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> maps = new HashMap<>();
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            if(maps.containsKey(x-difference)){
                max++;
            }
            else{
                maps.put(x,1);
            }
            max = Math.max(maps.get(x),max);
        }
        return max;
    }
    public static Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int start = 0;
        int end = sizeOfStack;
        int mid = end - (end - start)/2;
        int i = 0;
        ArrayList<Integer> arr =  new ArrayList<>(mid);
        while( i != mid-1){
            arr.add(s.pop());
            i++;
        }
        s.pop();
        int x = i-1;
        while(s.size() !=end-1){
            s.push(arr.get(x));
            x--;
        }

       // System.out.println(arr);
        return s;
    }


    public static int[] se(int []arr , int k){
        int n = arr.length;
        int len1 = k ; int len2 =n-k;
        int []arr1 = new int[100];
        int []arr2 = new int[100];

        for (int i = 0; i < k; i++)
            arr1[i] = arr[i];


        for (int i = k; i < n; i++)
            arr2[i - k] = arr[i];


        Arrays.sort(arr1, 0, k);


        Arrays.sort(arr2, 0, n - k);


        for (int i = 0; i < n; i++) {
            if (i < k)
                arr[i] = arr1[i];

            else {
                arr[i] = arr2[len2 - 1];
                len2--;
            }
        }
        return arr;
    }
    public static int findSecretCode(int s , int firstkey, int secondkey){
        firstkey = firstkey%1000000007;
        s = s%1000000007;
        secondkey = secondkey%1000000007;
        double x = Math.pow(s,firstkey);
        //x = x%1000000007;
        double y = x%10;
       // y = y%1000000007;
        double z = Math.pow(y,secondkey);
        z = z%1000000007;
        int ans = (int) (z%1000000007);
        return ans;
        }
       public static int fuc(int [] server){
        int sum = 0;
        for(int i = 0; i <server.length; i= i+2){
            sum+= server[i];
        }
        return sum;
       }
    public static int[] calculateMaxFootsteps(int fatherPos, int martinPos, int velFather, int steps) {
        int maxFootsteps = 0;
        int maxVelocity = 0;

        for (int v2 = velFather; v2 >= 1; v2--) {
            int f = martinPos / v2 + 1;
            int martinEndPos = martinPos + v2 * steps;

            if (martinEndPos > fatherPos) {
                f -= (martinEndPos - fatherPos) / velFather;
            }

            if (f >= maxFootsteps) {
                maxFootsteps = f;
                maxVelocity = v2;
            }


        }
        int x[] = new int[2];
        x[0] = maxFootsteps;
        x[1] = maxVelocity;


        return x;
    }

    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> stack = new Stack<>();
        while(q.isEmpty()){
            stack.push(q.remove());
        }
        while(stack.isEmpty()){
            q.add(stack.pop());
        }
        return q;
    }
   public static int[] asc(int []arr, int k){
        int n = arr.length;
       int []arr1 = new int[100];
       int []arr2 = new int[100];
       int len1 = k ; int len2 =n-k;
       for (int i = 0; i < k; i++)
           arr1[i] = arr[i];


       for (int i = k; i < n; i++)
           arr2[i - k] = arr[i];


       Arrays.sort(arr1, 0, k);


       Arrays.sort(arr2, 0, n - k);


       for (int i = 0; i < n; i++) {
           if (i < k)
               arr[i] = arr1[i];

           else {
               arr[i] = arr2[len2 - 1];
               len2--;
           }
       }
       return arr;
   }
    public static int  countChar(String data, char coder)    {
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if(ch == coder){
                count++;
            }
        }
        return count;
    }
    public static int [] count(int [][] arr){
        int row = arr.length;
        int col = arr[0].length;
       ArrayList<Integer> al = new ArrayList<>();
       int x = 0;
       int max = 0;
       int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < col; j++) {
               if(x<=col){
                   if(arr[i][j] >max){
                       max = arr[i][j];
                   }
               }
               al.add(max);
               max = 0;
               x=0;

            }
        }
        int arrr[] = new int[row];
        for (int i = 0; i < row; i++) {
            arrr[i]= al.get(i);
        }
        return arrr;
    }

    public static void main(String[] args) {
        int [][]arr = {{100,198,333,323},{122,232,221,111},{223,565,245,764}};
        System.out.println(count(arr));
    }
    public String FirstNonRepeating(String s)
    {
        // code here
      StringBuilder str = new StringBuilder();
      int x = 0;
      int y = 0;
      
       while(x<s.length()){
            while(s.charAt(x) == s.charAt(x+1)){
                x++;
            }
            str.append("#").charAt(x);
            break;
       }
        return str.toString();
      }
}


