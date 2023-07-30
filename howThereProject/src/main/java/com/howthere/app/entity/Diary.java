package com.howthere.app.entity;

import com.howthere.app.auditing.Period;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TBL_DIARY")
@Getter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Diary extends Period {
    @Id @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull private String diaryTitle;
    @NotNull private String diaryContent;
    @NotNull private Integer diaryViewCount;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diary")
    private List<DiaryLike> diaryLikes = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diary")
    private List<DiaryReply> diaryReplys = new ArrayList<>();
}