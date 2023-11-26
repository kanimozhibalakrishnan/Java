a= int(input("Enter value 1:"));
b= int(input("Enter value 2:"));
c= int(input("Enter value 3:"));

if(a>b and a>c):
    print("The value ",a,"is the largest among ",b,"and ",c);
elif(b>a and b>c):
    print("The value ",b,"is the largest among ",a,"and ",c);
else:
    print("The value ",c,"is the largest among ",a,"and ",b);