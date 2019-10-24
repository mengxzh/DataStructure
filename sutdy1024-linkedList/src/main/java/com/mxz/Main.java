package com.mxz;

/**
 * ClassName:Main
 * PackageName:com.mxz
 * Description:
 *
 * @date:2019/10/24 18:35
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1, 0);
        linkedList.insert(2, 1);
        linkedList.insert(3, 2);
        linkedList.insert(4, 3);
        linkedList.insert(5, 4);
        linkedList.insert(6, 5);
        linkedList.insert(7, 6);
        linkedList.insert(8, 7);
        linkedList.insert(9, 8);

        System.out.println(linkedList.findKBack(3));

    }
}
