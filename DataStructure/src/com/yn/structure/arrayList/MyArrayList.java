package com.yn.structure.arrayList;

import java.util.Arrays;

/**
 * @author yn
 * @class MyGithub
 * @describe 自定义ArrayList
 * @date 2020/12/10-21:07
 */
public class MyArrayList<E> {
    //初始化容量
    private static final int DEFAULT_CAPACITY=10;

    //空数组实例（调用有参构造方法创建集合的时候用来初始化）
    private static final Object[] EMPTY_ELETEMENTDATA={};

    //空数组实例（调用无参构造方法创建集合的时候用来初始化）
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELETEMENTDATA={};

    //真正保存数据的数组（这个属性不能被序列化）
    transient Object[] elementData;

    //记录元素的个数
    private int size;

    //容量的最大值（超过这个值可能会出现堆内存溢出）
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE-8;

    //有参构造
    public MyArrayList(int initialCapacity){
        if (initialCapacity>0){
            this.elementData=new Object[initialCapacity];
        }else if (initialCapacity==0){
            this.elementData = EMPTY_ELETEMENTDATA;
        }else {
            throw new IllegalArgumentException("错误的参数："+initialCapacity);
        }
    }

    //无参构造
    public MyArrayList(){
        this.elementData=DEFAULTCAPACITY_EMPTY_ELETEMENTDATA;
    }

    /**
     * 添加元素的方法，在添加元素之前要判断是否需要扩容
     * @param e 要添加的元素
     * @return 返回值
     */
    public boolean add(E e){
        //判断是否需要扩容
        ensureCapacityInternal(size+1);
        //添加元素
        elementData[size++] = e;
        //返回true
        return true;
    }

    /**
     * 确认当前容量是否足够用来保存新元素
     * @param minCapacity  需要的最小容量
     */
    private void ensureCapacityInternal(int  minCapacity){
        ensureExplicityCapacity(calculateCapacity(elementData,minCapacity));
    }

    /**
     * 计算需要的最小容量
     * @param elementData  数组
     * @param minCapacity  传递的最小容量
     * @return 返回值
     */
    private static int calculateCapacity(Object[] elementData,int minCapacity){
        if (elementData==DEFAULTCAPACITY_EMPTY_ELETEMENTDATA){
            //使用无参构造创建
            return Math.max(DEFAULT_CAPACITY,minCapacity);
        }
        return minCapacity;
    }

    /**
     * 决定是否要对当前数组扩容
     * @param minCapacity 计算出来需要的最小容量
     */
    private void ensureExplicityCapacity(int minCapacity){
        if (minCapacity-elementData.length>0){//elementData.length 表示当前数组的容量
            //扩容操作
            grew(minCapacity);
        }
    }

    /**
     * 实现扩容操作
     * @param minCapacity 计算出来需要的最小容量
     */
    private void grew(int minCapacity){
            int oldCapacity = elementData.length;//扩容之前的容量
            int newCapacity = oldCapacity+(oldCapacity>>1);//增长为原来的1.5倍
            if (newCapacity<minCapacity){//如果之后还是小于需要的最小容量
                newCapacity = minCapacity;
            }
            if (newCapacity>MAX_ARRAY_SIZE){
                if (minCapacity>MAX_ARRAY_SIZE){
                    newCapacity = Integer.MAX_VALUE;
                }else {
                    newCapacity = MAX_ARRAY_SIZE;
                }
            }
            //将原来数组拷贝到一个新的数组中，新数组的容量是newCapacity
            elementData = Arrays.copyOf(elementData,newCapacity);
    }

    /*方便检测  自定义输出方法*/
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i]+",");
        }
        System.out.println();
        System.out.println("当前元素的个数是："+size);
        System.out.println("当前的容量是："+elementData.length);
    }

    /**
     * 检测索引是否有效
     * @param index 指定的索引
     */
    private void rangeCheckForAdd(int index){
        if (index>size||index<0){
            throw new IndexOutOfBoundsException("索引不合法：index:"+index);
        }
    }

    /**
     * 在指定索引处添加元素
     * @param index  指定的索引
     * @param element 元素
     */
    public void add(int index,E element){
        //检测索引是否有效
        rangeCheckForAdd(index);
        //判断是否需要扩容
        ensureCapacityInternal(size+1);
        //将新元素插入指定位置
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index] = element;
        size++;
    }


}
