# Efficient Solution
class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_string=[character for character in s if character.isalnum()]
        new_string = "".join(new_string).lower()

        length = len(new_string)
        reverse =new_string[length::-1]

        if(reverse == new_string):
            return True
        else:
            return False
