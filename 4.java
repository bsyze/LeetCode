#4 寻找两个正序数组的中位数

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] all=new int[nums1.length+nums2.length];
        int left1=0;
        int left2=0;
        for(int i=0;i<nums1.length+ nums2.length;i++)
        {
            if(left1>= nums1.length)
            {
                for(int j=left2;j< nums2.length;j++)
                {
                    all[i]=nums2[j];
                    i++;
                }
                break;
            }
            if(left2>= nums2.length)
            {
                for(int j=left1;j< nums1.length;j++)
                {
                    all[i]=nums1[j];
                    i++;
                }
                break;
            }
            if(nums1[left1]>=nums2[left2])
            {
                all[i]=nums2[left2];
                left2++;
            }
            else
            {
                all[i]=nums1[left1];
                left1++;
            }
        }
        if(all.length%2==1)
        {
            return all[all.length/2];
        }
        else
        {
            return (float)(all[all.length/2]+all[all.length/2-1])/2;
        }
    }
}
