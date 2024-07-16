package String_ques;

import java.util.Stack;

public class LEETCODE {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
           ch = s.charAt(i);
           if(ch == '('){
               if(!stack.isEmpty()){
                   sb.append(ch);
               }
               stack.push(ch);
           }
           else{
               stack.pop();
               if(!stack.isEmpty()){
                   sb.append(ch);
               }
           }
        }
        return sb.toString();
    }

    public String largestOddNumber(String num) {
        int i = num.length()-1;
        int ans = 0;
        int max = 0;
        for (int j = i; j >0; j--) {
            ans += num.charAt(j) - '0';
            if(ans%2 == 1){
                max = Math.max(ans,max);
            }
            ans= ans *10;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max);
        return sb.toString();
    }
}
