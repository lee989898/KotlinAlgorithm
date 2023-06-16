import sys
from collections import deque

input = sys.stdin.readline
gear = [deque(list(map(int, input().rstrip()))) for _ in range(4)]

k = int(input())
for _ in range(k):
    f_gear_state = []
    for i in range(4):
        f_gear_state.append([gear[i][6], gear[i][2]])
    n, d = map(int, input().split())
    n = n - 1

    if n != 0:
        for i in range(n, 0, -1):
            if f_gear_state[i][0] != f_gear_state[i - 1][1]:
                if (n - (i - 1)) % 2 == 0:
                    gear[i - 1].rotate(d)
                elif (n - (i - 1)) % 2 != 0:
                    gear[i - 1].rotate(-1 * d)
            else:
                break

    if n != 3:
        for i in range(n, 3):
            if f_gear_state[i][1] != f_gear_state[i + 1][0]:
                if (n - (i + 1)) % 2 == 0:
                    gear[i + 1].rotate(d)
                elif (n - (i + 1)) % 2 != 0:
                    gear[i + 1].rotate(-1 * d)
            else:
                break
    gear[n].rotate(d)

res = 0
if gear[0][0] == 1:
    res += 1
if gear[1][0] == 1:
    res += 2
if gear[2][0] == 1:
    res += 4
if gear[3][0] == 1:
    res += 8
print(res)