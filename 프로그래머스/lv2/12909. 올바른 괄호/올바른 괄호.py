from collections import deque

def solution(s):
    answer = True
    queue = []
    
    for index in range(len(s)):
        if s[index] == '(':
            queue.append('(')
        elif queue:
            queue.pop()
        else:
            answer = False
    
    if len(queue) != 0:
        answer = False
    
    return answer