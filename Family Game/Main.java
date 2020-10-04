n = int(input())
s = input()
z=n
l = []
for i in range(n):
  l.append(True)
i=0
j=0
while(n!=1):
  if(l[i]):
    if(s[j]=='y'):
      l[i]=False
      n-=1
      j+=1
    else:
      j+=1
  i+=1
  if(i>=z):
    i=0
  if(j>=len(s)):
    j=0
print(l.index(True)+1)