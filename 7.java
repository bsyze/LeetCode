#7 整数反转
class Solution {
    public int reverse(int x) {
        String temp=x+"";
        int flag=1;
        if(temp.charAt(0)=='-')
        {
            temp=temp.substring(1);
            flag=-1;
        }
        // StringBuffer stringBuffer=new StringBuffer();
        // for(int i=temp.length()-1;i>=0;i--)
        // {
        //     if(temp.charAt(i)!='0') {
        //         temp = temp.substring(0,i+1);
        //         break;
        //     }

        // }
        // stringBuffer.append(temp);
        // stringBuffer=stringBuffer.reverse();



        try {
             return Integer.parseInt(new StringBuffer(temp).reverse().toString())*flag;
        }catch(Exception e)
        {
            return 0;
        }
    }
}
