import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 2;
        l1.next = new ListNode();
        l1.next.val = 4;
        l1.next.next = new ListNode();
        l1.next.next.val = 3;

        ListNode l2 = new ListNode();
        l2.val = 5;
        l2.next = new ListNode();
        l2.next.val = 6;
        l2.next.next = new ListNode();
        l2.next.next.val = 4;

        ListNode l3 = addTwoNumbers(l1, l2);
        System.out.println(Integer.toString(l3.val) + Integer.toString(l3.next.val) + Integer.toString(l3.next.next.val));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        String sl1 = LNsum(l1);
        String sl2 = LNsum(l2);

        BigInteger bsl1 = new BigInteger(sl1);
        BigInteger bsl2 = new BigInteger(sl2);

        char[] total = bsl1.add(bsl2).toString().toCharArray();
        l3 = reverseLN(l3, total, 1);

        return l3;
    }

    public static String LNsum(ListNode l1) {
        String currNum = "";
        if (l1.next != null) {
            currNum = LNsum(l1.next);
        }
        currNum = currNum + l1.val;

        return currNum;
    }

    public static ListNode reverseLN(ListNode l3, char[] total, int listEnd) {
        if (total[0] != 'a') {
            l3.val = Integer.parseInt(Character.toString(total[total.length - listEnd]));
            total[total.length - listEnd] = 'a';
            listEnd++;
            if (total[0] != 'a') {
                l3.next = new ListNode();
                l3.next = reverseLN(l3.next, total, listEnd);
            }
        }
        return l3;
    }
}