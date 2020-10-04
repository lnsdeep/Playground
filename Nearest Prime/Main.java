import math
def isprime(v):
  if(v==2):
    return True
  if(v%2==0):
    return False
  else:
    for i in range(3,math.floor(math.sqrt(v))+1,2):
      if(v%i==0):
        return False
    return True
for _ in range(int(input())):
  v = int(input())
  i=v
  j=v
  while(True):
    if(isprime(j)):
      print(j)
      break
    if(isprime(i)):
      print(i)
      break
    i+=1
    j-=1