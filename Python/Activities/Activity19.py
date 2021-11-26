import pandas
from pandas import ExcelWriter

Data = {
    "Fname": ["Ash","Vish","Kush"],
    "Lname": ["jojo",'momo'," "],
    "rank": [12,22,1]
}
data =pandas.DataFrame(Data)
print(data)
#Writing data into excel file
Write = ExcelWriter('Sample.xlsx')
data.to_excel(Write, 'sheet1')
#Commit data to excel
Write.save()