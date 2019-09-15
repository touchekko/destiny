package cn.tedu.mapper;

import cn.tedu.domain.Order;
import cn.tedu.domain.User;

public interface OrderUserMapper {
	/**
	 * 根据user_id
	 */
	public User selectUserById(Integer userId);

	public Order selectOrderById(String orderId);

	public void updateUserPointsById(User parUser);
}
