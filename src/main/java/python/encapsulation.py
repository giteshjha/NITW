max_age = 25
default_age = 1
age = default_age


def set_age(input_age):
    global age
    if input_age < max_age:
        age = input_age
    else:
        age = default_age


def get_age():
    return age