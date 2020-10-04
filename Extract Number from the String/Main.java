for _ in range(int(input())):
  l = list(input().split())
  final = []
  for i in l:
    if(i.isdigit()):
      if '9' not in i:
        final.append(int(i))
  print(max(final))