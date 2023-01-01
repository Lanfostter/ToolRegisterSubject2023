package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Roman;

import com.globits.core.dto.RoomDto;
import com.globits.education.domain.SemesterSubjectExamDate;
import com.globits.education.domain.SemesterSubjectExamHour;
import com.globits.education.domain.ExamHour;

public class SemesterSubjectExamDateDto implements Serializable {

	private Long id;
	
	private SemesterSubjectExamDto semesterSubjectExam;

	private Date date;

	private Set<SemesterSubjectExamHourDto> examHours;
	
	private RoomDto room;

	public RoomDto getRoom() {
		return room;
	}

	public void setRoom(RoomDto room) {
		this.room = room;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}

	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<SemesterSubjectExamHourDto> getExamHours() {
		return examHours;
	}

	public void setExamHours(Set<SemesterSubjectExamHourDto> examHours) {
		this.examHours = examHours;
	}

	public SemesterSubjectExamDateDto() {
		super();
	}

}
