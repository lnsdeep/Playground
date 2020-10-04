from itertools import combinations
for _ in range(int(input())):
  n = int(input())
  l = list(map(int,input().split()))
  s = int(input())
  count = 0
  if(s==sum(l)):
    count+=1
  for i in range(n-1,0,-1):
    for j in combinations(l,i):
      if(sum(j)==s):
        count+=1
  print(count)