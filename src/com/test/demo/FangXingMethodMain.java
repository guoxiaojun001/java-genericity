package com.test.demo;

public class FangXingMethodMain {
	
	//���ͷ�����
	public <T> void show(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		FangXingMethodMain fxm = new FangXingMethodMain();
		fxm.show(100);
		fxm.show("shshh");
		fxm.show(true);
	}
}

