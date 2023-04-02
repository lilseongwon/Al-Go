def solution(food):
    result = ''
    first = ''
    for a, i in enumerate(food):
        food[a] = int(i / 2)

    for k, v in enumerate(food):
        if(k != 0):
            for j in range(v):
                first += str(k)
                
    result += first
    result += '0'
    
    for i in reversed(first):
        result += i
    return result
        