public class Formateur{
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private int anneeExperience;
	
	public Formateur(){
		
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
	public int getAnneeExperience(){
		return this.anneeExperience;
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
	public void setAnneeExperience(int anneeExperience){
		this.anneeExperience = anneeExperience;
	}
}