package com.miracle9.common.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * 房间内的桌
 */
@Entity
public class Desk extends BaseEntity {
	private String name;
	private int maxGold; // 最大携带
	private int minGold;// 最少携带
	private int minBet;// 最少动物押注
	private int maxBet;// 最大动物押注
//	private int min_zxh;// 最少庄闲和押注
//	private int max_zx;// 最大庄闲押注
//	private int max_h;// 最大和押注
	private int betTime = 30;// 押注时间(秒)
	private int exchange = 1;// 即一个游戏币可以换算成的游戏分值
	private int animalDiff = 1;// 动物难度 0、1、2 易 中 难
//	private int zxhDiff = 1;// 庄闲和难度
	private int beilvType = 0;// 0-46倍组合、1-68倍组合、2-78倍组合
	private int beilvModel = 1;// 0-固定，1-打乱
	private int siteType = 1;// 0-小型场地，1-中型场地，2-大型场地
	private int waterType = 0;// 0抽水 1注水
	private int waterValue = 0;// 注水/抽水值
	@Column(updatable = false)
	private long sumYaFen = 0;// 总压分(所有)
	@Column(updatable = false)
	private long sumDeFen = 0;// 总得分(所有)
	private int autoKick = 1;// 自动踢出挂机玩家 0 不踢 1 踢
//	@Column(updatable = false)
//	private long sumZhxYaFen = 0;// 庄和闲总压分
//	@Column(updatable = false)
//	private long sumZhxDeFen = 0;// 庄和闲总得分
	private int orderBy = 0;// 排序字段
	private String chip; // 筹码选择 1|200|500|2000|5000
	private String virtualBet; // 虚拟押注次数 10|20|30|10|20|30
	private int type;// 0表示万人场，1表示六人场
	private int hideBet;// 隐藏押注 0-否 1-是

	// 临时字段
	@Transient
	private int onlineNumber;// 在线人数
	@Transient
	private List<Object> headUrls = new ArrayList<Object>();// 在线玩家Map

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinGold() {
		return minGold;
	}

	public void setMinGold(int minGold) {
		this.minGold = minGold;
	}

	public int getMinBet() {
		return minBet;
	}

	public void setMinBet(int minBet) {
		this.minBet = minBet;
	}

	public int getMaxBet() {
		return maxBet;
	}

	public void setMaxBet(int maxBet) {
		this.maxBet = maxBet;
	}

//	public int getMin_zxh() {
//		return min_zxh;
//	}
//
//	public void setMin_zxh(int minZxh) {
//		min_zxh = minZxh;
//	}
//
//	public int getMax_zx() {
//		return max_zx;
//	}
//
//	public void setMax_zx(int maxZx) {
//		max_zx = maxZx;
//	}
//
//	public int getMax_h() {
//		return max_h;
//	}
//
//	public void setMax_h(int maxH) {
//		max_h = maxH;
//	}

	public int getBetTime() {
		return betTime;
	}

	public void setBetTime(int betTime) {
		this.betTime = betTime;
	}

	public int getExchange() {
		return exchange;
	}

	public void setExchange(int exchange) {
		this.exchange = exchange;
	}

	public int getAnimalDiff() {
		return animalDiff;
	}

	public void setAnimalDiff(int animalDiff) {
		this.animalDiff = animalDiff;
	}

//	public int getZxhDiff() {
//		return zxhDiff;
//	}
//
//	public void setZxhDiff(int zxhDiff) {
//		this.zxhDiff = zxhDiff;
//	}

	public int getBeilvType() {
		return beilvType;
	}

	public void setBeilvType(int beilvType) {
		this.beilvType = beilvType;
	}

	public int getBeilvModel() {
		return beilvModel;
	}

	public void setBeilvModel(int beilvModel) {
		this.beilvModel = beilvModel;
	}

	public int getSiteType() {
		return siteType;
	}

	public void setSiteType(int siteType) {
		this.siteType = siteType;
	}

	public int getWaterType() {
		return waterType;
	}

	public void setWaterType(int waterType) {
		this.waterType = waterType;
	}

	public int getWaterValue() {
		return waterValue;
	}

	public void setWaterValue(int waterValue) {
		this.waterValue = waterValue;
	}

	public int getOnlineNumber() {
		return onlineNumber;
	}

	public void setOnlineNumber(int onlineNumber) {
		this.onlineNumber = onlineNumber;
	}

	public long getSumYaFen() {
		return sumYaFen;
	}

	public void setSumYaFen(long sumYaFen) {
		this.sumYaFen = sumYaFen;
	}

	public long getSumDeFen() {
		return sumDeFen;
	}

	public void setSumDeFen(long sumDeFen) {
		this.sumDeFen = sumDeFen;
	}

	public int getAutoKick() {
		return autoKick;
	}

	public void setAutoKick(int autoKick) {
		this.autoKick = autoKick;
	}

//	public long getSumZhxYaFen() {
//		return sumZhxYaFen;
//	}
//
//	public void setSumZhxYaFen(long sumZhxYaFen) {
//		this.sumZhxYaFen = sumZhxYaFen;
//	}
//
//	public long getSumZhxDeFen() {
//		return sumZhxDeFen;
//	}
//
//	public void setSumZhxDeFen(long sumZhxDeFen) {
//		this.sumZhxDeFen = sumZhxDeFen;
//	}

	public int getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getVirtualBet() {
		return virtualBet;
	}

	public void setVirtualBet(String virtualBet) {
		this.virtualBet = virtualBet;
	}

	public int getMaxGold() {
		return maxGold;
	}

	public void setMaxGold(int maxGold) {
		this.maxGold = maxGold;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Object> getHeadUrls() {
		return headUrls;
	}

	public void setHeadUrls(List<Object> headUrls) {
		this.headUrls = headUrls;
	}

	public int getHideBet() {
		return hideBet;
	}

	public void setHideBet(int hideBet) {
		this.hideBet = hideBet;
	}

}
