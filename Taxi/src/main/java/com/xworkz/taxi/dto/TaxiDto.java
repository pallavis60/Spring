package com.xworkz.taxi.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="taxi_info")
@NamedQuery(name="readAll", query="select dto from TaxiDto dto")
@NamedQuery(name="findTaxiByLocation", query="select dto from TaxiDto dto where dto.location=:lc")
@NamedQuery(name="updateTaxiAvailableById", query="update TaxiDto dto set dto.isAvailable=:status where dto.id=:id ")
@NamedQuery(name="findByAvailableStatus", query="select dto from TaxiDto dto where dto.isAvailable=:avla")
@NamedQuery(name="updateTaxiEarningsById",query="update TaxiDto dto set dto.earnings=:ear where dto.id=:id")
@Entity
public class TaxiDto implements Serializable{
	
	@Id
	private int id;
	private int taxiNo;
	private int earnings;
	private boolean isAvailable;
	private String location;
	private String trips;
	
	

}
