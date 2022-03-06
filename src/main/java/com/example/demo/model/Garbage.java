package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "garbage")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Garbage {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long keyGarbage ; 
	private double rateTemperature ;
	private int typeContenaire ; 
	private double rateFilling ;
	private double geoLat;
	private double geoLong;
	private LocalDateTime dateSending;
	private int classification;
	public Long getKeyGarbage() {
		return keyGarbage;
	}
	public void setKeyGarbage(Long keyGarbage) {
		this.keyGarbage = keyGarbage;
	}
	public double getRateTemperature() {
		return rateTemperature;
	}
	public void setRateTemperature(double rateTemperature) {
		this.rateTemperature = rateTemperature;
	}
	public int getTypeContenaire() {
		return typeContenaire;
	}
	public void setTypeContenaire(int typeContenaire) {
		this.typeContenaire = typeContenaire;
	}
	public double getRateFilling() {
		return rateFilling;
	}
	public void setRateFilling(double rateFilling) {
		this.rateFilling = rateFilling;
	}
	public double getGeoLat() {
		return geoLat;
	}
	public void setGeoLat(double geoLat) {
		this.geoLat = geoLat;
	}
	public double getGeoLong() {
		return geoLong;
	}
	public void setGeoLong(double geoLong) {
		this.geoLong = geoLong;
	}
	public LocalDateTime getDateSending() {
		return dateSending;
	}
	public void setDateSending(LocalDateTime dateSending) {
		this.dateSending = dateSending;
	}
	public int getClassification() {
		return classification;
	}
	public void setClassification(int classification) {
		this.classification = classification;
	}
	
	


}
