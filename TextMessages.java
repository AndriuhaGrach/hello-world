package library;

interface TextMessages {
    String[] menu = new String[] {
            "Menu:",
            "0. Exit",
            "1. Factorial",
            "2. Fibonacci",
            "Enter the menu item number and press \"enter\": "
    };
    String factorialMessage = "Please enter a number between 0 and 20: ";
    String fibonacciMessage = "Please enter a number between 0 and 36: ";
    String answer = "Answer: ";
}
