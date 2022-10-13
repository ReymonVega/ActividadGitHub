package net.jaumebalmes.m12.entitats;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //taula de la BD
public class Client {
	
	
	@Id // clau a la taula de la BD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String nomClient;
	private String cognomClient;
	private LocalDate data;
	
	public Client(String nomClient, String cognomClient, LocalDate data) {
		super();
		this.id = id;
		this.nomClient = nomClient;
		this.cognomClient = cognomClient;
		this.data = data;
	}

	public Client() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getCognomClient() {
		return cognomClient;
	}

	public void setCognomClient(String cognomClient) {
		this.cognomClient = cognomClient;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nomClient=" + nomClient + ", cognomClient=" + cognomClient + ", data=" + data
				+ "]";
	}
	
}