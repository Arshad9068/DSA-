public class KoKoEatingBanana {
    public static int minEatingSpeed1(int[] piles, int h) {
        int end =0,start=0;
        for(int i=0;i<piles.length;i++){
            start += piles[i];
            end = Math.max(piles[i],end);
        }
        start /= h;
        if(start<=0) start = 1;
        int ans=0;
        while(start<=end ){
            int k=0;
            int mid = start + (end-start)/2;
            for(int i=0;i<piles.length;i++){
                k+=piles[i]/mid;
                if(piles[i]%mid!=0){
                    k+=1;
                }
            }
            if(k<=h){
                ans=mid;
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return ans;
    }

        public static int minEatingSpeed(int[] piles, int h) {
            int start = 0 , end=0, mid,ans=0;
            for(int i=0; i<piles.length;i++){
                start+= piles[i];
                end  = Math.max(piles[i], end);
            }
            start /= h;
            if(start<=0){
                start = 1;
            }
//            3,6,7,11
            System.out.println(start + " " +end);
            while(start<=end){
                int total_Hours = 0;
                mid = start+(end-start)/2;
                for(int i=0; i<piles.length;i++){
                    total_Hours += piles[i]/mid;
                    if(piles[i]%mid != 0){
                        total_Hours++;
                    }
                }
                if(total_Hours>h){
                    start = mid+1;
                }
                else{
                    ans = mid;
                    end = mid-1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
            int[] arr ={805306368,805306368,805306368};
            int n = 1000000000;
        System.out.println(minEatingSpeed(arr,n));
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed1(piles,8));

    }

}

