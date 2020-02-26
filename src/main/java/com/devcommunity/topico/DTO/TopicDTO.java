package com.devcommunity.topico.DTO;

public class TopicDTO {

	private Long id;
	
	private String name;
	
	private String urlkey;
	
	private Long group_count;
	
	private Long member_count;
	
	private String description;
	
	private String lang;

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

	public String getUrlkey() {
		return urlkey;
	}

	public void setUrlkey(String urlkey) {
		this.urlkey = urlkey;
	}

	public Long getGroup_count() {
		return group_count;
	}

	public void setGroup_count(Long group_count) {
		this.group_count = group_count;
	}

	public Long getMember_count() {
		return member_count;
	}

	public void setMember_count(Long member_count) {
		this.member_count = member_count;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
}
