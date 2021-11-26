#Num_tuple = int(input("Enter the nos :").split(','))
Num_tuple = [12,20,35,30]
print(Num_tuple)

print("Printing nos which are divisible by 5 :")

for n in Num_tuple:
    if (n % 5 == 0) :
        print(n)    