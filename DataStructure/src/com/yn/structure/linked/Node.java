package com.yn.structure.linked;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-19:26
 */
public class Node<T> {
    private T data;//保存数据
    private Node nextNode;//指向下一个节点的引用
    public Node(){}

    public Node(T data) {
        this.data = data;
    }

    public Node(Node nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
