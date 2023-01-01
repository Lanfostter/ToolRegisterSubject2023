package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

import com.globits.education.domain.MarkType;
import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SpecialPoint;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.domain.StudentMark;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.Subject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.utils.NumberUtils;

public class StudentMarkDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private StudentDto student; // Sinh viên
	private Double originalMark;//Điểm thang 10 chưa qua xử lý(chưa trừ)
	private Double mark;
	private SubjectDto subject;
	private Boolean isLock;//Đã chốt 
	private StudentCourseSubjectDto studentCourseSubject;
	// private CourseSubjectDto courseSubject;

	private MarkTypeDto markType;// MarkType (0 = điểm chuyên cần, 1 = thường xuyên, 2 = điểm thi cuối kỳ lần 1,
	// điểm thi cuối kỳ lần 2, ...)
	private Integer examRound;// Lần thi cho loại điểm này (ví dụ : thi lần 1, thi lần 2, ...).
	private Double coeffiecient;

	private SubjectExamDto subjectExam;
	private Boolean isSelected;
	
	private String markingCode;// Số phách
	
	private Integer studyTime;
	
	private StudentSemesterSubjectExamRoomDto studentExamRoom;

	private SemesterSubjectDto semesterSubject;
	
	private Double oldMark;// Điểm trước khi cập nhật
	
	private Integer updateType;
	
	private SpecialPointDto specialPoint;
	
	private String displaySemester = "";
	
	private Integer markingCodeNumber;
	private Integer examCodeNumber;
	private Integer subjectStatus;//trạng thái học convert từ StudentCourseSubject.subjectStatus
	private String note;//ghi chú
	private Integer examStatus;//trạng thái thi(F, 0F, K, P..)
	private boolean isOld = false;
	private List<StudentMarkHistoryDto> historyModifi;
	
	
	
	public List<StudentMarkHistoryDto> getHistoryModifi() {
		return historyModifi;
	}

	public void setHistoryModifi(List<StudentMarkHistoryDto> historyModifi) {
		this.historyModifi = historyModifi;
	}

	public boolean isOld() {
		return isOld;
	}

	public void setOld(boolean isOld) {
		this.isOld = isOld;
	}

	public Integer getMarkingCodeNumber() {
		return markingCodeNumber;
	}

	public void setMarkingCodeNumber(Integer markingCodeNumber) {
		this.markingCodeNumber = markingCodeNumber;
	}

	public Integer getExamCodeNumber() {
		return examCodeNumber;
	}

	public void setExamCodeNumber(Integer examCodeNumber) {
		this.examCodeNumber = examCodeNumber;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Double getOldMark() {
		return oldMark;
	}

	public void setOldMark(Double oldMark) {
		this.oldMark = oldMark;
	}

	public String getDisplaySemester() {
		return displaySemester;
	}

	public void setDisplaySemester(String displaySemester) {
		this.displaySemester = displaySemester;
	}

	public Integer getUpdateType() {
		return updateType;
	}

	public void setUpdateType(Integer updateType) {
		this.updateType = updateType;
	}

	public SpecialPointDto getSpecialPoint() {
		return specialPoint;
	}

	public void setSpecialPoint(SpecialPointDto specialPoint) {
		this.specialPoint = specialPoint;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public Double getMark() {
		return NumberUtils.round(mark,1);
//		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public MarkTypeDto getMarkType() {
		return markType;
	}

	public void setMarkType(MarkTypeDto markType) {
		this.markType = markType;
	}

	public Double getCoeffiecient() {
		return coeffiecient;
	}

	public void setCoeffiecient(Double coeffiecient) {
		this.coeffiecient = coeffiecient;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}

	public SubjectExamDto getSubjectExam() {
		return subjectExam;
	}

	public void setSubjectExam(SubjectExamDto subjectExam) {
		this.subjectExam = subjectExam;
	}

	public StudentCourseSubjectDto getStudentCourseSubject() {
		return studentCourseSubject;
	}

	public void setStudentCourseSubject(StudentCourseSubjectDto studentCourseSubject) {
		this.studentCourseSubject = studentCourseSubject;
	}
	
	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	

	public String getMarkingCode() {
		return markingCode;
	}

	public void setMarkingCode(String markingCode) {
		this.markingCode = markingCode;
	}	

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public StudentSemesterSubjectExamRoomDto getStudentExamRoom() {
		return studentExamRoom;
	}

	public void setStudentExamRoom(StudentSemesterSubjectExamRoomDto studentExamRoom) {
		this.studentExamRoom = studentExamRoom;
	}

	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Double getOriginalMark() {
		return NumberUtils.round(originalMark,1);
//		return originalMark;
	}

	public void setOriginalMark(Double originalMark) {
		this.originalMark = originalMark;
	}
	
	public Integer getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(Integer subjectStatus) {
		this.subjectStatus = subjectStatus;
	}
	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}	

	public Integer getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(Integer examStatus) {
		this.examStatus = examStatus;
	}

	public StudentMarkDto() {

	}
}
