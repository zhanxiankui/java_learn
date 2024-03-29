package com.commons.studyone;

/**
 * 这是是测试二叉树的类，二叉树的功能比较多，junit测试写的麻烦，故写一个测试类。
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>succez</p>
 * @author w
 * @createdate 2019年8月2日
 */

public class TestBinaryTree {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree("A");

		TNode t1 = bt.add(bt.getRoot(), "B", true);
		TNode t2 = bt.add(bt.getRoot(), "D", false);

		TNode t3 = bt.add(t1, "G", true);
		TNode t4 = bt.add(t1, "H", false);

		TNode t5 = bt.add(t2, "C", true);
		TNode t6 = bt.add(t2, "F", false);

		System.out.println("-----" + bt.treeLevel(bt.getRoot(), 2));

	}

}
