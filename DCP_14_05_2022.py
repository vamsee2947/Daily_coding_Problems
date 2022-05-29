#The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.


def powerset(s):
    n=len(s)
    pow_set_size = 2**n
    count = 0;
    j = 0;
    for count in range(0, pow_set_size):
        for j in range(0, n):

            if((count & (1 << j)) > 0):
                print(s[j], end = "");
        print("");

arr = [ ]
arr=input()
arr= arr.split()
n=len(arr)

powerset(arr);
