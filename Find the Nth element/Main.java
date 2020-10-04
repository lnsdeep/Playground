n = int(input())
l = list(map(int,input().split()))
i = int(input())
try:
  print(l[i-1])
except:
  print("No node found")