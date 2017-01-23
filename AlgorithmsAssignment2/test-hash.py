import math
import random
import os
import numpy as np
import sys
from matplotlib import pyplot as plt

N = int (sys.argv[1])
m = int (sys.argv[2])
f = sys.argv[3]
fname = sys.argv[4]

if (sys.argv < 4):
    println("N m w F")
    sys.exit(0)



def h_mul(key,m,A):
    assert(0 < A <1)
    prod = (key % 1000000) * A
    frac = prod - math.floor(prod)
    return int(math.floor(m * frac))



def HASHTABLE_INSERT(T, x):
        if (f == "f1"):
            index= x*x % m
        elif (f == "f2"):
            index=h_mul(x,m,0.2)
        elif (f == "f3"):
            index=h_mul(x,m,0.618034)
        else:
            index=h_mul(x,m,0.8)

        if T[index] == None:
            T[index] = []
        T[index].append(x)


T =[None] * m
a = np.arange(m)    
collisions = []
for i in range(N):
    val = random.randint(0,sys.maxint)
    HASHTABLE_INSERT(T,val)


for i in range(len(T)):
    if T[i] == None:
        T[i] = []
    collisions.append(len(T[i]))
    print(str(i)+':'+ str(len(T[i])))


    print "longest list was:", max(collisions)


fig, draw = plt.subplots()
graph = draw.bar(a,collisions,color='r')
draw.set_xlabel('Number of slots')
draw.set_ylabel('List Length')
draw.set_title('Number of collisions vs slots with N = '+str(N) + 'm =' +str(m))
fig.savefig(fname)
plt.show()
