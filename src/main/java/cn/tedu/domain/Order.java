package cn.tedu.domain;
/**
 * 满足驼峰命名法,这样可以在写SQL时不用写映射
 */
public class Order {
	private String orderId;//对应数据库的order_id
	private Integer orderMoney;//对应order_money
	private Integer userId;//对应user_id
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderMoney=" + orderMoney + ", userId=" + userId + "]";
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(Integer orderMoney) {
		this.orderMoney = orderMoney;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
