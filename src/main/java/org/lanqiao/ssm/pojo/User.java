package org.lanqiao.ssm.pojo;

public class User {
    private int USERID;
    private String USERNAME;
    private String PHONE;
    private String EMAIL;
    private String PASSWORD;
    private String ROLENAME;

    public User() {
    }

    public User(int USERID, String USERNAME, String PHONE, String EMAIL, String PASSWORD, String ROLENAME) {
        this.USERID = USERID;
        this.USERNAME = USERNAME;
        this.PHONE = PHONE;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
        this.ROLENAME = ROLENAME;
    }

    public int getUSERID() {
        return USERID;
    }

    public void setUSERID(int USERID) {
        this.USERID = USERID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getROLENAME() {
        return ROLENAME;
    }

    public void setROLENAME(String ROLENAME) {
        this.ROLENAME = ROLENAME;
    }

    @Override
    public String toString() {
        return "User{" +
                "USERID=" + USERID +
                ", USERNAME='" + USERNAME + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", ROLENAME='" + ROLENAME + '\'' +
                '}';
    }
}
