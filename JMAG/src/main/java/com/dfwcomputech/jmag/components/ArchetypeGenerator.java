package com.dfwcomputech.jmag.components;

import org.apache.commons.lang3.StringUtils;

import com.dfwcomputech.jmag.enums.ApplicationType;

public class ArchetypeGenerator {
	private ApplicationType appType;
	private String initialPackage;
	private String appName;

	public ArchetypeGenerator(ApplicationType appType, String initialPackage,
			String appName) {
		super();
		this.appType = appType;
		this.initialPackage = initialPackage;
		this.appName = appName;
	}

	public String generateArchetype(){
		String code ="";
		//Common configuration
		code="mvn archetype:generate ";
		if(StringUtils.isNotBlank(initialPackage))
			code+="-DgroupId="+initialPackage+" ";
		else
			code+="-DgroupId=com.dfwcomputech.app ";
		if(StringUtils.isNotBlank(appName))
			code+="-DartifactId="+appName+" ";
		else
			code+="-DartifactId=my-app ";
		
		switch(appType){
		case STANDALONE:
			code+="-DarchetypeArtifactId=maven-archetype-quickstart";
			break;
		case WEB:
			code+="-DarchetypeArtifactId=maven-archetype-webapp";
			break;
		case VAADIN:
			code+=" -DarchetypeGroupId=com.vaadin -DarchetypeArtifactId=vaadin-archetype-application -DarchetypeVersion=7.1.10  -Dversion=1.0 -Dpackaging=war";
			break;
		default:
			break;
		}
		code+=" -DinteractiveMode=false";
		return code;
	}
	
	public ApplicationType getAppType() {
		return appType;
	}

	public void setAppType(ApplicationType appType) {
		this.appType = appType;
	}

	public String getInitialPackage() {
		return initialPackage;
	}

	public void setInitialPackage(String initialPackage) {
		this.initialPackage = initialPackage;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	
}
