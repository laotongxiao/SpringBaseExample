package com.test03;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Bean03 {
    private List<OtherBean03> otherBean03List;
    private List<String> nam3List;

    private Map<OtherBean03, OtherBean03> otherBean03Map;
    private Map<String, String> name3Map;

    private Set<OtherBean03> otherBean03Set;
    private Set<String> name3Set;

    private Properties otherBean03Properties;
    private Properties name3Properties;

    private OtherBean03 otherBean03null;

    public List<OtherBean03> getOtherBean03List() {
        return otherBean03List;
    }

    public void setOtherBean03List(List<OtherBean03> otherBean03List) {
        this.otherBean03List = otherBean03List;
    }

    public List<String> getNam3List() {
        return nam3List;
    }

    public void setNam3List(List<String> nam3List) {
        this.nam3List = nam3List;
    }

    public Map<OtherBean03, OtherBean03> getOtherBean03Map() {
        return otherBean03Map;
    }

    public void setOtherBean03Map(Map<OtherBean03, OtherBean03> otherBean03Map) {
        this.otherBean03Map = otherBean03Map;
    }

    public Map<String, String> getName3Map() {
        return name3Map;
    }

    public void setName3Map(Map<String, String> name3Map) {
        this.name3Map = name3Map;
    }

    public Set<OtherBean03> getOtherBean03Set() {
        return otherBean03Set;
    }

    public void setOtherBean03Set(Set<OtherBean03> otherBean03Set) {
        this.otherBean03Set = otherBean03Set;
    }

    public Set<String> getName3Set() {
        return name3Set;
    }

    public void setName3Set(Set<String> name3Set) {
        this.name3Set = name3Set;
    }

    public Properties getOtherBean03Properties() {
        return otherBean03Properties;
    }

    public void setOtherBean03Properties(Properties otherBean03Properties) {
        this.otherBean03Properties = otherBean03Properties;
    }

    public Properties getName3Properties() {
        return name3Properties;
    }

    public void setName3Properties(Properties name3Properties) {
        this.name3Properties = name3Properties;
    }

    public OtherBean03 getOtherBean03null() {
        return otherBean03null;
    }

    public void setOtherBean03null(OtherBean03 otherBean03null) {
        this.otherBean03null = otherBean03null;
    }

    @Override
    public String toString() {
        return "Bean03{" +
                "otherBean03List=" + otherBean03List +
                ", nam3List=" + nam3List +
                ", otherBean03Map=" + otherBean03Map +
                ", name3Map=" + name3Map +
                ", otherBean03Set=" + otherBean03Set +
                ", name3Set=" + name3Set +
                ", otherBean03Properties=" + otherBean03Properties +
                ", name3Properties=" + name3Properties +
                '}';
    }
}
