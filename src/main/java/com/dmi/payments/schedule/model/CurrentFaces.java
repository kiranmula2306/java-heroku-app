package com.dmi.payments.schedule.model;

public class CurrentFaces {
	
	private Double current_Face;
	private String tpuname;
	
	public Double getCurrent_Face() {
		return current_Face;
	}
	public void setCurrent_Face(Double current_Face) {
		this.current_Face = current_Face;
	}
	public String getTpuname() {
		return tpuname;
	}
	public void setTpuname(String tpuname) {
		this.tpuname = tpuname;
	}
	@Override
	public String toString() {
		return "CurrentFaces [current_Face=" + current_Face + ", tpuname=" + tpuname + "]";
	}

}
