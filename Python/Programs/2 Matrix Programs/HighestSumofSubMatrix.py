num = list(map(int,input().split(',')))
mx_mat = []
l = len(num)

for i in range(2,l):
    if i*i <= l:
        mx_mat.append(i)

mx_mat = sorted(mx_mat,reverse=True)

mat = []
maximum = 0

for i in mx_mat:
    sub = []
    for j in range(0,l,i):
        temp_mat = num[j:j+(i*i)]
        if len(temp_mat)==(i*i):
            res = sum(temp_mat)
            mat.append([res,temp_mat])
            if res>maximum:
                maximum=res

for val in mat:
    m1 = val[0]
    m2 = val[1]
    if m1 == maximum:
        i = 0
        for v in mx_mat:
            if len(m2)%v==0:
                i = v

        for j in range(0,len(m2),i):
            for k in range(j,j+i):
                print(m2[k],end=' ')
            print('')
        print('')

print(mx_mat)
print(mat)
print(maximum)




'''
Take string input then form all possible mXm square matrix, 
and print the matrix with maximum sum.
In case, two or more square matrix has maximum sum then 
print largest matrix followed by next largest matrix and so on.
In case, more than one matrix has same size print in order of their occurance.
INPUT:
6,3,6,20,3,6,-15,3,3
OUTPUT:
6 3 6
20 3 6
-15 3 3
6 3
6 20
6 20
3 6
Explanation:-
6 3 6
20 3 6 -> It’s sum is 35 and is order 3*3,
-15 3 3
6 3
6 20 -> It’s sum is 35 and is order 2*2,
6 20
3 6 -> It’s sum is 35 and is order 2*2,
Now , 3*3 is printed first because it’s has the highest order,
and the 2*2 order matrix must be printed in sequence,
which comes first in the given input (must) and
there should be no extra space printed anywhere
'''