#10 正则表达式匹配
//做的很不好，一开始没使用动态规划，单纯靠if。后来参考了动态规划解题思路。
class Solution {
    public static boolean isMatch(String s, String p) {
        boolean [][]f=new boolean[s.length()+1][p.length()+1];
        f[0][0]=true;
        for(int i=0;i<s.length()+1;i++)
        {
            for(int j=1;j<p.length()+1;j++)
            {
                char temp=p.charAt(j-1);
                if(temp=='*')
                {
                    if(i!=0&&(s.charAt(i-1)==p.charAt(j-1-1)||p.charAt(j-1-1)=='.'))
                    {
                        f[i][j]=f[i][j-2]||f[i-1][j];
                    }
                    else
                    {
                        f[i][j]=f[i][j-2];
                    }
                }
                else
                {
                    if(i!=0&&(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.'))
                    {
                        f[i][j]=f[i-1][j-1];
                    }

                }

            }
        }
        return f[s.length()][p.length()];

    }
}
