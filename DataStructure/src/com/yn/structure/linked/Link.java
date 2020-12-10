package com.yn.structure.linked;



/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/9-19:53
 */
public class Link<T> {
    private Node<T> root;//链表的根节点
    private int foot;//表示链表节点的索引（下标）
    private int count;//表示链表节点的个数
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

        //内部类里添加node
        public void addNode(Node newNode){
            if (this.nextNode==null){
                this.nextNode=newNode;
            }else {
                this.nextNode.addNode(newNode);
            }
        }
        //内部类里遍历
        public void printNode(){
            System.out.println(this.data);
            if (this.nextNode!=null){
                this.nextNode.printNode();
            }
        }

        /**
         * 内部类判断是否存在某一节点
         * @param data
         * @return
         */
        public boolean containsNode(T data){
            if (this.data.equals(data)){
                return true;
            }else {
                if (this.nextNode==null){
                    return false;
                }else {
                    return this.nextNode.containsNode(data);
                }
            }
        }

        /**
         * 返回指定索引下的数据
         * @param index
         * @return
         */
        public T getNode(int index){
            if (foot++==index){
                return this.data;
            }
            if (this.nextNode==null){
                    return null;
            }
            return   (T) this.nextNode.getNode(index);
        }

        /**
         * 内部类修改指定下标的节点数据
         * @param index
         * @param data
         */
        public void setNode(int index, T data){
            if (foot++==index){
                this.data = data;
            }else {
                if (this.nextNode!=null){
                    this.nextNode.setNode(index,data);
                }
            }
        }

        /**
         * 内部类中实现在指定索引位置添加新的节点
         * @param index 指定索引位置
         * @param previousNode 上一个节点
         * @param newNode 新的节点
         */
        public void addNode(int index,Node<T> previousNode,Node<T> newNode){
            if (foot++==index){
                //让当前节点成为新节点的下一个节点
                newNode.nextNode=this;
                //让新节点成为上一个节点的下节点
                previousNode.nextNode = newNode;
            }else {
                this.nextNode.addNode(index,this,newNode);
            }
        }

        /**
         * 内部类中实现根据索引删除
         * @param index 指定的索引值
         * @param previousNode 上一个节点
         */
        public void removeNode(int index,Node<T> previousNode){
            if (foot++==index){
                previousNode.nextNode = this.nextNode;
            }else {
                this.nextNode.removeNode(index,this);
            }
        }

        /**
         * 内部类实现根据数据删除
         * @param previousNode 上一个节点
         * @param data 传入的数据
         */
        public void removeNode(Node<T> previousNode,T data){
            if (this.data.equals(data)){
                previousNode.nextNode = this.nextNode;
            }else {
                this.nextNode.removeNode(this,data);
            }
        }

    }


    /******************以下是外部类的方法***********************/

    /**
     * 删除指定数据节点（外部类实现方法）
     * @param data 传入的数据
     */
    public void remove(T data){
        if (!this.contains(data)){
            //不存在直接结束
            return;
        }
        if (this.root.data.equals(data)){
            this.root = this.root.nextNode;
        }else {
            this.root.nextNode.removeNode(this.root,data);
        }
        this.count--;
    }

    /**
     * 删除指定索引处的节点（外部类方法实现）
     * @param index
     */
    public void remove(int index){
        if (index>=this.count||index<0){
            return;
        }
        if (index==0){
            //移除跟节点
            this.root = this.root.nextNode;
        }else {
            this.foot = 0;
            this.root.removeNode(index,this.root);
        }
        this.count--;
    }

    /**
     * 实现在指定位置添加新节点（外部类实现方法）
     * @param index
     * @param data
     */
    public void add(int index , T data){
        if (index>=this.count||index<0){
            return;
        }
        Node<T> newNode = new Node<>(data);
        if (index==0){
            //在根节点前插入节点
            newNode.nextNode=this.root;
            //更换根节点
            this.root = newNode;
        }else {
            this.foot=0;
            this.root.addNode(index,this.root,newNode);
        }

    }
    /**
     * 外部类修改指定下标的数据
     * @param index
     * @param data
     */
    public void set(int index,T data){
        if (index>=this.count||index<0){
            return;
        }
        if (this.root==null){
            return;
        }
        this.foot = 0;
        this.root.setNode(index,data);
    }

    /**
     * 外部类获取指定索引的数据
     * @param index
     * @return
     */
    public T get(int index){
        if (this.root==null){
            return null;
        }
        if (index>=this.count||index<0){
            return null;
        }
        this.foot=0;//重新初始化下标
        return this.root.getNode(index);
    }
    /**
     * 外部类判断链表中是否有指定数据
     * @param data
     * @return
     */
    public boolean contains(T data){
        if (this.root==null){
            return false;
        }
            return this.root.containsNode(data);
    }
    //外部类的添加节点
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (this.root==null){
            this.root=newNode;
        }else {
            this.root.addNode(newNode);
        }
        //更新个数
        this.count++;
    }

    //外部类的遍历方法
    public void print(){
        if (this.root==null){
            return;
        }
        this.root.printNode();
    }

    /**
     * 返回链表的长度
     * @return
     */
    public int size(){
        return this.count;
    }

    /**
     * 判断链表是否为空链表
     * @return
     */
    public boolean isEmpty(){
        return this.count==0;
    }
}
