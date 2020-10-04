for _ in range(int(input())):
  n = int(input())
  l = list(map(int,input().split()))
  i = 0
  j = n-1
  count = 0
  while(True):
    if(l[i]!=l[j]):
      #print(l,i,j)
      if(l[i]>l[j]):
        a=l.pop(j)
        b=l.pop(j-1)
        l.insert(j-1,a+b)
        i=0
        j=len(l)-1
        count+=1
      else:
        a=l.pop(i)
        b=l.pop(i)
        l.insert(i,a+b)
        i=0
        j=len(l)-1
        count+=1
      #print(l,i,j)
    else:
      i+=1
      j-=1
    if(len(l)%2==0):
      if(i>=len(l)/2 and j<=len(l)/2):
        break
    else:
      if(i==j):
        break
  print(count)