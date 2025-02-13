public class FindSqrt {
        public static int mySqrt(int x) {
            if(x<2){
                return x;
            }
            int start=0, end=x, ans = 0, mid;
            while(start<=end){
                mid = start +(end-start)/2;
                if(mid==x/mid){
                    ans = mid;
                    break;
                }
                else if(mid<x/mid){
                    ans=mid;
                    start = mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return ans;
        }

    public static int minBitFlips(int start, int goal) {
        int count = 0;
        int xor = start ^ goal; // XOR will give 1 where the bits differ
        System.out.println(xor);
        while(xor!=0){
            count += xor & 1; // Increment count if the last bit is 1
            xor >>=1; // Right-shift to check the next bit
        }
        return count;
    }
    public static void main(String[] args) {

//            System.out.println(mySqrt(8));

        System.out.println(minBitFlips(10,7));
    }
    
}


