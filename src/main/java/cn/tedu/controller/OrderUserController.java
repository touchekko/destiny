package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.domain.User;
import cn.tedu.service.OrderUserService;
/**
 * ResponseBody将数据完整传递给ajax
 */
@RestController
public class OrderUserController {
	@Autowired
	private OrderUserService orderUserService;
	@RequestMapping("/user/query/point")
	public User queryUserPoints(Integer userId) {
		
		return orderUserService.getUserById(userId);
	}
	
	/**
	 * 订单支付和积分跟新访问接收
	 */
	@RequestMapping("/order/pay")
	public Integer orderPay(String orderId) {
		try {
			orderUserService.orderPay(orderId);
			return 1;
		} catch (Exception e){
			return 0;
		}
	}
}
