import pandas as pd

Data = {
    "Users": ['Ash','Vish','kush'],
    "Password" : ['p@ss','w0Rd','Qazw2']
}

data1 = pd.DataFrame(Data)
print(data1)
data1.to_csv("sample.csv",index=False)