#32 最长有效括号
//动态规划
class Solution {
    public int longestValidParentheses(String s) {
        if(s.isEmpty())
            return 0;
        int max=0;
        Stack<Integer> stack=new Stack<>();
        int[]m=new int[s.length()];
        m[0]=0;
        if(s.charAt(0)=='(')
            stack.push(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                if(s.charAt(i-1)=='(')
                {
                    stack.pop();
                    m[i]=m[i-1]+2;
                }
                else
                {
                    if(stack.isEmpty())
                    {
                        m[i]=0;
                    }
                    else
                    {

                        int temp=stack.pop();
                        m[i]=m[temp]+m[i-1]+2;
                    }

                }
                if(m[i]>max)
                    max=m[i];
            }
            else
            {
                stack.push(i);
                if(s.charAt(i-1)==')')
                {
                    m[i]=m[i-1];
                }
                else
                {
                    m[i]=0;
                }

            }
        }
        return max;
    }
}
