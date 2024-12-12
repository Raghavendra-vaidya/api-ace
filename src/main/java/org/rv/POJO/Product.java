package org.rv.POJO;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("name")
    private String name;

    @SerializedName("data")
    private Data data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public  static class Data{
        @SerializedName("year")
        private int year;

        @SerializedName("price")
        private double price;

        @SerializedName("CPU model")
        private String cpuModel;

        @SerializedName("Hard disk size")
        private  String diskSize;

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getDiskSize() {
            return diskSize;
        }

        public void setDiskSize(String diskSize) {
            this.diskSize = diskSize;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCpuModel() {
            return cpuModel;
        }

        public void setCpuModel(String cpuModel) {
            this.cpuModel = cpuModel;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "year=" + year +
                    ", price=" + price +
                    ", cpuModel='" + cpuModel + '\'' +
                    ", diskSize='" + diskSize + '\'' +
                    '}';
        }
    }

}
