package com.liujan.dao.entity;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.stu_id
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    private String stuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.mac_address
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    private String macAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.user_pwd
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    private String userPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.email
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.teacher_id
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    private Integer teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.stu_id
     *
     * @return the value of student.stu_id
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.stu_id
     *
     * @param stuId the value for student.stu_id
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.mac_address
     *
     * @return the value of student.mac_address
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.mac_address
     *
     * @param macAddress the value for student.mac_address
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.user_pwd
     *
     * @return the value of student.user_pwd
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.user_pwd
     *
     * @param userPwd the value for student.user_pwd
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.email
     *
     * @return the value of student.email
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.email
     *
     * @param email the value for student.email
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.teacher_id
     *
     * @return the value of student.teacher_id
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.teacher_id
     *
     * @param teacherId the value for student.teacher_id
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}