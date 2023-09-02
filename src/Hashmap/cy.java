package Hashmap;

import java.util.*;

public class cy {

        public static void add(int []arr) {
            int n = 4; // Number of rows in the pattern
            int num = 1; // Starting number

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 0) {
                        System.out.print((num + j + (i - 1) * (n - i + 1)) + "*");
                    } else {
                        System.out.print((num + j) + "*");
                    }
                }
                num += i;
                System.out.println();
            }
        }


    int remove_duplicate(int arr[],int N){
        // code here
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[0]);
        int count = 0;
        for (int i = 1; i<arr.length; i++) {

            if(arr[i]== arr[i+1]){
                continue;
            }
            else{
               ar.add(arr[i]);
            }
        }
        return count;
    }
    //4 3 0 5 1 2
    //0 1 2 3 4 5
    //2 4 5 1 0 3
    static int findLongestConseqSubseq(int arr[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        int subseq = 1;
        int max =1 ;
        for (int i = 0; i <n; i++) {
            int curr = arr[i];
            int next = arr[i+1];
            if((next - curr)==1)
            {
                subseq++;
                if(subseq>max){
                    max = subseq;
                }
                else{
                    subseq =1;
                }
            }

        }
        return max;
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
//        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
            if(set.contains(arr[i])) {
                set.remove(arr[i]);
            }
        }

        for(int x: set)
        {
            ar.add(x);
        }
        if(ar.size() < 0){
            ar.add(-1);
        }
        return ar;
    }
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        int max = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr *= arr[i];
            max = Math.max(curr, max);
            if(max<=0){
                curr =1;
            }
        }
        return max;
    }
    public int largestAltitude(int[] gain) {

        int sum = gain[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < gain.length; i++) {
            sum+=gain[i];
            max = Math.max(sum,max);
        }
        return max;
    }

    static int sumOfNaturals(int n) {
        // code here
        if(n == 1){
            return n;
        }
        n+= sumOfNaturals(n-1);
        return n;
    }

//    public static void main(String[] args) {
//        int []arr = {4,3,0,5,1,2};
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i],i);
//        }
//        for(int key : map.keySet()){
//            arr[key] = map.get(key);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
    public static int[] syed(int []arr ,int start , int end){
            int count = 0;
            ArrayList<Integer> aar = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >=start && arr[i]<end){
                    aar.add(arr[i]);
                    count++;
                }
            }
            int[] newarr = new int[100];
        for (int i = 0; i < aar.size(); i++) {
            newarr[i] =aar.get(i);
        }

        return newarr;

    }
    public static int[] fun(int []inputDist,int start,int end){

        List<Integer> l = new ArrayList<>();

        for(int i=0;i<inputDist.length;i++){

            if(inputDist[i]<=end && inputDist[i]>=start){
                l.add(inputDist[i]);
            }


        }
        int n = l.size();
        int answer[] = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = l.get(i);
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(answer[i]);
        // }
        return answer;
    }

    public static void main(String[] args) {
            int []arr = {29,38,12,48,39,55};
            int start = 30;
            int end = 50;
        System.out.println(syed(arr,start,end));
        System.out.println(findsecre(3,1000000007,4));
    }
    public static int findsecre(int secretCode, int firstKey, int secondKey){
            int q = (int)
            Math.pow(secretCode, firstKey);
            int w = q%10;
            int e = (int)Math.pow(w,secondKey);
            int res = e%1000000007;
            return res;
//        long q = secondKey;
//        double x = Math.pow(secretCode,firstKey);
//        double y = x%10;
//        double z = Math.pow(y,secondKey);
//        int ans = (int) (z%1000000007);
//        return ans;
//        long q = secondKey;
//        double x = Math.pow(secretCode, firstKey);
//        double y = x % 10;
//        double z = Math.pow(y, secondKey);
//        int ans = (int) (z % 1000000007);
//        return ans;
    }
    public static int[] mq(int [][] salesRecord){
            int n = salesRecord.length;
            int m = salesRecord[0].length;
            int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if(salesRecord[i][j]>max){
                    max = salesRecord[i][j];
                }
            }
            arr[i] = max;
            max = 0;
        }
        return arr;
    }

}


