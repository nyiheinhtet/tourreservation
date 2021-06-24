/**
 *
 */
package jp.co.nttdata.example.tour.domain.service.tourinfo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.nttdata.example.tour.domain.model.TourInfo;
import jp.co.nttdata.example.tour.domain.repository.tourinfo.TourInfoSearchCriteria;

/**
 * @author nh.htet
 *
 */
public interface TourInfoService {

	/**
	 * 検索条件に該当するツアー情報の一覧をページオブジェクトとして取得する
	 *
	 * @param criteria 検索条件
	 * @param pageable ページネーションのページ情報
	 * @return
	 */
	public Page<TourInfo> searchTour(TourInfoSearchCriteria criteria, Pageable pageable);



}
