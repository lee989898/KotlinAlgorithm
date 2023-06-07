import sys

input = sys.stdin.readline

max_score = 0
result = 0

for index in range(1, 6):
    score = sum(list(map(int, input().split())))
    if score > max_score:
        max_score = score
        result = index

print(result, max_score)