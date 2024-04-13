Function:called the findPolyndromword function
The code algorithm:If the word length is 0 or 1 that is, if it is an empty string or a string of one character, then we consider it a palindrome and output the message "Polyndrom"
If the first and last characters match, then we recursively call the same function for a substring that does not include the first and last character. We continue this process until we get to the base case when the string will have a length of 0 or 1
If the first and last characters do not match, then it is not a palindrome, and we output the message "Not a Polydrom".
