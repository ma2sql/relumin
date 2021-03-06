package com.behase.relumin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SlowLog {
    private long id;
    private String nodeId;
    private String hostAndPort;
    private long timeStamp;
    private long executionTime;
    private List<String> args;
}
