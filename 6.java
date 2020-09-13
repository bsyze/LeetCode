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

//大佬的做法 c++
//两者核心差别在于，上面的我想复杂了，s在读入的时候是有顺序的，这个顺序没有好好利用，反而去求二维数组的精确位置。其实可以向左压缩，左对齐，不要被所谓的z字形骗了。所以大佬用的是vector来存储。
//在余数相等的一组，按照s读入的先后并入该组，不需要z字形，有先后顺序就够了。对于大佬的做法，我觉得是不是可以取2*(n-1)作为除数和取模的值，这样不用分奇偶，只需要判断超过numrows-1这个数
//同样的超过也改为逆序，可能相比奇偶感觉好理解。
class Solution {
public:
    string convert(string s, int numRows) {
        vector<string> temp(numRows);
        string res;
        if(s.empty() || numRows < 1) return res;
        if(numRows == 1) return s;
        for(int i = 0; i < s.size(); i++){
            int ans = i / (numRows-1);
            int cur = i % (numRows-1);
            if(ans % 2 == 0){  //结果为偶数或0
                temp[cur].push_back(s[i]); //按余数正序保存
            }
            if(ans % 2 != 0){  //结果为奇数
                temp[numRows-cur-1].push_back(s[i]); //按余数倒序保存
            }
        }
       for(int i = 0; i < temp.size(); i++){
               res += temp[i];
        }
        return res;
    }
};
