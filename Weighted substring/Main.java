n = int(input())
l = list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
w = [1]
index = 1
val = 2
while(True):
  c = (val*w[index-1])+w[index-1]
  if(c>n):
    index-=1
    break
  else:
    w.append(c)
    val+=1
    index+=1
fs = []
while(n>0):
  if(w[index]<=n):
    fs.insert(0,l[index])
    n=n-w[index]
  else:
    index-=1
print("".join(fs))