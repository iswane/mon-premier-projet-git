public class Etudiant{
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private int age;
	
	public Etudiant(){
		
	}
	// Constructeurs avec un seul paramètre
	public Etudiant(String nom){
		this.nom = nom;
	}
	// Constructeurs avec paramètres
	public Etudiant(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
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
	
	// Modificateurs
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