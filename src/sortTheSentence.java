public class sortTheSentence {
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int pos=0;
        for( String i : str){
            pos = (i.charAt(i.length()-1)) -'0';
            res[pos-1] = i.substring(0,i.length()-1);
        }
        int i=0;
        for(i=0;i<res.length-1;i++){
            sb.append(res[i]).append(" ");
        }
        sb.append(res[i]);
        return sb.toString();
    }
//    public static String sorting(String s){
//        String[] arr = new String[10];
//        int start=0, end=0, count =0, index=0;
//        String str = "";
//        while(index<s.length()){
//            if(s.charAt(index)== ' '){
//                end = index-1;
//                int pos = s.charAt(index-1) - '0';
//                arr[pos-1] = s.substring(start,end);
//                start = index+1;
//                count++;
//            }
//            index++;
//        }
//        end = index-1;
//        int pos = s.charAt(index-1) - '0';
//        arr[pos-1] = s.substring(start,end);
//        count++;
//
//        System.out.println(count);
//        for(int i=0; i<count;i++){
//            str += arr[i];
//            str += ' ';
//        }
//        return str;
//    }
    public static void main(String[] args) {
        System.out.println(sortSentence("sentence4 a3 is2 This1"));
//        System.out.println('1'-'0');
    }
}
