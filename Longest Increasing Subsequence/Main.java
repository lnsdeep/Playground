n = int(input())
l = list(map(int,input().split()))
count = []
for i in range(n):
  m = l[i]
  c = 1
  for j in range(i+1,n):
    if(l[j]>m):
      c+=1
      m=l[j]
  count.append(c)
print(max(count))