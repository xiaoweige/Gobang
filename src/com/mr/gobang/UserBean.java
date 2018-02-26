package com.mr.gobang;

import java.io.Serializable;
import java.net.InetAddress;
import java.sql.Time;

/**
 * 用户类
 */
public class UserBean implements Serializable {
	protected String name = "游客";// 用户名称
	protected InetAddress host;// 用户IP地址
	private Time time;// 用户创建时间

	public InetAddress getHost() {
		return host;
	}

	public void setHost(InetAddress host) {
		this.host = host;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Time getTime() {
		return time;
	}

	public String toString() {
		return getName();
	}
}
