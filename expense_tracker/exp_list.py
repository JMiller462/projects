
from datetime import date
import calendar
class ExpenseList:
    #categories = {"Food","Transportation", "Housing", "Healthcare","Misc."
    def __init__(self):
        self.list = []
        self.categories = set()
    
    def add(self,expense):
        self.list.append(expense)
        self.categories.add(expense.category)
    #def delete():
        
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
    
    



