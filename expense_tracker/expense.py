from datetime import date
class Expense:
    obj_counter = 0
    def __init__(self, amount, d, cat):
        self.amount = int(amount)
        self.date = date(int(d[0:4]),int(d[5:7]),int(d[8:]))
        self.category = cat
        self.ID = None

    def edit(self, new_amount, new_date, new_cat):
        self.amount = int(new_amount)
        self.date = new_date
        self.category = new_cat
        

    def toString(self):
        print("ID:", self.ID, "Amount: $", self.amount, "Date:", self.date, " Category:" , self.category)

        
    
