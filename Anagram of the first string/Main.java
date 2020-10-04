s1 = list(input())
s2 = list(input())
s1.sort()
s2.sort()
if(s1==s2):
  print("Anagram")
else:
  print("Not anagrams")