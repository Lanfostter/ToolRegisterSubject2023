package com.example.demo.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.globits.core.dto.EthnicsDto;
import com.globits.core.dto.PersonDto;
import com.globits.core.dto.ProfessionDto;
import com.globits.core.dto.ReligionDto;
import com.globits.core.dto.StatusDto;
import com.globits.education.Const;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCandidateProfile;
import com.globits.education.domain.StudentDecision;
import com.globits.education.domain.StudentEducationProgram;
import com.globits.education.domain.StudentObjectStudent;
import com.globits.education.domain.StudentObjectStudentSemester;
import com.globits.education.domain.StudentStatusStudentSemester;
import com.globits.education.dto.view.ViewStudentVoucherReceivePayDto;
import com.globits.education.utils.EducationConstant;
import com.globits.security.dto.UserDto;

public class StudentDto extends PersonDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String studentCode;

	private Integer highSchoolGraduationYear;// Năm tốt nghiệp phổ thông trung học

	private Integer yearOfAdmission;// Năm bắt đầu học

	private String fatherFullName; // Họ tên bố

	private String motherFullName; // Họ tên mẹ

	private Date fatherBirthDate; // Ngày sinh bố
	private String fatherBirthDateString;
	private Date motherBirthDate; // Ngày sinh mẹ
	private String motherBirthDateString;
	private Boolean isBoarder;
	private ProfessionDto fatherProfession;// Nghề nghiệp bố

	private ProfessionDto motherProfession; // Nghề nghiệp mẹ
	private String fatherPhoneNumber; // Số đt bố
	private String motherPhoneNumber; // Số đt mẹ

	private EnrollmentClassDto enrollmentClass; // Lớp nhập học
	
	private String bankAccount; // Số tài khoản
	private String bankName; // Tên ngân hàng
	private StudentObjectDto studentObject;//đối tượng đào tạo

	private Set<StudentEducationProgramDto> programs;
	
	private Set<StudentObjectStudentDto> studentObjectStudents;
	private Set<StudentObjectStudentSemesterDto> studentObjectStudentSemesters;
	private List<StudentStudentPrivateDocumentDto> studentStudentPrivateDocumentDtos;
	private Set<StudentDecisionDto> studentDecisions;
	private UserDto user;
	
	private StudentCandidateProfileDto candidateProfile;
	private Integer status;
	private Boolean updateStatus = true;
	private Boolean isStatusStudentExamRoom = false;//xét sinh viên  tồn tại ở phòng thi
	private Boolean isHave = false;//xét sinh viên  lưu vào phòng thi
	private Boolean isExempt = false;//xét trường hợp không học nhưng thi để lấy hệ số=1
	private String courseYear;
	private String department;
	private String speciality;
	private String specialityEng;
	private String className;
	private String classCode;
	private Boolean isAbleToGraduate;
	private Boolean isInGraduateList;
	
	private Integer subjectStatus;//Dùng cho trạng của sinh viên trong lớp học phần
	private Long studentCourseSubjectId;
	private ViewStudentVoucherReceivePayDto viewStudentVoucherReceivePayDto;
	private StudentTuitionFeeCalculateDto studentTuitionFeeCalculateDto;
	private String educationLevel;//bậc đào tạo
	private String educationType;//Loại hình đào tạo
	private String educationTypeEng;//Loại hình đào tạo
	private Set<StudentStatusStudentSemesterDto> studentStatusStudentSemesters;//trạng thái theo kỳ
	private String statusName;//trạng thái sv
	private String statusSemesterName;//trạng thái sv theo học kỳ
	private String note; // ghi chu
	private StatusDto studentStatus;//trạng thái sinh viên
	/*Phân loại đối tượng theo hệ - khóa hỗn hợp (hiện tại chỉ dùng cho báo có thu học phí theo ngày+ tổng hợp học bổng)
	 * 1=DHCQ,CD
	 * 2=DHTC
	 * 3=CAOHOC,NCS
	 * 4=LT
	 * 5=CTTT
	 */
	private int studentType;
	private Boolean payedAdmissionFee;
	private Boolean userActive;
	
	

	public Boolean getUserActive() {
		return userActive;
	}

	public void setUserActive(Boolean userActive) {
		this.userActive = userActive;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Integer getHighSchoolGraduationYear() {
		return highSchoolGraduationYear;
	}

	public void setHighSchoolGraduationYear(Integer highSchoolGraduationYear) {
		this.highSchoolGraduationYear = highSchoolGraduationYear;
	}

	public Integer getYearOfAdmission() {
		return yearOfAdmission;
	}

	public void setYearOfAdmission(Integer yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public String getFatherFullName() {
		return fatherFullName;
	}

	public void setFatherFullName(String fatherFullName) {
		this.fatherFullName = fatherFullName;
	}

	public String getMotherFullName() {
		return motherFullName;
	}

	public void setMotherFullName(String motherFullName) {
		this.motherFullName = motherFullName;
	}

	public Date getFatherBirthDate() {
		return fatherBirthDate;
	}

	public void setFatherBirthDate(Date fatherBirthDate) {
		this.fatherBirthDate = fatherBirthDate;
	}

	public Date getMotherBirthDate() {
		return motherBirthDate;
	}

	public void setMotherBirthDate(Date motherBirthDate) {
		this.motherBirthDate = motherBirthDate;
	}
	
	public String getFatherBirthDateString() {
//		try {
//			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//			 fatherBirthDateString = formatter.format(this.fatherBirthDate);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}		  
		return fatherBirthDateString;
	}

	public void setFatherBirthDateString(String fatherBirthDateString) {
		this.fatherBirthDateString = fatherBirthDateString;
	}

	public String getMotherBirthDateString() {
//		try {
//			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//			 motherBirthDateString = formatter.format(this.motherBirthDate);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}		  
		return motherBirthDateString;
	}

	public void setMotherBirthDateString(String motherBirthDateString) {
		this.motherBirthDateString = motherBirthDateString;
	}

	public ProfessionDto getFatherProfession() {
		return fatherProfession;
	}

	public void setFatherProfession(ProfessionDto fatherProfession) {
		this.fatherProfession = fatherProfession;
	}

	public ProfessionDto getMotherProfession() {
		return motherProfession;
	}

	public void setMotherProfession(ProfessionDto motherProfession) {
		this.motherProfession = motherProfession;
	}

	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}

	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}

	public Set<StudentEducationProgramDto> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<StudentEducationProgramDto> programs) {
		this.programs = programs;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(Boolean updateStatus) {
		this.updateStatus = updateStatus;
	}
	

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Boolean getIsBoarder() {
		return isBoarder;
	}

	public void setIsBoarder(Boolean isBoarder) {
		this.isBoarder = isBoarder;
	}

	public StudentObjectDto getStudentObject() {
		return studentObject;
	}

	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}

	public StudentCandidateProfileDto getCandidateProfile() {
		return candidateProfile;
	}

	public void setCandidateProfile(StudentCandidateProfileDto candidateProfile) {
		this.candidateProfile = candidateProfile;
	}
	

	public Boolean getIsStatusStudentExamRoom() {
		return isStatusStudentExamRoom;
	}

	public void setIsStatusStudentExamRoom(Boolean isStatusStudentExamRoom) {
		this.isStatusStudentExamRoom = isStatusStudentExamRoom;
	}

	public String getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(String courseYear) {
		this.courseYear = courseYear;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	

	public Boolean getIsHave() {
		return isHave;
	}

	public void setIsHave(Boolean isHave) {
		this.isHave = isHave;
	}

	public Boolean getIsAbleToGraduate() {
		return isAbleToGraduate;
	}

	public void setIsAbleToGraduate(Boolean isAbleToGraduate) {
		this.isAbleToGraduate = isAbleToGraduate;
	}

	public Boolean getIsInGraduateList() {
		return isInGraduateList;
	}

	public void setIsInGraduateList(Boolean isInGraduateList) {
		this.isInGraduateList = isInGraduateList;
	}
	

	public Boolean getIsExempt() {
		return isExempt;
	}

	public void setIsExempt(Boolean isExempt) {
		this.isExempt = isExempt;
	}

	public Integer getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(Integer subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

	public Long getStudentCourseSubjectId() {
		return studentCourseSubjectId;
	}

	public void setStudentCourseSubjectId(Long studentCourseSubjectId) {
		this.studentCourseSubjectId = studentCourseSubjectId;
	}

	public ViewStudentVoucherReceivePayDto getViewStudentVoucherReceivePayDto() {
		return viewStudentVoucherReceivePayDto;
	}

	public void setViewStudentVoucherReceivePayDto(ViewStudentVoucherReceivePayDto viewStudentVoucherReceivePayDto) {
		this.viewStudentVoucherReceivePayDto = viewStudentVoucherReceivePayDto;
	}

	public StudentTuitionFeeCalculateDto getStudentTuitionFeeCalculateDto() {
		return studentTuitionFeeCalculateDto;
	}

	public void setStudentTuitionFeeCalculateDto(StudentTuitionFeeCalculateDto studentTuitionFeeCalculateDto) {
		this.studentTuitionFeeCalculateDto = studentTuitionFeeCalculateDto;
	}

	public Set<StudentObjectStudentDto> getStudentObjectStudents() {
		return studentObjectStudents;
	}

	public void setStudentObjectStudents(Set<StudentObjectStudentDto> studentObjectStudents) {
		this.studentObjectStudents = studentObjectStudents;
	}

	public Set<StudentObjectStudentSemesterDto> getStudentObjectStudentSemesters() {
		return studentObjectStudentSemesters;
	}

	public void setStudentObjectStudentSemesters(Set<StudentObjectStudentSemesterDto> studentObjectStudentSemesters) {
		this.studentObjectStudentSemesters = studentObjectStudentSemesters;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public List<StudentStudentPrivateDocumentDto> getStudentStudentPrivateDocumentDtos() {
		return studentStudentPrivateDocumentDtos;
	}

	public void setStudentStudentPrivateDocumentDtos(
			List<StudentStudentPrivateDocumentDto> studentStudentPrivateDocumentDtos) {
		this.studentStudentPrivateDocumentDtos = studentStudentPrivateDocumentDtos;
	}

	public Set<StudentDecisionDto> getStudentDecisions() {
		return studentDecisions;
	}

	public void setStudentDecisions(Set<StudentDecisionDto> studentDecisions) {
		this.studentDecisions = studentDecisions;
	}	

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}	

	public String getEducationType() {
		return educationType;
	}

	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
	
	public String getSpecialityEng() {
		return specialityEng;
	}

	public void setSpecialityEng(String specialityEng) {
		this.specialityEng = specialityEng;
	}

	public String getEducationTypeEng() {
		return educationTypeEng;
	}

	public void setEducationTypeEng(String educationTypeEng) {
		this.educationTypeEng = educationTypeEng;
	}

	public Set<StudentStatusStudentSemesterDto> getStudentStatusStudentSemesters() {
		return studentStatusStudentSemesters;
	}

	public void setStudentStatusStudentSemesters(Set<StudentStatusStudentSemesterDto> studentStatusStudentSemesters) {
		this.studentStatusStudentSemesters = studentStatusStudentSemesters;
	}	

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}	

	public String getFatherPhoneNumber() {
		return fatherPhoneNumber;
	}

	public void setFatherPhoneNumber(String fatherPhoneNumber) {
		this.fatherPhoneNumber = fatherPhoneNumber;
	}

	public String getMotherPhoneNumber() {
		return motherPhoneNumber;
	}

	public void setMotherPhoneNumber(String motherPhoneNumber) {
		this.motherPhoneNumber = motherPhoneNumber;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public StatusDto getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(StatusDto studentStatus) {
		this.studentStatus = studentStatus;
	}
	
	public int getStudentType() {
		return studentType;
	}

	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}

	public Boolean getPayedAdmissionFee() {
		return payedAdmissionFee;
	}

	public void setPayedAdmissionFee(Boolean payedAdmissionFee) {
		this.payedAdmissionFee = payedAdmissionFee;
	}

	public String getStatusSemesterName() {
		return statusSemesterName;
	}

	public void setStatusSemesterName(String statusSemesterName) {
		this.statusSemesterName = statusSemesterName;
	}

	public StudentDto() {
		super();
		this.programs = new HashSet<StudentEducationProgramDto>();
		this.fatherProfession = new ProfessionDto();
		this.motherProfession = new ProfessionDto();
		this.enrollmentClass = new EnrollmentClassDto();
	}

	public StudentDto(Student student) {
		super(student);
		if (student != null) {
			this.studentCode = student.getStudentCode();
			if(student.getEnrollmentClass() != null) {
				this.enrollmentClass = new EnrollmentClassDto(student.getEnrollmentClass());
			}
			this.fatherBirthDate = student.getFatherBirthDate();
			this.fatherFullName = student.getFatherFullName();
			this.motherFullName = student.getMotherFullName();
			this.motherBirthDate = student.getMotherBirthDate();
			this.fatherPhoneNumber=student.getFatherPhoneNumber();
			this.motherPhoneNumber=student.getMotherPhoneNumber();
			this.highSchoolGraduationYear = student.getHighSchoolGraduationYear();
			this.gender=student.getGender();
			this.birthDate = student.getBirthDate();
			if(student.getReligion() != null) {
				this.religion = new ReligionDto(student.getReligion());
			}
			if(student.getEthnics() != null) {
				this.ethnics = new EthnicsDto(student.getEthnics());
			}
			this.phoneNumber = student.getPhoneNumber();
			if (student.getFatherProfession() != null) {
				this.fatherProfession = new ProfessionDto(student.getFatherProfession());
			}
			if (student.getMotherProfession() != null) {
				this.motherProfession = new ProfessionDto(student.getMotherProfession());
			}
			
			this.studentCode = student.getStudentCode();
			this.yearOfAdmission = student.getYearOfAdmission();
			if (student.getPrograms() != null) {
				this.programs = new HashSet<StudentEducationProgramDto>();
				Iterator<StudentEducationProgram> iters = student.getPrograms().iterator();
				while (iters.hasNext()) {
					this.programs.add(new StudentEducationProgramDto(iters.next()));
				}
			}

			if (student.getUser() != null) {
				user = new UserDto(student.getUser());
				user.setPassword(null);
			}
			this.bankAccount=student.getBankAccount();
			this.bankName=student.getBankName();
			this.note= student.getNote();
			if(student.isBoarder()!=null)
				this.isBoarder = student.isBoarder();
			if(student.getCandidateProfile()!=null) {
				this.candidateProfile=new StudentCandidateProfileDto(student.getCandidateProfile());
				this.payedAdmissionFee = student.getCandidateProfile().getPayedAdmissionFee();
			}
//			if(student.getStudentObject()!=null) {
//				this.studentObject=new StudentObjectDto(student.getStudentObject());
//			}
			this.status = student.getStatus();
			if (student.getStudentObjectStudents() != null) {
				this.studentObjectStudents = new HashSet<StudentObjectStudentDto>();
				Iterator<StudentObjectStudent> iters = student.getStudentObjectStudents().iterator();
				while (iters.hasNext()) {
					this.studentObjectStudents.add(new StudentObjectStudentDto(iters.next()));
				}
			}
			if (student.getStudentObjectStudentSemesters() != null) {
				this.studentObjectStudentSemesters = new HashSet<StudentObjectStudentSemesterDto>();
				Iterator<StudentObjectStudentSemester> iters = student.getStudentObjectStudentSemesters().iterator();
				while (iters.hasNext()) {
					this.studentObjectStudentSemesters.add(new StudentObjectStudentSemesterDto(iters.next()));
				}
			}			
			if (student.getStudentDecisions() != null && student.getStudentDecisions().size() > 0) {
				
				this.studentDecisions = new HashSet<StudentDecisionDto>();
				Iterator<StudentDecision> iters = student.getStudentDecisions().iterator();
				while (iters.hasNext()) {
					this.studentDecisions.add(new StudentDecisionDto(iters.next()));
				}				
			}
			if (student.getStudentStatusStudentSemesters() != null) {
				this.studentStatusStudentSemesters = new HashSet<StudentStatusStudentSemesterDto>();
				Iterator<StudentStatusStudentSemester> iters = student.getStudentStatusStudentSemesters().iterator();
				while (iters.hasNext()) {
					this.studentStatusStudentSemesters.add(new StudentStatusStudentSemesterDto(iters.next()));
				}
			}
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
				 if(this.birthDate!=null)
					 this.birthDateString = formatter.format(this.birthDate);
				 if(this.idNumberIssueDate!=null)
					 this.idNumberIssueDateString = formatter.format(this.idNumberIssueDate);	
				 if(this.fatherBirthDate!=null)
					 this.fatherBirthDateString = formatter.format(this.fatherBirthDate);	
				 if(this.motherBirthDate!=null)
					 this.motherBirthDateString = formatter.format(this.motherBirthDate);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			// tình trạng sinh viên
			if(student.getStudentStatus()!=null) {
				this.studentStatus=new StatusDto();
				this.studentStatus.setId(student.getStudentStatus().getId());
				this.studentStatus.setCode(student.getStudentStatus().getCode());
				this.studentStatus.setName(student.getStudentStatus().getName());
				this.statusName=student.getStudentStatus().getName();
			}else {
				this.statusName="Bình thường";
			}
//			try {
//				
//				String status="";
//				Date date=null;
//				if(student!=null&&student.getStudentStatusStudentSemesters()!=null&& student.getStudentStatusStudentSemesters().size()>0) {
//					for (StudentStatusStudentSemester id : student.getStudentStatusStudentSemesters()) {
//						if(date==null && id.getStudentStatus()!=null) {
//							status=id.getStudentStatus().getName();
////							if (id.getStatus().equals(EducationConstant.StudentStatus.baoLuu.getValue())) {
////								status="Bảo lưu";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.biDuoiHoc.getValue())) {
////								status="Buộc thôi học";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuyenTruong.getValue())) {
////								status="Chuyển trường";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.thoiHoc.getValue())) {
////								status="Thôi học";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.xoaTen.getValue())) {
////								status="Xóa tên";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuaRo.getValue())) {
////								status="Chưa rõ";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.daTotNghiep.getValue())) {
////								status="Đã tốt nghiệp";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.quayTroLai.getValue())) {
////								status="Quay trở lại";
////							} else {
////								status="Bình thường";
////							}
//							date=id.getStartDate();
//						}else if(date!=null && id.getStudentStatus()!=null && id.getStartDate()!=null && (date.equals(id.getStartDate())||date.before(id.getStartDate()))) {
////							if (id.getStatus().equals(EducationConstant.StudentStatus.baoLuu.getValue())) {
////								status="Bảo lưu";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.biDuoiHoc.getValue())) {
////								status="Buộc thôi học";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuyenTruong.getValue())) {
////								status="Chuyển trường";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.thoiHoc.getValue())) {
////								status="Thôi học";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.xoaTen.getValue())) {
////								status="Xóa tên";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.chuaRo.getValue())) {
////								status="Chưa rõ";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.daTotNghiep.getValue())) {
////								status="Đã tốt nghiệp";
////							} else if (id.getStatus().equals(EducationConstant.StudentStatus.quayTroLai.getValue())) {
////								status="Quay trở lại";
////							} else {
////								status="Bình thường";
////							}
//							status=id.getStudentStatus().getName();
//							date=id.getStartDate();
//						}
//					}
//				}
//				else if (student!=null&&student.getStudentStatus() != null) {
////					if (student.getStatus().equals(EducationConstant.StudentStatus.baoLuu.getValue())) {
////						status="Bảo lưu";
////					} else if (student.getStatus().equals(EducationConstant.StudentStatus.biDuoiHoc.getValue())) {
////						status="Buộc thôi học";
////					} else if (student.getStatus().equals(EducationConstant.StudentStatus.chuyenTruong.getValue())) {
////						status="Chuyển trường";
////					} else if (student.getStatus().equals(EducationConstant.StudentStatus.thoiHoc.getValue())) {
////						status="Thôi học";
////					} else if (student.getStatus().equals(EducationConstant.StudentStatus.xoaTen.getValue())) {
////						status="Xóa tên";
////					} else if (student.getStatus().equals(EducationConstant.StudentStatus.chuaRo.getValue())) {
////						status="Chưa rõ";
////					} else if (student.getStatus().equals(EducationConstant.StudentStatus.daTotNghiep.getValue())) {
////						status="Đã tốt nghiệp";
////					} else if (student.getStatus().equals(EducationConstant.StudentStatus.quayTroLai.getValue())) {
////						status="Quay trở lại";
////					} else {
////						status="Bình thường";
////					}
//					status=student.getStudentStatus().getName();
//
//				} else {
//					status="Bình thường";
//				}
//				this.setStatusName(status);
//					
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			
		}
	}
	
	public StudentDto(Student student, StudentCandidateProfile profile) {
		super(student);
		if (student != null) {
			this.studentCode = student.getStudentCode();
			if(student.getEnrollmentClass() != null) {
				this.enrollmentClass = new EnrollmentClassDto();
				this.enrollmentClass.setId(student.getEnrollmentClass().getId());
			}
			this.firstName = student.getFirstName();
			this.lastName = student.getLastName();
			this.displayName = student.getDisplayName();
			this.birthDate = student.getBirthDate();
			
			this.fatherBirthDate = student.getFatherBirthDate();
			this.fatherFullName = student.getFatherFullName();
			this.motherFullName = student.getMotherFullName();
			this.motherBirthDate = student.getMotherBirthDate();
			this.highSchoolGraduationYear = student.getHighSchoolGraduationYear();
			if(student.getReligion() != null) {
				this.religion = new ReligionDto();
				this.religion.setId(student.getReligion().getId()); 
			}
			if(student.getEthnics() != null) {
				this.ethnics = new EthnicsDto();
				this.ethnics.setId(student.getEthnics().getId());
			}
			this.phoneNumber = student.getPhoneNumber();
			if (student.getFatherProfession() != null) {
				this.fatherProfession = new ProfessionDto();
				this.fatherProfession.setId(student.getFatherProfession().getId());
			}
			if (student.getMotherProfession() != null) {
				this.motherProfession = new ProfessionDto();
				this.motherProfession.setId(student.getMotherProfession().getId());
			}
			
			this.studentCode = student.getStudentCode();
			this.yearOfAdmission = student.getYearOfAdmission();
//			if (student.getPrograms() != null) {
//				this.programs = new HashSet<StudentEducationProgramDto>();
//				Iterator<StudentEducationProgram> iters = student.getPrograms().iterator();
//				while (iters.hasNext()) {
//					StudentEducationProgramDto dto = new StudentEducationProgramDto();
//					dto.setId(iters.next().getId());
//					if(iters.next().getProgram()!=null) {
//						EducationProgramDto pro = new EducationProgramDto();
//						pro.setId(iters.next().getProgram().getId());
//						dto.setProgram(pro);
//					}					
//					this.programs.add(dto);
//				}
//			}

			if (student.getUser() != null) {
				user = new UserDto(student.getUser());
				user.setPassword(null);
			}
			this.bankAccount=student.getBankAccount();
			this.bankName=student.getBankName();
			this.note= student.getNote();
			if(student.isBoarder()!=null)
				this.isBoarder = student.isBoarder();
			if(profile!=null && profile.getId()!=null) {
				this.candidateProfile=new StudentCandidateProfileDto();;
				this.candidateProfile.setId(profile.getId());
				this.candidateProfile.setCandidateCode(profile.getCandidateCode());
				this.candidateProfile.setFirstSpecialityCode(profile.getFirstSpecialityCode());
				this.candidateProfile.setStudentCode(profile.getStudentCode());				
				this.candidateProfile.setTotalScore(profile.getTotalScore());
				this.payedAdmissionFee = profile.getPayedAdmissionFee();
			}
//			if(student.getStudentObject()!=null) {
//				this.studentObject=new StudentObjectDto(student.getStudentObject());
//			}
			this.status = student.getStatus();
			if(student.getStudentStatus()!=null) {
				this.studentStatus=new StatusDto();
				this.studentStatus.setId(student.getStudentStatus().getId());
				this.studentStatus.setCode(student.getStudentStatus().getCode());
				this.studentStatus.setName(student.getStudentStatus().getName());
				this.statusName=student.getStudentStatus().getName();
			}else {
				this.statusName="Bình thường";
			}
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
				 if(this.birthDate!=null)
					 this.birthDateString = formatter.format(this.birthDate);
				 if(this.idNumberIssueDate!=null)
					 this.idNumberIssueDateString = formatter.format(this.idNumberIssueDate);	
				 if(this.fatherBirthDate!=null)
					 this.fatherBirthDateString = formatter.format(this.fatherBirthDate);	
				 if(this.motherBirthDate!=null)
					 this.motherBirthDateString = formatter.format(this.motherBirthDate);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public StudentDto(Student student, boolean simple) {
		if (student != null) {
			this.setId(student.getId());
			this.setFirstName(student.getFirstName());
			this.setLastName(student.getLastName());
			this.setStudentCode(student.getStudentCode());
			this.setDisplayName(student.getDisplayName());
			this.setBankAccount(student.getBankAccount());
			this.setBirthDate(student.getBirthDate());
			this.setGender(student.getGender());
			this.setBirthPlace(student.getBirthPlace());
			this.setPhoneNumber(student.getPhoneNumber());
			this.note= student.getNote();
			if (student.getEnrollmentClass() != null) {
				this.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
				this.className = student.getEnrollmentClass().getClassName();
				this.classCode=student.getEnrollmentClass().getClassCode();
				if(student.getEnrollmentClass().getCourseyear()!=null) {
					this.courseYear = student.getEnrollmentClass().getCourseyear().getName();
				}
				if(student.getEnrollmentClass().getDepartment()!=null) {
					this.department = student.getEnrollmentClass().getDepartment().getName();
				}
				if(student.getEnrollmentClass().getSpeciality()!=null) {
					this.speciality = student.getEnrollmentClass().getSpeciality().getName();
				}
			}
			if (student.getStudentObjectStudents() != null) {
				this.studentObjectStudents = new HashSet<StudentObjectStudentDto>();
				Iterator<StudentObjectStudent> iters = student.getStudentObjectStudents().iterator();
				while (iters.hasNext()) {
					this.studentObjectStudents.add(new StudentObjectStudentDto(iters.next()));
				}
			}
			if (student.getStudentObjectStudentSemesters() != null) {
				this.studentObjectStudentSemesters = new HashSet<StudentObjectStudentSemesterDto>();
				Iterator<StudentObjectStudentSemester> iters = student.getStudentObjectStudentSemesters().iterator();
				while (iters.hasNext()) {
					this.studentObjectStudentSemesters.add(new StudentObjectStudentSemesterDto(iters.next()));
				}
			}
			if (student.getStudentStatusStudentSemesters() != null) {
				this.studentStatusStudentSemesters = new HashSet<StudentStatusStudentSemesterDto>();
				Iterator<StudentStatusStudentSemester> iters = student.getStudentStatusStudentSemesters().iterator();
				while (iters.hasNext()) {
					this.studentStatusStudentSemesters.add(new StudentStatusStudentSemesterDto(iters.next()));
				}
			}
			this.status = student.getStatus();
			// tình trạng sinh viên
			if(student.getStudentStatus()!=null) {
				this.studentStatus=new StatusDto();
				this.studentStatus.setId(student.getStudentStatus().getId());
				this.studentStatus.setCode(student.getStudentStatus().getCode());
				this.studentStatus.setName(student.getStudentStatus().getName());
				this.statusName=student.getStudentStatus().getName();
			}else {
				this.statusName="Bình thường";
			}
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
				 if(this.birthDate!=null)
					 this.birthDateString = formatter.format(this.birthDate);
				 if(this.idNumberIssueDate!=null)
					 this.idNumberIssueDateString = formatter.format(this.idNumberIssueDate);	
				 if(this.fatherBirthDate!=null)
					 this.fatherBirthDateString = formatter.format(this.fatherBirthDate);	
				 if(this.motherBirthDate!=null)
					 this.motherBirthDateString = formatter.format(this.motherBirthDate);	
			} catch (Exception e) {
				// TODO: handle exception
			}	
			
			if (simple) {
				
				if(student.getCandidateProfile()!=null) {
					this.payedAdmissionFee = student.getCandidateProfile().getPayedAdmissionFee();
					this.setCandidateProfile(new StudentCandidateProfileDto(student.getCandidateProfile()));
				}
				
				if(student!=null && student.getEnrollmentClass()!=null && student.getEnrollmentClass().getCourseyear()!=null
						&& student.getEnrollmentClass().getCourseyear().getEducationLevel()!=null
						&& student.getEnrollmentClass().getCourseyear().getEducationType()!=null) {
					//DHCQ,CD
					if((student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("DH")
						|| student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CD"))
							&& student.getEnrollmentClass().getCourseyear().getEducationType().getCode().equals("CQ")) {
						this.studentType=1;
					}
					//DHTC
					if((student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("DH")
							|| student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CD"))
								&& student.getEnrollmentClass().getCourseyear().getEducationType().getCode().equals("VLVH")) {
							this.studentType=2;
					}
					//CAOHOC,NCS
					if((student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("CH")
							|| student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("NCS"))
								) {
							this.studentType=3;
					}
					//LT
					if(student.getEnrollmentClass().getCourseyear().getEducationLevel().getCode().equals("LT")
							){
							this.studentType=4;
					}
					if(student.getPrograms()!=null && student.getPrograms().size()>0) {
						for (StudentEducationProgram pro : student.getPrograms()) {
							if(pro.getProgram().getType()!=null && pro.getProgram().getType().equals(Const.EducationProgramTypeEnum.Advanced.getValue())) {
								this.studentType=5;
								break;
							}
						}
					}
				}
			}
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
				 if(this.birthDate!=null)
					 this.birthDateString = formatter.format(this.birthDate);
				 if(this.idNumberIssueDate!=null)
					 this.idNumberIssueDateString = formatter.format(this.idNumberIssueDate);	
				 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public StudentDto(Student student, Integer subjectStatus,Long studentCourseSubjectId) {
		if (student != null) {
			this.setId(student.getId());
			this.setFirstName(student.getFirstName());
			this.setLastName(student.getLastName());
			this.setStudentCode(student.getStudentCode());
			this.setDisplayName(student.getDisplayName());
			this.setBankAccount(student.getBankAccount());
			this.setBirthDate(student.getBirthDate());
			this.setSubjectStatus(subjectStatus);
			this.setStudentCourseSubjectId(studentCourseSubjectId);
//			if (student.getEnrollmentClass() != null) {
//				this.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
//			}
			if(student.getEnrollmentClass()!=null) {
				this.className = student.getEnrollmentClass().getClassName();
				if(student.getEnrollmentClass().getCourseyear()!=null) {
					this.courseYear = student.getEnrollmentClass().getCourseyear().getName();
				}
				if(student.getEnrollmentClass().getDepartment()!=null) {
					this.department = student.getEnrollmentClass().getDepartment().getName();
				}
				if(student.getEnrollmentClass().getSpeciality()!=null) {
					this.speciality = student.getEnrollmentClass().getSpeciality().getName();
				}
			}
			this.status = student.getStatus();
			if(student.getStudentStatus()!=null) {
				this.studentStatus=new StatusDto();
				this.studentStatus.setId(student.getStudentStatus().getId());
				this.studentStatus.setCode(student.getStudentStatus().getCode());
				this.studentStatus.setName(student.getStudentStatus().getName());
				this.statusName=student.getStudentStatus().getName();
			}else {
				this.statusName="Bình thường";
			}
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
				 if(this.birthDate!=null)
					 this.birthDateString = formatter.format(this.birthDate);
					
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public StudentDto(Student student,int collapse) {
		if (student != null) {
			this.setId(student.getId());
			this.setFirstName(student.getFirstName());
			this.setLastName(student.getLastName());
			this.setStudentCode(student.getStudentCode());
			this.setDisplayName(student.getDisplayName());
			this.setBankAccount(student.getBankAccount());
			this.setBirthDate(student.getBirthDate());
			this.setGender(student.getGender());
			this.setBirthPlace(student.getBirthPlace());
			this.setIdNumber(student.getIdNumber());
			this.setIdNumberIssueBy(student.getIdNumberIssueBy());
			this.setIdNumberIssueDate(student.getIdNumberIssueDate());
			this.setPhoneNumber(student.getPhoneNumber());
			this.note= student.getNote();
//			if (student.getEnrollmentClass() != null) {
//				this.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
//			}
			if(student.getEnrollmentClass()!=null) {
				this.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
				this.className = student.getEnrollmentClass().getClassName();
				this.classCode=student.getEnrollmentClass().getClassCode();
				if(student.getEnrollmentClass().getCourseyear()!=null) {
					this.courseYear = student.getEnrollmentClass().getCourseyear().getName();
				}
				if(student.getEnrollmentClass().getDepartment()!=null) {
					this.department = student.getEnrollmentClass().getDepartment().getName();
				}
				if(student.getEnrollmentClass().getSpeciality()!=null) {
					this.speciality = student.getEnrollmentClass().getSpeciality().getName();
				}
			}
			this.status = student.getStatus();
			if(collapse==0) {
				StudentCandidateProfileDto candidateProfile = new StudentCandidateProfileDto();
				if(student.getCandidateProfile() != null) {
					candidateProfile.setCandidateCode(student.getCandidateProfile().getCandidateCode());
					candidateProfile.setIdNumber(student.getCandidateProfile().getIdNumber());
					candidateProfile.setIdNumberDateOfIssue(student.getCandidateProfile().getIdNumberDateOfIssue());
					candidateProfile.setIdNumberPlaceOfIssue(student.getCandidateProfile().getIdNumberPlaceOfIssue());
					candidateProfile.setContactAddress(student.getCandidateProfile().getContactAddress());
					candidateProfile.setPublicAddress(student.getCandidateProfile().getPublicAddress());
					candidateProfile.setEthnic(student.getCandidateProfile().getEthnic());
					candidateProfile.setReligion(student.getCandidateProfile().getReligion());
					this.payedAdmissionFee = student.getCandidateProfile().getPayedAdmissionFee();
				}
				this.setCandidateProfile(candidateProfile);
				if(student.getEthnics()!=null) {
					EthnicsDto eDto=new EthnicsDto();
					eDto.setName(student.getEthnics().getName());
					this.setEthnics(eDto);
				}
				if(student.getReligion()!=null) {
					ReligionDto eDto=new ReligionDto();
					eDto.setName(student.getReligion().getName());
					this.setReligion(eDto);
				}
				try {
					if (student.getStudentDecisions() != null && student.getStudentDecisions().size() > 0) {
						if (student.getStudentDecisions() != null && student.getStudentDecisions().size() > 0) {
							
							this.studentDecisions = new HashSet<StudentDecisionDto>();
							Iterator<StudentDecision> iters = student.getStudentDecisions().iterator();
							while (iters.hasNext()) {
								this.studentDecisions.add(new StudentDecisionDto(iters.next()));
							}				
						}
//						List<StudentDecisionDto> listStudentDecisionDto = new ArrayList<StudentDecisionDto>();
//						for (StudentDecision studentDecision : student.getStudentDecisions()) {
//							StudentDecisionDto studentDecisionDto = new StudentDecisionDto();
//							studentDecisionDto.setId(studentDecision.getId());
//							if (studentDecision.getDecision() != null) {
//								DecisionDto decision = new DecisionDto(studentDecision.getDecision(), true);
		//
//								studentDecisionDto.setDecision(decision);
//								listStudentDecisionDto.add(studentDecisionDto);
//							}
//						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				if (student.getStudentStatusStudentSemesters() != null) {
					this.studentStatusStudentSemesters = new HashSet<StudentStatusStudentSemesterDto>();
					Iterator<StudentStatusStudentSemester> iters = student.getStudentStatusStudentSemesters().iterator();
					while (iters.hasNext()) {
						this.studentStatusStudentSemesters.add(new StudentStatusStudentSemesterDto(iters.next()));
					}
				}
				if(student.getStudentStatus()!=null) {
					this.studentStatus=new StatusDto();
					this.studentStatus.setId(student.getStudentStatus().getId());
					this.studentStatus.setCode(student.getStudentStatus().getCode());
					this.studentStatus.setName(student.getStudentStatus().getName());
					this.statusName=student.getStudentStatus().getName();
				}else {
					this.statusName="Bình thường";
				}
			}else {
				if(student.getStudentStatus()!=null) {
					this.studentStatus=new StatusDto();
					this.studentStatus.setId(student.getStudentStatus().getId());
					this.studentStatus.setCode(student.getStudentStatus().getCode());
					this.studentStatus.setName(student.getStudentStatus().getName());
					this.statusName=student.getStudentStatus().getName();
				}else {
					this.statusName="Bình thường";
				}
			}
			try {
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
				 if(this.birthDate!=null)
					 this.birthDateString = formatter.format(this.birthDate);
				 	
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(student.getUser() != null) {
				 this.userActive =student.getUser().getActive();
			}
			this.fatherFullName = student.getFatherFullName();
			this.fatherPhoneNumber = student.getFatherPhoneNumber();
			this.motherFullName = student.getMotherFullName();
			this.motherPhoneNumber = student.getMotherPhoneNumber();
		}
	}

	public StudentDto(Student student,Long type) {
		super();
		if (student != null) {
			this.setId(student.getId());
			this.setFirstName(student.getFirstName());
			this.setLastName(student.getLastName());
			this.setStudentCode(student.getStudentCode());
			this.setDisplayName(student.getDisplayName());		
//			this.setBankAccount(student.getBankAccount());
//			this.setBirthDate(student.getBirthDate());
//			if (student.getEnrollmentClass() != null) {
//				this.setEnrollmentClass(new EnrollmentClassDto(student.getEnrollmentClass()));
//			}
//			if(student.getEnrollmentClass()!=null) {
//				this.className = student.getEnrollmentClass().getClassName();
//				this.classCode=student.getEnrollmentClass().getClassCode();
//				if(student.getEnrollmentClass().getCourseyear()!=null) {
//					this.courseYear = student.getEnrollmentClass().getCourseyear().getName();
//				}
//				if(student.getEnrollmentClass().getDepartment()!=null) {
//					this.department = student.getEnrollmentClass().getDepartment().getName();
//				}
//				if(student.getEnrollmentClass().getSpeciality()!=null) {
//					this.speciality = student.getEnrollmentClass().getSpeciality().getName();
//				}
//			}
			this.status = student.getStatus();
			if(student.getStudentStatus()!=null) {
				this.studentStatus=new StatusDto();
				this.studentStatus.setId(student.getStudentStatus().getId());
				this.studentStatus.setCode(student.getStudentStatus().getCode());
				this.studentStatus.setName(student.getStudentStatus().getName());
				this.statusName=student.getStudentStatus().getName();
			}else {
				this.statusName="Bình thường";
			}
		}
	}
	public StudentDto(Long id,String studentCode) {
		this.id = id;
		this.studentCode = studentCode;
	}
}
