package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.persistence.Column;

import com.globits.core.dto.RoomDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.SemesterSubjectExam;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.TestBag;

public class TestBagDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Integer numberStudent;// số lượng bài thi

	private Integer startMarkingCode;//Số phách bắt đầu
	private Integer endMarkingCode;//Số phách kết thúc
	private List<StudentSemesterSubjectExamRoomDto> students;
	private List<SemesterSubjectExamRoomDto> rooms;
	private SemesterSubjectExamDto semesterSubjectExam;
	private TestBagCreateTimeDto testBagCreateTimeDto;
	private List<String> roomsSummary;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public Integer getStartMarkingCode() {
		return startMarkingCode;
	}

	public void setStartMarkingCode(Integer startMarkingCode) {
		this.startMarkingCode = startMarkingCode;
	}

	public Integer getEndMarkingCode() {
		return endMarkingCode;
	}

	public void setEndMarkingCode(Integer endMarkingCode) {
		this.endMarkingCode = endMarkingCode;
	}

	public List<StudentSemesterSubjectExamRoomDto> getStudents() {
		return students;
	}

	public void setStudents(List<StudentSemesterSubjectExamRoomDto> students) {
		this.students = students;
	}

	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}

	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}
	public List<SemesterSubjectExamRoomDto> getRooms() {
		return rooms;
	}

	public void setRooms(List<SemesterSubjectExamRoomDto> rooms) {
		this.rooms = rooms;
	}

	public TestBagCreateTimeDto getTestBagCreateTimeDto() {
		return testBagCreateTimeDto;
	}

	public void setTestBagCreateTimeDto(TestBagCreateTimeDto testBagCreateTimeDto) {
		this.testBagCreateTimeDto = testBagCreateTimeDto;
	}

	public List<String> getRoomsSummary() {
		return roomsSummary;
	}

	public void setRoomsSummary(List<String> roomsSummary) {
		this.roomsSummary = roomsSummary;
	}

	public TestBagDto() {
		
	}

}
