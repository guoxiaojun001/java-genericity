package com.test.demo;

//�����ࣺ
public class FanXingLeiDemo<T> {//�����Ƿ��ͣ����Դ�����Ĳ���
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		FanXingLeiDemo<String> fxd = new FanXingLeiDemo<String>();
		fxd.setObj("hahaha");
		System.out.println(fxd.getObj());
	}
}
