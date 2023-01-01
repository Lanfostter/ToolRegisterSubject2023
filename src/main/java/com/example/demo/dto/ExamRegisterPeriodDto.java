package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.ExamRegisterPeriod;
import com.globits.education.domain.ExamRoomPeriod;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.SemesterSubjectExam;

public class ExamRegisterPeriodDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;
	private SemesterDto semester;

	private String name;
	private String code;
	private Date start; 
	private Date end;
	private Date fromDate;
	private Date toDate;
	private SemesterRegisterPeriodDto registerPeriod;
	private List<SemesterSubjectExamDto> semesterSubjectExams;
	private Set<ExamRoomPeriodDto> examRooms;
	private Boolean isPublished;// Được công bố lịch thi hay chưa
	
	
	public Set<ExamRoomPeriodDto> getExamRooms() {
		return examRooms;
	}
	public void setExamRooms(Set<ExamRoomPeriodDto> examRooms) {
		this.examRooms = examRooms;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}	
		
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}
	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}
	public List<SemesterSubjectExamDto> getSemesterSubjectExams() {
		return semesterSubjectExams;
	}
	public void setSemesterSubjectExam(List<SemesterSubjectExamDto> semesterSubjectExams) {
		this.semesterSubjectExams = semesterSubjectExams;
	}
	
	public Boolean getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}
	public ExamRegisterPeriodDto() {
		
	}
}
