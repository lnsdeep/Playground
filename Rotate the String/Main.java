s = input()
v = int(input())
d = input()
l = list(s)
if(d=="R"):
  for i in range(len(s)):
    l[(i+v)%len(s)]=s[i]
else:
  for i in range(len(s)):
    l[(i-v+len(s))%len(s)]=s[i]
print("".join(l))