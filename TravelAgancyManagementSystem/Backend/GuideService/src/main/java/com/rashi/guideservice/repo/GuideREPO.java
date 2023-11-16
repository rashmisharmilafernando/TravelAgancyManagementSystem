
package com.rashi.guideservice.repo;

import com.rashi.guideservice.entity.Guide;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuideREPO extends CrudRepository<Guide, String> {
    Guide findByGuideId(String guideId);
    List<Guide> findAll();
}
