package sample.multimodule.service.impl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.multimodule.domain.entity.Personne;
import sample.multimodule.repository.PersonneRepository;
import sample.multimodule.service.api.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService {

    @Value("${type}")
    private String texttest;

    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public Personne findOne(String number)  {
        
        
        Personne account = personneRepository.findByNumber(number);
        if(account == null){
          account = createAccountByNumber(number);
        }

        return account;
    }

    @Override
    public Personne createAccountByNumber(String number) {
        Personne personne = new Personne();
        personne.setNumber(number);
        return personneRepository.save(personne);
    }

    public String getDummyType() {
        return texttest;
    }

    public void setDummyType(String dummyType) {
        this.texttest = dummyType;
    }

}
