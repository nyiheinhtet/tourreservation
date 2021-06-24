package jp.co.nttdata.example.tour.domain.service.tourinfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.nttdata.example.tour.domain.model.TourInfo;
import jp.co.nttdata.example.tour.domain.repository.tourinfo.TourInfoRepository;
import jp.co.nttdata.example.tour.domain.repository.tourinfo.TourInfoSearchCriteria;

/**
 * ツアー情報を扱うサービスクラス
 *
 * @author nh.htet
 *
 */
@Service
public class TourInfoServiceImpl implements TourInfoService {

	@Inject
	TourInfoRepository tourInfoRepository;

	/**
	 * 検索条件に該当するツアー情報の一覧をページオブジェクトとして取得する
	 *
	 * @param criteria
	 *            検索条件
	 * @param pageable
	 *            ページネーションのページ情報
	 * @return
	 */
	@Transactional(readOnly = true)
	@Override
	public Page<TourInfo> searchTour(TourInfoSearchCriteria criteria, Pageable pageable) {

		Long count = tourInfoRepository.countBySearchCriteria(criteria);
		List<TourInfo> tourInfoList = new ArrayList<TourInfo>();
		if (count > 0) {
			tourInfoList = tourInfoRepository.findPageBySearchCriteria(criteria, pageable);
		} else {
			tourInfoList = Collections.emptyList();
		}

		return new PageImpl<>(tourInfoList, pageable, count);
	}

}
