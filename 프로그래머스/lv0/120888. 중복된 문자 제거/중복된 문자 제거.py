def solution(my_string):
    deduped_list = [char for index, char in enumerate(my_string) 
                    if char not in my_string[:index]]
    answer = ''.join(deduped_list)
    return answer