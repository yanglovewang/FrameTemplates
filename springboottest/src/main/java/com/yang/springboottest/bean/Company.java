package com.yang.springboottest.bean;


import com.yang.springboottest.commons.OpType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Company implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.company_name
     *
     * @mbg.generated
     */
    @NotBlank(groups = {OpType.Create.class,OpType.Update.class})
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.simple_name
     *
     * @mbg.generated
     */
    private String simpleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.license_code
     *
     * @mbg.generated
     */
    @NotBlank(groups = {OpType.Create.class,OpType.Update.class})
    private String licenseCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.license_image
     *
     * @mbg.generated
     */
    @NotBlank(groups = {OpType.Create.class,OpType.Update.class})
    private String licenseImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.bank_name
     *
     * @mbg.generated
     */
    @NotBlank(groups = {OpType.Create.class,OpType.Update.class})
    private String bankName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.account_name
     *
     * @mbg.generated
     */
    @NotBlank(groups = {OpType.Create.class,OpType.Update.class})
    private String accountName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.account_no
     *
     * @mbg.generated
     */
    @NotBlank(groups = {OpType.Create.class,OpType.Update.class})
    private String accountNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.contact
     *
     * @mbg.generated
     */
    private String contact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.contact_phone
     *
     * @mbg.generated
     */
    @NotBlank(groups = {OpType.Create.class,OpType.Update.class})
    private String contactPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.website
     *
     * @mbg.generated
     */
    private String website;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.logo_url
     *
     * @mbg.generated
     */
    private String logoUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.fee_rate
     *
     * @mbg.generated
     */
    private BigDecimal feeRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.audit_type
     *
     * @mbg.generated
     */
    private Integer auditType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.audit_status
     *
     * @mbg.generated
     */
    private Integer auditStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.operate_time
     *
     * @mbg.generated
     */
    private Date operateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.operate_remark
     *
     * @mbg.generated
     */
    private String operateRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.operate_id
     *
     * @mbg.generated
     */
    private Integer operateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table company
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.id
     *
     * @return the value of company.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.id
     *
     * @param id the value for company.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.user_id
     *
     * @return the value of company.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.user_id
     *
     * @param userId the value for company.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.company_name
     *
     * @return the value of company.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.company_name
     *
     * @param companyName the value for company.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.simple_name
     *
     * @return the value of company.simple_name
     *
     * @mbg.generated
     */
    public String getSimpleName() {
        return simpleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.simple_name
     *
     * @param simpleName the value for company.simple_name
     *
     * @mbg.generated
     */
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.license_code
     *
     * @return the value of company.license_code
     *
     * @mbg.generated
     */
    public String getLicenseCode() {
        return licenseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.license_code
     *
     * @param licenseCode the value for company.license_code
     *
     * @mbg.generated
     */
    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.license_image
     *
     * @return the value of company.license_image
     *
     * @mbg.generated
     */
    public String getLicenseImage() {
        return licenseImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.license_image
     *
     * @param licenseImage the value for company.license_image
     *
     * @mbg.generated
     */
    public void setLicenseImage(String licenseImage) {
        this.licenseImage = licenseImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.bank_name
     *
     * @return the value of company.bank_name
     *
     * @mbg.generated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.bank_name
     *
     * @param bankName the value for company.bank_name
     *
     * @mbg.generated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.account_name
     *
     * @return the value of company.account_name
     *
     * @mbg.generated
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.account_name
     *
     * @param accountName the value for company.account_name
     *
     * @mbg.generated
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.account_no
     *
     * @return the value of company.account_no
     *
     * @mbg.generated
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.account_no
     *
     * @param accountNo the value for company.account_no
     *
     * @mbg.generated
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.contact
     *
     * @return the value of company.contact
     *
     * @mbg.generated
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.contact
     *
     * @param contact the value for company.contact
     *
     * @mbg.generated
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.contact_phone
     *
     * @return the value of company.contact_phone
     *
     * @mbg.generated
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.contact_phone
     *
     * @param contactPhone the value for company.contact_phone
     *
     * @mbg.generated
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.website
     *
     * @return the value of company.website
     *
     * @mbg.generated
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.website
     *
     * @param website the value for company.website
     *
     * @mbg.generated
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.remark
     *
     * @return the value of company.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.remark
     *
     * @param remark the value for company.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.province
     *
     * @return the value of company.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.province
     *
     * @param province the value for company.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.city
     *
     * @return the value of company.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.city
     *
     * @param city the value for company.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.address
     *
     * @return the value of company.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.address
     *
     * @param address the value for company.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.logo_url
     *
     * @return the value of company.logo_url
     *
     * @mbg.generated
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.logo_url
     *
     * @param logoUrl the value for company.logo_url
     *
     * @mbg.generated
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.fee_rate
     *
     * @return the value of company.fee_rate
     *
     * @mbg.generated
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.fee_rate
     *
     * @param feeRate the value for company.fee_rate
     *
     * @mbg.generated
     */
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.audit_type
     *
     * @return the value of company.audit_type
     *
     * @mbg.generated
     */
    public Integer getAuditType() {
        return auditType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.audit_type
     *
     * @param auditType the value for company.audit_type
     *
     * @mbg.generated
     */
    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.status
     *
     * @return the value of company.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.status
     *
     * @param status the value for company.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.audit_status
     *
     * @return the value of company.audit_status
     *
     * @mbg.generated
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.audit_status
     *
     * @param auditStatus the value for company.audit_status
     *
     * @mbg.generated
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.operate_time
     *
     * @return the value of company.operate_time
     *
     * @mbg.generated
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.operate_time
     *
     * @param operateTime the value for company.operate_time
     *
     * @mbg.generated
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.operate_remark
     *
     * @return the value of company.operate_remark
     *
     * @mbg.generated
     */
    public String getOperateRemark() {
        return operateRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.operate_remark
     *
     * @param operateRemark the value for company.operate_remark
     *
     * @mbg.generated
     */
    public void setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.operate_id
     *
     * @return the value of company.operate_id
     *
     * @mbg.generated
     */
    public Integer getOperateId() {
        return operateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.operate_id
     *
     * @param operateId the value for company.operate_id
     *
     * @mbg.generated
     */
    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.create_time
     *
     * @return the value of company.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.create_time
     *
     * @param createTime the value for company.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.update_time
     *
     * @return the value of company.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.update_time
     *
     * @param updateTime the value for company.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", userId=" + userId +
                ", companyName='" + companyName + '\'' +
                ", simpleName='" + simpleName + '\'' +
                ", licenseCode='" + licenseCode + '\'' +
                ", licenseImage='" + licenseImage + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", contact='" + contact + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", website='" + website + '\'' +
                ", remark='" + remark + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", feeRate=" + feeRate +
                ", auditType=" + auditType +
                ", status=" + status +
                ", auditStatus=" + auditStatus +
                ", operateTime=" + operateTime +
                ", operateRemark='" + operateRemark + '\'' +
                ", operateId=" + operateId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}