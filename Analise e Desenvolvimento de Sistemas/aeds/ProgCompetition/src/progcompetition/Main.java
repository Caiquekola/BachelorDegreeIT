package progcompetition;

public class Main {

    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        //["insertHead", 1, "insertHead", 2, 
//        "insertTail", 3, "insertTail", 4, "insertHead", 5, 
//        "get", 0, "get", 2, "get", 4, "remove", 2, "remove", 
//        0, "insertHead", 6, "insertTail", 7, "getValues", "get", 5]
        lk.insertHead(1);
        lk.insertHead(2);
        System.out.println(lk.getValues());
        lk.insertTail(3);
        System.out.println(lk.getValues());
        lk.insertTail(4);
        lk.insertHead(5);
        System.out.println(lk.getValues());
        System.out.println("Get 0 : " + lk.get(0));
        System.out.println("Get 2 : " + lk.get(2));
        System.out.println("Get 4 : " + lk.get(4));
        lk.remove(2);
        System.out.println(lk.getValues());
        lk.remove(0);
        System.out.println(lk.getValues());
        lk.insertHead(6);
        System.out.println(lk.getValues());
        lk.insertTail(7);
        System.out.println(lk.getValues());
        System.out.println(lk.length);
        System.out.println(lk.get(5));
    }

}
