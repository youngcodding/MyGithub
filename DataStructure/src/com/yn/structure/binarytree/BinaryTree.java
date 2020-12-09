package com.yn.structure.binarytree;

import javax.swing.plaf.synth.SynthInternalFrameUI;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-15:17
 */
public class BinaryTree {//表示二叉树的外部类
    private Node root;//根节点
    private int count; //节点个数统计

    public class Node{//表示二叉树的内部类（本次二叉树用来操作int类型）
        private int data;//节点数据
        private Node left;//左节点
        private Node right;//右节点
        private Node parent;//父节点

        public Node(int data) {
            this.data = data;
        }
        //自内部类中定义添加节点的方法。
        public boolean addNode(Node newNode){
            if (newNode.data<this.data){//往左边添加
                if (this.left==null){
                    this.left=newNode;
                    newNode.parent=this;
                }else {
                    return  this.left.addNode(newNode);
                }
            }else if (newNode.data>this.data){//往右边添加
                if (this.right==null){
                    this.right=newNode;
                    newNode.parent=this;
                }else {
                    return this.right.addNode(newNode);
                }
            }else {
                //相等
                return false;
            }
            return true;
        }

        //在内部类中定义查找节点的方法
        public boolean containsNode(int data){
            if (this.data==data){
                return true;
            }else if (this.data>data){
                if (this.left!=null){
                  return   this.left.containsNode(data);
                }
            }else {
                if (this.right!=null){
                    return this.right.containsNode(data);
                }
            }
            return false;
        }

        //在内部类中先序遍历
        public void traversingNode(){
            System.out.print(this.data+" ");
            if (this.left!=null){
                this.left.traversingNode();
            }
            if (this.right!=null){
                this.right.traversingNode();
            }
        }

        //在内部类中先序遍历
        public void traversingNodeM(){
            if (this.left!=null){
                this.left.traversingNodeM();
            }
            System.out.print(this.data+" ");
            if (this.right!=null){
                this.right.traversingNodeM();
            }
        }

        //在内部类中先序遍历
        public void traversingNodeL(){
            if (this.left!=null){
                this.left.traversingNodeL();
            }
            if (this.right!=null){
                this.right.traversingNodeL();
            }
            System.out.print(this.data+" ");
        }
    }
    /*************************以上是内部类的内容，以下是外部类的内容*******************************/
    //在外部类中定义遍历的方法
    public void traversing(){
        if (this.root!=null){
            this.root.traversingNode();
        }
    }
    public void traversingM(){
        if (this.root!=null){
            this.root.traversingNodeM();
        }
    }
    public void traversingL(){
        if (this.root!=null){
            this.root.traversingNodeL();
        }
    }

    //在外部类定义查找节点的方法
    public boolean contains(int data){
        if (this.root==null){
            return false;
        }
        return this.root.containsNode(data);
    }

    //在外部类定义添加的方法
    public boolean add(int data){
        Node node = new Node(data);
        if (this.root==null){
            this.root=node;
        }else {
           return this.root.addNode(node);
        }
        this.count++;
        return true;
    }
}
