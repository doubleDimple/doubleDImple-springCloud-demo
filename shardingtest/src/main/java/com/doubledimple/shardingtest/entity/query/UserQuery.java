package com.doubledimple.shardingtest.entity.query;



/**
 * 
 * 参数
 * 
 */
public class UserQuery extends BaseParam{


	/**
	 * 
	 */
	private Long userId;

	/**
	 * 姓名
	 */
	private String userName;

	private String userNameFuzzy;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 生日
	 */
	private String birthday;

	private String birthdayFuzzy;

	/**
	 * 地址
	 */
	private String address;

	private String addressFuzzy;

	/**
	 * 身份证号码
	 */
	private Integer sex;


	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setUserNameFuzzy(String userNameFuzzy){
		this.userNameFuzzy = userNameFuzzy;
	}

	public String getUserNameFuzzy(){
		return this.userNameFuzzy;
	}

	public void setAge(Integer age){
		this.age = age;
	}

	public Integer getAge(){
		return this.age;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public String getBirthday(){
		return this.birthday;
	}

	public void setBirthdayFuzzy(String birthdayFuzzy){
		this.birthdayFuzzy = birthdayFuzzy;
	}

	public String getBirthdayFuzzy(){
		return this.birthdayFuzzy;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return this.address;
	}

	public void setAddressFuzzy(String addressFuzzy){
		this.addressFuzzy = addressFuzzy;
	}

	public String getAddressFuzzy(){
		return this.addressFuzzy;
	}

	public void setSex(Integer sex){
		this.sex = sex;
	}

	public Integer getSex(){
		return this.sex;
	}

}
