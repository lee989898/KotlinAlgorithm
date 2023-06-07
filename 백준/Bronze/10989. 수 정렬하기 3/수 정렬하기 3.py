import sys

input = sys.stdin.readline

n = int(input())

array = [0] * 10001

for _ in range(n):
    array[int(input())] += 1

for index in range(len(array)):
    if array[index] != 0:
        for _ in range(array[index]):
            print(index)
