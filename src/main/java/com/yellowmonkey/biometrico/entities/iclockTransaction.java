																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. Gómez (2020)
| File Date: Thu Dec 01 15:44:28 ECT 2022
| 
 -------------------------------------------------------------------
																*/
package com.yellowmonkey.biometrico.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import javax.persistence.Basic;
	
@Entity
@Table(name = "iclockTransaction")
public class iclockTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String emp_code;
	@Basic
	private Date punch_time;
	private String punch_state;
	private Long verify_type;
	private String work_code;
	private String terminal_sn;
	private String terminal_alias;
	private String area_alias;
	private Double longitude;
	private Double latitude;
	private String gps_location;
	private String mobile;
	private Long source;
	private Long purpose;
	private String crc;
	private Long is_attendance;
	private String reserved;
	private String upload_time;
	private Long sync_status;
	private String sync_time;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private personnelEmployee personnelEmployee;
	
	private Long terminal_id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmp_code() {
		return emp_code;
	}
	
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	
	public Date getPunch_time() {
		return punch_time;
	}
	
	public void setPunch_time(Date punch_time) {
		this.punch_time = punch_time;
	}
	
	public String getPunch_state() {
		return punch_state;
	}
	
	public void setPunch_state(String punch_state) {
		this.punch_state = punch_state;
	}
	
	public Long getVerify_type() {
		return verify_type;
	}
	
	public void setVerify_type(Long verify_type) {
		this.verify_type = verify_type;
	}
	
	public String getWork_code() {
		return work_code;
	}
	
	public void setWork_code(String work_code) {
		this.work_code = work_code;
	}
	
	public String getTerminal_sn() {
		return terminal_sn;
	}
	
	public void setTerminal_sn(String terminal_sn) {
		this.terminal_sn = terminal_sn;
	}
	
	public String getTerminal_alias() {
		return terminal_alias;
	}
	
	public void setTerminal_alias(String terminal_alias) {
		this.terminal_alias = terminal_alias;
	}
	
	public String getArea_alias() {
		return area_alias;
	}
	
	public void setArea_alias(String area_alias) {
		this.area_alias = area_alias;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public String getGps_location() {
		return gps_location;
	}
	
	public void setGps_location(String gps_location) {
		this.gps_location = gps_location;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Long getSource() {
		return source;
	}
	
	public void setSource(Long source) {
		this.source = source;
	}
	
	public Long getPurpose() {
		return purpose;
	}
	
	public void setPurpose(Long purpose) {
		this.purpose = purpose;
	}
	
	public String getCrc() {
		return crc;
	}
	
	public void setCrc(String crc) {
		this.crc = crc;
	}
	
	public Long getIs_attendance() {
		return is_attendance;
	}
	
	public void setIs_attendance(Long is_attendance) {
		this.is_attendance = is_attendance;
	}
	
	public String getReserved() {
		return reserved;
	}
	
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	
	public String getUpload_time() {
		return upload_time;
	}
	
	public void setUpload_time(String upload_time) {
		this.upload_time = upload_time;
	}
	
	public Long getSync_status() {
		return sync_status;
	}
	
	public void setSync_status(Long sync_status) {
		this.sync_status = sync_status;
	}
	
	public String getSync_time() {
		return sync_time;
	}
	
	public void setSync_time(String sync_time) {
		this.sync_time = sync_time;
	}
	
	public personnelEmployee getPersonnelEmployee() {
		return personnelEmployee;
	}

	public void setPersonnelEmployee(personnelEmployee personnelEmployee) {
		this.personnelEmployee = personnelEmployee;
	}

	public Long getTerminal_id() {
		return terminal_id;
	}
	
	public void setTerminal_id(Long terminal_id) {
		this.terminal_id = terminal_id;
	}
	
}
