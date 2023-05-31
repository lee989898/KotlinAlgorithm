hour, minute = map(int, input().split())
cooking = int(input())

hour = (hour * 60 + minute + cooking) // 60
minute = (hour * 60 + minute + cooking) % 60

if hour > 23:
    hour -= 24

print(hour, minute)