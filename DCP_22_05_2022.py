import random
def rand7():
    i= rand5()
    j= rand5()
    arr = [[0]*5]*5
    arr = [
        [ 1, 2, 3, 4, 5 ],
        [ 6, 7, 1, 2, 3 ],
        [ 4, 5, 6, 7, 1 ],
        [ 2, 3, 4, 5, 6 ],
        [ 7, 0, 0, 0, 0 ]
    ]
    a= arr[i-1][j-1]
    if a==0:
        a= rand7()
    return a
    
def rand5():
    return random.randint(1,5)
    

print(rand7())
