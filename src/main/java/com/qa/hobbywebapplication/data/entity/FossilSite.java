package com.qa.hobbywebapplication.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fossil_site")
public class FossilSite {
	
	@Id
	@Column(name = "fossil_site_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fossilSiteId;

}
