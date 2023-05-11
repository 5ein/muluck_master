package com.multi.muluck.card;

import java.sql.Timestamp;

public class CardVO {
	private Integer card_no;
	private Integer card_id;
	private String card_name;
	private String card_type;
	private String card_birth;
	private String card_mmti;
	private String card_img;
	private Timestamp card_date;

	public Integer getCard_no() {
		return card_no;
	}

	public void setCard_no(Integer card_no) {
		this.card_no = card_no;
	}

	public Integer getCard_id() {
		return card_id;
	}

	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getCard_birth() {
		return card_birth;
	}

	public void setCard_birth(String card_birth) {
		this.card_birth = card_birth;
	}

	public String getCard_mmti() {
		return card_mmti;
	}

	public void setCard_mmti(String card_mmti) {
		this.card_mmti = card_mmti;
	}

	public String getCard_img() {
		return card_img;
	}

	public void setCard_img(String card_img) {
		this.card_img = card_img;
	}

	public Timestamp getCard_date() {
		return card_date;
	}

	public void setCard_date(Timestamp card_date) {
		this.card_date = card_date;
	}

	@Override
	public String toString() {
		return "CardVO [card_no=" + card_no + ", card_id=" + card_id + ", card_name=" + card_name + ", card_type="
				+ card_type + ", card_birth=" + card_birth + ", card_mmti=" + card_mmti + ", card_img=" + card_img
				+ ", card_date=" + card_date + "]";
	}

}
