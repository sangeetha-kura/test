package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    
    List<Profile> findAllByAccessibility(String accessibility);
    
    void save(Profile profile);
    
    void updatePassword(String currentPassword, String newPassword);
    
    void setLoginId(String loginId);
    
    void setTitle(String title);
    
    void setFirstName(String firstName);
    
    void setLastName(String lastName);
    
    void setEmail(String email);
    
    void setPhoneNumber(String phoneNumber);
    
    void setMobileNumber(String mobileNumber);
}