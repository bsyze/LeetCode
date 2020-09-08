#3 无重复字符的最长子串

//做法一：较为笨重
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet set=new HashSet();
        Queue<String> queue=new LinkedList<>();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            String c= String.valueOf(s.charAt(i));
            if(set.contains(c))
            {
                while(queue.peek()!=null)
                {
                    String t=queue.poll();
                    if(!t.equals(c))
                    {
                        set.remove(t);
                    }
                    else
                    {
                        break;
                    }
                }
                set.add(c);
                queue.offer(c);
                if(queue.size()>max)
                    max=queue.size();
            }
            else
            {
                set.add(c);
                queue.offer(c);
                if(queue.size()>max)
                    max=queue.size();
            }
        }
        return max;
    }
}

//做法二：简单快捷，由于题目只要求了最长的长度，并未要求最长长度的字符串，所以无需像方法一一样维持一个队列，只需要操作游标即可。方法二用了hashmap存每个字符位置。left控制左游标，res输出结果。
//原文章https://www.cnblogs.com/ariel-dreamland/p/8668286.html
