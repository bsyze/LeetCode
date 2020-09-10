#5 最长回文子串
class Solution {
    public String longestPalindrome(String s) {
        Stack<String> stack=new Stack<>();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i)+"");
        }
        while(!stack.empty())
        {
            stringBuffer.append(stack.pop());
        }
        String t=stringBuffer.toString();
        int size=s.length();
        int [][]length=new int[size][size];
        int max=0;
        int pos=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    if(i==0||j==0)
                    {
                        length[i][j]=1;
                    }
                    else
                    {
                        length[i][j]=length[i-1][j-1]+1;
                    }
                    if(length[i][j]>max)
                    {
                        int judge=size-(j+1-length[i][j]);//aacdecaa
                        if(judge==(i+1)) {
                            max = length[i][j];
                            pos = i;
                        }
                    }
                }
            }
        }
        StringBuffer f=new StringBuffer();
        for(int i=pos+1-max;i<=pos;i++)
        {
            f.append(s.charAt(i));
        }

        return f.toString();
    }
}
