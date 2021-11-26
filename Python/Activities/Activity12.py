def AddNumbs(n):
    if n:
        return n +AddNumbs(n-1)
    else:
        return 0

no = int(input("Enter a no :"))
sum = AddNumbs(no)
print(sum)