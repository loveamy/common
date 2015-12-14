package com.miracle9.common.entity;

import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * 桌开奖结果
 */
@Entity
public class DeskResult extends BaseEntity {
	private int roomId = 0;
	private int deskId;
	private String datetime = "";
	private int animal;// 普通、幸运奖时0-11 全局大三元时0-3
	private int color;// 大四喜时有效0-2
	private int songDengCount;
	private String moreInfo = "";// 送灯信息0-11的字符串,分割
	private int type;// 开奖类型 0-普通 1-全局奖项 2-幸运奖项
	private int globalType;// 全局奖项类型 0-彩金、1-闪电、2-送灯、3-大三元、4-大四喜
	private int luckType;// 幸运奖项类型 0-彩金，1-闪电，2-送灯
	private int awardGold;// 彩金数量
	private int luckNum;// 幸运中奖分机号
	private int luckAnimal;// 幸运奖动物 0-11
	private int zxh;// 庄闲和开奖 0-庄1-和2-闲
	private int lightningBeilv = 1;// 闪电倍率
	private int sumYaFen;//本局压分
	private int sumDeFen;//本局得分
	private int result;//本局盈利
	private int betPeople;//本局押注人数
	private int isForce = 0; //是否强制出奖
	
	//临时字段
	@Transient
	private String resultStr;//开奖结果描述
	
	public int getDeskId() {
		return deskId;
	}

	public void setDeskId(int deskId) {
		this.deskId = deskId;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public int getAnimal() {
		return animal;
	}

	public void setAnimal(int animal) {
		this.animal = animal;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getMoreInfo() {
		return moreInfo;
	}

	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getZxh() {
		return zxh;
	}

	public void setZxh(int zxh) {
		this.zxh = zxh;
	}

	public int getGlobalType() {
		return globalType;
	}

	public void setGlobalType(int globalType) {
		this.globalType = globalType;
	}

	public int getLuckType() {
		return luckType;
	}

	public void setLuckType(int luckType) {
		this.luckType = luckType;
	}

	public int getLuckNum() {
		return luckNum;
	}

	public void setLuckNum(int luckNum) {
		this.luckNum = luckNum;
	}

	public int getLuckAnimal() {
		return luckAnimal;
	}

	public void setLuckAnimal(int luckAnimal) {
		this.luckAnimal = luckAnimal;
	}

	public int getAwardGold() {
		return awardGold;
	}

	public void setAwardGold(int awardGold) {
		this.awardGold = awardGold;
	}

	public int getSongDengCount() {
		return songDengCount;
	}

	public void setSongDengCount(int songDengCount) {
		this.songDengCount = songDengCount;
	}

	public int getLightningBeilv() {
		return lightningBeilv;
	}

	public void setLightningBeilv(int lightningBeilv) {
		this.lightningBeilv = lightningBeilv;
	}

	public int getSumYaFen() {
		return sumYaFen;
	}

	public void setSumYaFen(int sumYaFen) {
		this.sumYaFen = sumYaFen;
	}

	public int getSumDeFen() {
		return sumDeFen;
	}

	public void setSumDeFen(int sumDeFen) {
		this.sumDeFen = sumDeFen;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getBetPeople() {
		return betPeople;
	}

	public void setBetPeople(int betPeople) {
		this.betPeople = betPeople;
	}

	public String getResultStr() {
		return resultStr;
	}

	public void setResultStr(String resultStr) {
		this.resultStr = resultStr;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getIsForce() {
		return isForce;
	}

	public void setIsForce(int isForce) {
		this.isForce = isForce;
	}
	

}
