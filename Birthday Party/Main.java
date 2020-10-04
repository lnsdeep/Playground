n = int(input())
l = []
for i in range(n):
  l.append(int(input()))
series = [1,6]
for j in range(2,max(l)):
  series.append(((series[j-1]+2)*2)-series[j-2])
for i in l:
  print(series[i-1])