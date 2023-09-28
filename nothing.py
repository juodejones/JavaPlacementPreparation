t = int(input())
while t > 0:
    inp = input().split()
    n = int(inp[0])
    m = int(inp[1])
    maxi = 0
    for i in range(0, n):
        count = 0
        arr = input()
        for k in arr:
            if k == "#":
                count += 1
            else:
                count = 0
            if count > maxi:
                maxi = count
    print(maxi)
    t -= 1
