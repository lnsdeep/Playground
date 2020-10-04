n = int(input())
l = []
for i in range(n):
  l.append(input())
s = list(set(l))
s.sort()
#print(s)
for j in s:
  print(j,l.count(j))