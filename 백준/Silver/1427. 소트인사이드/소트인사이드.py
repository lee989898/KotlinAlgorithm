import sys

input = sys.stdin.readline

n = input().rstrip()
nums = []

for index in range(len(n)):
    nums.append(int(n[index]))

nums.sort(reverse=True)

for num in nums:
    print(num,end='')

