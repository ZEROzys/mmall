package com.mmall.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.order_no
     *
     * @mbg.generated
     */
    private Long orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.shipping_id
     *
     * @mbg.generated
     */
    private Integer shippingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.payment
     *
     * @mbg.generated
     */
    private BigDecimal payment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.payment_type
     *
     * @mbg.generated
     */
    private Integer paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.postage
     *
     * @mbg.generated
     */
    private Integer postage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.payment_time
     *
     * @mbg.generated
     */
    private Date paymentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.send_time
     *
     * @mbg.generated
     */
    private Date sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.close_time
     *
     * @mbg.generated
     */
    private Date closeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mmall_order.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mmall_order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.id
     *
     * @return the value of mmall_order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.id
     *
     * @param id the value for mmall_order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.order_no
     *
     * @return the value of mmall_order.order_no
     *
     * @mbg.generated
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.order_no
     *
     * @param orderNo the value for mmall_order.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.user_id
     *
     * @return the value of mmall_order.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.user_id
     *
     * @param userId the value for mmall_order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.shipping_id
     *
     * @return the value of mmall_order.shipping_id
     *
     * @mbg.generated
     */
    public Integer getShippingId() {
        return shippingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.shipping_id
     *
     * @param shippingId the value for mmall_order.shipping_id
     *
     * @mbg.generated
     */
    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.payment
     *
     * @return the value of mmall_order.payment
     *
     * @mbg.generated
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.payment
     *
     * @param payment the value for mmall_order.payment
     *
     * @mbg.generated
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.payment_type
     *
     * @return the value of mmall_order.payment_type
     *
     * @mbg.generated
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.payment_type
     *
     * @param paymentType the value for mmall_order.payment_type
     *
     * @mbg.generated
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.postage
     *
     * @return the value of mmall_order.postage
     *
     * @mbg.generated
     */
    public Integer getPostage() {
        return postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.postage
     *
     * @param postage the value for mmall_order.postage
     *
     * @mbg.generated
     */
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.status
     *
     * @return the value of mmall_order.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.status
     *
     * @param status the value for mmall_order.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.payment_time
     *
     * @return the value of mmall_order.payment_time
     *
     * @mbg.generated
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.payment_time
     *
     * @param paymentTime the value for mmall_order.payment_time
     *
     * @mbg.generated
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.send_time
     *
     * @return the value of mmall_order.send_time
     *
     * @mbg.generated
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.send_time
     *
     * @param sendTime the value for mmall_order.send_time
     *
     * @mbg.generated
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.end_time
     *
     * @return the value of mmall_order.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.end_time
     *
     * @param endTime the value for mmall_order.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.close_time
     *
     * @return the value of mmall_order.close_time
     *
     * @mbg.generated
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.close_time
     *
     * @param closeTime the value for mmall_order.close_time
     *
     * @mbg.generated
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.create_time
     *
     * @return the value of mmall_order.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.create_time
     *
     * @param createTime the value for mmall_order.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mmall_order.update_time
     *
     * @return the value of mmall_order.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mmall_order.update_time
     *
     * @param updateTime the value for mmall_order.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_order
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", userId=").append(userId);
        sb.append(", shippingId=").append(shippingId);
        sb.append(", payment=").append(payment);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", postage=").append(postage);
        sb.append(", status=").append(status);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}