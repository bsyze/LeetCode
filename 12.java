12. 整数转罗马数字
//渣渣的if判断
class Solution {
    public String intToRoman(int num) {
        StringBuffer stringBuffer=new StringBuffer();
        int m=num/1000;
        num=num-m*1000;
        for(int i=0;i<m;i++)
            stringBuffer.append("M");
        if(num>=900)
        {
            stringBuffer.append("CM");
            num=num-900;
        }
        else
        {
            int d=num/500;
            num=num-d*500;
            for(int i=0;i<d;i++)
                stringBuffer.append("D");
        }
        if(num>=400)
        {
            stringBuffer.append("CD");
            num=num-400;
        }
        else
        {
            int c=num/100;
            num=num-c*100;
            for(int i=0;i<c;i++)
            {
                stringBuffer.append("C");
            }
        }
        if(num>=90)
        {
            stringBuffer.append("XC");
            num=num-90;
        }
        else
        {
            int l=num/50;
            num=num-l*50;
            for(int i=0;i<l;i++)
                stringBuffer.append("L");
        }
        if(num>=40)
        {
            stringBuffer.append("XL");
            num=num-40;
        }
        else
        {
            int x=num/10;
            num=num-x*10;
            for(int i=0;i<x;i++)
            {
                stringBuffer.append("X");
            }
        }
        if(num>=9)
        {
            stringBuffer.append("IX");
            num=num-9;
        }
        else
        {
            int v=num/5;
            num=num-v*5;
            for(int i=0;i<v;i++)
                stringBuffer.append("V");
        }
        if(num>=4)
        {
            stringBuffer.append("IV");
            num=num-4;
        }
        else
        {
            for(int i=0;i<num;i++)
            {
                stringBuffer.append("I");
            }
        }
        return stringBuffer.toString();
    }
}
