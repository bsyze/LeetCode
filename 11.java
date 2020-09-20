11. 盛最多水的容器
//我的渣渣俩for
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(height[j]>=height[i])
                {
                    int temps=(i-j)*height[i];
                    if(temps>max)
                        max=temps;
                    break;
                }
            }
            for(int j=height.length-1;j>i;j--)
            {
                if(height[j]>=height[i])
                {
                    int temps=(j-i)*height[i];
                    if(temps>max)
                        max=temps;
                    break;
                }
            }
        }
        return max;

    }
}
//官方的双指针
public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }
}


作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/container-with-most-water/solution/sheng-zui-duo-shui-de-rong-qi-by-leetcode-solution/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
