package com.mxz;

/**
 * ClassName:LinkedList
 * PackageName:com.mxz
 * Description:
 *
 * @date:2019/10/24 18:20
 * @authorBy:mxzmxzmxz0828@gmail.com
 */
public class LinkedList {

    //头指针
    private Node head;
    //尾指针
    private Node last;
    //链表长度
    private int maxSize;

    /**
     * 定义节点的内部类供链表使用
     */
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data,int index){
        boolean flag = false;
        //判断链表指针是否超出链表范围
        if(index < 0 || index > maxSize){
            throw new IndexOutOfBoundsException("指针超出链表范围");
        }
        //将插入的数据封装成一个节点
        Node insertNode = new Node(data);
        if(maxSize ==0 ){
            //空链表
            head = insertNode;
            last = insertNode;
        }else if(index == 0){
            //头插
            insertNode.next = head;
            head = insertNode.next;
        }else if(index == maxSize){
            //尾插
            insertNode.next = null;
            last.next = insertNode;
            last = insertNode;
        }else{
            //插入的是中间位置
            Node prevNode = get(index-1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        maxSize++;

    }

    /**
     * 根据index获取到当前节点的元素
     * @param index 输入的索引
     * @return  返回一个节点
     */
    public Node get(int index){
        //对索引进行判断
        if(index < 0 || index > maxSize){
            throw new IndexOutOfBoundsException("索引超出链表范围!");
        }
        Node temp = head;
        for(int i =0; i<index-1;i++){
            temp = temp.next;
        }

        return temp;
    }

    public int remove(int index){
        if(index<0 || index >maxSize){
            throw new IndexOutOfBoundsException("索引超出链表范围！");
        }
        //定义一个节点存放被删除的元素
        Node removeNode = null;
        if(index == 0){
            //删除的是头结点
            removeNode = head;
            head = head.next;
        }else if(index == maxSize -1){
            //删除的是尾节点
            Node prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        }else{
            //删除的是中间节点
            Node prevNode = get(index-1);
            removeNode = prevNode.next;
            prevNode.next = prevNode.next.next;
        }
        return removeNode.data;
    }

    //倒数第k个
    public int findKBack(int k){
        //k<=0和k>链表长度
        if(k<=0 || k > maxSize){
            throw new IndexOutOfBoundsException("长度错误!");
        }

        //删除倒数第K个元素，定义一个和头指针间隔k的指针元素
        Node first = get(k);
        Node second = head;
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        return second.data;
    }

}

