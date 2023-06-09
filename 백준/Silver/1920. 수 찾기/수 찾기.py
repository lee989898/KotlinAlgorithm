n = int(input())
nums = set(map(int, input().split()))
m = int(input())
find_nums = list(map(int, input().split()))

for find_num in find_nums:
    if find_num in nums:
        print(1)
    else:
        print(0)
