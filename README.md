# Budget Management System
## Budget Management System

This is a simple budget management system that allows user to add income, expenses and check the remaining balance. The system automatically save each transaction to a file called "transactions.txt" in the same directory as the program.

To use the program, simply run the main "BudgetManagementSystem" class. User will be prompted with a menu with the following options:

1. Add income
2. Add expense
3. Check current balance
4. Quit

Enter the corresponding number according to the option you would like to access. If you select option 1, you will be prompted to enter the income amount. If you select option 2, you will be prompted to enter the expense amount. If your balance is insufficient for the expense, an error message will be displayed and you will be prompted to enter the expense again. If you select option 3, your current balance will be displayed. If you select option 4, the program will exit.

Each time you add income or expense, the transaction details will be saved to a file named "transactions.txt" in the following format:

Transaction type: Transaction amount
Current balance: Current balance

For example, if you add an income of $100, the file will contain the following:

Income: 100.0
Current balance: 100.0

And if you add an expense of $70, the file will contain the following:

Income: 100.0
Current balance: 30.0


The system will automatically create "transactions.txt" file, from the very first time you access the system to input data.

