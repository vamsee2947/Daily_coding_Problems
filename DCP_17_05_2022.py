def singleNumber(nums):
    return (3 * sum(set(nums)) - sum(nums)) / 2

a=[]
a= input().split(",")

for i in range(0, len(a)):
    a[i] = int(a[i])


print (int(singleNumber(a)))
