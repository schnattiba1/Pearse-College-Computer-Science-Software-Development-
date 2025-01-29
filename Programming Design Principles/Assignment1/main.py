# Asks how many students are there
print("\nWelcome to the grading system\n")
students = int(input("Please enter how many students wishing to grade?: "))

# Iteration
# The _ indicates throwaway variable when it's not needed
for _ in range(0, students):
    mark = int(input("\nEnter your grade: "))
    if (mark >= 0) and (mark <= 49):
        print("\nUnsatisfactory")
    elif (mark >= 50) and (mark <= 64):
        print("\nPass")
    elif (mark >= 65) and (mark <= 79):
        print("\nMerit")
    elif (mark >= 80) and (mark <= 100):
        print("\nDistinction")
    else:
        print("\nInvalid marks entered!")
