package jp.co.internous.ecsite.model.form;

import java.util.List;

public class CartForm {
	private int userId;
	
	private List<Cart> cartList;
	
	public int getUserId() {
		return userId;
	}
	public void setUserID(int userId) {
		this.userId = userId;
	}
	
	public List<Cart> getCartList(){
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

}
