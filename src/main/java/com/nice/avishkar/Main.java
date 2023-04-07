package com.nice.avishkar;

import com.nice.avishkar.entities.Voters;
import com.opencsv.bean.CsvToBeanBuilder;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{

    private InputStream getFileAsIOStream(String filename)
    {
        InputStream ioStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(filename);

        if (ioStream == null) {
            throw new IllegalArgumentException(filename + " is not found");
        }
        return ioStream;
    }

    public static void main(String[] args) {

        Main m = new Main();

        InputStream csvFile = m.getFileAsIOStream("votingFile.csv");

        //InputStream csvCandidateFile = m.getFileAsIOStream("candidateFile.csv");



        List<Voters> votersList = new CsvToBeanBuilder<Voters>(new InputStreamReader(csvFile))
                .withType(Voters.class)
                .build()
                .parse();



        HashMap<String,Integer> voteCount = new HashMap<>();

        HashMap<String,Integer> voterCountRef = new HashMap<>();

        HashMap<String,HashMap<String,Integer>> constituencyWithCandidatesData = new HashMap<>();

        for(Voters voters : votersList){
            //System.out.println(voters.getCandidate());
            voterCountRef.put(voters.getVoter(),voterCountRef.getOrDefault(voters.getVoter(),0)+1);
        }

        for(Voters voters : votersList){
            if(voterCountRef.get(voters.getVoter())==1)
                voteCount.put(voters.getCandidate(),voteCount.getOrDefault(voters.getCandidate(),0)+1);
        }


        System.out.println(constituencyWithCandidatesData);

        List<CandidateVotes> candidateVotesList = new ArrayList<>();

        for(Map.Entry<String,Integer> candidateVote : voteCount.entrySet()){
            String candidateName = candidateVote.getKey();
            Integer candidateVoteCount = candidateVote.getValue();
            candidateVotesList.add(new CandidateVotes(candidateName,candidateVoteCount));
        }


        for (CandidateVotes candidateVotes : candidateVotesList){
            System.out.println(candidateVotes);
        }


    }
}
