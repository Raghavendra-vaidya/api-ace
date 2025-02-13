package org.rv.POJO;

import com.google.gson.annotations.SerializedName;

public class CreateUserSuccess {

    @SerializedName("name")
    private String name;

    @SerializedName("job")
    private String job;

    @SerializedName("id")
    private  int id;

    @SerializedName("createdAt")
    private String createdAt;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
