for _ in range(int(input())):
  abc = list("abcdefghijklmnopqrstuvwxyz")
  ip = input()
  rem = list(set(abc)-set(ip))
  rem.sort(reverse=True)
  dc = {}
  for i in set(ip):
    v = ip.count(i)
    if v in dc.keys():
      dc[v].append(i)
    else:
      dc[v] = [i]
  for j in dc.keys():
    dc[j].sort(reverse=True)
    rem = rem + dc[j]
  print(" ".join(rem))
    