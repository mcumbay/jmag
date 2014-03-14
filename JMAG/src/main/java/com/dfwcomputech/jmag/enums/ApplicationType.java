package com.dfwcomputech.jmag.enums;

import com.dfwcomputech.common.enums.EnumConverter;
import com.dfwcomputech.common.enums.ReverseEnumMap;

public enum ApplicationType implements EnumConverter<ApplicationType>{
	STANDALONE(EnumConstants.STANDALONESTR),WEB(EnumConstants.WEBSTR),VAADIN(EnumConstants.VAADIN);
	
	private String value;
	private static ReverseEnumMap<ApplicationType> map =  new ReverseEnumMap<ApplicationType>(ApplicationType.class);
	
	private ApplicationType(String value){
		this.value=value;
	}

	@Override
	public  ApplicationType convert(String value){
		return map.get(value);
	}

	@Override
	public String convert() {
		
		return value;
	}
	
	public static ApplicationType get(String value){
		return map.get(value);
	}
}
