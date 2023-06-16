import sys

input = sys.stdin.readline

n = int(input())
result = 0
arr = []
for _ in range(n):
    x, y = map(int, input().split())
    arr.append((x, y))

arr.sort()

start, current = arr[0]

for line in arr:
    x, y = line
    if current >= x:
        current = max(current, y)
    else:
        result += current - start
        start = x
        current = y

result += current - start
print(result)
