package com.github.dapeng.counter.api.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据点
 */
public class DataPoint {

    /**
     * bizTag业务类型(如qps), 在时序数据库中也叫metric/measurement, 相当于关系型数据库的数据表
     */
    public String bizTag;

    public String getBizTag() {
        return this.bizTag;
    }

    public void setBizTag(String bizTag) {
        this.bizTag = bizTag;
    }

    public String bizTag() {
        return this.bizTag;
    }

    public DataPoint bizTag(String bizTag) {
        this.bizTag = bizTag;
        return this;
    }

    /**
     * field
     * values 可以为一个，可以为多个Field
     * value支持的类型floats，integers，strings，booleans
     * value会用于展示
     */
    public Map<String, String> values = new HashMap<>();

    public Map<String, String> getValues() {
        return this.values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    public Map<String, String> values() {
        return this.values;
    }

    public DataPoint values(Map<String, String> values) {
        this.values = values;
        return this;
    }


    public long timestamp;

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long timestamp() {
        return this.timestamp;
    }

    public DataPoint timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * tag是可选的。不过写入数据时最好加上tag，因为它可以被索引。tag的类型只能是字符串。
     */
    public java.util.Map<String, String> tags = new java.util.HashMap<>();

    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    public java.util.Map<String, String> tags() {
        return this.tags;
    }

    public DataPoint tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }


    public String database;

    public String getDatabase() {
        return this.database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String database() {
        return this.database;
    }

    public DataPoint database(String database) {
        this.database = database;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append("\"").append("bizTag").append("\":\"").append(this.bizTag).append("\",");
        stringBuilder.append("\"").append("values").append("\":").append(this.values).append(",");
        stringBuilder.append("\"").append("timestamp").append("\":").append(this.timestamp).append(",");
        stringBuilder.append("\"").append("tags").append("\":").append(this.tags).append(",");
        stringBuilder.append("\"").append("database").append("\":\"").append(this.database).append("\",");

        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
      