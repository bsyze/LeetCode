#9 回文数
//两种解法。 
public boolean isPalindrome(int x) {
    StringBuffer stringBuffer1=new StringBuffer(x+"");
    StringBuffer stringBuffer2=new StringBuffer(x+"");
    if(stringBuffer1.reverse().toString().equals(stringBuffer2.toString()))
        return true;
    else
        return false;
}
public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int y=x;
        int result=0;
        while(x%10!=0||x/10!=0)
        {
            int m=x%10;
            x=x/10;
            result=10*result+m;
        }
        if(result!=y)
            return false;
        else
            return true;

    }
