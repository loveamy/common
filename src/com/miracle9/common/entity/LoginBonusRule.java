package com.miracle9.common.entity;

import javax.persistence.Entity;

@Entity
public class LoginBonusRule extends BaseEntity {
	private int oneDayBonus;
	private int twoDayBonus;
	private int threeDayBonus;
	private int fourDayBonus;
	private int fiveDayBonus;
	private int sixDayBonus;
	private int sevenDayBonus;
	private int gt7DayBonus;
	public int getOneDayBonus() {
		return oneDayBonus;
	}
	public void setOneDayBonus(int oneDayBonus) {
		this.oneDayBonus = oneDayBonus;
	}
	public int getTwoDayBonus() {
		return twoDayBonus;
	}
	public void setTwoDayBonus(int twoDayBonus) {
		this.twoDayBonus = twoDayBonus;
	}
	public int getThreeDayBonus() {
		return threeDayBonus;
	}
	public void setThreeDayBonus(int threeDayBonus) {
		this.threeDayBonus = threeDayBonus;
	}
	public int getFourDayBonus() {
		return fourDayBonus;
	}
	public void setFourDayBonus(int fourDayBonus) {
		this.fourDayBonus = fourDayBonus;
	}
	public int getFiveDayBonus() {
		return fiveDayBonus;
	}
	public void setFiveDayBonus(int fiveDayBonus) {
		this.fiveDayBonus = fiveDayBonus;
	}
	public int getSixDayBonus() {
		return sixDayBonus;
	}
	public void setSixDayBonus(int sixDayBonus) {
		this.sixDayBonus = sixDayBonus;
	}
	public int getSevenDayBonus() {
		return sevenDayBonus;
	}
	public void setSevenDayBonus(int sevenDayBonus) {
		this.sevenDayBonus = sevenDayBonus;
	}
	public int getGt7DayBonus() {
		return gt7DayBonus;
	}
	public void setGt7DayBonus(int gt7DayBonus) {
		this.gt7DayBonus = gt7DayBonus;
	}
	
	
}
