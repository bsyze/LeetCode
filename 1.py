#1、两数之和
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        store={}
        l=[]
        for i in range(len(nums)):
            temp=target-nums[i]
            if temp not in store.keys():
                store[nums[i]]=i
            else:
                l.append(store[temp])
                l.append(i)
                break
        return l
