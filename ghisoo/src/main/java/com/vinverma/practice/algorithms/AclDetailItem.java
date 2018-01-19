package com.vinverma.practice.algorithms;

import java.util.LinkedList;

/**
 * Created by vinverma on 11/4/16.
 */
public class AclDetailItem {

    LinkedList<String> sList = new LinkedList<>();

    String aclName;
    String vlanName;
    String wlanName;

    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public String getVlanName() {
        return vlanName;
    }

    public void setVlanName(String vlanName) {
        this.vlanName = vlanName;
    }

    public String getWlanName() {
        return wlanName;
    }

    public void setWlanName(String wlanName) {
        this.wlanName = wlanName;
    }

    @Override
    public String toString() {
        return "main.AclDetailItem{" +
                "aclName='" + aclName + '\'' +
                ", vlanName='" + vlanName + '\'' +
                ", wlanName='" + wlanName + '\'' +
                '}';
    }

    class Room {
        public int startTime;
        public int endTime;
    }
}
