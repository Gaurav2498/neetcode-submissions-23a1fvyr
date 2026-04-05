class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;  

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPali(s, i + 1, j) || 
                       isPali(s, i, j - 1); 
            }
            i++;
            j--;
        }
        return true; 
    
    }

    public boolean isPali(String s , int l , int r){

        while (l < r) {
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    }
