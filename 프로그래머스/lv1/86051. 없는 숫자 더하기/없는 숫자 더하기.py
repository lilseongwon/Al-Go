def solution(numbers):
    sum = 0
    for i in range(1, 10):
        if i not in numbers:
            sum += i
    answer = sum
    return answer