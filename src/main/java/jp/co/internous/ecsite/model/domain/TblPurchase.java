package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {
  private int id;
  
  private int userId;
  
  private int goodsId;
  
  private String goodsName;
  
  private int itemCount;
  
  private int total;
  
  private Timestamp createdAt;
  
  public void setId(int id) {
	  this.id = id;
  }
  public int getId() {
	  return id;
  }
  
  public void setUserId(int userId) {
	  this.userId = userId;
  }
  public int getUserId() {
	  return userId;
  }
  
  public void setGoodsId(int goodsId) {
	  this.goodsId = goodsId;
  }
  public int getGoodsId() {
	  return goodsId;
  }
  
  public void setGoodsName(String goodsName) {
	  this.goodsName = goodsName;
  }
  public String getGoodsName() {
	  return goodsName;
  }
  
  public void setItemCount(int itemCount) {
	  this.itemCount = itemCount;
  }
  public int getItemCount() {
	  return itemCount;
  }
  public void setCreatedAt(Timestamp createdAt) {
	  this.createdAt = createdAt;
  }
  public Timestamp getCreatedAt() {
	  return createdAt;
  }
  
  public void setTotal(int total) {
	  this.total = total;
  }
  public int getTotal() {
	  return total;
  }
}

