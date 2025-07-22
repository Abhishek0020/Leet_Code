
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1=='('||ch1=='{'||ch1=='[')
            {
               stack.push(ch1);
            }
            else if(ch1==')'|| ch1=='}'|| ch1==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char ch2=stack.pop();
                if(!Pair(ch2,ch1)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean Pair(char ch1,char ch2){
        return (ch1=='(' && ch2==')')||(ch1=='{' && ch2=='}')||(ch1=='[' && ch2==']');
    }
}