package com.nice.avishkar.entities;

import com.opencsv.bean.CsvBindByPosition;

public class ConstituencyPojo
{
    @CsvBindByPosition(position = 0)
    private String Constituency;

    @CsvBindByPosition(position = 1)
    private String Candidate;

    public ConstituencyPojo() {
    }

    public ConstituencyPojo(String constituency, String candidate) {
        this.Constituency = constituency;
        this.Candidate = candidate;
    }

    public String getConstituency() {
        return this.Constituency;
    }

    public void setConstituency(String constituency) {
        this.Constituency = constituency;
    }

    public String getCandidate() {
        return this.Candidate;
    }

    public void setCandidate(String candidate) {
        this.Candidate = candidate;
    }

    @Override
    public String toString() {
        return "ConstituencyPojo{" +
                "Constituency='" + Constituency + '\'' +
                ", Candidate='" + Candidate + '\'' +
                '}';
    }
}
