def solution(s):
    wt = 0
    for c in s :
        if c == '(' : wt += 1
        elif c == ')' : wt -= 1
        if wt < 0 : return False
    return wt == 0