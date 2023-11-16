
package com.rashi.guideservice.service;

import com.rashi.guideservice.dto.GuideDTO;

import java.util.List;

public interface GuideService {
    void saveGuide(GuideDTO guideDTO);
    void updateGuide(GuideDTO guideDTO);
    void deleteGuide(String guideId);
    GuideDTO getGuideById(String guideId);
    List<GuideDTO> getAllGuides();
    boolean existById(String id);
}
