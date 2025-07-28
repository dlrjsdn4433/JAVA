package com.ProjectNull.practice0728;

public class Pair <T,U>{
    String first;
    Integer second;



    public void Pair (String first, Integer second ){
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
}
