package com.miracle9.common.dao;

import org.hibernate.Query;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.miracle9.common.entity.LoginBonusRule;

@Repository
public class LoginBonusRuleDao extends BaseDao<LoginBonusRule, Integer> {
	/**
	 * 更新系统配置
	 * 
	 * @param config
	 */
	@CacheEvict(value = "springCache", key = "'getLoginBonusRule'")
	public void updateLoginBonusRule(LoginBonusRule loginBonusRule) {
		String hql = "update LoginBonusRule set oneDayBonus=:oneDayBonus,twoDayBonus=:twoDayBonus,threeDayBonus=:threeDayBonus,fourDayBonus=:fourDayBonus,fiveDayBonus=:fiveDayBonus,sixDayBonus=:sixDayBonus,sevenDayBonus=:sevenDayBonus,gt7DayBonus=:gt7DayBonus";
		Query query = getSession().createQuery(hql);
		query.setProperties(loginBonusRule);
		query.executeUpdate();
	}

	/**
	 * 获取系统配置
	 * 
	 * @return
	 */
	@Cacheable(value = "springCache", key = "'getLoginBonusRule'")
	public LoginBonusRule getLoginBonusRule() {
		return queryByHql("from LoginBonusRule");
	}
}
