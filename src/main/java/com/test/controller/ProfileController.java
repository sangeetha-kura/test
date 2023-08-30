package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Profile;
import com.test.service.ProfileService;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profiles/accessibility")
    public List<Profile> getAllByAccessibility(@RequestParam String accessibility) {
        return profileService.getAllByAccessibility(accessibility);
    }

    @PostMapping("/profiles")
    public void saveProfile(@RequestBody Profile profile) {
        profileService.saveProfile(profile);
    }

    @PutMapping("/profiles/password")
    public void updatePassword(@RequestParam String currentPassword, @RequestParam String newPassword) {
        profileService.updatePassword(currentPassword, newPassword);
    }

    @PutMapping("/profiles/loginId")
    public void setLoginId(@RequestParam String loginId) {
        profileService.setLoginId(loginId);
    }

    @PutMapping("/profiles/title")
    public void setTitle(@RequestParam String title) {
        profileService.setTitle(title);
    }

    @PutMapping("/profiles/firstName")
    public void setFirstName(@RequestParam String firstName) {
        profileService.setFirstName(firstName);
    }

    @PutMapping("/profiles/lastName")
    public void setLastName(@RequestParam String lastName) {
        profileService.setLastName(lastName);
    }

    @PutMapping("/profiles/email")
    public void setEmail(@RequestParam String email) {
        profileService.setEmail(email);
    }

    @PutMapping("/profiles/phoneNumber")
    public void setPhoneNumber(@RequestParam String phoneNumber) {
        profileService.setPhoneNumber(phoneNumber);
    }

    @PutMapping("/profiles/mobileNumber")
    public void setMobileNumber(@RequestParam String mobileNumber) {
        profileService.setMobileNumber(mobileNumber);
    }
}