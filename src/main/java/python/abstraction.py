# income tax example

# if income is up to 1 lakh - no tax
# if income is upto 5 lakhs 50k tax

# if income is more than 5 lakhs 60k tax

# based on employee type tax calculation will change(full_time, part-time)
# for part-time the tax is 0 if income is less than 200K
# tax - 50K for more than 200K income

def calculate_tax(income, employement_type):
    if employement_type == 'full_time':
        if income < 100000:
            print("0")
        elif income <= 500000:
            print("50000")
        else:
            print( "60000")
    else:
        if income < 200000:
            print("0")
        else:
            print("50000")


def calculate_tax_for_part_time(income):
    pass

# 10 times
calculate_tax(5000)
calculate_tax(400000)


