n, d, k, c = map(int, input().split())
sushi = []
for _ in range(n):
    sushi.append(int(input()))
result = 0

sushi = sushi + sushi[0:k-1]

for i in range(len(sushi)):
    p = set(sushi[i:i+k])
    if c not in p:
        p.add(c)

    if len(p) > result:
        result = len(p)

print(result)
