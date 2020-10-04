def check(n,t):
  if(n==t):
    return True
  if(n>t):
    return False
  return check(n*10,t) or check(n*20,t)
for _ in range(int(input())):
  n = int(input())
  if(n==1):
    print("Yes")
  elif(check(1,n)):
    print("Yes")
  else:
    print("No")