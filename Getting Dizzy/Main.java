rc = int(input())
m = []
for i in range(rc):
  m.append(list(map(int,input().split())))
count = rc*rc
xmin = 0
xmax = rc-1
ymin = 0
ymax = rc-1
while(count>0):
  for y1 in range(ymin,ymax+1):
    print(m[xmin][y1],end=" ")
    count-=1
  if(count<=0):
    break
  for x1 in range(xmin+1,xmax+1):
    print(m[x1][ymax],end=" ")
    count-=1
  if(count<=0):
    break
  for y2 in range(ymax-1,ymin-1,-1):
    print(m[xmax][y2],end=" ")
    count-=1
  if(count<=0):
    break
  for x2 in range(xmax-1,xmin,-1):
    print(m[x2][ymin],end=" ")
    count-=1
  if(count<=0):
    break
  xmin+=1
  ymin+=1
  xmax-=1
  ymax-=1