public class Etudiant{
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	public Etudiant(){
		
	}
	
	// Getters
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public String getEmail(){
		return this.email;
	}	
	
	// Setters
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	public void setEmail(String email){
		this.email = email;
	}
}