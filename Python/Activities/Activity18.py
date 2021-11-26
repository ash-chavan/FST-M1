import pandas as pd
from pandas.core.frame import DataFrame 
d1 =pd.read_csv("sample.csv")
print("Full data from csv :")
print(d1)
print("Print list of users : ")
print(d1["Users"])
print("Printing 2nd user details :")
#print("User :",DataFrame["Users"][1]," |","Password :",DataFrame["Password"][1])
print("Username: ", d1["Users"][1], " | ", "Password: ", d1["Password"][1])
print("Sorting users in ascending order and password in descending:")
print(d1.sort_values("Users"))
print(d1.sort_values('Password',ascending=False))

