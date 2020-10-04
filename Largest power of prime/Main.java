for _ in range(int(input())):
    n,p = map(int,input().split())
    x = 0
    while(n!=0):
        n=int(n/p)
        x=x+n
    print(x)