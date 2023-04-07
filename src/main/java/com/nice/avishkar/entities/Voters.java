package com.nice.avishkar.entities;


import com.opencsv.bean.CsvBindByPosition;

public class Voters
{

    @CsvBindByPosition(position = 0)
    private String Voter;
    @CsvBindByPosition(position = 1)
    private String Constituency;
    @CsvBindByPosition(position = 2)
    private String PollingStation;
    @CsvBindByPosition(position = 3)
    private String Candidate;

    public  Voters()
    {

    }

    public Voters(String voter, String constituency, String pollingStation, String candidate) {
        this.Voter = voter;
        this.Constituency = constituency;
        this.PollingStation = pollingStation;
        this.Candidate = candidate;
    }

    public String getVoter() {
        return this.Voter;
    }

    public void setVoter(String voter) {
        this.Voter = voter;
    }

    public String getConstituency() {
        return this.Constituency;
    }

    public void setConstituency(String constituency) {
        this.Constituency = constituency;
    }

    public String getPollingStation() {
        return this.PollingStation;
    }

    public void setPollingStation(String pollingStation) {
        this.PollingStation = pollingStation;
    }

    public String getCandidate() {
        return this.Candidate;
    }

    public void setCandidate(String candidate) {
        this.Candidate = candidate;
    }

    @Override
    public String toString() {
        return "Voters{" +
                "Voter='" + this.Voter + '\'' +
                ", Constituency='" + this.Constituency + '\'' +
                ", PollingStation='" + this.PollingStation + '\'' +
                ", Candidate='" + this.Candidate + '\'' +
                '}';
    }
}
