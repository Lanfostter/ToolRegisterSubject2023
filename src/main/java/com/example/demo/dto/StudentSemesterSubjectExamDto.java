package com.example.demo.dto;

import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.StudentSemesterSubjectExam;

public class StudentSemesterSubjectExamDto extends BaseObjectDto {
	private Boolean isArrangedRoom;
	private Long examRoomId;
	private SemesterSubjectExamDto semesterSubjectExam;
	private StudentDto student;
	private StudentCourseSubjectDto studentCourseSubjectDto;
	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}
	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public StudentCourseSubjectDto getStudentCourseSubjectDto() {
		return studentCourseSubjectDto;
	}
	public void setStudentCourseSubjectDto(StudentCourseSubjectDto studentCourseSubjectDto) {
		this.studentCourseSubjectDto = studentCourseSubjectDto;
	}
	
	
	public Boolean getIsArrangedRoom() {
		return isArrangedRoom;
	}
	public void setIsArrangedRoom(Boolean isArrangedRoom) {
		this.isArrangedRoom = isArrangedRoom;
	}
	public Long getExamRoomId() {
		return examRoomId;
	}
	public void setExamRoomId(Long examRoomId) {
		this.examRoomId = examRoomId;
	}
	public StudentSemesterSubjectExamDto(StudentSemesterSubjectExam entity) {
		if(entity!=null) {
			this.id = entity.getId();
			semesterSubjectExam = new SemesterSubjectExamDto();
			student = new StudentDto();
			studentCourseSubjectDto = new StudentCourseSubjectDto();
	
			if(entity.getSemesterSubjectExam()!=null) {
				semesterSubjectExam.setId(entity.getSemesterSubjectExam().getId());
				semesterSubjectExam.setNumberEstimateStudent(entity.getSemesterSubjectExam().getNumberEstimateStudent());
			}
			
			if(entity.getStudent()!=null) {
				student.setId(entity.getStudent().getId());
				student.setStudentCode(entity.getStudent().getStudentCode());
				student.setDisplayName(entity.getStudent().getDisplayName());
				student.setLastName(entity.getStudent().getLastName());
				student.setFirstName(entity.getStudent().getFirstName());
				if(entity.getStudent().getEnrollmentClass()!=null && entity.getStudent().getEnrollmentClass().getClassCode()!=null) {
					student.setClassCode(entity.getStudent().getEnrollmentClass().getClassCode());
				}
				if(entity.getStudent().getEnrollmentClass()!=null && entity.getStudent().getEnrollmentClass().getClassName()!=null) {
					student.setClassName(entity.getStudent().getEnrollmentClass().getClassName());
				}
			}
			if(entity.getStudentCourseSubject()!=null) {
				studentCourseSubjectDto.setId(entity.getStudentCourseSubject().getId());
				CourseSubjectDto courseSubject = new CourseSubjectDto();
				courseSubject.setId(entity.getStudentCourseSubject().getCourseSubject().getId());
				courseSubject.setCode(entity.getStudentCourseSubject().getCourseSubject().getCode());
				courseSubject.setShortCode(entity.getStudentCourseSubject().getCourseSubject().getShortCode());
				studentCourseSubjectDto.setCourseSubject(courseSubject);			
			}
			
			this.examRoomId = entity.getExamRoomId();
			this.isArrangedRoom = entity.getIsArrangedRoom();
			
		}

	}
	public StudentSemesterSubjectExamDto() {
		
	}
}
