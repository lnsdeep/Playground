for _ in range(int(input())):
  v = int(input())
  if(v<=1):
    print(0)
    continue
  else:
    print(int((v*(v-1))/2))