
from datetime import date
import calendar
import random
class ExpenseList:
    def __init__(self):
        self.list = []
        self.categories = set()
        self.IDs = dict()
        self.ran_ids = random.sample(range(0,1001), 1000)
        for id in self.ran_ids:
            self.IDs[id] = 0

    def add(self,expense):
        for id in self.IDs: 
            if self.IDs[id] == 0:
                expense.ID = id
        self.IDs[expense.ID] = 1 #verification check from new system of storing expenses when testing delete function
        self.list.append(expense)
        self.categories.add(expense.category)

    def delete(self,expense, d_index):
        check = 0
        for i in range(len(self.list)):
            if expense.category == self.list[i].category and expense is not self.list[i]:
                break
            if i == len(self.list)-1:
                check = 1
        if check == 1:
            self.categories.remove(expense.category)
        self.IDs[self.list[d_index].ID] = 0
        del self.list[d_index]

    def cat_sum(self,cat):
        total = 0
        for e in self.list:
            if e.category == cat:
                total += e.amount
        return total
    
    def month_sum(self, month_name):
        total = 0
        for e in self.list:
            if calendar.month_name[int(str(e.date)[5:7])] == month_name:
                total += e.amount
        return total
    def day_sum(self, date):
        total = 0
        for e in self.list:
            if date == str(e.date):
                total += e.amount
        return total
    
    def period_sum(self, start_d, end_d):
        total = 0
        start_d = date(int(start_d[0:4]),int(start_d[5:7]),int(start_d[8:]))
        end_d = date(int(end_d[0:4]),int(end_d[5:7]),int(end_d[8:]))
        for e in self.list:
            if e.date >= start_d and e.date <= end_d:
                total += e.amount
        return total
    def display(self):
        for e in self.list:
            e.toString()
    
    



