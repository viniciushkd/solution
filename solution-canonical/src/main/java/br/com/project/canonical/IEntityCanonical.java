package br.com.project.canonical;

import java.io.Serializable;
import java.util.Date;

public interface IEntityCanonical extends Serializable{
	
	public String requestId();
	
	public String firstName();
	
	public String lastName();
	
	public int age();
	
	public Date date();

}
