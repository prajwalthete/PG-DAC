package com.prajwal.comp;

public class MyBean {

	private int msgId;
	private String msg;

	public MyBean(int msgId, String msg) {
		System.out.println("param constructor called");
		this.msgId = msgId;
		this.msg = msg;
	}

	public int getMsgId() {
		return msgId;
	}

	public String getMsg() {
		return msg;
	}

}
