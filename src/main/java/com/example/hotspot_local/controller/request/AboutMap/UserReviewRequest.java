package com.example.hotspot_local.controller.request.AboutMap;

import lombok.Data;

// review로 FE에서 받아오는 것
@Data
public class UserReviewRequest {
	String storeId;     // find the store from cache
	String userId;   // find user from DB -> save the review list -> after, it looks in mypage.
	int reviewSpicyLevel;     // spicy level
	String title;   	// title
	String comment;         // comment
	String reviewImage;
	String foodName;



}

