package com.waylau.spring.cloud.vo;

import java.io.Serializable;

/**
 * 未来天气信息.
 * 
 * @since 1.0.0 2017年9月2日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ForecastVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String date;
    private String high;
    private String fengxiang;
    private String low;
    private String fengli;
    private String type;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getFengxiang() {
		return fengxiang;
	}

	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getFengli() {
		return fengli;
	}

	public void setFengli(String fengli) {
		this.fengli = fengli;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ForecastVO() {

	}
 
}
