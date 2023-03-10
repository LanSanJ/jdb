package com;

import java.util.HashMap;

/**
 * @version Test
 * @auther liao
 */
public class Test {
    public void main(String[] args) {
        ListNode l1 = new ListNode(1);//创建链表对象 l1 （对应有参 和 无参 构造方法）
        l1.add(2);				//插入结点，打印
        l1.add(3);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
       

    }
    //创建一个链表的类
    class ListNode{
        int val;	//数值 data
        ListNode next;	// 结点 node

        ListNode(int x){	//可以定义一个有参构造方法，也可以定义一个无参构造方法
            val = x;
        }
        // 添加新的结点
        public void add(int newval) {
            ListNode newNode = new ListNode(newval);
            if(this.next == null)
                this.next = newNode;
            else
                this.next.add(newval);
        }
        // 打印链表
        public void print() {
            System.out.print(this.val);
            if(this.next != null)
            {
                System.out.print("-->");
                this.next.print();
            }
        }
    }

}
