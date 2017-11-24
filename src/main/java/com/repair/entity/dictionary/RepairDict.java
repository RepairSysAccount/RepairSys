package com.repair.entity.dictionary;

public class RepairDict {
    private Integer dictNo;
    private String deviceClass;
    private String problem;
    private String solution;

    public Integer getDictNo() {
        return dictNo;
    }

    public void setDictNo(Integer dictNo) {
        this.dictNo = dictNo;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public RepairDict() {
    }

    public RepairDict(Integer dictNo, String deviceClass, String problem, String solution) {
        this.dictNo = dictNo;
        this.deviceClass = deviceClass;
        this.problem = problem;
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "RepairDict{" +
                "dictNo='" + dictNo + '\'' +
                ", deviceClass='" + deviceClass + '\'' +
                ", problem='" + problem + '\'' +
                ", solution='" + solution + '\'' +
                '}';
    }
}
