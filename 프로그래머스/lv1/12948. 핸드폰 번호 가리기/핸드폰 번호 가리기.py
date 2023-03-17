def solution(phone_number):
    P = list(phone_number)
    for i in range (len(phone_number[:-4])):
        P[i] = '*'
    answer = ''.join(P)
    return answer