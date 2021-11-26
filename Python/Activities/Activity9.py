list1 = [21,11,22,34,55,37]
list2 = [12.23,43,56,6,3,10]

list3 = []

for n in list1:
    if (n%2 != 0):
        list3.append(n)

    
    
print(list3)

for n in list2:
    if (n%2 == 0):
        list3.append(n)


print(list3)
