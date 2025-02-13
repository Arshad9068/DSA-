public class addTwoStringAsNumber {
    public static String add(String num1, String num2){
        int index1 = num1.length()-1, index2 = num2.length()-1;
        String s= "";
        int carry=0;
        while(index2>=0){
            int sum = (num1.charAt(index1)-'0') + (num2.charAt(index2)-'0')+carry;

            carry = sum/10;
            int ch = '0' +sum%10;
            s += (char)ch;
            index1--;
            index2--;

        }
        while(index1>=0){
            int sum = (num1.charAt(index1)-'0') +carry;
            carry = sum/10;
            int ch ='0'+ sum%10;
            s += (char)ch;
            index1--;
        }
        if(carry>0){
            s += (char)carry;
        }
        String ans = "";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(add("123","11"));

    }
}
