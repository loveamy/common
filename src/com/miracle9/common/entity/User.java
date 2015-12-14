package com.miracle9.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 游戏用户
 */
@Entity
public class User extends BaseEntity {

	@Column(length = 50, nullable = false, unique = true)
	private String userName;
	@Column(length = 255, nullable = false)
	private String nickName;
	private String realName;
	private String password;
	private String mobilePhone;
	private String qq;// qq号码
	private String question;// 安全问题
	private String answer;// 问题答案
	private String signature = "";// 个性签名
	private String registDate;// 注册时间
	private String loginDate;// 登录时间
	private int status = 0;// 0-正常 1-封号 2-删号
	private String onlineStatus = "离线"; // 离线/大厅/房间名
	private int continueLoginDays; // 连续登录天数
	private int loginBonus; // 连续登录的奖励
	private int hasClaimedLoginBonus; // 是否领取本轮连续登录的奖励, 0未领取，1领取
	private int hasMessageToRead; // 是否有未读消息，0表示没有，1表示有
	private int gameGold = 0;// 游戏币
	private String headUrl = "1.png";// 头像地址
	private int userType = 0; // 会员类型 0-普通会员 1-超级玩家 2-游客
	private int userInfoModified = 0; // 用户信息是否修改过 0未修改过，1修改过
	private int luckNum;
	private String changeLuckNumDate;// 修改幸运号时间

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

	public String getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getGameGold() {
		return gameGold;
	}

	public void setGameGold(int gameGold) {
		this.gameGold = gameGold;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public int getContinueLoginDays() {
		return continueLoginDays;
	}

	public void setContinueLoginDays(int continueLoginDays) {
		this.continueLoginDays = continueLoginDays;
	}

	public int getLoginBonus() {
		return loginBonus;
	}

	public void setLoginBonus(int loginBonus) {
		this.loginBonus = loginBonus;
	}

	public int getHasClaimedLoginBonus() {
		return hasClaimedLoginBonus;
	}

	public void setHasClaimedLoginBonus(int hasClaimedLoginBonus) {
		this.hasClaimedLoginBonus = hasClaimedLoginBonus;
	}

	public int getUserInfoModified() {
		return userInfoModified;
	}

	public void setUserInfoModified(int userInfoModified) {
		this.userInfoModified = userInfoModified;
	}

	public int getHasMessageToRead() {
		return hasMessageToRead;
	}

	public void setHasMessageToRead(int hasMessageToRead) {
		this.hasMessageToRead = hasMessageToRead;
	}

	public int getLuckNum() {
		return luckNum;
	}

	public void setLuckNum(int luckNum) {
		this.luckNum = luckNum;
	}

	public String getChangeLuckNumDate() {
		return changeLuckNumDate;
	}

	public void setChangeLuckNumDate(String changeLuckNumDate) {
		this.changeLuckNumDate = changeLuckNumDate;
	}

}
