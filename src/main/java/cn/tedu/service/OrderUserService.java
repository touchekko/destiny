package cn.tedu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.domain.Order;
import cn.tedu.domain.User;
import cn.tedu.mapper.OrderUserMapper;

@Service
public class OrderUserService {
	@Autowired
	private OrderUserMapper orderUserMapper;
	
	public User getUserById(Integer userId) {
		return orderUserMapper.selectUserById(userId);
	}
	
	/**
	 * 支付逻辑;打印支付金额()
	 * 根据金额对积分进行跟新()
	 * @param orderId
	 */
	public void orderPay(String orderId) {
		Order order = orderUserMapper.selectOrderById(orderId);
		System.out.println("用户"+order.getUserId()+"支付了"+order.getOrderMoney()+"元");
		User parUser = new User();
		parUser.setUserId(order.getUserId());
		parUser.setPoints(order.getOrderMoney());
		orderUserMapper.updateUserPointsById(parUser);
	}
}
