n = int(input())

count = 1
stack = []
result = []

for _ in range(n):
    data = int(input())
    while count <= data:
        stack.append(count)
        count += 1
        result.append('+')
    if stack[-1] == data:
        stack.pop()
        result.append('-')
    else:
        print('NO')
        exit(0)

print('\n'.join(result))