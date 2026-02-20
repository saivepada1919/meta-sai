#include <iostream>

int main() {
    int first_number, second_number, sum;

    std::cout << "Enter two integers: ";
    // Taking multiple inputs in one line
    std::cin >> first_number >> second_number;

    // Adding the two variables
    sum = first_number + second_number;

    // Displaying the result
    std::cout << first_number << " + " << second_number << " = " << sum << std::endl;

    return 0;
}

