package com.example.demo.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.globits.education.domain.CourseHour;

public class CourseHourDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
//    @JsonFormat
//    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date start; // Thời điểm bắt đầu (sẽ không tính đến yếu tố ngày)
	private String startString;
	private Date end; // thời điểm kết thúc (không tính đến yếu tố ngày).
	private String endString;
	private Integer indexNumber; // Số thứ tự trong ngày
	private Integer type; 	//1.Buổi sáng		2.Buổi chiều		3.Buổi tối
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public String getStartString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");  
			 startString = formatter.format(this.start);
		} catch (Exception e) {
			// TODO: handle exception
		}		  
		return startString;
	}

	public Date getEnd() {
		return end;
	}

	public String getEndString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");  
			 endString = formatter.format(this.end);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return endString;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Integer getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(Integer indexNumber) {
		this.indexNumber = indexNumber;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public CourseHourDto() {

	}

	public CourseHourDto(CourseHour ch) {
		this.end = ch.getEnd();
		this.id = ch.getId();
		this.indexNumber = ch.getIndexNumber();
		this.name = ch.getName();
		this.start = ch.getStart();
		this.type = ch.getType();
	}

}
