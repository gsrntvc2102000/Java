# PROGRAM USING CMATH AND MATH MODULE

import cmath
import math


a = float(input("Enter a value of A: "))
b = float(input("Enter a value of B: "))
c = float(input("Enter a value of C: "))
d = b**2 - 4*a*c
if d < 0:
    sol1 = (-b + cmath.sqrt(d))/2*a
    sol2 = (-b - cmath.sqrt(d))/2*a
    print('The roots are {:6.2f} and {:6.2f}'.format(sol1, sol2))
elif d > 0:
    sol1 = (-b + math.sqrt(d))/2*a
    sol2 = (-b - math.sqrt(d))/2*a
    print("The roots are {:6.2f} and {:6.2f}".format(sol1, sol2))
else:
    print("The roots are real & equal")
    sol1 = -b/2*a
    sol2 = sol1
    print("The root are {:6.2f} and {:6.2f}".format(sol1, sol2))