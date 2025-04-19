# String Length Even or Not

This Java program takes a string input from the user and performs different operations based on the string's length (even or odd). The main logic is implemented in a class named `StringLengthEvenOrNot`.

## 📌 Functionality

- Prompts the user to enter a string.
- Counts the number of characters in the string using a `for` loop.
- If the count is **even**:
  - Appends the string `"bye"` to the original string and prints it.
- If the count is **odd**:
  - Prints the **first** and **last** characters of the string.

## 🧾 Code Explanation

```java
package test_27_03_25;

import java.util.Scanner;

public class StringLengthEvenOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);             // Creates Scanner object for input
        System.out.println("Enter the String");         // Prompts user
        String st = s.next();                           // Reads the input string (up to whitespace)

        int count = 0;
        for(int i = 0; i <= st.length() - 1; i++)       // Counts the number of characters
        {
            count++;
        }

        if(count % 2 == 0)                              // Checks if length is even
        {
            st = st + "bye";                            // Appends "bye" to the string
            System.out.println(st);                     // Prints modified string
        }
        else                                            // If length is odd
        {
            System.out.println("First Char " + st.charAt(0));                      // Prints first character
            System.out.println("Last Char " + st.charAt(st.length() - 1));        // Prints last character
        }
    }
}
```

## 📌 Sample Output

### Example 1 (Even length):
```
Enter the String
Java
Javabye
```

### Example 2 (Odd length):
```
Enter the String
Hello
First Char H
Last Char o
```

## ✅ Notes

- `next()` reads input only up to the first space. To include spaces, `nextLine()` can be used.
- The use of a loop to count characters is redundant as `st.length()` provides the length directly, but it demonstrates how loops can be used for counting.

---
## Clone
```
git clone https://github.com/Ananthadatta02/Java-String_Length_Even_Or_Not.git
```
