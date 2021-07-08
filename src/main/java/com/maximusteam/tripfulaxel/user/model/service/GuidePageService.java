package com.maximusteam.tripfulaxel.user.model.service;

import java.util.List;

import com.maximusteam.tripfulaxel.user.model.dto.TripReviewDTO;

/**
 * @author JJY
 *
 */

public interface GuidePageService {

	List<TripReviewDTO> selectGuideReview(int guideCode);

	 int insertReply(TripReviewDTO tripreview);

	List<TripReviewDTO> selectMyGoods(int guideCode);

	int selectCount(int guideCode);

	int selectStar(int guideCode);
	
		

}
