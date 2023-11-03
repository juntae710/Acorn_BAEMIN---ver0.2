package com.acorn.baemin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionDTO {
	int optionCode;
	int menuCode;
	String optionCategory;
	int optionSelectType;
	String optionName;
	int optionPrice;
	String optionStatus;
}
