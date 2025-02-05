# Defining functions
def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def division(a, b):
    return a / b

def multiply(a, b):
    return a * b

def power(a, b):
    return a ** b

password = "1234"

while True:
    enter_password = input("\n*** Please enter password ***\n\n")
    if enter_password != password:
        print("\nPlease try again")
        # Runs the program from the beginning
        continue 

    print("\n**************************************")
    print("*** Welcome to the Maths Calculator ***")
    print("**************************************")

    name = input("\n*** Please enter your name ***\n")

    # Nested while loop
    while True:
        math_operators = input("\nEnter: '+', '-', '/', '*', '**'\n")
        if (math_operators != '+') and (math_operators != '-') and (math_operators != '/') and (math_operators != '*') and (math_operators != '**'):
            print("\nInvalid! Mathematical operators must be typed in.")
            continue
        
        num1 = int(input("\nEnter first number: \n"))
        num2 = int(input("\nEnter second number: \n"))

        if num1 > num2:
            print(f"\n{num1} is greater than {num2}\n")
        elif num1 < num2:
            print(f"\n{num2} is less than {num1}\n")


        if math_operators == '+':
            # Invoking the functions
            print("\nThe result: ", add(num1, num2))
        elif math_operators == '-':
            print("\nThe result: ", subtract(num1, num2))
        elif math_operators == '/':
            print("\nThe result: ", division(num1, num2))
        elif math_operators == '*':
            print("\nThe result: ", multiply(num1, num2))
        elif math_operators == "**":
            print("\nThe result: ", power(num1, num2))
        else:
            break
    
        print(f"\nThank you {name} for using the Maths Calculator Application!")

        # Nested while loop
        while True:
            ask_user = input("\n\nWould you like to use it again? Yes(Y/y) No(N/n): \n")
            if (ask_user == "Yes") or (ask_user == "yes") or (ask_user == "Y") or (ask_user == "y"):
                print("\nProgram restarting...\n")
                break
            elif (ask_user == "No") or (ask_user == "no") or (ask_user == "N") or (ask_user == "n"):
                print("\nProgram closing...\n")
                quit() # Closes the entire program
            else:
               print("\nInvalid! Please type again.")
