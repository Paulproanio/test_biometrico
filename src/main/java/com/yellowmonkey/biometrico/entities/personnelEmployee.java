																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. G�mez (2020)
| File Date: Tue Feb 01 15:23:36 ECT 2022
| 
 -------------------------------------------------------------------
																*/
package com.yellowmonkey.biometrico.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;
import javax.persistence.Basic;
	
@Entity
@Table(name = "personnelEmployee")
public class personnelEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private Date createTime;
	private String createUser;
	@Basic
	private Date changeTime;
	private String changeUser;
	private Long status;
	private Long empCode;
	private String firstName;
	private String lastName;
	private String nickname;
	private String passport;
	private String driverLicenseAutomobile;
	private String driverLicenseMotorcycle;
	private String photo;
	private String selfPassword;
	private String devicePassword;
	private Long devPrivilege;
	private String cardNo;
	private String accGroup;
	private String accTimezone;
	private String gender;
	@Basic
	private Date birthday;
	private String address;
	private String postcode;
	private String officeTel;
	private String contactTel;
	private String mobile;
	private String national;
	private String religion;
	private String title;
	private String enrollSn;
	private String ssn;
	private String updateTime;
	@Basic
	private Date hireDate;
	private Long verifyMode;
	private String city;
	private Boolean isAdmin;
	private Long empType;
	private Boolean enableAtt;
	private Boolean enableOvertime;
	private Boolean enableHoliday;
	private Boolean deleted;
	private Long reserved;
	private Long delTag;
	private Long appStatus;
	private Long appRole;
	private String email;
	private String lastLogin;
	private Boolean isActive;
	private Long departmentId;
	private Long positionId;
	private Boolean enablePayroll;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public Date getChangeTime() {
		return changeTime;
	}
	
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	
	public String getChangeUser() {
		return changeUser;
	}
	
	public void setChangeUser(String changeUser) {
		this.changeUser = changeUser;
	}
	
	public Long getStatus() {
		return status;
	}
	
	public void setStatus(Long status) {
		this.status = status;
	}
	
	public Long getEmpCode() {
		return empCode;
	}
	
	public void setEmpCode(Long empCode) {
		this.empCode = empCode;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public String getDriverLicenseAutomobile() {
		return driverLicenseAutomobile;
	}
	
	public void setDriverLicenseAutomobile(String driverLicenseAutomobile) {
		this.driverLicenseAutomobile = driverLicenseAutomobile;
	}
	
	public String getDriverLicenseMotorcycle() {
		return driverLicenseMotorcycle;
	}
	
	public void setDriverLicenseMotorcycle(String driverLicenseMotorcycle) {
		this.driverLicenseMotorcycle = driverLicenseMotorcycle;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getSelfPassword() {
		return selfPassword;
	}
	
	public void setSelfPassword(String selfPassword) {
		this.selfPassword = selfPassword;
	}
	
	public String getDevicePassword() {
		return devicePassword;
	}
	
	public void setDevicePassword(String devicePassword) {
		this.devicePassword = devicePassword;
	}
	
	public Long getDevPrivilege() {
		return devPrivilege;
	}
	
	public void setDevPrivilege(Long devPrivilege) {
		this.devPrivilege = devPrivilege;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getAccGroup() {
		return accGroup;
	}
	
	public void setAccGroup(String accGroup) {
		this.accGroup = accGroup;
	}
	
	public String getAccTimezone() {
		return accTimezone;
	}
	
	public void setAccTimezone(String accTimezone) {
		this.accTimezone = accTimezone;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getOfficeTel() {
		return officeTel;
	}
	
	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}
	
	public String getContactTel() {
		return contactTel;
	}
	
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getNational() {
		return national;
	}
	
	public void setNational(String national) {
		this.national = national;
	}
	
	public String getReligion() {
		return religion;
	}
	
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getEnrollSn() {
		return enrollSn;
	}
	
	public void setEnrollSn(String enrollSn) {
		this.enrollSn = enrollSn;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public Long getVerifyMode() {
		return verifyMode;
	}
	
	public void setVerifyMode(Long verifyMode) {
		this.verifyMode = verifyMode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public Long getEmpType() {
		return empType;
	}
	
	public void setEmpType(Long empType) {
		this.empType = empType;
	}
	
	public Boolean getEnableAtt() {
		return enableAtt;
	}
	
	public void setEnableAtt(Boolean enableAtt) {
		this.enableAtt = enableAtt;
	}
	
	public Boolean getEnableOvertime() {
		return enableOvertime;
	}
	
	public void setEnableOvertime(Boolean enableOvertime) {
		this.enableOvertime = enableOvertime;
	}
	
	public Boolean getEnableHoliday() {
		return enableHoliday;
	}
	
	public void setEnableHoliday(Boolean enableHoliday) {
		this.enableHoliday = enableHoliday;
	}
	
	public Boolean getDeleted() {
		return deleted;
	}
	
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	public Long getReserved() {
		return reserved;
	}
	
	public void setReserved(Long reserved) {
		this.reserved = reserved;
	}
	
	public Long getDelTag() {
		return delTag;
	}
	
	public void setDelTag(Long delTag) {
		this.delTag = delTag;
	}
	
	public Long getAppStatus() {
		return appStatus;
	}
	
	public void setAppStatus(Long appStatus) {
		this.appStatus = appStatus;
	}
	
	public Long getAppRole() {
		return appRole;
	}
	
	public void setAppRole(Long appRole) {
		this.appRole = appRole;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLastLogin() {
		return lastLogin;
	}
	
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public Long getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	public Long getPositionId() {
		return positionId;
	}
	
	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}
	
	public Boolean getEnablePayroll() {
		return enablePayroll;
	}
	
	public void setEnablePayroll(Boolean enablePayroll) {
		this.enablePayroll = enablePayroll;
	}
	
}
