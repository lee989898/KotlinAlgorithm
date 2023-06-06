import sys
input = sys.stdin.readline
from collections import deque

n, k = list(map(int, input().split()))

nums = deque([i for i in range(1, n + 1)])
result = []

while nums:
    for _ in range(k):
        nums.append((nums.popleft()))
    result.append(str(nums.pop()))

print("<",', '.join(result),">", sep="")