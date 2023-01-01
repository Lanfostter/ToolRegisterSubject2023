package com.example.demo.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

import org.springframework.util.StringUtils;

import com.globits.core.dto.AdministrativeUnitDto;
import com.globits.core.dto.CountryDto;
import com.globits.core.dto.EthnicsDto;
import com.globits.core.dto.ReligionDto;
import com.globits.education.Const;
import com.globits.education.domain.StudentCandidateProfile;
import com.globits.security.dto.UserDto;

public class StudentCandidateProfileDto implements Serializable {

	private static final long serialVersionUID = -4502466700609655017L;

	private Long id;

	private String candidateCode;
	
	private StudentDto student;

	private String studentObjectCode;
	
	private StudentObjectDto studentObject;// đối tượng sinh viên

	private Integer admissionsYear;// Năm tuyển sinh

	private String lastName;

	private String firstName;

	private String displayName;// lastName + firstName

	private Boolean isEnroll;// Đã nhập học hay chưa?
	
	private Boolean isSpecialtyCNTT = false;

	private String wishToEnroll1;	//nguyện vọng đăng ký học 1 cho ngành CNTT

	private String wishToEnroll2;	//nguyện vọng đăng ký học 2 cho ngành CNTT

	private String wishToEnroll3;	//nguyện vọng đăng ký học 3 cho ngành CNTT

	private String wishToEnroll4;	//nguyện vọng đăng ký học 4 cho ngành CNTT
	private CountryDto country;
	/*
	 * Mã sinh viên Khi thí sinh này thi đỗ và được làm thủ tục nhập học thì lấy mã
	 * sinh viên lưu vào trường này đánh dấu là đã nhập học, khi không nhập học thì
	 * để null tránh trường hợp nhập học 2 lần
	 */
	private String studentCode;
	private Long trainingBaseId;
	private Float firstSubjectScore; // Điểm môn đầu tiên
	private Float firstSubjectName; // Tên môn đầu tiên
	private String firstNameSubject; // Tên môn đầu tiên

	private Float secondSubjectScore; // Điểm môn thứ hai
	private Float secondSubjectName; // Tên môn thứ hai
	private String secondNameSubject; // Tên môn thứ hai

	private Float thirdSubjectScore; // Điểm môn thứ ba
	private Float thirdSubjectName; // Tên môn thứ ba
	private String thirdNameSubject; // Tên môn thứ ba

	private Float totalScore; // Tổng điểm

	private Float dtc0; // Tổng điểm chưa có điểm thưởng
	private String reason; // Lý do được điểm thưởng

	private String firstSpecialityDetailCode; // Mã ngành chi tiết thứ nhất

	private String firstSpecialityCode; // Ngành đăng ký thứ nhất

	private String secondSpecialityCode; // Ngành đăng ký thứ hai

	private String gender; // Giới tính

	private Integer highSchoolGraduationYear;// Năm tốt nghiệp phổ thông trung học
	private String highSchoolGraduation;// Trường tốt nghiệp phổ thông trung học
	private String highSchoolGraduationPlace;// Nơi tốt nghiệp phổ thông trung học
	private String highSchoolGrade;// Xếp loại PTTH
	private String highSchoolConduct;// Xếp loại hạnh kiểm

	private Date birthDate;
	private String birthDateString;
	private String gradeTen;

	private String gradeEleven;

	private String gradeTwelve;

	private String note;

	private String areaCode;

	private String idNumber;

	private String phoneNumber;

	private String priorityGroup;

	private String contactAddress; // Địa chỉ liên lạc theo hồ sơ tuyển sinh

	private String publicAddress;// Địa chỉ báo tin khi cần (Cho ai, ở đâu ?)
	private String provinceCode;
	private String provinceName;
	private String districtCode;
	private String districtName;
	private String wardCode;
	
	private String wardName;

	private String examRoom;
	
	private AdministrativeUnitDto province;
	
	private AdministrativeUnitDto district;
	
	private AdministrativeUnitDto ward;

	private String trainingUnits;

	private String firstSchool;// Truong1

	private String secondSchool;

	private String stage;

	private String admissionCommittee;

	private String firstGroup;

	private String secondGroup;

	private String admission;

	private String email;
	
	private String officialEmail;

	private String fatherName;// họ tên bố

	private String motherName;// họ tên mẹ

	private String fatherPhoneNumber;// Số điện thoại bố

	private String motherPhoneNumber;// Số điện thoại mẹ
	
	private String fatherAddress;
	
	private String motherAddress;

	private Date idNumberDateOfIssue;// Ngày cấp CMTND

	private String idNumberPlaceOfIssue; // Nơi cấp CMTND

	private String placeOfBirth; // Nơi sinh

	private String nativeVillage; // Quê quán

	private String ethnic; // Dân tộc

	private String religion; // Tôn giáo
	
	private EthnicsDto ethnics;
	
	private ReligionDto religionObject;

	private String placeOfPermanentResidenceRegistration;// nơi đăng ký thường trú

	private String currentWhereabouts;// Nơi ở hiện nay

	private String admissionCombination;
	private Boolean checkAdmissionFee;
	private boolean isBoarder;// Sinh viên ở nội trú
	/*
	 * Ngành nhập học, Khi nhập học, trong trường hợp tìm đúng 1 thí sinh theo số
	 * báo danh thì lấy luôn ngành cho thí sinh này
	 */
	private SpecialityDto specialityDto;

	private CourseYearDto courseYearDto;

	private EnrollmentClassDto enrollmentClassDto;

	private Boolean isRecruitedDirectly;

	private Boolean isConfirmAdmission; // Đã xác nhận nhập học
	
	private Boolean isConfirm = Boolean.FALSE;
	
	private String insuranceCardCode;//Mã thẻ bảo hiểm y tế
	
	//Mã số giấy đăng ký nghĩa vụ quân sự
	private String militaryServiceRegCode;
	
	//Ngày đăng ký nghĩa vụ quân sự
	private Date militaryServiceRegDate;
	
	private String militaryServiceRegDateString;
	
	private Date motherDob;
	
	private Date fatherDob;
	
	private Integer motherYob;//năm sinh mẹ
	
	private Integer fatherYob;//năm sinh bố
	
	private String motherJob; // nghề nghiệp mẹ
	
	private String fatherJob;// nghề nghiệp bố
	
	private Date groupAdmissionDate;
	
	private String groupAdmissionPlace;
	
	private Date communistAdmissionDate;
	
	private String communistAdmissionPlace;
	// tên , năm sinh,nơi ở hiện nay của anh trai 1
	private String nameOldBrother1;
	private Integer yearOldBrother1;
	private String addressOldBrother1;
	
	// tên , năm sinh,nơi ở hiện nay của anh trai 2
	private String nameOldBrother2;
	private Integer yearOldBrother2;
	private String addressOldBrother2;
	
	// tên , năm sinh,nơi ở hiện nay của anh trai 3
	private String nameOldBrother3;
	private Integer yearOldBrother3;
	private String addressOldBrother3;
	
	// tên , năm sinh,nơi ở hiện nay của chị gái 1
	private String nameOldSister1;
	private Integer yearOldSister1;
	private String addressOldSister1;
	
	// tên , năm sinh,nơi ở hiện nay của chị gái 2
	private String nameOldSister2;
	private Integer yearOldSister2;
	private String addressOldSister2;
	
	// tên , năm sinh,nơi ở hiện nay của chị gái 3
	private String nameOldSister3;
	private Integer yearOldSister3;
	private String addressOldSister3;
	
	// gồm: tên , năm sinh,nơi ở hiện nay của em 1
	private String nameLittleBrother1;
	private Integer yearLittleBrother1;
	private String addressLittleBrother1;
	
	// gồm: tên , năm sinh,nơi ở hiện nay của em 2
	private String nameLittleBrother2;
	private Integer yearLittleBrother2;
	private String addressLittleBrother2;
	
	// gồm: tên , năm sinh,nơi ở hiện nay của em 3
	private String nameLittleBrother3;
	private Integer yearLittleBrother3;
	private String addressLittleBrother3;
	
	private String linkFb;
	
	private UserDto user;
	
	private String countryCode;
	
	private Boolean payedAdmissionFee;
	private Float firstRecordsBookScore;//Điểm học bạ môn đầu
	private Float secondRecordsBookScore;//Điểm học bạ môn thứ hai
	private Float thirdRecordsBookScore;//Điểm học bạ môn thứ ba
	private Float totalRecordsBookScore;//Tổng điểm 3 môn xét học bạ
	private String firstRecordsBookName;//Tên môn 1 xét học bạ 
	private String secondRecordsBookName;//Tên môn 2 xét học bạ 
	private String thirdRecordsBookName;//Tên môn 3 xét học bạ 
	private String admissionCombinationRecordsBook;//Tổ hợp xét tuyển học bạ
	private Boolean isSchoolProfile;//Xét tuyển bẳng học bạ
	
	
	public Boolean getIsSchoolProfile() {
		return isSchoolProfile;
	}

	public void setIsSchoolProfile(Boolean isSchoolProfile) {
		this.isSchoolProfile = isSchoolProfile;
	}

	public String getFirstRecordsBookName() {
		return firstRecordsBookName;
	}

	public void setFirstRecordsBookName(String firstRecordsBookName) {
		this.firstRecordsBookName = firstRecordsBookName;
	}

	public String getSecondRecordsBookName() {
		return secondRecordsBookName;
	}

	public void setSecondRecordsBookName(String secondRecordsBookName) {
		this.secondRecordsBookName = secondRecordsBookName;
	}

	public String getThirdRecordsBookName() {
		return thirdRecordsBookName;
	}

	public void setThirdRecordsBookName(String thirdRecordsBookName) {
		this.thirdRecordsBookName = thirdRecordsBookName;
	}

	public String getAdmissionCombinationRecordsBook() {
		return admissionCombinationRecordsBook;
	}

	public void setAdmissionCombinationRecordsBook(String admissionCombinationRecordsBook) {
		this.admissionCombinationRecordsBook = admissionCombinationRecordsBook;
	}

	public Float getFirstRecordsBookScore() {
		return firstRecordsBookScore;
	}

	public void setFirstRecordsBookScore(Float firstRecordsBookScore) {
		this.firstRecordsBookScore = firstRecordsBookScore;
	}

	public Float getSecondRecordsBookScore() {
		return secondRecordsBookScore;
	}

	public void setSecondRecordsBookScore(Float secondRecordsBookScore) {
		this.secondRecordsBookScore = secondRecordsBookScore;
	}

	public Float getThirdRecordsBookScore() {
		return thirdRecordsBookScore;
	}

	public void setThirdRecordsBookScore(Float thirdRecordsBookScore) {
		this.thirdRecordsBookScore = thirdRecordsBookScore;
	}

	public Float getTotalRecordsBookScore() {
		return totalRecordsBookScore;
	}

	public void setTotalRecordsBookScore(Float totalRecordsBookScore) {
		this.totalRecordsBookScore = totalRecordsBookScore;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getMotherJob() {
		return motherJob;
	}

	public void setMotherJob(String motherJob) {
		this.motherJob = motherJob;
	}

	public String getFatherJob() {
		return fatherJob;
	}

	public void setFatherJob(String fatherJob) {
		this.fatherJob = fatherJob;
	}

	public String getLinkFb() {
		return linkFb;
	}

	public void setLinkFb(String linkFb) {
		this.linkFb = linkFb;
	}

	public Integer getMotherYob() {
		return motherYob;
	}

	public void setMotherYob(Integer motherYob) {
		this.motherYob = motherYob;
	}

	public Integer getFatherYob() {
		return fatherYob;
	}

	public void setFatherYob(Integer fatherYob) {
		this.fatherYob = fatherYob;
	}

	public String getWishToEnroll1() {
		return wishToEnroll1;
	}

	public void setWishToEnroll1(String wishToEnroll1) {
		this.wishToEnroll1 = wishToEnroll1;
	}

	public String getWishToEnroll2() {
		return wishToEnroll2;
	}

	public void setWishToEnroll2(String wishToEnroll2) {
		this.wishToEnroll2 = wishToEnroll2;
	}

	public String getWishToEnroll3() {
		return wishToEnroll3;
	}

	public void setWishToEnroll3(String wishToEnroll3) {
		this.wishToEnroll3 = wishToEnroll3;
	}

	public String getWishToEnroll4() {
		return wishToEnroll4;
	}

	public void setWishToEnroll4(String wishToEnroll4) {
		this.wishToEnroll4 = wishToEnroll4;
	}

	public Boolean getIsSpecialtyCNTT() {
		return isSpecialtyCNTT;
	}

	public void setIsSpecialtyCNTT(Boolean isSpecialtyCNTT) {
		this.isSpecialtyCNTT = isSpecialtyCNTT;
	}

	public Boolean getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Boolean isConfirm) {
		this.isConfirm = isConfirm;
	}

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
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

	public Date getIdNumberDateOfIssue() {
		return idNumberDateOfIssue;
	}

	public void setIdNumberDateOfIssue(Date idNumberDateOfIssue) {
		this.idNumberDateOfIssue = idNumberDateOfIssue;
	}

	public String getIdNumberPlaceOfIssue() {
		return idNumberPlaceOfIssue;
	}

	public void setIdNumberPlaceOfIssue(String idNumberPlaceOfIssue) {
		this.idNumberPlaceOfIssue = idNumberPlaceOfIssue;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getNativeVillage() {
		return nativeVillage;
	}

	public void setNativeVillage(String nativeVillage) {
		this.nativeVillage = nativeVillage;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getPlaceOfPermanentResidenceRegistration() {
		return placeOfPermanentResidenceRegistration;
	}

	public void setPlaceOfPermanentResidenceRegistration(String placeOfPermanentResidenceRegistration) {
		this.placeOfPermanentResidenceRegistration = placeOfPermanentResidenceRegistration;
	}

	public String getCurrentWhereabouts() {
		return currentWhereabouts;
	}

	public void setCurrentWhereabouts(String currentWhereabouts) {
		this.currentWhereabouts = currentWhereabouts;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficialEmail() {
		return officialEmail;
	}

	public void setOfficialEmail(String officialEmail) {
		this.officialEmail = officialEmail;
	}

	public Boolean getIsConfirmAdmission() {
		return isConfirmAdmission;
	}

	public void setIsConfirmAdmission(Boolean isConfirmAdmission) {
		this.isConfirmAdmission = isConfirmAdmission;
	}

	public Boolean getIsEnroll() {
		return isEnroll;
	}

	public void setIsEnroll(Boolean isEnroll) {
		this.isEnroll = isEnroll;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCandidateCode() {
		return candidateCode;
	}

	public void setCandidateCode(String candidateCode) {
		this.candidateCode = candidateCode;
	}

	public String getStudentObjectCode() {
		return studentObjectCode;
	}

	public void setStudentObjectCode(String studentObjectCode) {
		this.studentObjectCode = studentObjectCode;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	

	public String getInsuranceCardCode() {
		return insuranceCardCode;
	}

	public void setInsuranceCardCode(String insuranceCardCode) {
		this.insuranceCardCode = insuranceCardCode;
	}

	public String getMilitaryServiceRegCode() {
		return militaryServiceRegCode;
	}

	public void setMilitaryServiceRegCode(String militaryServiceRegCode) {
		this.militaryServiceRegCode = militaryServiceRegCode;
	}

	public Date getMilitaryServiceRegDate() {
		return militaryServiceRegDate;
	}

	public void setMilitaryServiceRegDate(Date militaryServiceRegDate) {
		this.militaryServiceRegDate = militaryServiceRegDate;
	}

	public String getMilitaryServiceRegDateString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			 militaryServiceRegDateString = formatter.format(this.militaryServiceRegDate);
		} catch (Exception e) {
			// TODO: handle exception
		}		  
		return militaryServiceRegDateString;
	}

	public void setMilitaryServiceRegDateString(String militaryServiceRegDateString) {
		this.militaryServiceRegDateString = militaryServiceRegDateString;
	}

	public String getDisplayName() {
		this.displayName = "";

		if (this.lastName != null) {
			this.displayName += lastName + " ";
		}
		if (this.firstName != null) {
			this.displayName += firstName;
		}
		return displayName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Long getTrainingBaseId() {
		return trainingBaseId;
	}

	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Float getFirstSubjectScore() {
		return firstSubjectScore;
	}

	public void setFirstSubjectScore(Float firstSubjectScore) {
		this.firstSubjectScore = firstSubjectScore;
	}

	public Float getSecondSubjectScore() {
		return secondSubjectScore;
	}

	public void setSecondSubjectScore(Float secondSubjectScore) {
		this.secondSubjectScore = secondSubjectScore;
	}

	public Float getThirdSubjectScore() {
		return thirdSubjectScore;
	}

	public void setThirdSubjectScore(Float thirdSubjectScore) {
		this.thirdSubjectScore = thirdSubjectScore;
	}

	public Float getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Float totalScore) {
		this.totalScore = totalScore;
	}

	public Float getDtc0() {
		return dtc0;
	}

	public void setDtc0(Float dtc0) {
		this.dtc0 = dtc0;
	}

	public String getFirstSpecialityCode() {
		return firstSpecialityCode;
	}

	public void setFirstSpecialityCode(String firstSpecialityCode) {
		this.firstSpecialityCode = firstSpecialityCode;
	}

	public String getSecondSpecialityCode() {
		return secondSpecialityCode;
	}

	public void setSecondSpecialityCode(String secondSpecialityCode) {
		this.secondSpecialityCode = secondSpecialityCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getHighSchoolGraduationYear() {
		return highSchoolGraduationYear;
	}

	public void setHighSchoolGraduationYear(Integer highSchoolGraduationYear) {
		this.highSchoolGraduationYear = highSchoolGraduationYear;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getBirthDateString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			 birthDateString = formatter.format(this.birthDate);
		} catch (Exception e) {
			// TODO: handle exception
		}		  
		return birthDateString;
	}

	public void setBirthDateString(String birthDateString) {
		this.birthDateString = birthDateString;
	}

	public String getGradeTen() {
		return gradeTen;
	}

	public void setGradeTen(String gradeTen) {
		this.gradeTen = gradeTen;
	}

	public String getGradeEleven() {
		return gradeEleven;
	}

	public void setGradeEleven(String gradeEleven) {
		this.gradeEleven = gradeEleven;
	}

	public String getGradeTwelve() {
		return gradeTwelve;
	}

	public void setGradeTwelve(String gradeTwelve) {
		this.gradeTwelve = gradeTwelve;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPriorityGroup() {
		return priorityGroup;
	}

	public void setPriorityGroup(String priorityGroup) {
		this.priorityGroup = priorityGroup;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getExamRoom() {
		return examRoom;
	}

	public void setExamRoom(String examRoom) {
		this.examRoom = examRoom;
	}

	public String getTrainingUnits() {
		return trainingUnits;
	}

	public void setTrainingUnits(String trainingUnits) {
		this.trainingUnits = trainingUnits;
	}

	public String getFirstSchool() {
		return firstSchool;
	}

	public void setFirstSchool(String firstSchool) {
		this.firstSchool = firstSchool;
	}

	public String getSecondSchool() {
		return secondSchool;
	}

	public void setSecondSchool(String secondSchool) {
		this.secondSchool = secondSchool;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getAdmissionCommittee() {
		return admissionCommittee;
	}

	public void setAdmissionCommittee(String admissionCommittee) {
		this.admissionCommittee = admissionCommittee;
	}

	public String getFirstGroup() {
		return firstGroup;
	}

	public void setFirstGroup(String firstGroup) {
		this.firstGroup = firstGroup;
	}

	public String getSecondGroup() {
		return secondGroup;
	}

	public void setSecondGroup(String secondGroup) {
		this.secondGroup = secondGroup;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getAdmissionCombination() {
		return admissionCombination;
	}

	public void setAdmissionCombination(String admissionCombination) {
		this.admissionCombination = admissionCombination;
	}

	public boolean isBoarder() {
		return isBoarder;
	}

	public void setBoarder(boolean isBoarder) {
		this.isBoarder = isBoarder;
	}

	public Integer getAdmissionsYear() {
		return admissionsYear;
	}

	public void setAdmissionsYear(Integer admissionsYear) {
		this.admissionsYear = admissionsYear;
	}

	public Float getFirstSubjectName() {
		return firstSubjectName;
	}

	public void setFirstSubjectName(Float firstSubjectName) {
		this.firstSubjectName = firstSubjectName;
	}

	public Float getSecondSubjectName() {
		return secondSubjectName;
	}

	public void setSecondSubjectName(Float secondSubjectName) {
		this.secondSubjectName = secondSubjectName;
	}

	public Float getThirdSubjectName() {
		return thirdSubjectName;
	}

	public void setThirdSubjectName(Float thirdSubjectName) {
		this.thirdSubjectName = thirdSubjectName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getHighSchoolGraduation() {
		return highSchoolGraduation;
	}

	public void setHighSchoolGraduation(String highSchoolGraduation) {
		this.highSchoolGraduation = highSchoolGraduation;
	}

	public String getHighSchoolGraduationPlace() {
		return highSchoolGraduationPlace;
	}

	public void setHighSchoolGraduationPlace(String highSchoolGraduationPlace) {
		this.highSchoolGraduationPlace = highSchoolGraduationPlace;
	}

	public String getHighSchoolGrade() {
		return highSchoolGrade;
	}

	public void setHighSchoolGrade(String highSchoolGrade) {
		this.highSchoolGrade = highSchoolGrade;
	}

	public String getHighSchoolConduct() {
		return highSchoolConduct;
	}

	public void setHighSchoolConduct(String highSchoolConduct) {
		this.highSchoolConduct = highSchoolConduct;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public SpecialityDto getSpecialityDto() {
		return specialityDto;
	}

	public void setSpecialityDto(SpecialityDto specialityDto) {
		this.specialityDto = specialityDto;
	}

	public String getFirstSpecialityDetailCode() {
		return firstSpecialityDetailCode;
	}

	public void setFirstSpecialityDetailCode(String firstSpecialityDetailCode) {
		this.firstSpecialityDetailCode = firstSpecialityDetailCode;
	}

	public CourseYearDto getCourseYearDto() {
		return courseYearDto;
	}

	public void setCourseYearDto(CourseYearDto courseYearDto) {
		this.courseYearDto = courseYearDto;
	}

	public EnrollmentClassDto getEnrollmentClassDto() {
		return enrollmentClassDto;
	}

	public void setEnrollmentClassDto(EnrollmentClassDto enrollmentClassDto) {
		this.enrollmentClassDto = enrollmentClassDto;
	}

	public Boolean getCheckAdmissionFee() {
		return checkAdmissionFee;
	}

	public void setCheckAdmissionFee(Boolean checkAdmissionFee) {
		this.checkAdmissionFee = checkAdmissionFee;
	}

	public Boolean getIsRecruitedDirectly() {
		return isRecruitedDirectly;
	}

	public void setIsRecruitedDirectly(Boolean isRecruitedDirectly) {
		this.isRecruitedDirectly = isRecruitedDirectly;
	}

	public Date getMotherDob() {
		return motherDob;
	}

	public void setMotherDob(Date motherDob) {
		this.motherDob = motherDob;
	}

	public Date getFatherDob() {
		return fatherDob;
	}

	public void setFatherDob(Date fatherDob) {
		this.fatherDob = fatherDob;
	}

	public Date getGroupAdmissionDate() {
		return groupAdmissionDate;
	}

	public void setGroupAdmissionDate(Date groupAdmissionDate) {
		this.groupAdmissionDate = groupAdmissionDate;
	}

	public String getGroupAdmissionPlace() {
		return groupAdmissionPlace;
	}

	public void setGroupAdmissionPlace(String groupAdmissionPlace) {
		this.groupAdmissionPlace = groupAdmissionPlace;
	}

	public Date getCommunistAdmissionDate() {
		return communistAdmissionDate;
	}

	public void setCommunistAdmissionDate(Date communistAdmissionDate) {
		this.communistAdmissionDate = communistAdmissionDate;
	}

	public String getCommunistAdmissionPlace() {
		return communistAdmissionPlace;
	}

	public void setCommunistAdmissionPlace(String communistAdmissionPlace) {
		this.communistAdmissionPlace = communistAdmissionPlace;
	}

	public String getNameOldBrother1() {
		return nameOldBrother1;
	}

	public void setNameOldBrother1(String nameOldBrother1) {
		this.nameOldBrother1 = nameOldBrother1;
	}

	public Integer getYearOldBrother1() {
		return yearOldBrother1;
	}

	public void setYearOldBrother1(Integer yearOldBrother1) {
		this.yearOldBrother1 = yearOldBrother1;
	}

	public String getAddressOldBrother1() {
		return addressOldBrother1;
	}

	public void setAddressOldBrother1(String addressOldBrother1) {
		this.addressOldBrother1 = addressOldBrother1;
	}

	public String getNameOldBrother2() {
		return nameOldBrother2;
	}

	public void setNameOldBrother2(String nameOldBrother2) {
		this.nameOldBrother2 = nameOldBrother2;
	}

	public Integer getYearOldBrother2() {
		return yearOldBrother2;
	}

	public void setYearOldBrother2(Integer yearOldBrother2) {
		this.yearOldBrother2 = yearOldBrother2;
	}

	public String getAddressOldBrother2() {
		return addressOldBrother2;
	}

	public void setAddressOldBrother2(String addressOldBrother2) {
		this.addressOldBrother2 = addressOldBrother2;
	}

	public String getNameOldBrother3() {
		return nameOldBrother3;
	}

	public void setNameOldBrother3(String nameOldBrother3) {
		this.nameOldBrother3 = nameOldBrother3;
	}

	public Integer getYearOldBrother3() {
		return yearOldBrother3;
	}

	public void setYearOldBrother3(Integer yearOldBrother3) {
		this.yearOldBrother3 = yearOldBrother3;
	}

	public String getAddressOldBrother3() {
		return addressOldBrother3;
	}

	public void setAddressOldBrother3(String addressOldBrother3) {
		this.addressOldBrother3 = addressOldBrother3;
	}

	public String getNameOldSister1() {
		return nameOldSister1;
	}

	public void setNameOldSister1(String nameOldSister1) {
		this.nameOldSister1 = nameOldSister1;
	}

	public Integer getYearOldSister1() {
		return yearOldSister1;
	}

	public void setYearOldSister1(Integer yearOldSister1) {
		this.yearOldSister1 = yearOldSister1;
	}

	public String getAddressOldSister1() {
		return addressOldSister1;
	}

	public void setAddressOldSister1(String addressOldSister1) {
		this.addressOldSister1 = addressOldSister1;
	}

	public String getNameOldSister2() {
		return nameOldSister2;
	}

	public void setNameOldSister2(String nameOldSister2) {
		this.nameOldSister2 = nameOldSister2;
	}

	public Integer getYearOldSister2() {
		return yearOldSister2;
	}

	public void setYearOldSister2(Integer yearOldSister2) {
		this.yearOldSister2 = yearOldSister2;
	}

	public String getAddressOldSister2() {
		return addressOldSister2;
	}

	public void setAddressOldSister2(String addressOldSister2) {
		this.addressOldSister2 = addressOldSister2;
	}

	public String getNameOldSister3() {
		return nameOldSister3;
	}

	public void setNameOldSister3(String nameOldSister3) {
		this.nameOldSister3 = nameOldSister3;
	}

	public Integer getYearOldSister3() {
		return yearOldSister3;
	}

	public void setYearOldSister3(Integer yearOldSister3) {
		this.yearOldSister3 = yearOldSister3;
	}

	public String getAddressOldSister3() {
		return addressOldSister3;
	}

	public void setAddressOldSister3(String addressOldSister3) {
		this.addressOldSister3 = addressOldSister3;
	}

	public Integer getYearLittleBrother2() {
		return yearLittleBrother2;
	}

	public void setYearLittleBrother2(Integer yearLittleBrother2) {
		this.yearLittleBrother2 = yearLittleBrother2;
	}

	public String getNameLittleBrother1() {
		return nameLittleBrother1;
	}

	public void setNameLittleBrother1(String nameLittleBrother1) {
		this.nameLittleBrother1 = nameLittleBrother1;
	}

	public String getNameLittleBrother2() {
		return nameLittleBrother2;
	}

	public void setNameLittleBrother2(String nameLittleBrother2) {
		this.nameLittleBrother2 = nameLittleBrother2;
	}

	public String getNameLittleBrother3() {
		return nameLittleBrother3;
	}

	public void setNameLittleBrother3(String nameLittleBrother3) {
		this.nameLittleBrother3 = nameLittleBrother3;
	}

	public Integer getYearLittleBrother1() {
		return yearLittleBrother1;
	}

	public void setYearLittleBrother1(Integer yearLittleBrother1) {
		this.yearLittleBrother1 = yearLittleBrother1;
	}

	public String getAddressLittleBrother1() {
		return addressLittleBrother1;
	}

	public void setAddressLittleBrother1(String addressLittleBrother1) {
		this.addressLittleBrother1 = addressLittleBrother1;
	}

	public String getAddressLittleBrother2() {
		return addressLittleBrother2;
	}

	public void setAddressLittleBrother2(String addressLittleBrother2) {
		this.addressLittleBrother2 = addressLittleBrother2;
	}

	public Integer getYearLittleBrother3() {
		return yearLittleBrother3;
	}

	public void setYearLittleBrother3(Integer yearLittleBrother3) {
		this.yearLittleBrother3 = yearLittleBrother3;
	}

	public String getAddressLittleBrother3() {
		return addressLittleBrother3;
	}

	public void setAddressLittleBrother3(String addressLittleBrother3) {
		this.addressLittleBrother3 = addressLittleBrother3;
	}

	public String getWardCode() {
		return wardCode;
	}

	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public AdministrativeUnitDto getProvince() {
		return province;
	}

	public void setProvince(AdministrativeUnitDto province) {
		this.province = province;
	}

	public AdministrativeUnitDto getDistrict() {
		return district;
	}

	public void setDistrict(AdministrativeUnitDto district) {
		this.district = district;
	}

	public AdministrativeUnitDto getWard() {
		return ward;
	}

	public void setWard(AdministrativeUnitDto ward) {
		this.ward = ward;
	}

	public EthnicsDto getEthnics() {
		return ethnics;
	}

	public void setEthnics(EthnicsDto ethnics) {
		this.ethnics = ethnics;
	}

	public ReligionDto getReligionObject() {
		return religionObject;
	}

	public void setReligionObject(ReligionDto religionObject) {
		this.religionObject = religionObject;
	}

	public CountryDto getCountry() {
		return country;
	}

	public void setCountry(CountryDto country) {
		this.country = country;
	}

	public StudentCandidateProfileDto() {
	}
	
	
	public StudentObjectDto getStudentObject() {
		return studentObject;
	}

	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}
	
	public String getFatherAddress() {
		return fatherAddress;
	}

	public void setFatherAddress(String fatherAddress) {
		this.fatherAddress = fatherAddress;
	}

	public String getMotherAddress() {
		return motherAddress;
	}

	public void setMotherAddress(String motherAddress) {
		this.motherAddress = motherAddress;
	}	

	public String getFirstNameSubject() {
		return firstNameSubject;
	}

	public void setFirstNameSubject(String firstNameSubject) {
		this.firstNameSubject = firstNameSubject;
	}

	public String getSecondNameSubject() {
		return secondNameSubject;
	}

	public void setSecondNameSubject(String secondNameSubject) {
		this.secondNameSubject = secondNameSubject;
	}

	public String getThirdNameSubject() {
		return thirdNameSubject;
	}

	public void setThirdNameSubject(String thirdNameSubject) {
		this.thirdNameSubject = thirdNameSubject;
	}	

	public String getPublicAddress() {
		return publicAddress;
	}

	public void setPublicAddress(String publicAddress) {
		this.publicAddress = publicAddress;
	}

	public StudentCandidateProfileDto(StudentCandidateProfile studentCandidateProfile, boolean simple) {
		if (studentCandidateProfile != null) {
			this.id = studentCandidateProfile.getId();
			this.candidateCode = studentCandidateProfile.getCandidateCode();
		}
	}

	public Boolean getPayedAdmissionFee() {
		return payedAdmissionFee;
	}

	public void setPayedAdmissionFee(Boolean payedAdmissionFee) {
		this.payedAdmissionFee = payedAdmissionFee;
	}

	public StudentCandidateProfileDto(StudentCandidateProfile studentCandidateProfile) {
		super();
		if (studentCandidateProfile != null) {
			this.id = studentCandidateProfile.getId();
			this.trainingBaseId = studentCandidateProfile.getTrainingBaseId();
			this.candidateCode = studentCandidateProfile.getCandidateCode();
			this.studentObjectCode = studentCandidateProfile.getStudentObjectCode();
			this.admissionsYear = studentCandidateProfile.getAdmissionsYear();
			this.lastName = studentCandidateProfile.getLastName();
			this.firstName = studentCandidateProfile.getFirstName();
			this.gender=studentCandidateProfile.getGender();
			this.firstSubjectScore = studentCandidateProfile.getFirstSubjectScore();
			this.firstSubjectName = studentCandidateProfile.getFirstSubjectName();
			this.secondSubjectScore = studentCandidateProfile.getSecondSubjectScore();
			this.secondSubjectName = studentCandidateProfile.getSecondSubjectName();
			this.thirdSubjectScore = studentCandidateProfile.getThirdSubjectScore();
			this.thirdSubjectName = studentCandidateProfile.getThirdSubjectName();
			this.firstNameSubject=studentCandidateProfile.getFirstNameSubject();
			this.secondNameSubject=studentCandidateProfile.getSecondNameSubject();
			this.thirdNameSubject=studentCandidateProfile.getThirdNameSubject();
			this.totalScore = studentCandidateProfile.getTotalScore();
			this.dtc0 = studentCandidateProfile.getDtc0();
			this.reason = studentCandidateProfile.getReason();
			this.firstSpecialityCode = studentCandidateProfile.getFirstSpecialityCode();
			this.secondSpecialityCode = studentCandidateProfile.getSecondSpecialityCode();
			this.gender = studentCandidateProfile.getGender();
			this.highSchoolGraduationYear = studentCandidateProfile.getHighSchoolGraduationYear();
			this.highSchoolGraduation = studentCandidateProfile.getHighSchoolGrade();
			this.highSchoolGraduationPlace = studentCandidateProfile.getHighSchoolGraduationPlace();
			this.highSchoolGrade = studentCandidateProfile.getHighSchoolGrade();
			this.highSchoolConduct = studentCandidateProfile.getHighSchoolConduct();
			this.birthDate = studentCandidateProfile.getBirthDate();
			this.gradeTen = studentCandidateProfile.getGradeTen();
			this.gradeEleven = studentCandidateProfile.getGradeEleven();
			this.gradeTwelve = studentCandidateProfile.getGradeTwelve();
			this.note = studentCandidateProfile.getNote();
			this.areaCode = studentCandidateProfile.getAreaCode();
			this.idNumber = studentCandidateProfile.getIdNumber();
			this.phoneNumber = studentCandidateProfile.getPhoneNumber();
			this.priorityGroup = studentCandidateProfile.getPriorityGroup();
			this.contactAddress = studentCandidateProfile.getContactAddress();
			this.publicAddress=studentCandidateProfile.getPublicAddress();
			this.provinceCode = studentCandidateProfile.getProvinceCode();
			this.provinceName = studentCandidateProfile.getProvinceName();
			this.districtCode = studentCandidateProfile.getDistrictCode();
			this.districtName = studentCandidateProfile.getDistrictName();
			this.examRoom = studentCandidateProfile.getExamRoom();
			this.trainingUnits = studentCandidateProfile.getTrainingUnits();
			this.firstSchool = studentCandidateProfile.getFirstSchool();
			this.secondSchool = studentCandidateProfile.getSecondSchool();
			this.stage = studentCandidateProfile.getStage();
			this.admissionCommittee = studentCandidateProfile.getAdmissionCommittee();
			this.firstGroup = studentCandidateProfile.getFirstGroup();
			this.secondGroup = studentCandidateProfile.getSecondGroup();
			this.admission = studentCandidateProfile.getAdmission();
			this.admissionCombination = studentCandidateProfile.getAdmissionCombination();
			this.email = studentCandidateProfile.getEmail();
			this.officialEmail = studentCandidateProfile.getOfficialEmail();
			this.studentCode = studentCandidateProfile.getStudentCode();
			this.fatherName = studentCandidateProfile.getFatherName();
			this.motherName = studentCandidateProfile.getMotherName();
			this.fatherPhoneNumber = studentCandidateProfile.getFatherPhoneNumber();
			this.motherPhoneNumber = studentCandidateProfile.getMotherPhoneNumber();
			this.idNumberDateOfIssue = studentCandidateProfile.getIdNumberDateOfIssue();
			this.idNumberPlaceOfIssue = studentCandidateProfile.getIdNumberPlaceOfIssue();
			this.placeOfBirth = studentCandidateProfile.getPlaceOfBirth();
			this.nativeVillage = studentCandidateProfile.getNativeVillage();
			this.ethnic = studentCandidateProfile.getEthnic();
			this.religion = studentCandidateProfile.getReligion();
			this.placeOfPermanentResidenceRegistration = studentCandidateProfile.getPlaceOfPermanentResidenceRegistration();
			this.currentWhereabouts = studentCandidateProfile.getCurrentWhereabouts();
			this.isConfirm = studentCandidateProfile.getIsConfirm();
			this.payedAdmissionFee = studentCandidateProfile.getPayedAdmissionFee();
			if (studentCandidateProfile.getStudent() != null && studentCandidateProfile.getStudent().getId() != null && StringUtils.hasText(studentCandidateProfile.getStudent().getStudentCode())) {
				this.isEnroll = true;
				this.student = new StudentDto();
				this.student.setId(studentCandidateProfile.getStudent().getId());
				this.student.setStudentCode(studentCandidateProfile.getStudent().getStudentCode());
				if(studentCandidateProfile.getStudent().getEnrollmentClass() != null) {
					EnrollmentClassDto enrollmentClassDto = new EnrollmentClassDto();
					enrollmentClassDto.setId(studentCandidateProfile.getStudent().getEnrollmentClass().getId());
					enrollmentClassDto.setClassName(studentCandidateProfile.getStudent().getEnrollmentClass().getClassName());
					enrollmentClassDto.setClassCode(studentCandidateProfile.getStudent().getEnrollmentClass().getClassCode());
					this.student.setEnrollmentClass(enrollmentClassDto);
				}
			}
			else {
				this.isEnroll = false;
			}
			if (studentCandidateProfile.getFirstSpecialityCode() != null && StringUtils.hasText(studentCandidateProfile.getFirstSpecialityCode())
					&& studentCandidateProfile.getFirstSpecialityCode().equals(Const.specialtyCNTT)) {
				this.isSpecialtyCNTT = true;
			}
			this.wishToEnroll1 = studentCandidateProfile.getWishToEnroll1();
			this.wishToEnroll2 = studentCandidateProfile.getWishToEnroll2();
			this.wishToEnroll3 = studentCandidateProfile.getWishToEnroll3();
			this.wishToEnroll4 = studentCandidateProfile.getWishToEnroll4();
					
			/*if (studentCandidateProfile.getIsConfirmAdmission() != null && studentCandidateProfile.getIsConfirmAdmission()) {
				this.isEnroll = true;
			} else {
				this.isEnroll = false;
			}*/
			this.firstSpecialityDetailCode = studentCandidateProfile.getFirstSpecialityDetailCode();
			if (studentCandidateProfile.getEnrollmentClass() != null) {
				this.enrollmentClassDto = new EnrollmentClassDto();
				this.enrollmentClassDto.setId(studentCandidateProfile.getEnrollmentClass().getId());
				this.enrollmentClassDto.setClassName(studentCandidateProfile.getEnrollmentClass().getClassName());
				this.enrollmentClassDto.setClassCode(studentCandidateProfile.getEnrollmentClass().getClassCode());
				if (studentCandidateProfile.getEnrollmentClass().getSpeciality() != null) {
					this.enrollmentClassDto.setSpeciality(new SpecialityDto());
					this.enrollmentClassDto.getSpeciality()
							.setId(studentCandidateProfile.getEnrollmentClass().getSpeciality().getId());
					this.enrollmentClassDto.getSpeciality()
							.setName(studentCandidateProfile.getEnrollmentClass().getSpeciality().getName());
				}
				if (studentCandidateProfile.getEnrollmentClass().getCourseyear() != null) {
					this.enrollmentClassDto.setCourseyear(new CourseYearDto());
					this.enrollmentClassDto.getCourseyear()
							.setId(studentCandidateProfile.getEnrollmentClass().getCourseyear().getId());
					this.enrollmentClassDto.getCourseyear()
							.setCode(studentCandidateProfile.getEnrollmentClass().getCourseyear().getCode());
					this.enrollmentClassDto.getCourseyear()
							.setName(studentCandidateProfile.getEnrollmentClass().getCourseyear().getName());
				}
			}
			if (studentCandidateProfile.getCourseYear() != null) {
				this.courseYearDto = new CourseYearDto();
				this.courseYearDto.setName(studentCandidateProfile.getCourseYear().getName());
				this.courseYearDto.setCode(studentCandidateProfile.getCourseYear().getCode());
				this.courseYearDto.setId(studentCandidateProfile.getCourseYear().getId());
			}
			this.checkAdmissionFee = studentCandidateProfile.getCheckAdmissionFee();
			this.isRecruitedDirectly = studentCandidateProfile.getIsRecruitedDirectly();
			this.isConfirmAdmission = studentCandidateProfile.getIsConfirmAdmission();
			this.fatherDob = studentCandidateProfile.getFatherDob();
			this.motherDob = studentCandidateProfile.getMotherDob();
			
			this.groupAdmissionDate = studentCandidateProfile.getGroupAdmissionDate();// set ngày kết nạp đoàn
			this.groupAdmissionPlace = studentCandidateProfile.getGroupAdmissionPlace();// set nơi kết nạp đoàn
			
			this.communistAdmissionDate = studentCandidateProfile.getCommunistAdmissionDate();// set ngày kết nạp Đảng
			this.communistAdmissionPlace = studentCandidateProfile.getCommunistAdmissionPlace();// set ngày kết nạp Đảng
			
			//thông tin về anh trai 1, anh trai 2, anh trai 3
			this.nameOldBrother1 = studentCandidateProfile.getNameOldBrother1();
			this.addressOldBrother1 = studentCandidateProfile.getAddressOldBrother1();
			this.yearOldBrother1 = studentCandidateProfile.getYearOldBrother1();
			
			this.nameOldBrother2 = studentCandidateProfile.getNameOldBrother2();
			this.addressOldBrother2 = studentCandidateProfile.getAddressOldBrother2();
			this.yearOldBrother2 = studentCandidateProfile.getYearOldBrother2();
			
			this.nameOldBrother3 = studentCandidateProfile.getNameOldBrother3();
			this.addressOldBrother3 = studentCandidateProfile.getAddressOldBrother3();
			this.yearOldBrother3 = studentCandidateProfile.getYearOldBrother3();
			// thông tin về chị gái 1, chị gái 2, chị gái 3
			this.nameOldSister1 = studentCandidateProfile.getNameOldSister1();
			this.addressOldSister1 = studentCandidateProfile.getAddressOldSister1();
			this.yearOldSister1 = studentCandidateProfile.getYearOldSister1();
			
			this.nameOldSister2 = studentCandidateProfile.getNameOldSister2();
			this.addressOldSister2 = studentCandidateProfile.getAddressOldSister2();
			this.yearOldSister2 = studentCandidateProfile.getYearOldSister2();
			
			this.nameOldSister3 = studentCandidateProfile.getNameOldSister3();
			this.addressOldSister3 = studentCandidateProfile.getAddressOldSister3();
			this.yearOldSister3 = studentCandidateProfile.getYearOldSister3();
			// thông tin về em 1, em 2, em 3 
			this.nameLittleBrother1 = studentCandidateProfile.getNameLittleBrother1();
			this.addressLittleBrother1 = studentCandidateProfile.getAddresslittleBrother1();
			this.yearLittleBrother1 = studentCandidateProfile.getYearLittleBrother1();
			
			this.nameLittleBrother2 = studentCandidateProfile.getNameLittleBrother2();
			this.addressLittleBrother2 = studentCandidateProfile.getAddressLittleBrother2();
			this.yearLittleBrother2 = studentCandidateProfile.getYearLittleBrother2();
			
			this.nameLittleBrother3 = studentCandidateProfile.getNameLittleBrother3();
			this.addressLittleBrother3 = studentCandidateProfile.getAddresslittleBrother3();
			this.yearLittleBrother3 = studentCandidateProfile.getYearLittleBrother3();
			
			this.motherYob = studentCandidateProfile.getMotherYob();
			this.fatherYob = studentCandidateProfile.getFatherYob();
			
			this.linkFb = studentCandidateProfile.getLinkFb();
			this.fatherJob = studentCandidateProfile.getFatherJob();
			this.motherJob = studentCandidateProfile.getMotherJob();
			this.wardCode = studentCandidateProfile.getWardCode();
			this.wardName = studentCandidateProfile.getWardName();
			this.insuranceCardCode = studentCandidateProfile.getInsuranceCardCode();
			if(studentCandidateProfile.getProvince() != null) {
				this.province = new AdministrativeUnitDto(studentCandidateProfile.getProvince());
			}
			if(studentCandidateProfile.getDistrict() != null) {
				this.district = new AdministrativeUnitDto(studentCandidateProfile.getDistrict());
			}
			if(studentCandidateProfile.getWard() != null) {
				this.ward = new AdministrativeUnitDto(studentCandidateProfile.getWard());
			}
			
			if(studentCandidateProfile.getEthnics() != null) {
				this.ethnics = new EthnicsDto(studentCandidateProfile.getEthnics());
			}
			
			if(studentCandidateProfile.getReligionObject() != null) {
				this.religionObject = new ReligionDto(studentCandidateProfile.getReligionObject());
			}
			
			if(studentCandidateProfile.getCountry() != null) {
				this.country = new CountryDto(studentCandidateProfile.getCountry());
			}
			if(studentCandidateProfile.getStudentObject() != null) {
				this.studentObject = new StudentObjectDto(studentCandidateProfile.getStudentObject());
			}
			this.motherAddress = studentCandidateProfile.getMotherAddress();
			this.fatherAddress = studentCandidateProfile.getFatherAddress();
			this.militaryServiceRegCode=studentCandidateProfile.getMilitaryServiceRegCode();
			this.militaryServiceRegDate=studentCandidateProfile.getMilitaryServiceRegDate();
			this.firstRecordsBookScore = studentCandidateProfile.getFirstRecordsBookScore();
			this.firstRecordsBookName = studentCandidateProfile.getFirstRecordsBookName();
			this.secondRecordsBookScore = studentCandidateProfile.getSecondRecordsBookScore();
			this.secondRecordsBookName = studentCandidateProfile.getSecondRecordsBookName();
			this.thirdRecordsBookScore = studentCandidateProfile.getThirdRecordsBookScore();
			this.thirdRecordsBookName = studentCandidateProfile.getThirdRecordsBookName();
			this.admissionCombinationRecordsBook = studentCandidateProfile.getAdmissionCombinationRecordsBook();
			this.totalRecordsBookScore = studentCandidateProfile.getTotalRecordsBookScore();
			this.isSchoolProfile = studentCandidateProfile.getIsSchoolProfile();
		}
	}

}
