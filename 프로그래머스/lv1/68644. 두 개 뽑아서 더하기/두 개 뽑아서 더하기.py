import itertools

def solution(numbers):
    answer = []
    result = list(itertools.combinations(numbers,2))
    for i in result:
         answer.append(sum(i))
    return sorted(list(set(answer)))