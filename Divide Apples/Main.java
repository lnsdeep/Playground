n = int(input())
l = list(map(int,input().split()))
avg = int(sum(l)/n)
b = [0]
for i in range(n-1):
  b.append(b[i]+l[i]-avg)
b.sort()
m = -b[int(n/2)]
val = 0
for i in b:
  val = val + abs(i+m)
print(val)