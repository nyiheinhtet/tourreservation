package jp.co.nttdata.example.tour.domain.repository.tourinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import jp.co.nttdata.example.tour.domain.model.TourInfo;

public interface TourInfoRepository {

	List<TourInfo> findPageBySearchCriteria(@Param("criteria") TourInfoSearchCriteria criteria,
			@Param("pageable") Pageable pageable);

	long countBySearchCriteria(@Param("criteria") TourInfoSearchCriteria criteria);
}
