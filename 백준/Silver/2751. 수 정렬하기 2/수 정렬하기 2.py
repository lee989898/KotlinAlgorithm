import sys

input = sys.stdin.readline

n = int(input())
nums = []

for _ in range(n):
    nums.append(int(input()))

def merge(left, right):
    merged = list()
    left_point, right_point = 0, 0

    # case1 - left/right 둘다 있을떄
    while len(left) > left_point and len(right) > right_point:
        if left[left_point] > right[right_point]:
            merged.append(right[right_point])
            right_point += 1
        else:
            merged.append(left[left_point])
            left_point += 1

    # case2 - left 데이터가 없을 떄
    while len(left) > left_point:
        merged.append(left[left_point])
        left_point += 1

    # case3 - right 데이터가 없을 때
    while len(right) > right_point:
        merged.append(right[right_point])
        right_point += 1

    return merged


def mergesplit(data):
    if len(data) <= 1:
        return data
    medium = len(data) // 2
    left = mergesplit(data[:medium])
    right = mergesplit(data[medium:])
    return merge(left, right)

for num in mergesplit(nums):
    print(num)
