package com.yn.structure.linked;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-19:29
 */
public class NodeTest {
    public static void main(String[] args) {
        Node<String> root = new Node<>("火车头");
        Node<String> n1 = new Node<>("车厢A");
        Node<String> n2 = new Node<>("车厢B");
        Node<String> n3 = new Node<>("车厢c");
        root.setNextNode(n1);
        n1.setNextNode(n2);
        n2.setNextNode(n3);

       /* Node<String> currentNode = root;
        //循环输出节点数据
        while (currentNode!=null){
            System.out.print(currentNode.getData()+"----->");
            currentNode=currentNode.getNextNode();
        }*/
       print(root);
    }

    public static void print(Node current){
        if (current==null){
            return;
        }
        System.out.print(current.getData()+"----->");
        print(current.getNextNode());
    }
}
