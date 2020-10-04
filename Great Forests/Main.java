n = int(input())
arr = []
maxv = 0
count = [0]
def countT(i,j):
  if(i<0 or j<0 or i>=n or j>=n):
    return
  elif(arr[i][j]=='T'):
    arr[i][j]='W'
    count[0]+=1
  elif(arr[i][j]=='W'):
    return
  countT(i-1,j)
  countT(i+1,j)
  countT(i,j+1)
  countT(i,j-1)
for i in range(n):
  arr.append(list(input()))
for j in range(n):
  for k in range(n):
    if(arr[j][k]=='T'):
      countT(j,k)
    if(maxv<count[0]):
      maxv=count[0]
    count[0]=0
print(maxv)