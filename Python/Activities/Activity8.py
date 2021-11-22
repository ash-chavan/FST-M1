NumList = list(input("Enter your numbers  :").split(","))
Fno = NumList[0]
Lno = NumList[-1]
if(Fno==Lno):
    print('True')
else:
    print('False')