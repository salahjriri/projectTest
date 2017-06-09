package sample.multimodule.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String number;

   
    /**
     * Create an empty account.
     */
    public Personne() {

    }
    
    /**
     * Create a new account.
     * 
     * @param number
     *            the account number
     * @param id
     *            the account id
     */
    public Personne(Long id, String number) {
        this.number = number;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

   

}
