package com.cg.main.exceptions;

import java.time.LocalDate;

public class Error {
	private String msg;
	private LocalDate date;
	private String desc;
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * 
	 */
	public Error() {
		super();
	}
	/**
	 * @param msg
	 * @param date
	 * @param desc
	 */
	public Error(String msg, LocalDate date, String desc) {
		super();
		this.msg = msg;
		this.date = date;
		this.desc = desc;
	}

}
