from datetime import date
class Expense:
    obj_counter = 0
    def __init__(self, amount, d, cat):
        self.amount = amount
        self.date = date(int(d[0:4]),int(d[5:7]),int(d[8:]))
        self.category = cat
        Expense.obj_counter += 1
        self.counter = Expense.obj_counter

    def edit(self, new_amount, new_date, new_cat):
        self.amount = new_amount
        self.date = new_date
        self.cat = new_cat
        

    def toString(self):
        print("Order:", self.counter, "Amount: $", self.amount, "Date:", self.date, " Category:" , self.category)

        
    
