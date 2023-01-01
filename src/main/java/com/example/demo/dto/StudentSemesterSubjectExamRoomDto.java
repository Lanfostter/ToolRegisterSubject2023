package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.ExamStatus;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.SpecialPoint;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.TestBag;

public class StudentSemesterSubjectExamRoomDto implements Serializable {
	private Long id;
	private int status;
	private String examCode;// Số báo danh
	private Integer examCodeNumber;// Số báo danh qui đổi ra số
	private String markingCode;// Số phách
	private Integer markingCodeNumber;// Số phách đổi ra số
	private StudentCourseSubjectDto studentCourseSubject;// Đăng ký cho lần học nào. Một sinh viên phải học ít nhất 1
	private String examPeriodCode;//Mã đợt thi													// lần mới được thi.

	private SemesterSubjectExamRoomDto examRoom;
	private TestBagDto testBag;

	private StudentDto student;// Dư thừa dữ liệu nhưng cần để sử dụng trong trường hợp 1 số môn học không cần
								// học mà cũng được thi.
	private Boolean isExempt;//sinh viên không học nhưng được thi và nhập điểm luôn, lấy hệ số là 1.
	private String className;
	private String classCode;
	private SpecialPointDto specialPoint;
	
	private Integer examRound;
	private Integer subjectCredit;
	private String subjectName;
	private String studentCode;
	private Integer studyTime;
	
	private Long studentExamId;
	private ExamStatusDto examStatus;
	private Long courseSubjectId;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public void setExamCodeNumber(Integer examCodeNumber) {
		this.examCodeNumber = examCodeNumber;
	}

	public void setMarkingCodeNumber(Integer markingCodeNumber) {
		this.markingCodeNumber = markingCodeNumber;
	}

	public String getMarkingCode() {
		return markingCode;
	}

	public void setMarkingCode(String markingCode) {
		this.markingCode = markingCode;
	}

	public Long getStudentExamId() {
		return studentExamId;
	}

	public void setStudentExamId(Long studentExamId) {
		this.studentExamId = studentExamId;
	}

	public Integer getExamCodeNumber() {
		try {
			examCodeNumber = Integer.parseInt(this.examCode);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return examCodeNumber;
	}

	public Integer getMarkingCodeNumber() {
		try {
			markingCodeNumber = Integer.parseInt(this.markingCode);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return markingCodeNumber;
	}

	public StudentCourseSubjectDto getStudentCourseSubject() {
		return studentCourseSubject;
	}

	public void setStudentCourseSubject(StudentCourseSubjectDto studentCourseSubject) {
		this.studentCourseSubject = studentCourseSubject;
	}

	public String getExamPeriodCode() {
		return examPeriodCode;
	}

	public void setExamPeriodCode(String examPeriodCode) {
		this.examPeriodCode = examPeriodCode;
	}

	public SemesterSubjectExamRoomDto getExamRoom() {
		return examRoom;
	}

	public void setExamRoom(SemesterSubjectExamRoomDto examRoom) {
		this.examRoom = examRoom;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}
	

	public Boolean getIsExempt() {
		return isExempt;
	}

	public void setIsExempt(Boolean isExempt) {
		this.isExempt = isExempt;
	}
	

	public TestBagDto getTestBag() {
		return testBag;
	}

	public void setTestBag(TestBagDto testBag) {
		this.testBag = testBag;
	}
	

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	

	public SpecialPointDto getSpecialPoint() {
		return specialPoint;
	}

	public void setSpecialPoint(SpecialPointDto specialPoint) {
		this.specialPoint = specialPoint;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}

	public Integer getSubjectCredit() {
		return subjectCredit;
	}

	public void setSubjectCredit(Integer subjectCredit) {
		this.subjectCredit = subjectCredit;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Integer getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Integer studyTime) {
		this.studyTime = studyTime;
	}

	public ExamStatusDto getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(ExamStatusDto examStatus) {
		this.examStatus = examStatus;
	}

	public Long getCourseSubjectId() {
		return courseSubjectId;
	}

	public void setCourseSubjectId(Long courseSubjectId) {
		this.courseSubjectId = courseSubjectId;
	}

	public StudentSemesterSubjectExamRoomDto() {

	}
}
