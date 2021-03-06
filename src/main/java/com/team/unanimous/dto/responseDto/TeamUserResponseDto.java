package com.team.unanimous.dto.responseDto;


import com.team.unanimous.model.team.Team;
import lombok.Getter;

import java.util.List;

@Getter
public class TeamUserResponseDto {

    private Long teamId;

    private String teamname;
    private String uuid;


    public TeamUserResponseDto(Team team) {
        this.teamId = team.getId();
        this.teamname = team.getTeamname();
        this.uuid = team.getUuid();
//        this.userCnt = userCnt;
//        this.nicknameResponseDtos = nicknameResponseDtos;
    }
}
