n = int(input())

array = []

for _ in range(n):
    input_data = list(map(int, input().split()))
    array.append([input_data[0], input_data[1]])

for data in sorted(array):
    print(data[0], data[1])

