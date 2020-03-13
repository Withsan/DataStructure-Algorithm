package com.wyl.satastructureandalgorithm.datastructure.linkedlist;

import java.util.Stack;

/**
 * 我的单向链表
 *
 * @author Wyl
 * @date 2019-12-19 21:54
 */
public class MyLinkedList<E> {
    Node<E> first;
    Node<E> last;
    int size = 0;

    private static final class Node<E> {
        E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
        @Override
        public String toString() {
            return item.toString();
        }
    }

    public MyLinkedList() {

    }

    /**
     * 尾部添加
     *
     * @param item
     */
    public void add(E item) {
        final Node<E> l = last;
        Node<E> node = new Node<>(item, null);
        last = node;
        if (l == null) {
            first = node;
        }else {
            l.next = node;
        }
        size ++;
    }

    /**
     * 移除index节点
     * @param index 要移除的节点在链表中的位置
     * @return
     */
    public E remove(int index){
        if(index<0){
            throw new IllegalArgumentException("下标小于零");
        }
        if(index>size){
            return null;
        }
        // 目标前一个节点
        Node<E> prev;
        if(index == 0){
            return unLinkFirst();
        }else {
            prev = node(index-1);
        }
        //目标后一个节点
        Node<E> next ;
        if(index == size-1){
            return unLinkLast();
        }else {
            next = node(index+1);
        }
        //目标前节点连接到目标后节点
        prev.next = next;
        // 返回目标节点
        Node<E> node = node(index);
        // size减小
        size--;
        return node.item;
    }

    /**
     * 删除第一个节点
     * @return 第一个节点的值
     */
    private E unLinkFirst(){
        Node<E> fn = first.next;
        Node<E> f = first;
        f.next = null;
        first = fn;
        size--;
        return f.item;
    }

    /**
     * 删除最后一个节点
     * @return
     */
    private E unLinkLast(){
        Node<E> l = last;
        Node<E> l2 = node(size - 2);
        l2.next = null;
        size--;
        return l.item;
    }
    /**
     * 获取位置为index的节点
     * @param index
     * @return
     */
    private Node<E> node(int index) {
        Node<E> node= first;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }

    /**
     * 打印所有的数据
     */
    public void showList() {
        final Node<E> f = first;
        if (f == null) {
            System.out.println("空链表哟~");
            return;
        }
        printRecursive(f);
        printLoop(f);
    }

    /**
     * 递归打印
     *
     * @param node
     */
    private void printRecursive(Node<E> node) {
        if (node == null) {
            return;
        }
        System.out.println("递归打印"+node);
        printRecursive(node.next);
    }
    /**
     * 循环
     *
     * @param node
     */
    private void printLoop(Node<E> node) {
        if (node == null) {
            return;
        }
       for (Node<E> item = node;item!=null;item = item.next){
           System.out.println("循环打印"+item);
       }
    }

    /**
     * 获取第一个元素
     *
     * @return
     */
    public E getFirst() {
        return first.item;
    }

    /**
     * 获取最后一个元素
     *
     * @return
     */
    public E getLast() {
        return last.item;
    }

    /**
     * 反转list顺序
     */
    public void reverse(){
        Node<E> f = new Node<>(null,null);
        Node<E> node = first;
        Node<E> next;
        while (node != null){
            next = node.next;
            node.next= f.next;
            f.next = node;
            node = next;
        }
        last = first;
        last.next = null;
        first = f.next;
    }
    /**
     * 倒序打印
     */
    public void reverseShow(){
        Stack<Node<E>>  stack = new Stack<>();
        Node<E>  node = first;
        while (node.next!=null){
            stack.add(node);
            node = node.next;
        }
        stack.add(node);
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
