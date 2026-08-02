class Solution {
    public String addStrings(String num1, String num2) {

       int right1 = num1.length()-1;
       int right2 = num2.length()-1;
       StringBuilder res = new StringBuilder();
       int carry = 0;
       int val = 0;

       while(right1>=0 && right2>=0){

        val = num1.charAt(right1) - '0' + num2.charAt(right2) - '0' + carry;

        if(val>9){
            val = val%10;
            carry = 1;
        } else {
            carry = 0;
        }

        res.append((char)(val + '0'));
        right1--;
        right2--;
       }

       while(right1>=0){
        val = num1.charAt(right1) - '0' + carry;

        if(val>9){
            val = val%10;
            carry = 1;
        } else {
            carry = 0;
        }

        res.append((char)(val + '0'));
        right1--;
       }

       while(right2>=0){
        val = num2.charAt(right2) - '0' + carry;

        if(val>9){
            val = val%10;
            carry = 1;
        } else {
            carry = 0;
        }

        res.append((char)(val + '0'));
        right2--;
       }

       if(carry != 0){
        res.append((char)(carry + '0'));
       }

       return res.reverse().toString();
    }
}