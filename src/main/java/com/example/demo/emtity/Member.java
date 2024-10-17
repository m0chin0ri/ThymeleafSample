package com.example.demo.emtity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
	/*
	 * メンバーID	
	 */
	private Integer id;
	/*
	 * メンバー名
	 */
	private String name;
}
