package com.test.demo;

// ʵ������
//ʵ�ֽӿڣ�
public class  Demo<T> implements Inter<T> {
	@Override
	public void show(T t) {
		// TODO �Զ����ɵķ������
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		// ����ʵ�ֵĲ�����һ�� �������õķ�����ʲô����
		Inter<String> ins = new Demo<String>();
		ins.show("hahah");

		Inter<Boolean> inb = new Demo<Boolean>();
		inb.show(true);

		Inter<Integer> ini = new Demo<Integer>();
		ini.show(123);

	}
}