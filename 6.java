#6 Z字形变换
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        int len=0;
        int pp=numRows-1;
        int p=2*pp;

        if(s.length()%p==0)
        {
            len=s.length()/p*pp;
        }
        else
        {
            len=(s.length()/numRows+1)*pp;
        }
        String[][] all=new String[numRows][len];
        for(int i=0;i<numRows;i++)
        {
            for (int j=0;j<len;j++)
            {
                all[i][j]="";
            }
        }

        for(int i=0;i<s.length();i++)
        {
            String temp=s.charAt(i)+"";
            int c=i/p;
            int m=i%p;
            if(m<numRows)
            {
                all[m][c*pp]=temp;
            }
            else
            {
                int t=m-numRows+1;
                all[pp-t][c*pp+t]=temp;
            }

        }
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<numRows;i++)
        {
            for (int j=0;j<len;j++)
            {
                if(!all[i][j].isEmpty()&&!all[i][j].equals(""))
                {
                    stringBuffer.append(all[i][j]);
                }
            }
        }
        return stringBuffer.toString();
    }
}
