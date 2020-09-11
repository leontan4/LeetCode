# Brute Force Solution
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

# Efficient Solution    
class Solution:
    def isPalindrome(self, s: str) -> bool:
	# upper case convert lower case
	# delete punctuation and space
	nor_str = ''.join([c.lower() if c.isalnum() else '' for c in s])
	# two pinters check
    return nor_str[:] == nor_str[::-1]
