package com.bandgear.apfree.bean;

public class MacWhite {
	/**
	 *"id":"1",
		"ap_id":"1",
		"mac":"00:ff:12:21:21:09",
		"enable":"0"
	 */
	private int id;
	private int ap_id;
	private String mac;
	private int enable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAp_id() {
		return ap_id;
	}
	public void setAp_id(int ap_id) {
		this.ap_id = ap_id;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	
}