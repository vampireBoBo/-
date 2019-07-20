package com.lhb.entity;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sno
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    private Integer sno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sname
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    private Integer age;
    
    // 补充属性
    private String email;
    
    

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public void setId(String id) {
        this.id = id;
    }

   
    public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sname
     *
     * @return the value of student.sname
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sname
     *
     * @param sname the value for student.sname
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbg.generated Tue May 07 21:29:27 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}