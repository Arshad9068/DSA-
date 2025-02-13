import java.util.Objects;

public class temp {
    public static void main(String[] args) {
        ListNode nd1 = new ListNode(3);
        ListNode nd2 = new ListNode(10,nd1);
        ListNode nd3 = new ListNode(6,nd2);
        ListNode nd4 = new ListNode(18,nd3);

        Solution obj = new Solution();
//        ListNode xy = obj.insertGreatestCommonDivisors(nd4);
        System.out.println(nd4);

        char x= '9';
        char y = '2';
        char z = (char)(x-y);
        System.out.println(x-y);


    }
}
//18,6,10,3