from exp_list import ExpenseList
from expense import Expense
import os
e_list = ExpenseList()
start_s = '''
________________
|Expense Tracker|
-----------------
(1) View Expenses
(2) Add Expenses
(3) Edit Expenses
(4) View Total Expenses
(5) Exit Program
-----------------
'''
option = input(start_s)
os.system('cls')
while option.isdigit() != True or (int(option) < 1 or int(option) > 5):
    option = input("Please enter the correct option.")
while option != "5":
    if option == "1":
        if len(e_list.list) != 0:
            e_list.display()
            option = input("Options: (1) View All Expense, (2) Add, (3) Edit, (5) View Totals (5) Exit Program")
            os.system('cls')
        else:
            print("No Expenses to Display.")
            option = input("Options: (1) View, (2) Add, (3) Edit, (4) Exit Program")
            os.system('cls')
            
    elif option == "2":
        info = input("Please enter amount, date (yyyy-mm-dd), and category (Separate by commas):")
        info = info.split(",")
        new_e = Expense(info[0],info[1],info[2])
        e_list.add(new_e)
        print("Expense Added:", end=" ")
        new_e.toString()
        option = input("Options: (1) View, (2) Add, (3) Edit, (4) Exit Program")
        os.system('cls')

    elif option ==  "3":
        e_list.display()
        order = int(input("Please select expense to edit by its order number:"))
        edit_e = e_list.list[order - 1]
        info = input("Please enter amount, date (yyyy-mm-dd), and category (Separate by commas):")
        info = info.split(",")
        edit_e.edit(info[0], info[1], info[2])
        print("Expense Edited :", end=" ")
        edit_e.toString()
        option = input("Options: (1) View, (2) Add, (3) Edit, (4) Exit Program")
        os.system('cls')
    elif option == "4":
        select1 = input("View Totals by (1) Category or (2) Time:")
        while(select1 != '1' or select1 != '2'):
            print("Please enter the correct number:")
        if(select1 == "1"):
            cat = input("Enter Category:")
            if cat in e_list.categories:
                print(f"The total expense in category {cat} is ${e_list.cat_sum(cat)} ")
            else:
                print("Category not found.")
                option = input("Options: (1) View, (2) Add, (3) Edit, (4) Exit Program")
                os.system('cls')
            option = input("Options: (1) View, (2) Add, (3) Edit, (4) Exit Program")
            os.system('cls')
        elif(select1 == "2"):
                total = 0
                select2 = input("(1) By Day\n(2) By Month\n(3) By Period")
                while(select2 != "1" or select2 != "2" or select2 != "3"):
                    print("Please enter the correct number:") 
                if(select2 == "1"):
                    e_list
                os.system('cls')
    