package com.gkemayo.library.customer;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Customer Model")
public class CustomerDTO implements Comparable<CustomerDTO>{
	
	
	@ApiModelProperty(value = "Customer id")
	private Integer id;
	
	@ApiModelProperty(value = "Customer first name")
	private String firstName;
	
	@ApiModelProperty(value = "Customer last name")
	private String lastName;
	
	@ApiModelProperty(value = "Customer address")
	private String address;
	
	@ApiModelProperty(value = "Customer email")
	private String email;
	
	@ApiModelProperty(value = "Customer password")
    private String password;
	
	@ApiModelProperty(value = "Customer tel number")
	private String mobileNumber;
	
	@ApiModelProperty(value = "Customer creation date in the system")
	private LocalDate creationDate;
	
    private UserType userType;
	
	private AccountStatus accountStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String telNumber) {
		this.mobileNumber = telNumber;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}


	@Override
	public int compareTo(CustomerDTO o) {
		return this.lastName.compareToIgnoreCase(o.getLastName());
	}
		
}
