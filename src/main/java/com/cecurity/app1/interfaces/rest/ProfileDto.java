package com.cecurity.app1.interfaces.rest;

import com.cecurity.app1.core.profile.Profile;

import java.time.LocalDate;
import java.time.LocalDateTime;

record ProfileDto(
    Long id, String nickname, LocalDate birthdate, int manelength, int gender,
    Integer attractedToGender, String description, LocalDateTime lastseen
) {
  static ProfileDto fromDomain( Profile p ) {
    return new ProfileDto(
        p.getId(), p.getNickname(), p.getBirthdate(), p.getManelength(),
        p.getGender(), p.getAttractedToGender(), p.getDescription(),
        p.getLastseen()
    );
  }
}