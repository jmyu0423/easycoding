package com.easycoding.myjava.entity.board;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class BoardVo {
    private Integer seq;
    private String title;
    private String content;
    private Integer regSeq;
    private String regDate;
    private String updDate;

    private String[] seqList;
}
