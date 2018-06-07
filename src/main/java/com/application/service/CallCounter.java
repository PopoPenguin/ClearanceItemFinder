package com.application.service;

/**
 * created by Jialor Cheung on 6/6/18
 */

public class CallCounter {

    private Integer count;
    private Integer timer;
    private Integer currentCount;
    private Integer totalCountDay;

    //current API key limits
    //5 calls/second
    //5,000 calls/day

    public void TrackCount (Integer count){
        currentCount += count;


        return;
    }

}
