package cn.tedu.domain;

/**
 * 对应数据库的user表格,每一行数据对应一个bean
 */
public class User {
	private Integer userId;
	private Integer lev;
	private Integer points;
	@Override
	public String toString() {
		return "User [userId=" + userId + ", lev=" + lev + ", points=" + points + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getLev() {
		return lev;
	}
	public void setLev(Integer lev) {
		this.lev = lev;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	
}
