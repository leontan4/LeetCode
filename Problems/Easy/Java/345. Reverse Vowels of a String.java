//Optimal Solution
class Solution {
    public String reverseVowels(String s) {
        
       	char[] arr = s.toCharArray();	
		
		int j = arr.length - 1;
		int i = 0;
		while(i < j) {
			boolean src = false;
			boolean dest = false;			
			if(isVowelChar(arr[i])) {			
				src = true;	
			} else {				
				i++;				
				continue;
			}
			
			while(j > i) {
				if(isVowelChar(arr[j])) {
					dest = true;				
					break;					
				} else {
					j--;
					continue;
				}
			}
			
			if(arr[i] != arr[j] && src && dest) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}	
			
			i++;
			j--;
		
		}
        
        return new String(arr);
        
    }
    
    public boolean isVowelChar(char c) {
    	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
           	|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } 
        else {
            return false;
        }
    }
}

//Fast Solution 
class Solution {
    public String reverseVowels(String s) {
        
        char[] c = s.toCharArray();
        int len = s.length(), j = 0;

        ArrayList<Character> vowels= new ArrayList<Character>();
        for (int i=0; i<len; i++){
            if(c[i] == 'a' || c[i] == 'e' ||c[i] == 'i' ||c[i] == 'o' ||c[i] == 'u' || c[i] == 'A' || c[i] == 'E' ||c[i] == 'I' ||c[i] == 'O' ||c[i] == 'U') {
                vowels.add(c[i]);
            }
        }

        for (int i=len-1; i>=0; i--){
            if(c[i] == 'a' || c[i] == 'e' ||c[i] == 'i' ||c[i] == 'o' ||c[i] == 'u' || c[i] == 'A' || c[i] == 'E' ||c[i] == 'I' ||c[i] == 'O' ||c[i] == 'U') {
                c[i] = vowels.get(j);
                j++;
            }
        }
        
        return String.valueOf(c);
        
    }
}