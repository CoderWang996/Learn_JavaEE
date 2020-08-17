package com.itheima.domain.system;

import java.io.Serializable;

public class Dept implements Serializable {
    private String id;   //部门id
    private String deptName;//部门名称
    private String parentId; //部门的父级id
    private Integer state;//状态

    //建立部门与上级部门的关联关系：对一
    private Dept parent;

    public Dept getParent() {
        return parent;
    }

    public void setParent(Dept parent) {
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                ", deptName='" + deptName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", state=" + state +
                ", parent=" + parent +
                '}';
    }
}
