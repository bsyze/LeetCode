#8 字符串转换整数 (atoi)
    //更好的解法用正则
//0001q,+,00001,00000
    public static int myAtoi(String str) {
        if(str.isEmpty())
            return 0;
        str=str.trim();
        if(str.isEmpty())
            return 0;
        char firstc=str.charAt(0);
        int flag=1;
        if(firstc=='-') {
            str=str.substring(1);
            flag = -1;
        }
        else if(firstc=='+')
        {
            str=str.substring(1);
            flag = 1;
        }
        else if(firstc<'0'||firstc>'9')
            return 0;
        if(str.isEmpty())
            return 0;

        while(str.charAt(0)=='0') {
            str = str.substring(1);
            if(str.isEmpty())
                return 0;
        }
        if(str.charAt(0)<'0'||str.charAt(0)>'9')
            return 0;
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            char temp=str.charAt(i);
            if(temp<'0'||temp>'9')
                break;
            stringBuffer.append(temp);
        }
        String s=stringBuffer.toString();
        int max = 0x7fffffff, min = 0x80000000;//int的最大值最小值
        if(s.length()>10)
        {
            if(flag==1)
                return max;
            else
                return min;
        }
        long result=Long.parseLong(s)*flag;
        if(result>max)
            return max;
        if(result<min)
            return min;
        return (int)result;

    }
