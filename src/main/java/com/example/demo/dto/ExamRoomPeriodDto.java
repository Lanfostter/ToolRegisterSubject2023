package com.example.demo.dto;

import java.io.Serializable;

import com.globits.core.dto.RoomDto;
import com.globits.education.domain.ExamRoomPeriod;

public class ExamRoomPeriodDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Id;
	private RoomDto room;
	private ExamRegisterPeriodDto period;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public RoomDto getRoom() {
		return room;
	}
	public void setRoom(RoomDto room) {
		this.room = room;
	}
	public ExamRegisterPeriodDto getPeriod() {
		return period;
	}
	public void setPeriod(ExamRegisterPeriodDto period) {
		this.period = period;
	}
	public ExamRoomPeriodDto() {
	}
	

	public ExamRoomPeriodDto(ExamRoomPeriod entity) {
		if (entity != null) {
			this.Id= entity.getId();
			if (entity.getRoom() != null) {
				this.room = new RoomDto(entity.getRoom());
			}
			if (entity.getPeriod() != null) {
				this.period = new ExamRegisterPeriodDto();
				this.period.setId(entity.getPeriod().getId());
			}
		}
	}

}
