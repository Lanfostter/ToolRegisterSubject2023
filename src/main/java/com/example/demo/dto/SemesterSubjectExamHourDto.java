package com.example.demo.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.RoomDto;
import com.globits.education.domain.SemesterSubjectExamDate;
import com.globits.education.domain.SemesterSubjectExamHour;
import com.globits.education.domain.SemesterSubjectExamHourRoom;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;

public class SemesterSubjectExamHourDto extends BaseObjectDto {
	private SemesterSubjectExamDateDto examDate;
	
	private ExamHourDto examHour;
	
	private Set<SemesterSubjectExamRoomDto> examRooms;//phòng thi dự kiến

	public SemesterSubjectExamDateDto getExamDate() {
		return examDate;
	}

	public void setExamDate(SemesterSubjectExamDateDto examDate) {
		this.examDate = examDate;
	}

	public void setExamHour(ExamHourDto examHour) {
		this.examHour = examHour;
	}

	public ExamHourDto getExamHour() {
		return examHour;
	}

	public Set<SemesterSubjectExamRoomDto> getExamRooms() {
		return examRooms;
	}

	public void setExamRooms(Set<SemesterSubjectExamRoomDto> examRooms) {
		this.examRooms = examRooms;
	}
	public SemesterSubjectExamHourDto() {
		super();
	}
}
