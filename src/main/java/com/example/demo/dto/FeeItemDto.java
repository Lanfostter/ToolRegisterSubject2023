package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.FeeItem;

public class FeeItemDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Double amount;
	private Long numberOfStudent;
	private Double totalAmountPerEducationVoucher;
	/*
	 * Loại:
	 * 1: học phí, lệ phí các loại, tính vào bảng cân đối của sinh viên
	 * 0: khoản thu hộ đơn vị khác
	 * EducationConstant.FeeItemTypeEnum
	 */
	private int type;
	/*
	 * Nhóm:
	 * EducationConstant.FeeType
	 * //Khoản Khác
		OtherFee(-1),
		//Phí nhập học
		AdmidssionFee(0),
		//Học phí
		TuitionFee(1),
		//Học bổng
		Scholarship(2),
		//Lệ phí thi
		ExamFee(3),
		//Học phí lớp riêng
		SpecialCourseSubjectFee(4),
		//Phí hủy học phần
		CancelFee(5),
		//Kết chuyển
		Tranfer(6),
		//Tổng hợp: hóa đơn thu cho nhiều khoản khác nhau
		General(7);
	 */
	private Integer feeGroup;
	
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
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(Long numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public Double getTotalAmountPerEducationVoucher() {
		return totalAmountPerEducationVoucher;
	}

	public void setTotalAmountPerEducationVoucher(Double totalAmountPerEducationVoucher) {
		this.totalAmountPerEducationVoucher = totalAmountPerEducationVoucher;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}	

	public Integer getFeeGroup() {
		return feeGroup;
	}

	public void setFeeGroup(Integer feeGroup) {
		this.feeGroup = feeGroup;
	}

	public FeeItemDto() {

	}
	public FeeItemDto(Double amount,Long numberOfStudent,Long feeItemId) {
		this.amount = amount;
		this.numberOfStudent = numberOfStudent;
		this.id = feeItemId;
	}
	public FeeItemDto(FeeItem feeItem) {
		super();
		if(feeItem !=null) {
			this.id = feeItem.getId();
			this.code = feeItem.getCode();
			this.name = feeItem.getName();
			this.type = feeItem.getType();
//			this.feeGroup = feeItem.getFeeGroup();
		}
	}
}
