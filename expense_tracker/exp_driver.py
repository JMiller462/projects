from exp_list import ExpenseList
from expense import Expense
import os
import re
e_list = ExpenseList()
start_s = '''
________________
|Expense Tracker|
-----------------
(1) View Expenses
(2) Add Expenses
(3) Edit/Delete Expenses
(4) View Total Expenses
(5) Exit Program
-----------------
'''
option = input(start_s)
os.system('cls')
while option.isdigit() != True or (int(option) < 1 or int(option) > 5):
    option = input("Please enter the correct option.")
while option != "5":
    os.system('cls')
    if option == "1":
        if len(e_list.list) != 0:
            e_list.display()
        else:
            print("No Expenses to Display.")
    elif option == "2":
        os.system('cls')
        info = input("Please enter amount, date (yyyy-mm-dd), and category (Separate by commas):")
        info = re.split(',', info)
        new_e = Expense(info[0],info[1],info[2])
        e_list.add(new_e)
        print("Expense Added:", end=" ")
        new_e.toString()
    elif option ==  "3": #updated
        os.system('cls')
        if len(e_list.list) != 0:
            index = None
            e_list.display()
            id = int(input("Please select expense to edit or delete by its ID number:"))
            while id not in e_list.IDs.keys():
                id = int(input("Please enter correct ID number."))
            for i in range(len(e_list.list)):
                if e_list.list[i].ID == id:
                    sel_e = e_list.list[i]
                    index = i
                    break
            choice = input("Do you want to edit or delete this expense? (Enter e (edit) or d (delete) :")
            if choice == "e" or  choice == "E": 
                old_cat = e_list.list[index].category
                info = input("Please enter amount, date (yyyy-mm-dd), and category (Separate by commas):")
                info = re.split(',', info) 
                sel_e.edit(info[0], info[1], info[2])
                if old_cat != sel_e.category:# old category clean up and new category addition
                    e_list.categories.add(sel_e.category)
                    check = 0 #checks if category of any expense in list matches the old category(0:match, 1:no match)
                    for i in range(len(e_list.list)):
                        if old_cat == e_list.list[i].category and sel_e is not e_list.list[i]:
                            break
                        if i == len(e_list.list)-1:
                            check = 1
                    if check == 1:
                        e_list.categories.remove(old_cat)
                
                    
                print("Expense Edited :", end=" ")
                sel_e.toString()
            elif choice == "d" or  choice == "D":
                print("Expense #", id, "deleted")
                e_list.delete(sel_e,index)

        else:
            print("No expenses to edit or delete.")
    elif option == "4":
        os.system('cls')
        select1 = input("View Totals by (1) Category or (2) Time:")
        while(select1 != "1" and select1 != "2"):
            input("Please enter the correct number:")
        if(select1 == "1"):
            cat = input("Enter Category:")
            if cat in e_list.categories:
                print(f"The total expense in category {cat} is ${e_list.cat_sum(cat)} ")
            else:
                print("Category not found.")
        elif(select1 == "2"):
                total = 0
                select2 = input("(1) By Day\n(2) By Month\n(3) By Period")
                while(select2 != "1" and select2 != "2"  and select2 != "3"):
                    input("Please enter the correct number:") 
                if(select2 == "1"):
                    day = input("Enter Day (yyyy-mm-dd):")
                    print(f"The total expense in this day {day} is ${e_list.day_sum(day)} ")
                elif(select2 == "2"):
                    month = input("Enter Month Name:")
                    print(f"The total expense in this day {month} is ${e_list.month_sum(month)} ")
                elif(select2 == "3"):
                    start = input("Enter Start Date (yyyy-mm-dd):")
                    end = input("Enter End Date (yyyy-mm-dd):")
                    print(f"The total expense in this period  is ${e_list.period_sum(start,end)} ")
    option = input("Options: (1) View All Expense, (2) Add, (3) Edit/Delete, (4) View Totals (5) Exit Program")
    


                
