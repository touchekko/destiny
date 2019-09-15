<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="itemAddForm" class="itemForm" method="post">
			<tr>
				<td align="center" valign="middle" bgcolor="#FFFFFF">订单id:a</td>
				<td align="center" valign="middle" bgcolor="#FFFFFF">订单金额:5000元</td>
			</tr>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submita()">支付订单</a>
			<br></br>
			<tr>
				<td align="center" valign="middle" bgcolor="#FFFFFF">订单id:b</td>
				<td align="center" valign="middle" bgcolor="#FFFFFF">订单金额:6000元</td>

			</tr>
			
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitb()">支付订单</a>
			<br></br>
			<tr>
				<td align="center" valign="middle" bgcolor="#FFFFFF">订单id:a</td>
				<td align="center" valign="middle" bgcolor="#FFFFFF">订单金额:9000元</td>
			</tr>
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitc()">支付订单</a>
	
	    
<script type="text/javascript">
	function submita(){
		$.get("/order/pay?orderId=a",function(data){
			if(data==1){
				alert("支付成功，已经积分成功");
			}else{
				alert("支付失败，未能积分成功");
			}
		});
	}
	function submitb(){
		$.get("/order/pay?orderId=b",function(data){
			if(data==1){
				alert("支付成功，已经积分成功");
			}else{
				alert("支付失败，未能积分成功");
			}
		});
	}
	function submitc(){
		$.get("/order/pay?orderId=c",function(data){
			if(data==1){
				alert("支付成功，已经积分成功");
			}else{
				alert("支付失败，未能积分成功");
			}
		});
	}
</script>
