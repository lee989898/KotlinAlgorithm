import sys

stack = []

n = int(sys.stdin.readline())
for _ in range(n):
    str = sys.stdin.readline().split()
    if str[0] == 'push':
        stack.append(str[1])
    elif str[0] == 'top':
        if stack:
            print(stack[-1])
        else:
            print(-1)
    elif str[0] == 'size':
        print(len(stack))
    elif str[0] == 'empty':
        if stack:
            print(0)
        else:
            print(1)
    else:
        if stack:
            data = stack[-1]
            del stack[-1]
            print(data)
        else:
            print(-1)
