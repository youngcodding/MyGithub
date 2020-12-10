package com.yn.structure.linked;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/10-11:20
 */
public class DoubleLink<E> {//双向链表类
    private int size;//链表长度
    //private Node<E> first;//首节点
    public Node<E> first;//首节点
    private Node<E> last;//尾节点

    public class Node<E>{//内部节点类
        private E item;//节点数据
        private Node<E> prev;//前驱引用
        private Node<E> next;//后驱引用

        public Node(Node<E> prev,E item , Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
    /*这次不在内部类中定义方法，直接在内部类中定义*/

    /*定义添加首节点的私有方法*/
    private void linkFirst(E e){
        Node<E> f = first; //将当前的首节点保存到f变量中
        Node<E> newNode  = new Node<>(null,e,f);//这是将成为首节点的新节点
        first = newNode;//将新节点设置为首节点
        if (f==null)//如果之前的首节点为null，则这个新节点既是首节点也是尾节点
            last=newNode;
        else//如果不是空链表，就将之前首节点的前驱引用设置为新节点
            f.prev=newNode;
        size++;//链表数量增加
    }
    /*定义添加尾节点的私有方法*/
    private void linkLast(E e){
        Node<E> l = last;//将当前的尾节点保存l变量中
        Node<E> newNode = new Node<>(l,e,null);//这是将成为尾节点的新节点
        last=newNode;//将新节点设置为尾节点
        if (l==null)//如果之前的尾节点为null，则这个新节点既是首节点也是尾节点
            first=newNode;
        else//如果不是空链表，就将之前的尾节点的后驱引用设置为新节点
            l.next=newNode;
        size++;//链表数量增加
    }

    /*校验索引*/
    private void checkElementIndex(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("Index:"+index+",Size"+size);
        }
    }
    /*返回指定索引处的非空节点*/
    private Node<E> getNode(int index){
        if(index<(size>>1)){
            //index在前半段
            Node<E> x = first;
            for (int i = 0; i <index ; i++) {
                x=x.next;
            }
            return x;
        }else {
            //index在后半段
            Node<E> x = last;
            for (int i = size-1; i > index; i--) {
                x=x.prev;
            }
            return x;
        }
    }

    /**
     * 这是一个公共的方法，可能其他多个方法都要调用
     * 从列表中删除一个非空数据
     * @param x 要被删除的节点
     * @return 返回删除节点的数据
     */
    private E unLink(Node<E> x){
        E element = x.item;//保存要删除的数据
        Node<E> next = x.next;//保存删除节点的下一个节点
        Node<E> prev = x.prev;//保存的是删除节点的上一个节点
        if (prev==null){//满足条件表示删除节点是首节点
           first = next;//让删除节点的下一个节点成为首节点
        }else {
            prev.next = next;//让删除节点的下一个节点成为删除节点的下一个节点的上一个节点
            x.prev = null;//将删除节点的prev引用设置为null
        }
        if (next==null){//满足条件表示删除节点是尾节点
            last = prev;//让删除节点的上一个节点成为尾节点
        }else {
            next.prev = prev;//将删除节点的下一个节点的上一节点设置为删除节点的上一个节点
            x.next = null;//将删除节点的next引用设为null
        }
        x.item = null;//将删除节点的数据设置为null
        size--;//链表的长度减一
        return element;
    }

    /**
     * 修饰指定索引处节点数据
     * @param index  指定索引
     * @param e 修改的数据
     */
    public void set(int index,E e){
        checkElementIndex(index);//校验索引
        getNode(index).item = e;//获取指定索引的节点，并给这个节点重新赋值
    }
    /**
     * 在指定所索引处插入节点数据
     * @param index  指定索引处
     * @param e 数据
     */
    public void add(int index,E e){
        checkElementIndex(index);//校验索引
        if (index==0){ //如果是0 就表示在首节点之前插入
            addFirst(e);//直接调用添加首节点方法
            return;
        }
        Node<E> n = getNode(index); //调用获取指定索引的节点方法获取节点赋值给变量n
        Node<E> prev = n.prev;  //获取n的上一个节点prev
        //此时插入节点 就是在prev和n之间插入这个新节点
        Node<E> newNode = new Node<>(prev,e,n);//创建新节点 上节点指定为prev  下节点指定为n
        prev.next = newNode;//指定prev的下一个节点为新节点
        n.prev = newNode;//之前原来索引处的节点n的上一个节点为新节点
    }

    /**
     * 返回链表的节点数
     * @return 返回值是int类型
     */
    public int size(){
        return size;
    }

    /**
     * 删除指定节点
     * @param o
     * @return
     */
    public boolean remove(Object o){
        if (o==null){
            for (Node<E> x = first;x!=null;x=x.next){
                if (x.item==null){
                    unLink(x);
                    return true;
                }
            }
        }else {
            for (Node<E> x = first;x!=null;x=x.next){
                if (o.equals(x.item)){
                    unLink(x);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 删除指定索引的数据
     * @param index
     * @return
     */
    public E remove(int index){
        checkElementIndex(index);
        return unLink(getNode(index));
    }
    /**
     * 获取链表指定索引位置的元素
     * @param index 索引值
     * @return 返回的数值
     */
    public E get(int index){
        checkElementIndex(index);
        return getNode(index).item;
    }
    /**
     * 把指定元素添加到链表后面
     * @param e 要添加的元素
     */
    public void addLast(E e){
        linkLast(e);
    }
    /**
     * 把指定元素添加到链表前面
     * @param e 要添加的元素
     */
    public void addFirst(E e){
       linkFirst(e);
    }

    /*输出链表-测试使用*/
    public void print(Node<E> e){
        if (e!=null){
            System.out.println(e.item);
            if (e.next!=null){
                print(e.next);
            }
        }
    }
}
