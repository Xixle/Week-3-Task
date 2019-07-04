package com;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "mambodb", catalog = "")
public class AdminEntity {
    private int userId;
    private String adminName;
    private String emaii;
    private String password;
    private String loginStatus;

    @Id
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "adminName", nullable = false, length = 32)
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "emaii", nullable = false, length = 32)
    public String getEmaii() {
        return emaii;
    }

    public void setEmaii(String emaii) {
        this.emaii = emaii;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "loginStatus", nullable = false, length = 32)
    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (userId != that.userId) return false;
        if (adminName != null ? !adminName.equals(that.adminName) : that.adminName != null) return false;
        if (emaii != null ? !emaii.equals(that.emaii) : that.emaii != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (loginStatus != null ? !loginStatus.equals(that.loginStatus) : that.loginStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (adminName != null ? adminName.hashCode() : 0);
        result = 31 * result + (emaii != null ? emaii.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (loginStatus != null ? loginStatus.hashCode() : 0);
        return result;
    }
}
