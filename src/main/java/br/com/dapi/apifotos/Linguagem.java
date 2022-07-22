package br.com.dapi.apifotos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {
	@Id
	private String id;
	private String title;
	private String hdurl;
	private String media_type;
	private String service_version;
	private String url;
	private Integer ranking;
	
	public Linguagem() {
		
	}
	public Linguagem(String title, String hdurl, String media_type, String service_version, String url,
			Integer ranking) {
		this.title = title;
		this.hdurl = hdurl;
		this.media_type = media_type;
		this.service_version = service_version;
		this.url = url;
		this.ranking = ranking;
	}
	public String getTitle() {
		return title;
	}
	public String getHdurl() {
		return hdurl;
	}
	public String getMedia_type() {
		return media_type;
	}
	public String getService_version() {
		return service_version;
	}
	public String getUrl() {
		return url;
	}
	public Integer getRanking() {
		return ranking;
	}
	public String getId() {
		return id;
	}	
	
}
