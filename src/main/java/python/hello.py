import encapsulation
from encapsulation import set_age, get_age

# Encapsulation
from inheritance import dog_eating

set_age(27)
print(get_age())
set_age(24)
print(get_age())

# # We can't trust developer with this.
encapsulation.max_age = 30
set_age(27)
print(get_age())
#
# dog_eating()





























# problem -
"""
    User details management
    Operations
    Add user details(name, stream, college_name, user_type(regular, part_time))
    Get all user details at once
    Modify stream
"""