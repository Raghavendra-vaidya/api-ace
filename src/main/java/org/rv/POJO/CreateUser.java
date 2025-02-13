package org.rv.POJO;

import com.google.gson.annotations.SerializedName;

public class CreateUser {
    @SerializedName("name")
    private String name;

    @SerializedName("job")
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
