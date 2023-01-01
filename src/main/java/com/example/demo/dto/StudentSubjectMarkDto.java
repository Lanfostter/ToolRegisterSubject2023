package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;

import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.Semester;
import com.globits.education.domain.StudentMark;
import com.globits.education.domain.StudentSubjectMark;
import com.globits.education.domain.Subject;
import com.globits.education.utils.MarkUtil;
import com.globits.education.utils.NumberUtils;



public class StudentSubjectMarkDto implements Serializable {
	private Long id;
	private StudentDto student;

	private SubjectDto subject;
	private SemesterDto semester;
	
	private Long studentId;
	private Long subjectId;
	private Long semesterId;
	
	private Double mark;//Điểm thang 10
	private Integer examRound;
	private Integer studyTime;//Lần học thứ mấy của sinh viên
	private List<StudentMarkDto> details;
	private Integer status;
	private Double mark4;//Điểm thang 4
	private String charMark;//điểm chữ
	private Boolean isAccepted;
	private String note;//ghi chú
	private Boolean isCounted;//Là môn tính điểm
	
	private Integer result;
	
	private Long equivalentSubjectId;
	
	private String equivalentSubjectCode;
	private String equivalentSubjectName;
	
	private Boolean isInProgram;
	
	/* Trạng thái sinh viên ở phòng thi
	 * 0.Có thi
	 * -1. Bỏ thi
	 * 1. Miễn thi
	 * -2. Đình chỉ thi
	 */	
	private int examStatus;//trạng thái cấm thi
	private String  examStatusCode;//trạng thái cấm thi
	
	private Boolean isPublished;// Được công bố hay chưa
	
	private boolean saveStatus;//trạng thái lưu
	private Double markQT;
	private Double markTHI;
	private Boolean isMarkEquivalent;//Điểm công nhận tương đương;
	private Boolean isConditionalMark;//Là điểm điều kiện (ví dụ điểm của kỳ thi trung học phổ thông quốc gia,...)
	
	public StudentSubjectMarkDto() {
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public List<StudentMarkDto> getDetails() {
		return details;
	}

	public void setDetails(List<StudentMarkDto> details) {
		this.details = details;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getMark4() {
		return mark4;
	}

	public void setMark4(Double mark4) {
		this.mark4 = mark4;
	}

	public String getCharMark() {
		return charMark;
	}

	public void setCharMark(String charMark) {
		this.charMark = charMark;
	}

	public Boolean getIsAccepted() {
		return isAccepted;
	}

	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getIsCounted() {
		return isCounted;
	}

	public void setIsCounted(Boolean isCounted) {
		this.isCounted = isCounted;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public Long getEquivalentSubjectId() {
		return equivalentSubjectId;
	}

	public void setEquivalentSubjectId(Long equivalentSubjectId) {
		this.equivalentSubjectId = equivalentSubjectId;
	}

	public String getEquivalentSubjectCode() {
		return equivalentSubjectCode;
	}

	public void setEquivalentSubjectCode(String equivalentSubjectCode) {
		this.equivalentSubjectCode = equivalentSubjectCode;
	}

	public String getEquivalentSubjectName() {
		return equivalentSubjectName;
	}

	public void setEquivalentSubjectName(String equivalentSubjectName) {
		this.equivalentSubjectName = equivalentSubjectName;
	}

	public Boolean getIsInProgram() {
		return isInProgram;
	}

	public void setIsInProgram(Boolean isInProgram) {
		this.isInProgram = isInProgram;
	}

	public int getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(int examStatus) {
		this.examStatus = examStatus;
	}

	public String getExamStatusCode() {
		return examStatusCode;
	}

	public void setExamStatusCode(String examStatusCode) {
		this.examStatusCode = examStatusCode;
	}

	public Boolean getIsPublished() {
		return isPublished;
	}

	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	public boolean isSaveStatus() {
		return saveStatus;
	}

	public void setSaveStatus(boolean saveStatus) {
		this.saveStatus = saveStatus;
	}

	public Double getMarkQT() {
		return markQT;
	}

	public void setMarkQT(Double markQT) {
		this.markQT = markQT;
	}

	public Double getMarkTHI() {
		return markTHI;
	}

	public void setMarkTHI(Double markTHI) {
		this.markTHI = markTHI;
	}

	public Boolean getIsMarkEquivalent() {
		return isMarkEquivalent;
	}

	public void setIsMarkEquivalent(Boolean isMarkEquivalent) {
		this.isMarkEquivalent = isMarkEquivalent;
	}

	public Boolean getIsConditionalMark() {
		return isConditionalMark;
	}

	public void setIsConditionalMark(Boolean isConditionalMark) {
		this.isConditionalMark = isConditionalMark;
	}
	
}
