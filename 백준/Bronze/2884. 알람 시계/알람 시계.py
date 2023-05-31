hour, minute = map(int, input().split())

if hour == 0:
    hour = 24

hour = (hour * 60 + minute - 45) // 60
minute = (hour * 60 + minute - 45) % 60

if hour == 24:
    print(0, minute)
else:
    print(hour, minute)