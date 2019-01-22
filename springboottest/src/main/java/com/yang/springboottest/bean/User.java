package com.yang.springboottest.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.phone
	 * @mbg.generated
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.email
	 * @mbg.generated
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.nickname
	 * @mbg.generated
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.cipher
	 * @mbg.generated
	 */
	private String cipher;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.salt
	 * @mbg.generated
	 */
	private String salt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.status
	 * @mbg.generated
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.grade
	 * @mbg.generated
	 */
	private Integer grade;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.real_name
	 * @mbg.generated
	 */
	private String realName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id_card
	 * @mbg.generated
	 */
	private String idCard;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.birthday
	 * @mbg.generated
	 */
	private Date birthday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.sex
	 * @mbg.generated
	 */
	private Integer sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.photo_url
	 * @mbg.generated
	 */
	private String photoUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.referrer
	 * @mbg.generated
	 */
	private String referrer;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.company_id
	 * @mbg.generated
	 */
	private Integer companyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.remark
	 * @mbg.generated
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.create_time
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.update_time
	 * @mbg.generated
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.expired_date
	 * @mbg.generated
	 */
	private Date expiredDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.phone
	 * @return  the value of user.phone
	 * @mbg.generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.phone
	 * @param phone  the value for user.phone
	 * @mbg.generated
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.email
	 * @return  the value of user.email
	 * @mbg.generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.email
	 * @param email  the value for user.email
	 * @mbg.generated
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.nickname
	 * @return  the value of user.nickname
	 * @mbg.generated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.nickname
	 * @param nickname  the value for user.nickname
	 * @mbg.generated
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.cipher
	 * @return  the value of user.cipher
	 * @mbg.generated
	 */
	public String getCipher() {
		return cipher;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.cipher
	 * @param cipher  the value for user.cipher
	 * @mbg.generated
	 */
	public void setCipher(String cipher) {
		this.cipher = cipher;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.salt
	 * @return  the value of user.salt
	 * @mbg.generated
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.salt
	 * @param salt  the value for user.salt
	 * @mbg.generated
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.status
	 * @return  the value of user.status
	 * @mbg.generated
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.status
	 * @param status  the value for user.status
	 * @mbg.generated
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.grade
	 * @return  the value of user.grade
	 * @mbg.generated
	 */
	public Integer getGrade() {
		return grade;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.grade
	 * @param grade  the value for user.grade
	 * @mbg.generated
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.real_name
	 * @return  the value of user.real_name
	 * @mbg.generated
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.real_name
	 * @param realName  the value for user.real_name
	 * @mbg.generated
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id_card
	 * @return  the value of user.id_card
	 * @mbg.generated
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id_card
	 * @param idCard  the value for user.id_card
	 * @mbg.generated
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.birthday
	 * @return  the value of user.birthday
	 * @mbg.generated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.birthday
	 * @param birthday  the value for user.birthday
	 * @mbg.generated
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.sex
	 * @return  the value of user.sex
	 * @mbg.generated
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.sex
	 * @param sex  the value for user.sex
	 * @mbg.generated
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.photo_url
	 * @return  the value of user.photo_url
	 * @mbg.generated
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.photo_url
	 * @param photoUrl  the value for user.photo_url
	 * @mbg.generated
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.referrer
	 * @return  the value of user.referrer
	 * @mbg.generated
	 */
	public String getReferrer() {
		return referrer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.referrer
	 * @param referrer  the value for user.referrer
	 * @mbg.generated
	 */
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.company_id
	 * @return  the value of user.company_id
	 * @mbg.generated
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.company_id
	 * @param companyId  the value for user.company_id
	 * @mbg.generated
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.remark
	 * @return  the value of user.remark
	 * @mbg.generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.remark
	 * @param remark  the value for user.remark
	 * @mbg.generated
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.create_time
	 * @return  the value of user.create_time
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.create_time
	 * @param createTime  the value for user.create_time
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.update_time
	 * @return  the value of user.update_time
	 * @mbg.generated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.update_time
	 * @param updateTime  the value for user.update_time
	 * @mbg.generated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.expired_date
	 * @return  the value of user.expired_date
	 * @mbg.generated
	 */
	public Date getExpiredDate() {
		return expiredDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.expired_date
	 * @param expiredDate  the value for user.expired_date
	 * @mbg.generated
	 */
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", nickname='" + nickname + '\'' +
				", cipher='" + cipher + '\'' +
				", salt='" + salt + '\'' +
				", status=" + status +
				", grade=" + grade +
				", realName='" + realName + '\'' +
				", idCard='" + idCard + '\'' +
				", birthday=" + birthday +
				", sex=" + sex +
				", photoUrl='" + photoUrl + '\'' +
				", referrer='" + referrer + '\'' +
				", companyId=" + companyId +
				", remark='" + remark + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				", expiredDate=" + expiredDate +
				'}';
	}
}