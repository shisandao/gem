package com.ssd.gem.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GemJournalAccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gem_journal_account.id
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gem_journal_account.order_id
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gem_journal_account.account_type
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private Integer accountType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gem_journal_account.amount
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gem_journal_account.pay_type
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private Integer payType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gem_journal_account.pay_date
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private Date payDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gem_journal_account.remarks
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gem_journal_account
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gem_journal_account.id
     *
     * @return the value of gem_journal_account.id
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gem_journal_account.id
     *
     * @param id the value for gem_journal_account.id
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gem_journal_account.order_id
     *
     * @return the value of gem_journal_account.order_id
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gem_journal_account.order_id
     *
     * @param orderId the value for gem_journal_account.order_id
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gem_journal_account.account_type
     *
     * @return the value of gem_journal_account.account_type
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gem_journal_account.account_type
     *
     * @param accountType the value for gem_journal_account.account_type
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gem_journal_account.amount
     *
     * @return the value of gem_journal_account.amount
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gem_journal_account.amount
     *
     * @param amount the value for gem_journal_account.amount
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gem_journal_account.pay_type
     *
     * @return the value of gem_journal_account.pay_type
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gem_journal_account.pay_type
     *
     * @param payType the value for gem_journal_account.pay_type
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gem_journal_account.pay_date
     *
     * @return the value of gem_journal_account.pay_date
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public Date getPayDate() {
        return payDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gem_journal_account.pay_date
     *
     * @param payDate the value for gem_journal_account.pay_date
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gem_journal_account.remarks
     *
     * @return the value of gem_journal_account.remarks
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gem_journal_account.remarks
     *
     * @param remarks the value for gem_journal_account.remarks
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_journal_account
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", accountType=").append(accountType);
        sb.append(", amount=").append(amount);
        sb.append(", payType=").append(payType);
        sb.append(", payDate=").append(payDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}