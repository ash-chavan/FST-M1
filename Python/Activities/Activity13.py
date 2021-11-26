def Calcute_Sum(Numbers):
    sum =0
    for n in Numbers:
        sum += n
    return sum

NList = [12,22,12,2]
result = Calcute_Sum(NList)
print('Sum of nos is :')
print(result)