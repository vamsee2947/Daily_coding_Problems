
#Given an array of integers where every integer occurs three times except for one integer,
#which only occurs once, find and return the non-duplicated integer.

def singleNumber(nums):
    return (3 * sum(set(nums)) - sum(nums)) / 2

a=[]
a= input().split(",")

for i in range(0, len(a)):
    a[i] = int(a[i])


print (int(singleNumber(a)))
