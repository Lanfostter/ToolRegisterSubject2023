package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.SemesterSubjectExam;
import com.globits.education.domain.SemesterSubjectExamCourseSubject;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.Subject;
import com.globits.education.domain.TestBag;
import com.globits.education.domain.TrainingBaseSemesterSubject;
import com.globits.education.domain.TrainingBaseSemesterSubjectExam;

public class SemesterSubjectExamCourseSubjectDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;

	private SemesterSubjectExamDto semesterSubjectExam;

	private CourseSubjectDto courseSubject;
	 

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

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}


	public SemesterSubjectExamCourseSubjectDto() {
		
	}
}
