import java.util.HashMap;

public class RomanToInteger {
    public int num(char c){
        if(c=='I'){
            return 1;
        }else if(c=='V'){
            return 5;
        }else if(c=='X'){
            return 10;
        }else if(c=='L'){
            return 50;
        }else if(c=='C'){
            return 100;
        }else if(c=='D'){
            return 500;
        }else if(c=='M'){
            return 1000;
        }
        return -1;
    }

    public int romanToInt(String s) {
        int index = 0;
        int sum =0;
        while(index<s.length()-1){
            if(num(s.charAt(index))<num(s.charAt(index+1))){
                sum-=num(s.charAt(index));
            }else {
                sum+=num(s.charAt(index));

            }
            index++;
        }
        sum+=num(s.charAt(s.length()-1));
        return sum;
    }
    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        String R = "";
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int e:arr){
            while(num>=e){
                R+=map.get(e);
                num -= e;
            }
        }
        return R;
    }

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.romanToInt("XIII"));
        System.out.println(obj.intToRoman(1994));
//        mcmxc
    }
}
