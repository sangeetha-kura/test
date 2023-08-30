package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Profile;
import com.test.repository.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> getAllByAccessibility(String accessibility) {
        return profileRepository.findAllByAccessibility(accessibility);
    }

    public void saveProfile(Profile profile) {
        profileRepository.save(profile);
    }

    public void updatePassword(String currentPassword, String newPassword) {
        profileRepository.updatePassword(currentPassword, newPassword);
    }

    public void setLoginId(String loginId) {
        profileRepository.setLoginId(loginId);
    }

    public void setTitle(String title) {
        profileRepository.setTitle(title);
    }

    public void setFirstName(String firstName) {
        profileRepository.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        profileRepository.setLastName(lastName);
    }

    public void setEmail(String email) {
        profileRepository.setEmail(email);
    }

    public void setPhoneNumber(String phoneNumber) {
        profileRepository.setPhoneNumber(phoneNumber);
    }

    public void setMobileNumber(String mobileNumber) {
        profileRepository.setMobileNumber(mobileNumber);
    }
}