l = []
while(True):
  v = int(input())
  if(v<0):
    break
  else:
    if v not in l:
      l.append(v)
if(len(l)!=0):
  for i in l:
    print(i)
else:
  print("List is empty")