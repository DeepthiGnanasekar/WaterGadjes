package com.revature.watercanappreservems.dto;

import lombok.Data;

@Data
public class ReserveDto {
	private int userId;
	private String userName;
	private int reservedCans;
}
